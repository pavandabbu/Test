package com.mtc.app;

public class Employee{
	
	private int id;
	private String name;
	private int phno;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public Employee(int id, String name, int phno) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
	}
	

}
