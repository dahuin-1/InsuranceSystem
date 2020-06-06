package com.insurance.system.customer;

import java.util.ArrayList;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer add(Customer customer, ArrayList<Customer> customerArrayList) {
        customerArrayList.add(customer);
        return customer;
    }

    @Override
    public boolean delete(int customerID, ArrayList<Customer> customerArrayList) {
        for (Customer customer : customerArrayList) {
            if (customer.getCustomerID() == customerID) {
                customerArrayList.remove(customer);
                return true;
            }
        }
        return false;
    }

    @Override
    public Customer search(int customerID, ArrayList<Customer> customerArrayList) {
        for (Customer customer : customerArrayList) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }
}
