package com.lti.AirlineBackend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Payments")
public class Payment {
	
	@Id
	private int paymentId;
	private double amount;
	@Column(length=20)
	private String paymentDate;
	public Payment(int paymentId, double amount, String paymentDate) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentDate = paymentDate;
	}
	public Payment() {
		super();
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentDate=" + paymentDate + "]";
	}
	
	
	
	
}
