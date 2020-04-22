package com.zss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zss.dao.repository.ConListRepository;
import com.zss.model.ConType;
import com.zss.service.ConListService;

@Service
public class ConListServiceImpl implements ConListService{

	@Autowired
	private ConListRepository conListRepository;
	
	@Override
	public List<ConType> selectConList(Integer page, Integer size) {
		// TODO Auto-generated method stub
		if(null == page) {
			page = 0;
		}
		
		return null;
	}

}
