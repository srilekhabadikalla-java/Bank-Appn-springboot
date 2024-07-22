package com.sri.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bank {
	@Id
	private long acno;
	private String name;
	private String password;
	private String cpassword;
	private double amount;
	private String address;
	private long mno;
	private String status;
	public Bank() {
		super();
	}
	public Bank(long acno, String name, String password, String cpassword, double amount, String address, long mno,
			String status) {
		super();
		this.acno = acno;
		this.name = name;
		this.password = password;
		this.cpassword = cpassword;
		this.amount = amount;
		this.address = address;
		this.mno = mno;
		this.status = status;
	}
	public long getAcno() {
		return acno;
	}
	public void setAcno(long acno) {
		this.acno = acno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Bank [acno=" + acno + ", name=" + name + ", password=" + password + ", cpassword=" + cpassword
				+ ", amount=" + amount + ", address=" + address + ", mno=" + mno + ", status=" + status + "]";
	}

}
