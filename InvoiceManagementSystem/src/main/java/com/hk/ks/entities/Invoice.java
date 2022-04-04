package com.hk.ks.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String invoiceId;
	
	
	private String invoiceNumber;
	private String invoiceVendor;
	private double invoiceAmount;
	private String invoiceDate;
	
	public Invoice () {

	}
	
	public Invoice(String invoiceNumber, String invoiceVendor, double invoiceAmount, String invoiceDate) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.invoiceVendor = invoiceVendor;
		this.invoiceAmount = invoiceAmount;
		this.invoiceDate = invoiceDate;
	}
	
	public String getInvoiceId() {
		return invoiceId;
	}


	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	
	
	public String getInvoiceNumber() {
		return invoiceNumber;
	}


	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}


	public String getInvoiceVendor() {
		return invoiceVendor;
	}


	public void setInvoiceVendor(String invoiceVendor) {
		this.invoiceVendor = invoiceVendor;
	}


	public double getInvoiceAmount() {
		return invoiceAmount;
	}


	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}


	public String getInvoiceDate() {
		return invoiceDate;
	}


	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}	
}
