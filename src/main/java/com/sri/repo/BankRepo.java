package com.sri.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sri.model.Bank;

public interface BankRepo extends JpaRepository<Bank, Long> {

}
