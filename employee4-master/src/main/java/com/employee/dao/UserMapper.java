package com.employee.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.employee.entity.Employee;
import com.employee.entity.User;

/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午7:11:27
 */
public interface UserMapper {
	//根据用户名查询
	@Select("select user_name,user_password,permission_level from user where user_name = #{user_name}")
	public User getByUser_name(String user_name);
	
	//查询所有用户
    @Select("select user_name,user_password,permission_level from user")
    public List<User> getAllUser();
    
    //添加用户
  	@Insert("insert into user (user_name,user_password,permission_level) values (#{user_name},#{user_password},#{permission_level}) ")
  	@Options(useGeneratedKeys=true,keyColumn="id")
  	public void saveUser(User user);
  	
  	//删除用户
  	@Delete("delete from user where user_name = #{user_name}")
  	public void deleteByUser_name(String user_name);
  	
  	//修改用户信息
  	@Update("update user set user_password = #{user_password},permission_level = #{permission_level} where user_name = #{user_name}")
  	public void updateUser(User user);
}
