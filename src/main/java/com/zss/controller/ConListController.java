package com.zss.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zss.dao.ConListTypeDao;
import com.zss.dao.repository.ConListRepository;
import com.zss.dao.repository.ConTypeRepository;
import com.zss.model.ConList;
import com.zss.model.ConType;

@RestController
public class ConListController {

	@Autowired
	private ConListRepository conListRepository;
	
	@RequestMapping(value = "conList", method = RequestMethod.GET)
	public ModelAndView conList() {
		ModelAndView mv = new ModelAndView("conList");
		return mv;
	}
	
	//获取列表
	@RequestMapping(value = "getConList", method = RequestMethod.GET)
	public List<ConListTypeDao> getConList() {
		List<ConListTypeDao> conList = conListRepository.findConList();
		return conList;
	}
	
	@RequestMapping(value = "saveConList", method = RequestMethod.POST)
	public void saveConList(ConList conList, HttpServletRequest request) {
		String oper = request.getParameter("oper");
		String id = request.getParameter("name");
		conList.setConTypeId(Integer.parseInt(id));
		if(oper.equals("add")) {
			conListRepository.save(conList);
		}
	}
}

