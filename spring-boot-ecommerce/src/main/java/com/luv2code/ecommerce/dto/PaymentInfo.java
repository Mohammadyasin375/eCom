package com.luv2code.ecommerce.dto;

import lombok.Data;

@Data
public class PaymentInfo {

    private int amount;
    private String currency;
    private String receiptEmail;
	public Object getAmount() {
		return amount;
	}
	public Object getCurrency() {
		return currency;
	}
	public String getReceiptEmail() {
		return receiptEmail;
	}
	public void setReceiptEmail(String receiptEmail) {
		this.receiptEmail = receiptEmail;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void setCurrency(String currency) { this.currency = currency; }

}
