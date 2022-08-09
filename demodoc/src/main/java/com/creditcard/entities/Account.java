package com.creditcard.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
@Entity
@Table(name = "Account")
public class Account {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		//@NotBlank(message="Account ID is mandatory!")
		private long accountId;
		
		@Column
	//	@NotNull
	//	@NotBlank(message="Please enter your valid Name!")
		private String accountName;
		
		@Column
		private double balance;
		
		@Column
	//	@NotNull
		private String accountType;
		
		public long getAccountId() {
			return accountId;
		}

		public void setAccountId(long accountId) {
			this.accountId = accountId;
		}

		public String getAccountName() {
			return accountName;
		}

		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getAccountType() {
			return accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		@ManyToOne
		@JoinColumn(name= "userId")
		private Customer customer;
	
		
		



}
