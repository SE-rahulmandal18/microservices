package com.example.jobms.job;

import com.example.jobms.job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> getAllJobs();

    void createJob(Job job);

    JobDTO getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJobById(Long id, Job updateJobById);

}



