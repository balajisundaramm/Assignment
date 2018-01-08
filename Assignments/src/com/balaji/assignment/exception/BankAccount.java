
package com.balaji.assignment.exception;

import com.balaji.assignment.customexception.InsufficientFundsExcxeption;
import com.balaji.assignment.customexception.LowBalanceException;
import com.balaji.assignment.customexception.NegativeAmountException;

/**
 * 
 * @author spaneos
 *
 */
public class BankAccount {
	private String cusName;
	private int accNo;
	private String accType;
	private float balance;
/**
 * 
 * @param cusName input value
 * @param accNo Input value
 * @param accType Input value-either be saving or current
 * @param balance Initial Balance
 */
	public BankAccount(String cusName, int accNo, String accType, float balance) {
		this.cusName = cusName;
		this.accNo = accNo;
		this.accType = accType;
		this.balance = balance;
	}
	/**
	 * 
	 * @param amt input value to deposit
	 * @throws NegativeAmountException To restrict invalid input
	 */
	public void deposit(float amt) throws NegativeAmountException {
		if (amt>0) {
			balance+=amt;
		}
		else {
			throw new NegativeAmountException("Amount should not be negative.  Enter the amount correctly");
		}

	}
/**
 * THis method is used to withdraw the given amount from the balance.
 * @param amt Input value
 * @throws InsufficientFundsExcxeption To maintain minimum balance
 * @throws NegativeAmountException To restrict invalid input
 */
	public void withdraw(float amt) throws InsufficientFundsExcxeption, NegativeAmountException {
		if (amt>0) {
			if(accType.equals(Constants.SAVING)) {
				if((balance-amt)>=1000) {
					balance-=amt;
				}
				else {
					throw new InsufficientFundsExcxeption("Minimum balance for a saving account is 1000."
							+ " check balance and withdraw again");
				}
			}
			else {
				if((balance-amt)>=5000) {
					balance-=amt;
				}
				else {
					throw new InsufficientFundsExcxeption("Minimum balance for a current account is 5000."
							+ " check balance and withdraw again");

				}

			}

		}
		else {
			throw new NegativeAmountException("Amount should not be negative. Enter the amount correctly");
		}
	}
/**
 * 
 * @return balance
 * @throws LowBalanceException To maintain minimum balance.
 */
	public float getBalance() throws LowBalanceException {
		if(accType.equals(Constants.SAVING)) {
			if((balance)>=1000) {
				return balance;
			}
			else {
				throw new LowBalanceException("Minimum balance for a saving account is 1000."
						+ " please maintain the minimum balance");
			}
		}
		else {
			if((balance)>=5000) {
				return balance;
			}
			else {
				throw new LowBalanceException("Minimum balance for a current account is 5000."
						+ " please maintain the minimum balance");

			}
		}
	}
}
