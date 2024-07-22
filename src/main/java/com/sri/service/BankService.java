package com.sri.service;

import java.util.List;

import com.sri.model.Bank;


public interface BankService {
	public Bank openAcount(Bank b);
	public Bank balance(Bank b);
	public Bank deposit(Bank b);
	public Bank withdraw(Bank b);
	public Bank closeAcount(Bank b);
	public Bank transform(long acno,long accno,Bank b);
	public Bank activate(Bank b);

}
