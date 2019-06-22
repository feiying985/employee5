package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeMapper;
import com.employee.entity.Employee;
/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午1:51:54
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeMapper employeeMapper;
	//根据工号查询员工
	public Employee getByEmployee_id(int employee_id) { 
		return employeeMapper.getByEmployee_id(employee_id);
	}
	//查询所有员工
	public List<Employee> getAllEmployee(){
		return employeeMapper.getAllEmployee();
	}
	//添加员工
	@Transactional  //添加事务
	public void saveEmployee(Employee employee) {
		employeeMapper.saveEmployee(employee);
	}
	//删除员工
	@Transactional  //添加事务
	public void deleteByEmployee_id(int employee_id) {
		employeeMapper.deleteByEmployee_id(employee_id);
	}
	//修改员工信息
	@Transactional  //添加事务
	public void updateEmployee(Employee employee) {
		employeeMapper.updateEmployee(employee);
	}
}
