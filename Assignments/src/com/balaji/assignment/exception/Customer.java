/**
 * 
 */
package com.balaji.assignment.exception;

import com.balaji.assignment.customexception.InsufficientFundsExcxeption;
import com.balaji.assignment.customexception.LowBalanceException;
import com.balaji.assignment.customexception.NegativeAmountException;
import com.balaji.assignment.utill.UserInputValidations;

/**
 * @author spaneos
 *
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int ch=0;
		boolean flag=true;
		BankAccount account=null;
		while (flag) {
			System.out.println("Enter 1 to create an account");
			System.out.println("Enter 2 to deposit");
			System.out.println("Enter 3 to withdraw");
			System.out.println("Enter 4 to get balance");
			System.out.println("Enter 5 to exit");
			ch=UserInputValidations.validateInteger();
			switch (ch) {
			case 1:
				System.out.println("Creating an account");
				System.out.println("Enter the name of the customer");
				String cusName=UserInputValidations.validateString();
				System.out.println("Enter the account no");
				int accNo=UserInputValidations.validateInteger();
				System.out.println("Enter the account type");
				System.out.println("Enter 1 to choose saving");
				System.out.println("Enter 2 to choose current");
				boolean b=true;
				String accType="";
				while(b) {
					int option=UserInputValidations.validateInteger();
					switch (option) {
					case 1:
						accType=Constants.SAVING;
						b=false;
						break;
					case 2:
						accType=Constants.CURRENT;
						b=false;
						break;
					default:
						System.out.println("Enter only 1 or 2");
						b=true;
						break;
					}
				}
				System.out.println("Enter the initial balance");
				float balance=UserInputValidations.validateFloat();
				account=new BankAccount(cusName, accNo, accType, balance);
				System.out.println("Account has been created successfully!!!");
				flag=true;
				break;
			case 2:
				System.out.println("Depositing the money into the account");
				if(account!=null) {
					System.out.println("Enter the amount");
					float amt=UserInputValidations.validateFloat();
					try {
						account.deposite(amt);
						System.out.println("Amount, "+amt+" deposited successfully!!");
						System.out.println("The balnce is "+account.getBalance());
					} 
					catch (NegativeAmountException | LowBalanceException e) {
						System.out.println(e.getMessage());
					}
				}
				else {
					System.out.println("Create account first and then deposit.");
				}
				flag=true;
				break;
			case 3:
				System.out.println("Withdrawing the money from the account");
				if(account!=null) {
					System.out.println("Enter the amount");
					float amt=UserInputValidations.validateFloat();
					try {
						account.withdraw(amt);
						System.out.println("Amount, "+amt+" withdrew successfully!!");
						System.out.println("The balnce is "+account.getBalance());
					}

					catch (InsufficientFundsExcxeption | NegativeAmountException | LowBalanceException e) {
						System.out.println(e.getMessage());
					}
				}
				else {
					System.out.println("Create account first and then withdraw.");
				}
				flag=true;
				break;
			case 4:
				System.out.println("Checking the balance");
				if(account!=null) {
					float bal;
					try {
						bal = account.getBalance();
						System.out.println("The balnce in your account is "+bal);
					} 
					catch (LowBalanceException e) {
					System.out.println(e.getMessage());
					}
				}
				else {
					System.out.println("Create account first and then check the balance.");
				}

				flag=true;
				break;
			case 5:
				System.out.println("Thank you!!!");
				flag=false;
				break;
			default:
				System.out.println("Enter only 1 to 5");
				flag=true;
				break;
			}
		}
	}

}
