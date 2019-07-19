package com.jusdt.javase.bank;

/**
 * @author wwj
 * @date 2019年7月7日
 */
public class SavingAccount extends Account {
	//存储利息
	private double interestRate;

	public SavingAccount(double init_balance, double interestRate) {
		super(init_balance);
		this.interestRate = interestRate;
	}

	public double getIntersetRate() {
		return interestRate;
	}
}
