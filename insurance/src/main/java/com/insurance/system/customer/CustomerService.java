package com.insurance.system.customer;

import java.util.ArrayList;

public interface CustomerService {
    Customer add(Customer customer, ArrayList<Customer> customerArrayList);
    boolean delete(int customerID, ArrayList<Customer> customerArrayList);
    Customer search(int customerID, ArrayList<Customer> customerArrayList);
}
