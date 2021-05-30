package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    DataResult<Employer> save(Employer employer);

    Result delete(int id);

    DataResult<List<Employer>> getAll();

}
