package com.sadik.hrmscf.business.abstracts;

import com.sadik.hrmscf.core.utilities.result.Result;
import com.sadik.hrmscf.entities.concretes.Profession;

public interface ProfessionService {
    Result add(Profession profession);
}
