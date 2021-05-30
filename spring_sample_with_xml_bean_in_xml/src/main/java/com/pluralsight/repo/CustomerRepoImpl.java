package com.pluralsight.repo;

import java.util.Arrays;
import java.util.List;

import com.pluralsight.model.Customer;

public class CustomerRepoImpl implements CustomerRepo{

	@Override
	public List<Customer> getAll() {
		return Arrays.asList(new Customer("Ramesh", "Verma"), new Customer("Nisha", "Sharma"));
	}

}
