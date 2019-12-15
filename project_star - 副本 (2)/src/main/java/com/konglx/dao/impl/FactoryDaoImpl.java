package com.konglx.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.konglx.dao.FactoryDao;
import com.konglx.domain.Factory;

/**
 * @Description:
 * @Author:	konglx
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2019-12-08
 */
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{
	public FactoryDaoImpl() {
		this.setNs("com.konglx.mapper.FactoryMapper.");			//设置命名空间
	}
	
	public void changeState(Map<String, Object> map) {
		this.getSqlSession().update(this.getNs() + "changeState", map);
	}
}
