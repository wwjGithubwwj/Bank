package com.jusdt.javase.bank.test;

import com.jusdt.javase.bank.Account;
import com.jusdt.javase.bank.Customer;

/**
 * @author wwj
 * @date 2019年7月7日
 */
public class TestBank2 {
	public static void main(String[] args) {
		Customer customer;

		System.out.println("Creating the customer Jane Smith.");

		customer = new Customer("Jane", "Smith");

		System.out.println("Creating her account with a 500.00 balance.");

		// code
		// account = new Account(500);
		// customer.setAccount(account);

		customer.setAccount(new Account(500));

		System.out.println("Withdraw 150.00");

		// code
		customer.getAccount().withdraw(150);

		System.out.println("Deposit 22.50");
		// code
		customer.getAccount().deposit1(22.50);

		System.out.println("Withdraw 47.62");
		// code
		customer.getAccount().withdraw(47.62);

		// Print out the final account balance
		System.out.println("Customer [" + customer.getLastName() + ", " + customer.getFirstName()
		+ "] has a balance of " + customer.getAccount().getBalance());
	}
}
