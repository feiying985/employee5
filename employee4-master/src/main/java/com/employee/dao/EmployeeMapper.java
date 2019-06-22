package com.employee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.employee.entity.Employee;
/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午1:52:18
 */
public interface EmployeeMapper {
	//根据工号查询
	@Select("select employee_id,name,age,sex,telephone,email,status from employee where employee_id = #{employee_id}")
	public Employee getByEmployee_id(int employee_id);
	
	//查询所有员工
	@Select("select employee_id,name,age,sex,telephone,email,status from employee")
	public List<Employee> getAllEmployee();
	
	//添加员工
	@Insert("insert into employee (employee_id,name,age,sex,telephone,email,status) values (#{employee_id},#{name},#{age},#{sex},#{telephone},#{email},#{status}) ")
	@Options(useGeneratedKeys=true,keyColumn="id")
	public void saveEmployee(Employee employee);
	
	//删除员工
	@Delete("delete from employee where employee_id = #{employee_id}")
	public void deleteByEmployee_id(int employee_id);
	
	//修改员工信息
	@Update("update employee set name = #{name},age = #{age},sex = #{sex},telephone = #{telephone},email = #{email},status = #{status} where employee_id = #{employee_id}")
	public void updateEmployee(Employee employee);
}
