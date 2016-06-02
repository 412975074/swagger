package com.myapp.beans;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value="person",description="this person")
public class Person {

	private String name;
	
	private String phone;

	public String getName() {
		return name;
	}

	@ApiModelProperty(value="为什么",required=true)
	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	@ApiModelProperty(value="我有点不明白啊",required=false)
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
