package com.lottery.service;

import java.util.List;

import com.lottery.entity.History;

public interface HistoryService {
	History getHistoryById(int id);

	List<History> getHistories();

	int insertHistory(History history);
}
