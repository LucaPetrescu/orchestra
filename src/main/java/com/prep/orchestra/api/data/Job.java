package com.prep.orchestra.api.data;

import com.prep.orchestra.api.data.enums.JobStatus;
import com.prep.orchestra.api.data.enums.JobType;
import jakarta.persistence.*;

@Entity
@Table(name = "jobs")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private JobType jobType;

    private JobStatus jobStatus;

}
