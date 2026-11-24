package com.prep.orchestra.api.data.entities;

import com.prep.orchestra.api.data.enums.JobStatus;
import com.prep.orchestra.api.data.enums.JobType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Entity
@Getter
@Table(name = "jobs")

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private JobType jobType;

    private JobStatus jobStatus;

    public Job(JobType jobType, JobStatus jobStatus) {
        this.jobType = jobType;
        this.jobStatus = jobStatus;
    }
}
