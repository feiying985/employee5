package com.employee.entity;
/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午1:07:35
 */
public class Employee {
	
	private int employee_id;//工号，唯一索引
	private String name;       //姓名
	private int age;           //年龄
	private int sex;           //性别
	private String telephone;  //电话
	private String email;      //邮件地址
	private int status;        //在职状态
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", telephone=" + telephone + ", email=" + email + ", status=" + status + "]";
	}
	
	
}
