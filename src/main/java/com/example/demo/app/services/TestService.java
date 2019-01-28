package com.example.demo.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.app.model.Computer;

// Component -> Service, Repository, Controller, RestController(Specialized form of Controller)


@Service
public class TestService {
	
	public List<Computer> getAllComputers(){
		
		List<Computer> list = new ArrayList<>();
		list.add(new Computer(1, "ios", 4, 100000.0f));
		list.add(new Computer(2, "windows", 8, 200000.0f));
		
		return list;
		
	}

}
