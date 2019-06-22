package com.employee.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午1:51:39
 */
@Controller     //@RestController返回json格式
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	//展示所有员工信息
	@RequestMapping("/getAllEmployee")    //url提交此请求，映射到下面方法getAllEmployee(Map<String,List<Employee>> map)
	public String getAllEmployee(Map<String,List<Employee>> map){    //利用map接收参数
		List<Employee> listEmployee = employeeService.getAllEmployee();
		map.put("listEmployee", listEmployee);
		//这里设置一个参数listEmployee,让前端去获取
		return "listEmployee";   //返回员工列表视图，application.properties中配置了前缀贺后缀
	}
	
	//根据工号展示员工
	@RequestMapping("/getByEmployee_id")
	public String getByEmployee(int employee_id,Map<String,Employee> map) {
		Employee employee = employeeService.getByEmployee_id(employee_id);
		map.put("employee", employee);      //前端获取
		return "listOneEmployee";
	}	
	
	//获取表单中的信息，然后添加员工，employee.employee_id,employee.name......
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:getAllEmployee";   //重定向
	}
	
	//删除员工
	@RequestMapping("/deleteEmployee")
	public String deleteEmployee(int employee_id) {
		employeeService.deleteByEmployee_id(employee_id);
		return "redirect:getAllEmployee";   //返回删除成功视图
	}
	
	//修改员工信息
	@RequestMapping("/updateEmployee")   //要从前端提交一个表单(可以用一个编辑跳到表单)
	public String updateEmployee(Employee employee) {
		employeeService.updateEmployee(employee);
		return "redirect:getAllEmployee";   //返回更新成功视图
	}

	
}
