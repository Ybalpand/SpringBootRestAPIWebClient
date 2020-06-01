package com.webapp.springbootrestapiwebclient.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction implements Serializable{
	
	@Id
	@Column(name="transaction_id")
	private Integer transactionId;
	
	@Column(name="amount")
	private Double ammount;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="account_number")
	private Integer accountNumber;
	
	@Column(name="customer_id")
	private Integer customerId;
	
	public Transaction() {
		super();
	}
	
	public Transaction(Integer transactionId, Double ammount, Date date, Integer accountNumber, Integer customerId) {
		super();
		this.transactionId = transactionId;
		this.ammount = ammount;
		this.date = date;
		this.accountNumber = accountNumber;
		this.customerId = customerId;
	}

	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Double getAmmount() {
		return ammount;
	}
	public void setAmmount(Double ammount) {
		this.ammount = ammount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", ammount=" + ammount + ", date=" + date
				+ ", accountNumber=" + accountNumber + ", customerId=" + customerId + "]";
	}
	
	
}
