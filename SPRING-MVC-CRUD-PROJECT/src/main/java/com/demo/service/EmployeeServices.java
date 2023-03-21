package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.demo.dao.EmployeeDao;
import com.demo.model.Employee;

@Component
@Service
public class EmployeeServices 
{
	@Autowired
	@Qualifier(value="employeeDao")

	EmployeeDao employeeDao;
	
	
	public void addEmp(Employee emp)
	{
		employeeDao.addEmployee(emp);
	}
	public List<Employee> getAllEmp()
	{
		return employeeDao.getAllEmp();
	}
	
	public Employee getById(Long id)
	{
		return employeeDao.getEmpById(id);
	}
	
	public void updateEmp(Employee emp)
	{
		employeeDao.updateEmp(emp);
	}
	
	public void deleteEmp(Long id)
	{
		employeeDao.deleteEmp(id);
	}
	
	
}
