package com.mfbilgin.HRMS.Business.Abstracts;

import com.mfbilgin.HRMS.Core.Utilities.Results.DataResult;
import com.mfbilgin.HRMS.Core.Utilities.Results.Result;
import com.mfbilgin.HRMS.Entites.Concretes.Language;

import java.util.List;

public interface LanguageService {
    Result add(Language language);
    Result update(Language language);
    Result delete(int languageId);
    DataResult<Language> getById(int id);
    DataResult<List<Language>> getByStaffId(int staff_id);
    DataResult<List<Language>> getByStaffIdOrderByLevelDesc(int staff_id);
}
