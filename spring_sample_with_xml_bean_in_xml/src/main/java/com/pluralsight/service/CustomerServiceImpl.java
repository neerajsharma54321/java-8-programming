package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repo.CustomerRepo;
import com.pluralsight.repo.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {
	
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
