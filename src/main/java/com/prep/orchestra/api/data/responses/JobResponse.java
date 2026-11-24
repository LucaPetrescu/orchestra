package com.prep.orchestra.api.data.responses;

import com.prep.orchestra.api.data.entities.Job;
import com.prep.orchestra.api.data.enums.JobStatus;
import com.prep.orchestra.api.data.enums.JobType;

public record JobResponse(
    Long id,
    JobType jobType,
    JobStatus jobStatus
) {
    public static JobResponse from(Job job) {
        return new JobResponse(job.getId(), job.getJobType(), job.getJobStatus());
    }
}
