package com.jusdt.javase.bank;

/**
 * @author wwj
 * @date 2019年7月7日
 */
public class Account {
	private double balance;

	public Account(double init_balance) {
		super();
		this.balance = init_balance;
	}

	/**
	 * 存钱方法
	 * @param amt: 存款的钱数
	 * @return: 返回存款是否成功
	 */
	public boolean deposit1(double amt) {
		this.balance += amt;
		return true;
	}

	/**
	 * 存钱方法
	 * @param amt: 存款的钱数
	 */
	//	public void deposit(double amt) {
	//		this.balance += amt;
	//
	//	}

	public double getBalance() {
		return balance;
	}

	/**
	 * 取钱方法
	 * @param amt: 取款的钱数
	 * @return: 返回取款是否成功
	 */
	public boolean withdraw(double amt) {
		if (amt > balance) {
			return false;
		}
		this.balance -= amt;
		return true;
	}
}
