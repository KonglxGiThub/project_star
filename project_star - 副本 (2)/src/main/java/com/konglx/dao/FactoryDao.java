package com.konglx.dao;

import java.util.Map;

import com.konglx.domain.Factory;

/**
 * @Description:
 * @Author:	konglx
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2019/12/08
 */
public interface FactoryDao extends BaseDao<Factory> {
	public void changeState(Map<String,Object> map);
}
