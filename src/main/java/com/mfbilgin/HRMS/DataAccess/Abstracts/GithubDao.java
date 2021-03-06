package com.mfbilgin.HRMS.DataAccess.Abstracts;

import com.mfbilgin.HRMS.Entites.Concretes.Github;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public interface GithubDao  extends JpaRepository<Github,Integer> {
    Github getByStaff_Id(@NotNull @NotBlank int staff_id);
}
