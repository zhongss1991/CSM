package com.zss.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zss.dao.ConTypeDao;
import com.zss.dao.repository.ConTypeRepository;
import com.zss.model.ConType;

@RestController
public class ConTypeController {

	@Autowired
	private ConTypeRepository conTypeRepository;
	
	@RequestMapping("getConType")
	public List<ConType> getConType() {
		
		return conTypeRepository.findAll();
	}
	
	@RequestMapping(value = "conTypeList", method = RequestMethod.GET)
	public ModelAndView conTypeList() {
		ModelAndView mv = new ModelAndView("contype");
		return mv;
	}
	
	@RequestMapping(value = "saveConType", method = RequestMethod.POST)
	public void saveConType(ConType conType, HttpServletRequest request) {
		String oper = request.getParameter("oper");
		if(oper.equals("add")) {
			//新增
//			conType.setId("2");
			conTypeRepository.save(conType);
		}else if(oper.equals("edit")) {
			//修改
			conTypeRepository.save(conType);
		}else if(oper.equals("del")) {
			conTypeRepository.deleteById(conType.getId());
		}
	}
	
	@RequestMapping(value = "getConTypeName", method = RequestMethod.POST)
	public List<ConTypeDao> getConTypeName() {
		
		return conTypeRepository.findConType();
	}
}

