package com.prep.orchestra.api.data.responses;

import com.prep.orchestra.api.data.enums.JobStatus;
import com.prep.orchestra.api.data.enums.JobType;
import jakarta.validation.constraints.NotBlank;

public record JobRequest (
        @NotBlank
        JobType jobType,

        @NotBlank
        JobStatus jobStatus
) {

}
