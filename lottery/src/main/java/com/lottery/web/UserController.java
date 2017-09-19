package com.lottery.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lottery.entity.User;
import com.lottery.service.UserService;

@Controller
public class UserController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/{id}/detail", method = RequestMethod.GET)
	@ResponseBody
	public User detail(@PathVariable("id") Long id) {
		User user = userService.getUserById(id);
		return user;
	}
}
