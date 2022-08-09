package com.creditcard.entities;
import java.time.LocalDate;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Data
@Table(name = "creditcards")
public class CreditCard {

	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cardId;
	@Column
	private String cardName;
	@Column
	private String cardType;
	@Column
	private String cardNumber;
	@Column
    private LocalDate expiryDate;
	@Column
	private String bankName;
    
	
	@ManyToOne
	@JoinColumn(name="userId" )
	private Customer customer;


	public long getCardId() {
		return cardId;
	}


	public void setCardId(long cardId) {
		this.cardId = cardId;
	}


	public String getCardName() {
		return cardName;
	}


	public void setCardName(String cardName) {
		this.cardName = cardName;
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public String getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	public LocalDate getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
	
	
	
}