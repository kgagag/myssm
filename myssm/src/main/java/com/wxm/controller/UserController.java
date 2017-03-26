package com.wxm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.client.support.HttpAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wxm.dao.UserDao;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserDao userDao;
	@RequestMapping("/showUser")
	@ResponseBody
	public Object showUser(HttpServletRequest request){
		return this.userDao.getById(1);
	}
}
