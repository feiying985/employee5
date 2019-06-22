package com.employee.utils;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.employee.entity.User;
import com.employee.service.UserService;

/**
 * 工具类，验证用户信息等
 * @author lanzefei
 * @date 2019年6月21日 下午2:52:14
 */
@Component
public class UserUtil {
	@Autowired
	private UserService userService;
	public Boolean isExists(User user) {
		Boolean flag = false;
		String password = null;
	    List<User> listUser = userService.getAllUser();
	    //遍历用户
	    Iterator<User> iterator = listUser.iterator();
	    while(iterator.hasNext()) {
	    	User myuser = iterator.next();
	    	if(user.getUser_name().equals(myuser.getUser_name())) {
	    		password = myuser.getUser_password();    //保存此用户的密码
	    		flag = true;
	    		break;    //跳出循环
	    	}
	    }
	  //存在用户名，再判断密码是否正确
		if(flag) {
			if(user.getUser_password().equals(password)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;    //用户名不存在
		}
	}
	
}
