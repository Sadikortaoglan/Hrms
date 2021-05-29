package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.JobPosting;

import java.time.LocalDate;
import java.util.List;
public interface JobPostingService {

   Result add(JobPosting jobPosting);

    DataResult<List<JobPosting>> getAll();
    DataResult<List<JobPosting>> findByIsActiveTrue();

    DataResult<List<JobPosting>> findUpdatedAtIsActiveTrue(LocalDate localDate);

    DataResult<JobPosting> findById(int id);




}
