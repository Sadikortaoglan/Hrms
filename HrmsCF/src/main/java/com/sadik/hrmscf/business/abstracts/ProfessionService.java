package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.DataResult;
import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Profession;
import java.util.List;
public interface ProfessionService {
    Result add(Profession profession);
    DataResult<List<Profession>> getall();
}
