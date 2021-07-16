package com.bhavesh.app;

public class Test {

	public static void main(String[] args) {
		
		/*Cat cat = new Cat();	// create object of cat
		
		cat.setName("My Catt");
		cat.setColor("White");
		
		cat.info();
		
		Cat cat2 = new Cat("Black");
		
		cat2.info();*/
		
		//Animal animal = new Animal();
		
		//A super class reference can refer subclass object always
		Animal animal = new Cat("Cattiee", "Black");
		
		animal.makeNoise();
		
		animal.sleep();
		// Cat c = new Animal(); This is incorrect statement
		
		
	}

}
