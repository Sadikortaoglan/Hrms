package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.JobPostingService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.JobPostingDao;
import com.sadik.hrmscf.entities.concretes.JobPosting;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class JobPostingManager implements JobPostingService {

    private JobPostingDao jobPostingDao;
	@Autowired
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
    public DataResult<List<JobPosting>> findByActivateTrue() {
        return new SuccessDataResult<List<JobPosting>>(jobPostingDao.findByActivateTrue(),Messages.Listed);
    }

    @Override
    public DataResult<List<JobPosting>> findByUpdatedAtAndActivateTrue(LocalDate localDate) {
        return new SuccessDataResult<List<JobPosting>>
                (jobPostingDao.findByUpdatedAtAndActivateTrue(localDate),Messages.Listed);
    }

    @Override
    public DataResult<JobPosting> findById(int id) {
        return null;
    }
}
