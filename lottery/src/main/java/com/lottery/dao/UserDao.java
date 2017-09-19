package com.lottery.dao;

import com.lottery.entity.User;

public interface UserDao {
	User queryById(long id);
}
