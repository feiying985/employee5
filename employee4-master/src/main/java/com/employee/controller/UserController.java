package com.employee.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.entity.User;
import com.employee.service.UserService;
import com.employee.utils.UserUtil;

/**
 * 
 * @author lanzefei
 * @date 2019年6月20日 下午7:29:49
 */
@Controller
public class UserController {
	@Autowired
    private UserService userService;
	@Autowired
	private UserUtil userUtil;
	
	//展示所有用户信息
	@RequestMapping("/getAllUser")
	public String getAllUser(Map<String,List<User>> map){
		List<User> listUser = userService.getAllUser();
		map.put("listUser", listUser);
		return "listUser";   //返回/WEB-INF/jsp/listUser.jsp
	}
	
	/**
	//登录表单
	@RequestMapping("/formUserLogin")
	public String formUserLogin() {
		return "formUserLogin";
	}
	**/
	//添加用户
	@RequestMapping("/saveUser")
	public String saveEmployee(User user) {
		userService.saveUser(user);
		return "redirect:getAllUser";     //重定向，重新查询所有用户，并展示
	}
	
	//删除用户
	@RequestMapping("/deleteUser")
	public String deleteEmployee(String user_name) {
		userService.deleteByUser_name(user_name);
		return "redirect:getAllUser";   
	}
	
	//修改用户信息
	@RequestMapping("/updateUser")   
	public String updateUser(User user) {
		userService.updateUser(user);
		return "redirect:getAllUser";   
	}
	
	//处理登录请求
	@RequestMapping("/loginHandle")
	public String loginHandle(User user,HttpSession session) {
		if(userUtil.isExists(user)) {
			session.setAttribute("user", user);      //登陆成功，就设置session
		}
		return "redirect:getAllEmployee";    //重定向到员工列表请求
	}
	
	//处理注销请求
	@RequestMapping("/quitHandle")
	public String quitHandle(HttpSession session) {
		session.removeAttribute("user");      //退出登录就移除session
		return "redirect:formUserLogin.jsp";      //重定向到登陆界面
	}
}
