package com.yongmin.portfolio;

public class MemberVO {
	private String name;
	private int age;
	private String school;
	public MemberVO(String name, int age, String school) {
		super();
		this.name = name;
		this.age = age;
		this.school = school;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
}
