// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.quantum.jobs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Job details. */
@Fluent
public final class JobDetails {
    /*
     * The job id.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * The job name. Is not required for the name to be unique and it's only
     * used for display purposes.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The blob container SAS uri, the container is used to host job data.
     */
    @JsonProperty(value = "containerUri", required = true)
    private String containerUri;

    /*
     * The input blob SAS uri, if specified, it will override the default input
     * blob in the container.
     */
    @JsonProperty(value = "inputDataUri")
    private String inputDataUri;

    /*
     * The format of the input data.
     */
    @JsonProperty(value = "inputDataFormat", required = true)
    private String inputDataFormat;

    /*
     * The input parameters for the job. JSON object used by the target solver.
     * It is expected that the size of this object is small and only used to
     * specify parameters for the execution target, not the input data.
     */
    @JsonProperty(value = "inputParams")
    private Object inputParams;

    /*
     * The unique identifier for the provider.
     */
    @JsonProperty(value = "providerId", required = true)
    private String providerId;

    /*
     * The target identifier to run the job.
     */
    @JsonProperty(value = "target", required = true)
    private String target;

    /*
     * The job metadata. Metadata provides client the ability to store
     * client-specific information
     */
    @JsonProperty(value = "metadata")
    private Map<String, String> metadata;

    /*
     * The output blob SAS uri. When a job finishes successfully, results will
     * be uploaded to this blob.
     */
    @JsonProperty(value = "outputDataUri")
    private String outputDataUri;

    /*
     * The format of the output data.
     */
    @JsonProperty(value = "outputDataFormat")
    private String outputDataFormat;

    /*
     * The job status.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private JobStatus status;

    /*
     * The creation time of the job.
     */
    @JsonProperty(value = "creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * The time when the job began execution.
     */
    @JsonProperty(value = "beginExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime beginExecutionTime;

    /*
     * The time when the job finished execution.
     */
    @JsonProperty(value = "endExecutionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime endExecutionTime;

    /*
     * The time when a job was successfully cancelled.
     */
    @JsonProperty(value = "cancellationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime cancellationTime;

    /*
     * The error data for the job. This is expected only when Status 'Failed'.
     */
    @JsonProperty(value = "errorData", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorData errorData;

    /**
     * Get the id property: The job id.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: The job id.
     *
     * @param id the id value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The job name. Is not required for the name to be unique and it's only used for display
     * purposes.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The job name. Is not required for the name to be unique and it's only used for display
     * purposes.
     *
     * @param name the name value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the containerUri property: The blob container SAS uri, the container is used to host job data.
     *
     * @return the containerUri value.
     */
    public String getContainerUri() {
        return this.containerUri;
    }

    /**
     * Set the containerUri property: The blob container SAS uri, the container is used to host job data.
     *
     * @param containerUri the containerUri value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setContainerUri(String containerUri) {
        this.containerUri = containerUri;
        return this;
    }

    /**
     * Get the inputDataUri property: The input blob SAS uri, if specified, it will override the default input blob in
     * the container.
     *
     * @return the inputDataUri value.
     */
    public String getInputDataUri() {
        return this.inputDataUri;
    }

    /**
     * Set the inputDataUri property: The input blob SAS uri, if specified, it will override the default input blob in
     * the container.
     *
     * @param inputDataUri the inputDataUri value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setInputDataUri(String inputDataUri) {
        this.inputDataUri = inputDataUri;
        return this;
    }

    /**
     * Get the inputDataFormat property: The format of the input data.
     *
     * @return the inputDataFormat value.
     */
    public String getInputDataFormat() {
        return this.inputDataFormat;
    }

    /**
     * Set the inputDataFormat property: The format of the input data.
     *
     * @param inputDataFormat the inputDataFormat value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setInputDataFormat(String inputDataFormat) {
        this.inputDataFormat = inputDataFormat;
        return this;
    }

    /**
     * Get the inputParams property: The input parameters for the job. JSON object used by the target solver. It is
     * expected that the size of this object is small and only used to specify parameters for the execution target, not
     * the input data.
     *
     * @return the inputParams value.
     */
    public Object getInputParams() {
        return this.inputParams;
    }

    /**
     * Set the inputParams property: The input parameters for the job. JSON object used by the target solver. It is
     * expected that the size of this object is small and only used to specify parameters for the execution target, not
     * the input data.
     *
     * @param inputParams the inputParams value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setInputParams(Object inputParams) {
        this.inputParams = inputParams;
        return this;
    }

    /**
     * Get the providerId property: The unique identifier for the provider.
     *
     * @return the providerId value.
     */
    public String getProviderId() {
        return this.providerId;
    }

    /**
     * Set the providerId property: The unique identifier for the provider.
     *
     * @param providerId the providerId value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setProviderId(String providerId) {
        this.providerId = providerId;
        return this;
    }

    /**
     * Get the target property: The target identifier to run the job.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: The target identifier to run the job.
     *
     * @param target the target value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the metadata property: The job metadata. Metadata provides client the ability to store client-specific
     * information.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The job metadata. Metadata provides client the ability to store client-specific
     * information.
     *
     * @param metadata the metadata value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the outputDataUri property: The output blob SAS uri. When a job finishes successfully, results will be
     * uploaded to this blob.
     *
     * @return the outputDataUri value.
     */
    public String getOutputDataUri() {
        return this.outputDataUri;
    }

    /**
     * Set the outputDataUri property: The output blob SAS uri. When a job finishes successfully, results will be
     * uploaded to this blob.
     *
     * @param outputDataUri the outputDataUri value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setOutputDataUri(String outputDataUri) {
        this.outputDataUri = outputDataUri;
        return this;
    }

    /**
     * Get the outputDataFormat property: The format of the output data.
     *
     * @return the outputDataFormat value.
     */
    public String getOutputDataFormat() {
        return this.outputDataFormat;
    }

    /**
     * Set the outputDataFormat property: The format of the output data.
     *
     * @param outputDataFormat the outputDataFormat value to set.
     * @return the JobDetails object itself.
     */
    public JobDetails setOutputDataFormat(String outputDataFormat) {
        this.outputDataFormat = outputDataFormat;
        return this;
    }

    /**
     * Get the status property: The job status.
     *
     * @return the status value.
     */
    public JobStatus getStatus() {
        return this.status;
    }

    /**
     * Get the creationTime property: The creation time of the job.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Get the beginExecutionTime property: The time when the job began execution.
     *
     * @return the beginExecutionTime value.
     */
    public OffsetDateTime getBeginExecutionTime() {
        return this.beginExecutionTime;
    }

    /**
     * Get the endExecutionTime property: The time when the job finished execution.
     *
     * @return the endExecutionTime value.
     */
    public OffsetDateTime getEndExecutionTime() {
        return this.endExecutionTime;
    }

    /**
     * Get the cancellationTime property: The time when a job was successfully cancelled.
     *
     * @return the cancellationTime value.
     */
    public OffsetDateTime getCancellationTime() {
        return this.cancellationTime;
    }

    /**
     * Get the errorData property: The error data for the job. This is expected only when Status 'Failed'.
     *
     * @return the errorData value.
     */
    public ErrorData getErrorData() {
        return this.errorData;
    }
}
