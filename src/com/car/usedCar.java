package com.car;

public class usedCar extends Car {
private double miles;

	public usedCar(String make, String model, int year, double price) {
		super (make,model,year,price);
	}
	public usedCar(String make, String model, int year, double price,double miles) {
		super(make, model, year, price, miles);
		
	}

	public double getMiles() {
		return miles;
	}
@Override
	public void setMiles(double miles) {
	super.setMiles(miles);
	System.out.println("TEST");
	}

}
