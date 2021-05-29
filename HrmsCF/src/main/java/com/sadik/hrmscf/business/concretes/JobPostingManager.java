package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.JobPostingService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.JobPostingDao;
import com.sadik.hrmscf.dataAccess.abstracts.JobSeekerDao;
import com.sadik.hrmscf.entities.concretes.JobPosting;

import java.time.LocalDate;
import java.util.List;

public class JobPostingManager implements JobPostingService {

    private JobPostingDao jobPostingDao;

    public JobPostingManager(JobPostingDao jobPostingDao) {
        this.jobPostingDao = jobPostingDao;
    }
    @Override
    public Result add(JobPosting jobPosting) {
        this.jobPostingDao.save(jobPosting);
        return new SuccessResult(Messages.Success);
    }

    @Override
    public DataResult<List<JobPosting>> getAll() {
        return new SuccessDataResult<List<JobPosting>>(jobPostingDao.findAll(),Messages.Listed);
    }

    @Override
    public DataResult<List<JobPosting>> findByIsActiveTrue() {
        return new SuccessDataResult<List<JobPosting>>(jobPostingDao.findByIsActiveTrue(),Messages.Listed);
    }

    @Override
    public DataResult<List<JobPosting>> findUpdatedAtIsActiveTrue(LocalDate localDate) {
        return new SuccessDataResult<List<JobPosting>>
                (jobPostingDao.findUpdatedAtIsActiveTrue(localDate),Messages.Listed);
    }

    @Override
    public DataResult<JobPosting> findById(int id) {
        return null;
    }
}
