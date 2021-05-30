package com.pluralsight.repo;

import java.util.List;

import com.pluralsight.model.Customer;

public interface CustomerRepo {
	List<Customer> getAll();
}
