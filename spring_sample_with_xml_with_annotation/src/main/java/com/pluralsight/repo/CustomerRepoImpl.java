package com.pluralsight.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pluralsight.model.Customer;

@Component
public class CustomerRepoImpl implements CustomerRepo{

	@Override
	public List<Customer> getAll() {
		return Arrays.asList(new Customer("Ramesh", "Verma"), new Customer("Nisha", "Sharma"));
	}

}
