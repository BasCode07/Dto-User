package com.bascode.dto;

import java.util.List;
import lombok.Data;


public class UserLocationDTO {
	
	private long userId;
	private String userName;
	private String place;
	private String description;
	private List<String> addr;
	private double logit;
	private double lati;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getAddr() {
		return addr;
	}
	public void setAddr(List<String> addr) {
		this.addr = addr;
	}
	public double getLogit() {
		return logit;
	}
	public void setLogit(double logit) {
		this.logit = logit;
	}
	public double getLati() {
		return lati;
	}
	public void setLati(double lati) {
		this.lati = lati;
	}
	
	
	
	

}
