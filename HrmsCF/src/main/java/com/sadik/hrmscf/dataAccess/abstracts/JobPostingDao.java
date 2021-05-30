package com.sadik.hrmscf.dataAccess.abstracts;

import com.sadik.hrmscf.entities.concretes.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@EnableJpaRepositories
@Repository
public interface JobPostingDao extends JpaRepository<JobPosting,Integer> {

   List<JobPosting> findByActivateTrue();

    List<JobPosting> findByUpdatedAtAndActivateTrue(LocalDate localDate);

    JobPosting findById(int id);

}

