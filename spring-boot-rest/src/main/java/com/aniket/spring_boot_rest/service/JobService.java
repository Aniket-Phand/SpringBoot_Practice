package com.aniket.spring_boot_rest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniket.spring_boot_rest.model.JobPost;
import com.aniket.spring_boot_rest.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobpost) {
        repo.save(jobpost);
    }

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Java Developer", "Must Have a Good In Java and Spring", 2, Arrays.asList("Java", "Spring", "SpringBoot")),
                new JobPost(2, "Frontend Developer", "Experience in building responsive web applications", 3, Arrays.asList("JavaScript", "React", "HTML", "CSS")),
                new JobPost(3, "Python Engineer", "Focus on data processing and backend automation scripting", 1, Arrays.asList("Python", "Django", "PostgreSQL")),
                new JobPost(4, "DevOps Engineer", "Manage cloud infrastructure and CI/CD pipelines", 4, Arrays.asList("AWS", "Docker", "Kubernetes", "Jenkins")),
                new JobPost(5, "Mobile Developer", "Build cross-platform applications with high performance", 2, Arrays.asList("Flutter", "Dart", "Firebase")),
                new JobPost(6, "Data Scientist", "Analyze complex data structures and train ML models", 3, Arrays.asList("Python", "TensorFlow", "Pandas", "SQL"))

        ));
        repo.saveAll(jobs);
    }
}
