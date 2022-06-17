package com.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class AccountVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	Integer accountNumber;	
	Integer custId;
	String accountType;
	float acctBalance;
	String description;
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getCustId() {
		return custId;
	}
	public void setCustId(Integer custId) {
		this.custId = custId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public float getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(float acctBalance) {
		this.acctBalance = acctBalance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
