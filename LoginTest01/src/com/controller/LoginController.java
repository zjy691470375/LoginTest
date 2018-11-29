package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Users;
import com.service.UsersService;

/**
 * 登录控制器
 * 
 * @author dougang
 *
 */
@Controller
public class LoginController extends GenericController {

	@Resource(name = "usersService")
	private UsersService usersService;

	public UsersService getUsersService() {
		return usersService;
	}

	public void setUsersService(UsersService usersService) {
		this.usersService = usersService;
	}

	@RequestMapping("/LoginController_login.do")
	public ModelAndView login(Users users) {
		Users currentUser = this.usersService.loginValidate(users.getUsername());
		if (currentUser == null) {
			return new ModelAndView("login", "error", "用户名不存在");
		} else {
			if (currentUser.getPassword().equals(users.getPassword())) {
				this.session.setAttribute("currentUser", currentUser);
				return new ModelAndView("index");
			} else {
				return new ModelAndView("login", "error", "密码错误");
			}
		}
	}

}
