package com.sri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sri.model.Bank;
import com.sri.repo.BankRepo;
import com.sri.service.BankServiceImp;

@Controller
public class BankController {
@Autowired
private BankServiceImp s;


@RequestMapping("/")
public String homePage() {
	return "home";
}
@RequestMapping("/newaccount")
public String newaccountForm() {
	return "newaccount";
}
@RequestMapping("/save")
public String saveNewAccount(Bank b) {
	s.openAcount(b);
	return "success";
}
@RequestMapping("/balance")
public String displayBalance() {
	return "balance";
}
@RequestMapping(value="/save1",method=RequestMethod.GET)
public String printBanlance(@RequestParam int acno,@RequestParam String name,@RequestParam String password,Bank b,ModelMap model) {
	model.put("eid", s.balance(b));
	if((s.balance(b) ) != null ){
	return "viewBalance";
	}
	else {
		return "fail";
	}
}
@RequestMapping("/deposit")
public String displayDeposit() {
	return "deposit";
}
@RequestMapping(value="/saveDeposit",method=RequestMethod.GET)
public String depositAmount(Bank b,ModelMap model) {
	Bank ba=s.deposit(b);
	model.put("eid", ba);
	if(ba != null ){
		return "depositRes";
		}
		else {
			return "fail";
		}
}
@RequestMapping("/withdraw")
public String displayWithdraw() {
	return "withdraw";
}
@RequestMapping(value="/withdrawRes",method=RequestMethod.GET)
public String withdrawAmount(Bank b,ModelMap model) {
	Bank ba=s.withdraw(b);
	model.put("eid", ba);
	if(ba != null ){
		return "withdrawRes";
		}
		else {
			return "fail";
		}
}


@RequestMapping("/close")
public String closeAmount() {
	return "close";
}
@RequestMapping(value="/closeUrl",method=RequestMethod.GET)
	public String closeAcount(Bank b,ModelMap model) {
		model.put("eid", s.withdraw(b));
		if((s.closeAcount(b) ) != null ){
			return "closeRes";
			}
			else {
				return "fail";
			}
}
@RequestMapping("/transfer")
public String transferAmount() {
	return "transfer";
}
@RequestMapping(value="/transferUrl",method=RequestMethod.GET)
public String transferAcount(@RequestParam long acno,@RequestParam String name,@RequestParam String password, @RequestParam double amount,@RequestParam long accno,Bank b,ModelMap model) {
	Bank ba = new Bank();
    ba.setAcno(acno);
    ba.setName(name);
    ba.setPassword(password);
    ba.setAmount(amount);
    Bank result = s.transform(acno, accno, ba);
    if (result != null) {
        model.put("sourceAccount", result);
        model.put("targetAccount", s.repo.findById(accno).get());
        return "transferRes";
    } else {
        return "fail";
    }
}
@RequestMapping("/active")
public String displayActive() {
	return "active";
}
@RequestMapping(value="/activeUrl",method=RequestMethod.GET)
public String acountActive(Bank b,ModelMap model) {
	model.put("eid",s.activate(b));
	if (s.activate(b) != null) {
		return "activateRes";
	}
	else {
		return "fail";
	}
}

}