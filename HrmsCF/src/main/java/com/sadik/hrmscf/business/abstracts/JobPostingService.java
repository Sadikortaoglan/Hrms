package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.JobPosting;
import com.sadik.hrmscf.entities.dtos.JobPostingForEmployerDto;

import java.time.LocalDate;
import java.util.List;

public interface JobPostingService {

    Result add(JobPostingForEmployerDto jobPostingForEmployerDto);

    DataResult<List<JobPosting>> getAll();

    DataResult<List<JobPosting>> findByActivateTrue();

    DataResult<List<JobPosting>> findByUpdatedAtAndActivateTrue(LocalDate localDate);

    DataResult<JobPosting> findById(int id);


}
