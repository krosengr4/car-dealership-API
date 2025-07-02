package com.pluralsight.CarDealershipAPI.models;

public abstract class Contract {

	String dateOfContract;
	String customerName;
	String customerEmail;
	Vehicle vehicleSold;

	double totalPrice;
	double monthlyPayment;

	public Contract() {}

	public Contract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold) {
		this.dateOfContract = dateOfContract;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.vehicleSold = vehicleSold;
	}

	//region Getters and Setters
	public String getDateOfContract() {
		return dateOfContract;
	}

	public void setDateOfContract(String dateOfContract) {
		this.dateOfContract = dateOfContract;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Vehicle getVehicleSold() {
		return vehicleSold;
	}

	public void setVehicleSold(Vehicle vehicleSold) {
		this.vehicleSold = vehicleSold;
	}
	//endregion

	//Abstract methods
	abstract double calculateTotalPrice();
	abstract double calculateMonthlyPayment();
}
