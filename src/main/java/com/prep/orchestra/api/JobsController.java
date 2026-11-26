package com.prep.orchestra.api;

import com.prep.orchestra.api.data.entities.Job;
import com.prep.orchestra.api.data.responses.JobResponse;
import com.prep.orchestra.api.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/v1/jobs")
public class JobsController {

    private final JobService jobService;

    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> submitJob(@RequestBody Job job) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobResponse> getJobById(@RequestParam Long id)  {
        return ResponseEntity.ok(jobService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<JobResponse>> getJobs() {
        return ResponseEntity.ok(jobService.findAll());
    }

}
