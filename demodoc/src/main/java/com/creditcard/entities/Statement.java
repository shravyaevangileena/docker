package com.creditcard.entities;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name= "Statement")
public class Statement {
		
		@Id
	//	@GeneratedValue(strategy=GenerationType.TABLE)
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long statementId;
		private double dueAmount;
		private LocalDate billingDate;
		private LocalDate dueDate;
		
		
		@ManyToOne
		@JoinColumn(name= "userId")
		private Customer customer;


		public long getStatementId() {
			return statementId;
		}


		public void setStatementId(long statementId) {
			this.statementId = statementId;
		}


		public double getDueAmount() {
			return dueAmount;
		}


		public void setDueAmount(double dueAmount) {
			this.dueAmount = dueAmount;
		}


		public LocalDate getBillingDate() {
			return billingDate;
		}


		public void setBillingDate(LocalDate billingDate) {
			this.billingDate = billingDate;
		}


		public LocalDate getDueDate() {
			return dueDate;
		}


		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}


		public Customer getCustomer() {
			return customer;
		}


		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		
		
		
	}

