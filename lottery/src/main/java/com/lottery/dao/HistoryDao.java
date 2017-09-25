package com.lottery.dao;

import java.util.List;

import com.lottery.entity.History;

public interface HistoryDao {
	History queryById(int id);

	List<History> queryAll();

	int insertHistory(History history);
}
