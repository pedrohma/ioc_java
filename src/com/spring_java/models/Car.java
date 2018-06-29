package com.spring_java.models;

import java.util.Random;

public class Car {
	
	public Car() {
		System.out.println("Creating a new car... Vrummmm!!!");
	}
	
	public void GetSpeed() {
		System.out.println("Driving at " + new Random().nextInt(200) + " miles per hour!");
	}
}
