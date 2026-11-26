package com.prep.orchestra.api.service;

import com.prep.orchestra.api.data.entities.Job;
import com.prep.orchestra.api.data.repository.JobRepository;
import com.prep.orchestra.api.data.responses.JobRequest;
import com.prep.orchestra.api.data.responses.JobResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Transactional
    public JobResponse create(JobRequest request) {
        Job saved = jobRepository.save(new Job(request.jobType(), request.jobStatus()));
        return JobResponse.from(saved);
    }

    @Transactional
    public JobResponse findById(Long id) {
        return jobRepository.findById(id).map(JobResponse::from).orElseThrow(NoSuchElementException::new);
    }

    @Transactional
    public List<JobResponse> findAll() {
        return jobRepository.findAll().stream().map(JobResponse::from).toList();
    }
}
