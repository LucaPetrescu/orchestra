package com.prep.orchestra.api;

import com.prep.orchestra.api.data.Job;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/v1/jobs")
public class JobsController {

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> submitJob(@RequestBody Job job) {
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById() {
        return ResponseEntity<Job>
    }

    @GetMapping
    public ResponseEntity<ArrayList<Job>> getJobs() {

    }

}
