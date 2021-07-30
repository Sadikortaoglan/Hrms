package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.JobPostingService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.CityDao;
import com.sadik.hrmscf.dataAccess.abstracts.EmployerDao;
import com.sadik.hrmscf.dataAccess.abstracts.JobPostingDao;
import com.sadik.hrmscf.entities.concretes.JobPosting;
import com.sadik.hrmscf.entities.dtos.JobPostingForEmployerDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class JobPostingManager implements JobPostingService {

    private JobPostingDao jobPostingDao;
    private ModelMapper modelMapper;
    private CityDao cityDao;
    private EmployerDao employerDao;
	@Autowired
    public JobPostingManager(JobPostingDao jobPostingDao, ModelMapper modelMapper,CityDao cityDao,EmployerDao employerDao) {
        this.jobPostingDao = jobPostingDao;
        this.modelMapper=modelMapper;
        this.cityDao=cityDao;
        this.employerDao=employerDao;

    }

    @Override
    public Result add(JobPostingForEmployerDto jobPostingForEmployerDto) {

	/*    modelMapper.addMappings(new PropertyMap<jobPostingForEmployerDto,JobPosting>() {
	        @Override
            protected void configure(){
	            map()
            }
        })*/

        /*JobPosting jobPosting=modelMapper.map(jobPostingForEmployerDto,JobPosting.class);

        jobPosting.setApprovalStatus(false);
        jobPosting.setActivate(false);
         jobPostingDao.save(jobPosting);*/
        JobPosting jobPosting=new JobPosting();
        jobPosting.setApplicationDeadline(jobPostingForEmployerDto.getApplicationDeadline());
        jobPosting.setCity(this.cityDao.getById(jobPostingForEmployerDto.getCityId()));
        jobPosting.setEmployer(this.employerDao.findById(jobPostingForEmployerDto.getEmployerId()));
        jobPosting.setJobDescription(jobPostingForEmployerDto.getJobDescription());
        jobPosting.setNumberOfApplication(jobPostingForEmployerDto.getNumberOfApplication());

        jobPostingDao.save(jobPosting);
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
