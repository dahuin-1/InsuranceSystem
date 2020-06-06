package com.insurance.system;

import com.insurance.system.config.Display;
import com.insurance.system.customer.Customer;
import com.insurance.system.customer.CustomerService;
import com.insurance.system.customer.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customerArrayList = new ArrayList<>();
        CustomerService customerService = new CustomerServiceImpl();
        Display display = new Display();
        App app = new App(customerArrayList, customerService, display);
        app.start();
    }
}
