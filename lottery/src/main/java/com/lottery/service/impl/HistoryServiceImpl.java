package com.lottery.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.HistoryDao;
import com.lottery.entity.History;
import com.lottery.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private HistoryDao historyDao;

	@Override
	public History getHistoryById(int id) {
		History history = historyDao.queryById(id);
		return history;
	}

	@Override
	public List<History> getHistories() {
		List<History> list = historyDao.queryAll();
		return list;
	}

	@Override
	public int insertHistory(History history) {
		int result = historyDao.insertHistory(history);
		return result;
	}
}
