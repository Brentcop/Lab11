package com.car;

public class Car {

	private String make;
	private String model;
	private int year;
	private double price;
	private double miles;
	
	
//	public Car(String string, String string2, int i, double d) {
//		make = "";
//		model = "";
//		year = 0;
//		price = 0.00;
//	}
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	public Car(String make, String model, int year, double price,double miles) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.miles = miles;
	}public double getMiles() {
		return miles;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setMiles(double miles) {
		this.miles = miles;
		
	}
	@Override
	public String toString() {
	
		//return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
		return String.format(getMake() + " " + getModel() +" "+ getYear() +" "+ getPrice() + " " + getMiles());
	}
	
	
	
}
