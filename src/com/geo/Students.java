package com.geo;

public class Students {
	int rollNum;
	String name;
	
	
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Students(String name, int rollNum) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Students [rollNum=" + rollNum + ", name=" + name + "]";
	}
}
