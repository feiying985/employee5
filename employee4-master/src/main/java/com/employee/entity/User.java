package com.employee.entity;
/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午7:08:45
 */
public class User {
	
	private String user_name;      //用户名
	private String user_password;  //用户密码
	private int permission_level;  //用户权限
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public int getPermission_level() {
		return permission_level;
	}
	public void setPermission_level(int permission_level) {
		this.permission_level = permission_level;
	}
	
	@Override
	public String toString() {
		return "User [user_name=" + user_name + ", user_password=" + user_password + ", permission_level="
				+ permission_level + "]";
	}
	
	
}
