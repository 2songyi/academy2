package com.varxyz.banking.domain;

public class SavingAccount extends Account {

	private double interestRate = 1.5;
	
	// super()를 이용해 부모클래스에서 선언한 생성자를 호출한다.
	public SavingAccount(String accountNum, double balance) {
		super(accountNum, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount < 0) {
			// 잔고 부족으로 예외 발생
			throw new InsufficienBalanceException("잔고가 부족합니다. 현재 출금 가능한 잔액은" + balance + "원 입니다.");
		} else {
			super.balance -= amount;
			System.out.println(amount + "원 출금하셨습니다. 현재 잔액은 " + super.balance + "입니다.");
			System.out.println("현재 계좌의 이자율은 " + interestRate + "% 입니다.");
		}
	}
}
