package com.lottery.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.UserDao;
import com.lottery.entity.User;
import com.lottery.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUserById(long id) {
		return userDao.queryById(id);
	}

}
