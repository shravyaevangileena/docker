package com.creditcard.entities;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name ="Customer")
public class Customer {
	
	@Id
//	@GeneratedValue(strategy=GenerationType.TABLE)
//	@GeneratedValue(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String userId;
	private String name;
	private String email;
	private String contactNo;
	private LocalDate dob;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="doorNo", column=@Column(name="Customer_doorno")),
		@AttributeOverride(name="street", column=@Column(name="Customer_street")),
		@AttributeOverride(name="area", column=@Column(name="Customer_area")),
		@AttributeOverride(name="city", column=@Column(name="Customer_city")),
		@AttributeOverride(name="state", column=@Column(name="Customer_state")),
		@AttributeOverride(name="pincode", column=@Column(name="pincode")),

	})
	private Address address;
	
	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private List<CreditCard> creditCard;
	
	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	
	private List<Transaction> transaction;
	
	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private List<Statement> statement;
	
	@OneToMany(mappedBy = "customer")
	@JsonIgnore
	private List<Account> account;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<CreditCard> getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(List<CreditCard> creditCard) {
		this.creditCard = creditCard;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public List<Statement> getStatement() {
		return statement;
	}

	public void setStatement(List<Statement> statement) {
		this.statement = statement;
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	
	
}