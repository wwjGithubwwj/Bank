package com.jusdt.javase.bank;

/**
 * @author wwj
 * @date 2019年7月7日
 */
public class Customer {
	private String firstName;
	private String lastName;
	//代表用户有的账户属性
	private Account account;
	//表示拥护可以有多个账户
	private Account[] accounts;
	//表示用户所有的有效账户的数量
	private int numberOfAccounts;
	private SavingAccount savingAccount;

	private CheckingAccount checkingAccount;

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new Account[5];
	}

	public Account getAccount() {
		return account;
	}

	public Account getAccount(int index) {
		return accounts[index];
	}

	public void addAccount(Account account) {
		accounts[numberOfAccounts++] = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setAccount(Account account) {
		this.account = account;

	}

	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public SavingAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}

}
