package com.varxyz.banking.domain;

/**
 * 은행계좌정보를 8 구현한 class 0 
 * @author LeeSongYi
 *
 */
public abstract class Account {
	// 공통정보
	private String accountNum; // 계좌번호
	protected double balance; // 잔액

	public Account(String accountNum, double balance) {
		this.setAccountNum(accountNum);
		this.balance = balance;
	}

	// 입금 method
	public void deposite(double amount) {
		balance += amount;
	}

	// 출금메서드를 추상메서드로 구현 후 자식클래스에서 오버라이딩한다.
	public abstract void withdraw(double amount);
	
	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
}
