package com.zss.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zss.dao.ConListTypeDao;
import com.zss.model.ConList;
import com.zss.model.ConType;

public interface ConListRepository extends JpaRepository<ConList, String>{

	@Query(value="select a.conid,a.contypeid,a.receiveUser,a.receiveTime,a.receiveNum,b.name from con_list a left join con_type b on a.contypeid=b.id", nativeQuery = true)
	public List<ConListTypeDao> findConList();
}
