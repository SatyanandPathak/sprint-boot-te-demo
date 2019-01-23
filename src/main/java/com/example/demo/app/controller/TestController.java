package com.example.demo.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.app.model.Computer;

@RestController
@RequestMapping("test")
public class TestController {
	
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
	
	
	@RequestMapping(method=RequestMethod.PUT, path="device", value="{/{deviceId}}")
	public Computer updateDevices(@RequestBody Computer computer, @PathVariable int deviceId){

		// from database get the computer obj having id = deviceId
		//Computer computerToUpdate = new Computer().getDeviceId();
		
		
		return computer;
		
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE, path="device", value="{/{deviceId}}")
	public Computer deleteDevices(@PathVariable int deviceId){

		// from database get the computer obj having id = deviceId
		//Computer computerToUpdate = new Computer().getDeviceId();
		
		
		return null;
		
	}
	
	

}
