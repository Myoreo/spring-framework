package org.springframework.tests;

public class Person {

	private String name;
	private int age;
	private God god;
	
	public Person() {
		System.out.println("【Person】 constructor");
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

	public God getGod() {
		return god;
	}

	public void setGod(God god) {
		this.god = god;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
