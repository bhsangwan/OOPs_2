package com.bhavesh.app;

public class Cat extends Animal{
	
	private String color;

	
	//User Defined Constructor but it is similar to JVM provided default constructor
	public Cat() {
		super("SomeName");	//super();
		System.out.println("Constructing object of type Cat");
	}
	
	public Cat(String color) {
		super("SomeName");
		this.color = color;
	}
	
	public Cat(String name, String color) {
		super(name);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// Or I can provide cat specific version of super type property
	//Method Overriding
	public void eat() {
		System.out.println("Cat is eating milk..!");
	}
	
	//Method Overriding
	public void makeNoise() {
		System.out.println("Miyaaaun Miyaaaun..!");
	}
	
	// And I can introduce additional properties in Cat
	public void jump() {
		System.out.println(getName() + " is jumping");
	}
}
