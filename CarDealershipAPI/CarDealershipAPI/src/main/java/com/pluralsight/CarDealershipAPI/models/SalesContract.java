package com.pluralsight.CarDealershipAPI.models;

public class SalesContract extends Contract {

	double salesTax;
	double recordingFee;
	double processingFee;
	boolean isFinanced;

	public SalesContract() {}

	public SalesContract(String dateOfContract, String customerName, String customerEmail, Vehicle vehicleSold, boolean isFinanced) {
		super(dateOfContract, customerName, customerEmail, vehicleSold);
		this.isFinanced = isFinanced;
	}

	//region Getters and Setters
	public double getRecordingFee() {
		return 100.00;
	}

	public void setRecordingFee(double recordingFee) {
		this.recordingFee = recordingFee;
	}

	public boolean isFinanced() {
		return isFinanced;
	}

	public void setIsFinanced(boolean isFinanced) {
		this.isFinanced = isFinanced;
	}
	//endregion

	public double calculateSalesTax() {
		return vehicleSold.getPrice() * .05;
	}

	public double calculateProcessingFee() {
		if(this.vehicleSold.getPrice() < 10000.00) {
			return 295.00;
		} else {
			return 495.00;
		}
	}

	@Override
	public double calculateMonthlyPayment() {
		//M = P [ i(1 + i)^n ] / [ (1 + i)^n-1
		//P = loan amount
		//i = monthly interest rate
		//n = number of months
		double loanAmount = this.calculateTotalPrice();

		if (this.isFinanced && this.vehicleSold.getPrice() >= 10000) {
			double monthlyInterest = .0425 / 12;
			double numberOfMonths = 48;

			return loanAmount * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfMonths) / (Math.pow(1 + monthlyInterest, numberOfMonths) - 1));
		} else if (this.isFinanced && this.vehicleSold.getPrice() < 10000) {
			double monthlyInterest = .0525 / 12;
			double numberOfMonths = 24;

			return loanAmount * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfMonths) / (Math.pow(1 + monthlyInterest, numberOfMonths) - 1));
		} else {
			return 0.00;
		}
	}

	@Override
	public double calculateTotalPrice() {
		return this.getVehicleSold().getPrice() + this.calculateSalesTax() + this.getRecordingFee() + this.calculateProcessingFee();
	}

}
