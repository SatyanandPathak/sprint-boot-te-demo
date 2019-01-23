package com.example.demo.app.model;

import org.springframework.stereotype.Component;

@Component
public class Computer {
	
	private int deviceId;
	
	private String os;
	private int memory;
	private float ram;
	
	public int getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public float getRam() {
		return ram;
	}
	public void setRam(float ram) {
		this.ram = ram;
	}

}
