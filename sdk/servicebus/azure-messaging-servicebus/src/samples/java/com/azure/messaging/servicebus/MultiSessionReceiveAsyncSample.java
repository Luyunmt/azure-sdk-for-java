// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus;

import com.azure.messaging.servicebus.models.ReceiveAsyncOptions;
import com.azure.messaging.servicebus.models.ReceiveMode;
import reactor.core.Disposable;
import reactor.core.publisher.Mono;

import java.security.SecureRandom;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Sample demonstrates how to receive and process multiple samples.
 */
public class MultiSessionReceiveAsyncSample {
    private static final SecureRandom RANDOM = new SecureRandom();

    /**
     * Main method to invoke this demo on how to receive from multiple sessions {@link ServiceBusReceivedMessage} from
     * an Azure Service Bus Queue.
     *
     * @param args Unused arguments to the program.
     *
     * @throws InterruptedException If the program is unable to sleep while waiting for the operations to complete.
     */
    public static void main(String[] args) throws InterruptedException {

        // The connection string value can be obtained by:
        // 1. Going to your Service Bus namespace in Azure Portal.
        // 2. Go to "Shared access policies"
        // 3. Copy the connection string for the "RootManageSharedAccessKey" policy.
        String connectionString = "Endpoint={fully-qualified-namespace};SharedAccessKeyName={policy-name};"
            + "SharedAccessKey={key}";

        // Create a receiver.
        // "<<queue-name>>" will be the name of the Service Bus queue instance you created inside the Service Bus
        // namespace.
        ServiceBusReceiverAsyncClient receiver = new ServiceBusClientBuilder()
            .connectionString(connectionString)
            .sessionReceiver()
            .maxConcurrentSessions(3)
            .receiveMode(ReceiveMode.PEEK_LOCK)
            .queueName("<<queue-name>>")
            .buildAsyncClient();

        // At most, the receiver will automatically renew the session lock until 120 seconds have elapsed.
        // By default, after messages are processed, they are completed (ie. removed from the queue/topic). Setting
        // enableAutoComplete to true will tell the processor to complete or abandon the message depending
        ReceiveAsyncOptions options = new ReceiveAsyncOptions()
            .setIsAutoCompleteEnabled(false)
            .setMaxAutoLockRenewalDuration(Duration.ofSeconds(120));

        Disposable subscription = receiver.receive(options)
            .flatMap(context -> {
                if (context.hasError()) {
                    System.out.printf("An error occurred in session %s. Error: %s%n",
                        context.getSessionId(), context.getThrowable());

                    return Mono.empty();
                }

                System.out.println("Processing message from session: " + context.getSessionId());

                // Change the `messageProcessed` according to you business logic and if you are able to process the
                // message successfully. In this case, we randomly get a boolean to determine if processing was
                // successful or not.
                boolean messageProcessed = RANDOM.nextBoolean();
                if (messageProcessed) {
                    return receiver.complete(context.getMessage());
                } else {
                    return receiver.abandon(context.getMessage());
                }
            }).subscribe();

        // Subscribe is not a blocking call so we sleep here so the program does not end.
        TimeUnit.SECONDS.sleep(60);

        // Disposing of the subscription will cancel the receive() operation.
        subscription.dispose();

        // Close the receiver.
        receiver.close();
    }
}