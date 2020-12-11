package com.cg.employeepayollapp.service;

import java.util.List;

import com.cg.employeepayollapp.dto.EmployeePayrollDTO;
import com.cg.employeepayollapp.model.EmployeePayrollData;


public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);

	void deleteEmployeePayrollData(int empId);
}
