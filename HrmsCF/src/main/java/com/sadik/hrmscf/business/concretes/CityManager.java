package com.sadik.hrmscf.business.concretes;

import com.sadik.hrmscf.business.abstracts.CityService;
import com.sadik.hrmscf.business.constans.Messages;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.core.utilities.result.SuccessResult;
import com.sadik.hrmscf.dataAccess.abstracts.CityDao;
import com.sadik.hrmscf.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityManager implements CityService {
    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public Result add(City city) {
        cityDao.save(city);
        return  new SuccessResult(Messages.Success);
    }
}
