package com.zss.service;

import java.util.List;

import com.zss.model.ConType;

public interface ConListService {

	public List<ConType> selectConList(Integer page, Integer size);
	
}
