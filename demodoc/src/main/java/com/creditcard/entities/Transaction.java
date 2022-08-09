package com.creditcard.entities;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name= "transactions")
public class Transaction {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.TABLE)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long tranId;
	@Column
	private String cardNumber;
	@Column
	private LocalDate tranDate;
	@Column
	private String Status;
	@Column
	private double amount;
	@Column
	private String paymentMethod;
	@Column
	private String description;
	
	
	@ManyToOne
	
	@JoinColumn(name= "userId")
	private Customer customer;


	public long getTranId() {
		return tranId;
	}


	public void setTranId(long tranId) {
		this.tranId = tranId;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public LocalDate getTranDate() {
		return tranDate;
	}


	public void setTranDate(LocalDate tranDate) {
		this.tranDate = tranDate;
	}


	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
