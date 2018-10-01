package com.casamia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_table")
public class Loan {

private int loanId;
@Id
private String emailId;
private double principalAmount;
private double emiAmount;
private String loanStatus;
private String preClosureStatus;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public double getPrincipalAmount() {
	return principalAmount;
}
public void setPrincipalAmount(double principalAmount) {
	this.principalAmount = principalAmount;
}
public double getEmiAmount() {
	return emiAmount;
}
public void setEmiAmount(double emiAmount) {
	this.emiAmount = emiAmount;
}
public String getLoanStatus() {
	return loanStatus;
}
public void setLoanStatus(String loanStatus) {
	this.loanStatus = loanStatus;
}
public String getPreClosureStatus() {
	return preClosureStatus;
}
public void setPreClosureStatus(String preClosureStatus) {
	this.preClosureStatus = preClosureStatus;
}




}
