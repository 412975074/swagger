package com.myapp.beans;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(value="contact",description="联系人")
public class Contact {
	
   private String name;
   
   private Long id;
   
   private String address;
   
   
   
public String getAddress() {
	return address;
}

@ApiModelProperty(value="dizhi",required=true)
public void setAddress(String address) {
	this.address = address;
}

public String getName() {
	return name;
}
 
@ApiModelProperty(value="这只是姓名",required=true)
public void setName(String name) {
	this.name = name;
}


public Long getId() {
	return id;
}

@ApiModelProperty(value="好像是Id",required=false)
public void setId(Long id) {
	this.id = id;
}
}
