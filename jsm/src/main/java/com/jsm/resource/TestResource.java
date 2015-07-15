package com.jsm.resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.jsm.service.MessageService;
import com.jsm.service.UserService;

@Component
@Path("test")
@Scope("prototype")
public class TestResource {
	
	@Autowired
	private MessageService messageService;
	
	@Autowired
	private UserService userService;
	
	@GET
	@Path("hello")
	@Produces(MediaType.APPLICATION_JSON)
	public String hello(){
		return messageService.getMessage();
	}
	
	@GET
	@Path("add")
	@Produces(MediaType.APPLICATION_JSON)
	public String add(){
		return messageService.addMessage();
	}
	
	@GET
	@Path("addUser")
	@Produces(MediaType.APPLICATION_JSON)
	public String addUser(){
		userService.addBlog();
		return "success";
	}
}
