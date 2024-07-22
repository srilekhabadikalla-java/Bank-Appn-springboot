package com.sri.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.model.Bank;
import com.sri.repo.BankRepo;

@Service
public class BankServiceImp implements BankService {
@Autowired
public BankRepo repo;
	@Override
	public Bank openAcount(Bank b) {
		String s="Activated";
		b.setStatus(s);
		Bank saveBank=repo.save(b);
		return saveBank;
	}

	@Override
	public Bank balance(Bank b) {
		Bank bacno=repo.findById(b.getAcno()).get();
		String s="Activated";
		if((bacno.getName().equals(b.getName())) &&(bacno.getPassword().equals(b.getPassword())) &&  (s.equals(bacno.getStatus()))) {
			return bacno;
		}
		else {
		return null;
		}
	}

	@Override
	public Bank deposit(Bank b) {
		Bank bacno=repo.findById(b.getAcno()).get();
		double w=0.0;
		String s="Activated";
		if((bacno.getName().equals(b.getName())) &&(bacno.getPassword().equals(b.getPassword())) &&  (s.equals(bacno.getStatus()))) {
			w=bacno.getAmount()+b.getAmount();
			bacno.setAmount(w);
			Bank saveBank=repo.save(bacno);
			return saveBank;
		}
		else {
		return null;
		}
	}

	@Override
	public Bank withdraw(Bank b) {
		Bank bacno=repo.findById(b.getAcno()).get();
		double w=0.0;
		String s="Activated";
		if((bacno.getAmount()>b.getAmount()) && (bacno.getName().equals(b.getName())) &&(bacno.getPassword().equals(b.getPassword())) &&  (s.equals(bacno.getStatus()))) {
			w=bacno.getAmount()-b.getAmount();
			bacno.setAmount(w);
			Bank saveBank=repo.save(bacno);
			return saveBank;
		}
		else {
		return null;
		}
	}

	@Override
	public Bank closeAcount(Bank b) {
		Bank bacno=repo.findById(b.getAcno()).get();
		String s="Deactivated";
		bacno.setStatus(s);
		Bank saveBank=repo.save(bacno);
		return saveBank;
	}

	@Override
	public Bank transform(long acno,long accno,Bank b) {
		Optional<Bank> bacno=repo.findById(acno);
		Optional<Bank> baccno=repo.findById(accno);
		Bank ba=bacno.get();
		Bank ta=baccno.get();
		String s="Activated";
		double baamount=ba.getAmount();
		double addAmount=b.getAmount();
		if ((baamount > addAmount) && (ba.getAcno()==(b.getAcno())) &&(ba.getName().equals(b.getName())) && (ba.getPassword().equals(b.getPassword())) && (s.equals(ba.getStatus())) &&  (s.equals(ta.getStatus()))) {
			Bank sourceAccount = withdraw(b);
			Bank destAccount = new Bank();
	        destAccount.setAcno(accno);
	        destAccount.setName(ta.getName());
	        destAccount.setPassword(ta.getPassword());
	        destAccount.setAmount(b.getAmount());
	        Bank targetAccount = deposit(destAccount);
			return sourceAccount;
		}
		else {
		return null;
		}
	}

	@Override
	public Bank activate(Bank b) {
		Bank bacno=repo.findById(b.getAcno()).get();
		Bank saveBank=openAcount(bacno);
		return saveBank;
	}

}
