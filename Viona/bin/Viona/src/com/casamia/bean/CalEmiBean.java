package com.casamia.bean;

public class CalEmiBean {

	private int tenure;
	private double RATE_OF_INTEREST = 8;
	private double principalAmount;
	private double emi;

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getRATE_OF_INTEREST() {
		return RATE_OF_INTEREST;
	}

	public void setRATE_OF_INTEREST(double rATE_OF_INTEREST) {
		RATE_OF_INTEREST = rATE_OF_INTEREST;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(double prnicipalAmount) {
		this.principalAmount = prnicipalAmount;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

}
