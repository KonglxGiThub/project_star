package com.konglx.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konglx.dao.FactoryDao;
import com.konglx.domain.Factory;
import com.konglx.service.FactoryService;

/**
 * @Description:
 * @Author:	konglx
 * @CreateDate:	2019-12-08
 */
@Service
public class FactoryServiceImpl implements FactoryService {
	@Autowired
	FactoryDao factoryDao;
	
	public List<Factory> find(Factory factory) {
		return factoryDao.find(factory);
	}

	public Factory get(Serializable id) {
		return factoryDao.get(id);
	}

	public void insert(Factory factory) {
		factoryDao.insert(factory);
	}

	public void update(Factory factory) {
		factoryDao.update(factory);
	}

	public void delete(Serializable id) {
		factoryDao.delete(id);
	}

	public void delete(Serializable[] ids) {
		factoryDao.delete(ids);
	}

	public void changeState(Map<String, Object> map) {
		factoryDao.changeState(map);
	}

}
