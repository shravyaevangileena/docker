package com.creditcard.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


import lombok.Data;

@Entity
@Data
@Table(name= "Payments")
public class Payment {
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long paymentId;
	private String method;
	private String status;
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
		
	
}
