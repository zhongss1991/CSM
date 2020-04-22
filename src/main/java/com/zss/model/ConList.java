package com.zss.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "con_list")
@Entity
public class ConList implements Serializable{

	private static final long serializableUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, unique = true, name = "conid")
	private String conId;
	@Column(nullable = false, unique = true, name = "contypeid")
	private int conTypeId;
	@Column(nullable = false, unique = true, name = "receiveuser")
	private String receiveUser;
	@Column(nullable = false, unique = true, name = "receivetime")
	private String receiveTime;
	@Column(nullable = false, unique = true, name = "receivenum")
	private int receiveNum;
	public int getReceiveNum() {
		return receiveNum;
	}
	public void setReceiveNum(int receiveNum) {
		this.receiveNum = receiveNum;
	}
	public String getConId() {
		return conId;
	}
	public void setConId(String conId) {
		this.conId = conId;
	}
	public int getConTypeId() {
		return conTypeId;
	}
	public void setConTypeId(int conTypeId) {
		this.conTypeId = conTypeId;
	}
	public String getReceiveUser() {
		return receiveUser;
	}
	public void setReceiveUser(String receiveUser) {
		this.receiveUser = receiveUser;
	}
	public String getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(String receiveTime) {
		this.receiveTime = receiveTime;
	}
	
}

