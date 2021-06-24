package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.City;
import java.util.List;
public interface CityService {
    Result add(City city);
    DataResult<List<City>> getall();


}
