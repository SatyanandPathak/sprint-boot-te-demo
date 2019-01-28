package com.example.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.model.Computer;
import com.example.demo.app.services.TestService;

// Spring related Annotation
@RestController
@RequestMapping("test")
public class TestController {
	
	
	@Autowired
	private TestService services;
	
	@RequestMapping(method=RequestMethod.GET, path="/devices")
	public List<Computer> getAllComputers(){
		return services.getAllComputers();
	}
		
	@RequestMapping(method=RequestMethod.GET)
	public String greet(){
		return "Hello There";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="another-greet")
	public String greetMe(){
		return "Hello There another";
	}
	
	@RequestMapping(method=RequestMethod.POST, path="device")
	public Computer addNewDevices(@RequestBody Computer computer){
		Computer newComp = computer;
		newComp.setDeviceId(1);
		return newComp;
		
	}
	
	
	@RequestMapping(method=RequestMethod.PUT, path="device/{deviceId}")
	public Computer updateDevices(@RequestBody Computer computer, @PathVariable int deviceId){

		// from database get the computer obj having id = deviceId
		//Computer computerToUpdate = new Computer().getDeviceId();
		System.out.println("device id obtained is==="+deviceId);
		
		return computer;
		
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, path="device/{deviceId}")
	public void deleteDevices(@PathVariable int deviceId){

		// from database get the computer obj having id = deviceId
		//Computer computerToUpdate = new Computer().getDeviceId();
		System.out.println("device id in delete is=="+deviceId);
				
	}
	
	

}
