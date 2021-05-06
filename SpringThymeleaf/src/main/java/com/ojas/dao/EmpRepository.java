package com.ojas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.domain.Employee;

@Repository
public interface EmpRepository  extends JpaRepository<Employee, Integer>{

}
