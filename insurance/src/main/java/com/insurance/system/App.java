package com.insurance.system;

import com.insurance.system.config.Display;
import com.insurance.system.customer.Customer;
import com.insurance.system.customer.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    private final ArrayList<Customer> customerArrayList;
    private final CustomerService customerService;
    private final Display display;
    private final Scanner scanner = new Scanner(System.in);

    public App(ArrayList<Customer> customerArrayList,
               CustomerService customerService,
               Display display) {
        this.customerArrayList = customerArrayList;
        this.customerService = customerService;
        this.display = display;
    }

    void start() {
        String state = "999";
        while (!state.equals("0")) {
            this.display.showSelectMenu();
            state = this.scanner.next();
            this.display.showInputForm(state);

        }
    }
}
