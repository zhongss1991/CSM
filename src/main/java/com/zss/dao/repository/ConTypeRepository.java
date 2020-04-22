package com.zss.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zss.dao.ConTypeDao;
import com.zss.model.ConType;

public interface ConTypeRepository extends JpaRepository<ConType, String>{

	@Query(value = "select a.id,a.name from con_type a", nativeQuery = true)
	public List<ConTypeDao> findConType();
}
