package com.second;

public class Student {
	int rn;
	String name;
	int marks;
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", marks=" + marks + "]";
	}
	public Student(int rn, String name, int marks) {
		super();
		this.rn = rn;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
