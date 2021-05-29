package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {

   DataResult<JobSeeker> add(JobSeeker jobSeeker ) ;

  Result delete(int id);

   Result get(int id);

  DataResult<List<JobSeeker>> getAll();
}
