package com.myapp.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myapp.beans.Contact;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


@Api(value = "contacts", description = "中文")
@Controller
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired  
    private HttpServletRequest request;
 
  @ResponseBody
  @RequestMapping(value="/{id}",method=RequestMethod.GET)  
  @ApiOperation(value = "添加用户get", notes = "返回用户基本信息",response=Contact.class)
  @ApiResponses(value={
		  @ApiResponse(code=301,message="跳转"),
		  @ApiResponse(code=404,message="找不到"),
		  @ApiResponse(code=500,message="服务器报错")
  })
  public Map<String, String> get(@ApiParam(name="id",value="aaaaa") @PathVariable Long id,
		  @ApiParam(name="name",value="this is name") @RequestParam(required=false) String name) {
    Map<String, String> m = new HashMap<String, String>();
    m.put("name", "wanzz");
    m.put("id", id.toString());
    m.put("api_key", request.getHeader("api_key"));
    return m;
  }
  
  @ResponseBody
  @RequestMapping(value="/post",method=RequestMethod.POST)
  @ApiOperation(value = "获取用户post", notes = "返回用户",response=Contact.class) 
  public Map<String,String> add(@RequestBody Contact contact) {

	  Map<String,String> m = new HashMap<String,String>();
	    m.put("name", "wanzz");
	    m.put("id", "1111");
	    return m;
  }
 
  @ResponseBody
  @RequestMapping(value="put",method=RequestMethod.PUT)
  @ApiOperation(value = "获取用户put", notes = "返回用户",response=Contact.class)
  public Map<String, String> update(@RequestParam Long id,@RequestBody Contact contact) {
    contact.setId(id);
    Map<String, String> m = new HashMap<String, String>();
    m.put("name", "wanzz");
    m.put("id", "1111");
    return m;
  }
  
  @ResponseBody
  @RequestMapping(value="delete",method=RequestMethod.DELETE)
  @ApiOperation(value = "delete用户", notes = "返回用户",response=Contact.class)
  public Map<String, String> delete(@RequestParam Long id) {
    Map<String, String> m = new HashMap<String, String>();
    m.put("name", "wanzz");
    m.put("id", "1111");
    return m;
  }
  
  @ResponseBody
  @RequestMapping(value="/apost",method=RequestMethod.POST)
  @ApiOperation(value = "获取用户with", notes = "返回用户",response=Contact.class) 
  public Map<String,String> addUser(@RequestParam(required=false) String name,
		  @RequestBody Contact contact) {

	  Map<String,String> m = new HashMap<String,String>();
	    m.put("name", "wanzz");
	    m.put("id", "1111");
	    return m;
  }
 
 
}
