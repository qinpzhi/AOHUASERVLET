package com.aohua.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aohua.dao.Pu_PurOrderDao;
import com.aohua.model.Pu_PurOrder;
import com.aohua.model.Pu_PurOrderDt;

@Service
public class Pu_PurOrderService {
	@Autowired
	private Pu_PurOrderDao pu_PurOrderDao;
	public Long add(final Pu_PurOrder pu_PurOrder){
		return pu_PurOrderDao.add(pu_PurOrder);
	}
	public void addDt(final List<Pu_PurOrderDt> list){
		pu_PurOrderDao.addDt(list);
	}
}