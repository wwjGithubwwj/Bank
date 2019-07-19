package com.jusdt.javase.bank.test;

import com.jusdt.javase.bank.Account;

/**
 * @author wwj
 * @date 2019年7月7日
 */
public class Testbank1 {
	public static void main(String[] args) {
		Account account = null;
		// Create an account that can has a 500.00 balance.
		System.out.println("Creating an account with a 500.00 balance.");
		//code
		account = new Account(500);
		System.out.println("Withdraw 150.00");
		//code
		account.withdraw(150);

		System.out.println("Deposit 22.50");

		//code
		account.deposit1(22.50);

		System.out.println("Withdraw 47.62");
		//code
		account.withdraw(47.62);

		// Print out the final account balance
		System.out.println("The account has a balance of " + account.getBalance());
	}
}
