package com.charles.test1;

public class Triangle extends Shape{

	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		this.height = height;
		this.base = base;
	}
	
	@Override
	public double getArea() {
		return 0.5* height*base;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "are="+this.getArea();
	}
	
}
