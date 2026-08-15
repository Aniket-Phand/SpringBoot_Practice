package com.aniket.spring_boot_rest.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.aniket.spring_boot_rest.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    //Search by keyword
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile,String postDesc);

}
/*  private final List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Must Have a Good In Java and Spring", 2, Arrays.asList("Java", "Spring", "SpringBoot")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications", 3, Arrays.asList("JavaScript", "React", "HTML", "CSS")),
            new JobPost(3, "Python Engineer", "Focus on data processing and backend automation scripting", 1, Arrays.asList("Python", "Django", "PostgreSQL")),
            new JobPost(4, "DevOps Engineer", "Manage cloud infrastructure and CI/CD pipelines", 4, Arrays.asList("AWS", "Docker", "Kubernetes", "Jenkins")),
            new JobPost(5, "Mobile Developer", "Build cross-platform applications with high performance", 2, Arrays.asList("Flutter", "Dart", "Firebase")),
            new JobPost(6, "Data Scientist", "Analyze complex data structures and train ML models", 3, Arrays.asList("Python", "TensorFlow", "Pandas", "SQL"))

    ));

    public void addJob(JobPost job) {
        jobs.add(job);
    }

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public JobPost getJob(int postId){
        for(JobPost job : jobs){
            if(job.getPostId()==postId)
                return job;
        }
        return null;
    }

    public void updateJob(JobPost jobPost) {
        for(JobPost jobPost1 : jobs) {
            if (jobPost1.getPostId() == jobPost.getPostId()) {
                jobPost1.setPostProfile(jobPost.getPostProfile());
                jobPost1.setPostDesc(jobPost.getPostDesc());
                jobPost1.setReqExperience(jobPost.getReqExperience());
                jobPost1.setPostTechStack(jobPost.getPostTechStack());
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost jobPost : jobs){
            if(jobPost.getPostId() == postId){
                jobs.remove(jobPost);
            }
        }
    }
}
*/