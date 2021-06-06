package com.nt.beans;
import java.util.Date;
public class WishMessageGenerator {
	private String name;
	private Date date;
	public void setName(String name) {
		this.name=name;
	}
	public void setDate(Date date) {
		this.date=date;
	}
	public String generateWishMsg() {
	return"Good Morning ` "+name+"---->"+date;
	
		}
	}

