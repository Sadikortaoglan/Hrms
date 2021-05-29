package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {

    List<JobPosting> findByIsActiveTrue();

    List<JobPosting> findUpdatedAtIsActiveTrue(LocalDate localDate);

    JobPosting findById(int id);

}

