package com.jusdt.javase.bank.test;

import com.jusdt.javase.bank.Bank;
import com.jusdt.javase.bank.Customer;

/**
 * @author wwj
 * @date 2019年7月7日
 */
public class TestBank4 {
	public static void main(String[] args) {
		Bank bank = new Bank();

		// Add Customer Jane, Simms
		bank.addCustomer("Jane", "Smms");

		// Add Customer Owen, Bryant
		bank.addCustomer("Owen", "Bryant");

		// Add Customer Tim, Soley
		bank.addCustomer("Tim", "Soley");

		// Add Customer Maria, Soley
		bank.addCustomer("Maria", "Soley");

		for (int i = 0; i < bank.getNumOfCustomers(); i++) {
			Customer customer = bank.getCustomer(i);

			System.out.println(
					"Customer [" + (i + 1) + "] is " + customer.getLastName() + ", " + customer.getFirstName());
		}
	}
}
