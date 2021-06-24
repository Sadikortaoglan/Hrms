package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.ProfessionService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessDataResult;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.ProfessionDao;
import com.sadik.hrmscf.entities.concretes.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionManager implements ProfessionService {
    @Autowired
    private final ProfessionDao professionDao;
    public ProfessionManager(ProfessionDao professionDao) {
        this.professionDao = professionDao;
    }



    @Override
    public Result add(Profession profession) {
        professionDao.save(profession);
        return new SuccessResult(Messages.Success);
    }

    @Override
    public DataResult<List<Profession>> getall() {
        return new SuccessDataResult<>(professionDao.findAll(),Messages.Listed);
    }
}
