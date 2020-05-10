package com.manish.soni;

public class Person {

	private String name;

	private int age;

	private String gender;

	private String address;

	Person(String name, int age, String gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}

}
