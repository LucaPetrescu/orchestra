package com.prep.orchestra.api.data.repository;

import com.prep.orchestra.api.data.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
