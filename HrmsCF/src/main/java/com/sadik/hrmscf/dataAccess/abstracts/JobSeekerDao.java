package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
    JobSeeker findJobSeekerByIdentityNumber(String identityNumber);
    JobSeeker findByEmail(String email);
}
