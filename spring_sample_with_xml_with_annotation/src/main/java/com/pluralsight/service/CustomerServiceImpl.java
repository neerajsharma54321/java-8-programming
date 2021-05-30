package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pluralsight.model.Customer;
import com.pluralsight.repo.CustomerRepo;

@Component
//("customerkouthalo")
public class CustomerServiceImpl implements CustomerService {
	
	//property base autowiring
	@Autowired
	private CustomerRepo customerRepo;
	
	public CustomerServiceImpl() {
	}
	
	// It will be used for constructor based dependency injection.
	public CustomerServiceImpl(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
	
	@Override
	public List<Customer> getAll() {
		return this.customerRepo.getAll();
	}

	public void setCustomerRepo(CustomerRepo customerRepo) {
		this.customerRepo = customerRepo;
	}
	
}
