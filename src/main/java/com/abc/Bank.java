package com.abc;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<Customer>();
    }

    /**
     * @param customer
     */
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    /**
     * 
     * @return customer summary
     */

    public String customerSummary() {
        String summary = "Customer Summary";
        for (Customer c : customers)
            summary += "\n - " + c.getName() + " (" + format(c.getNumberOfAccounts(), "account") + ")";
        return summary;
    }

    /**
     * 
     * @param number
     * @param word
     * @return plural of word
     *         Make sure correct plural of word is created based on the number
     *         passed in:
     *         If number passed in is 1 just return the word otherwise add an 's' at
     *         the end
     */
    private String format(int number, String word) {
        return number + " " + (number == 1 ? word : word + "s");
    }

    /**
     * 
     * @return amount
     *         total interest paid to all customers across accounts
     */
    public double totalInterestPaid() {
        double total = 0;
        for (Customer c : customers)
            total += c.totalInterestEarned();
        return total;
    }

    /**
     * 
     * @return name of first customer of the bank
     */

    public String getFirstCustomer() {
        try {
            return customers.get(0).getName();
        } catch (Exception e) {
            e.printStackTrace();
            return "Error";
        }
    }
}
