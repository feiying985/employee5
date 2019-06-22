package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.UserMapper;
import com.employee.entity.User;

/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午7:23:16
 */
@Service
public class UserService {
	@Autowired
    private UserMapper userMapper;
    
	//根据用户名查询用户
	public User getByUser_name(String user_name) {
		return userMapper.getByUser_name(user_name);
	}
	//所有用户查询
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
	//添加用户
	@Transactional  //添加事务
	public void saveUser(User user) {
		userMapper.saveUser(user);
	}
	//删除用户
	@Transactional  //添加事务
	public void deleteByUser_name(String user_name) {
		userMapper.deleteByUser_name(user_name);
	}
	//更新用户信息
	@Transactional  //添加事务
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
}
