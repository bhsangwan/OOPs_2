package com.bhavesh.app;

public class Animal extends Object{

	private String name;
	
	public Animal() {
		System.out.println("Animal Object is created..!");
	}

	public Animal(String name) {
		this.name =name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Animal is eating something");
	}
	
	//eat method is overloaded two times
	public void eat(String item) {
		System.out.println("Animal is eating "+item);
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	
	public void makeNoise() {
		System.out.println("Animal is making some noise");
	}
	
	public void info() {
		System.out.println("This is an Animal");
		System.out.println("Name is : " + name);
	}
}
