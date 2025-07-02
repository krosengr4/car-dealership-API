package com.pluralsight.CarDealershipAPI.models;

public class Vehicle {

	int vin;
	int yearMade;
	String make;
	String model;
	String color;
	String type;
	int odometer;
	double price;

	public Vehicle(int vin, int yearMade, String make, String model, String color, String type, int odometer, double price) {
		this.vin = vin;
		this.yearMade = yearMade;
		this.make = make;
		this.model = model;
		this.color = color;
		this.type = type;
		this.odometer = odometer;
		this.price = price;
	}

	//region Getters and Setter
	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//endregion
}
