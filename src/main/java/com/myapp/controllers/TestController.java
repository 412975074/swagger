package com.myapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myapp.beans.Person;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

@Api(value="test",description="test person")
@Controller
@RequestMapping("/test")
public class TestController {

	@ResponseBody
	@RequestMapping(value="aa/{name}",method=RequestMethod.POST)
	@ApiOperation(value="query person",notes="aaaa",response=Person.class)
	@ApiResponses(value={
			@ApiResponse(code=404,message="好像找不到")
	})
	public Map<String,String> test(
			@PathVariable String name,
			@RequestParam String phone,
			@RequestBody Person person){
		Map<String, String> m = new HashMap<String, String>();
	    m.put("name", "wanzz");
	    m.put("phone", "1111");
	    return m;
	}
	
	@ResponseBody
	@RequestMapping(value="bb/{phone}",method=RequestMethod.GET)
	@ApiOperation(value="bb",notes="ss",response=Person.class)
	public Map<String,String> fire(@RequestParam String name,@PathVariable String phone){
		Map<String, String> m = new HashMap<String, String>();
	    m.put("name", "wanzz");
	    m.put("phone", "1111");
	    return m;
	}
}
