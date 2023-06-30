package demo;

import java.util.Scanner;

public class BankAccount {
	int accountBalance;
	
	//constructor
	BankAccount (int accountBalance) {
		
		if (accountBalance >= 0)
			this.accountBalance = accountBalance;
		else{
			this.accountBalance = 0;
			System.err.println("Invalid balance supplied");
    }
}
	
   public void CreditAmount(int CreditAmount){
	if (CreditAmount >= 0) 
		  accountBalance += CreditAmount;
	}

	public void DebitAmount(int DebitAmount) {
		if (DebitAmount >= 0) 
			if (accountBalance >= DebitAmount)
				accountBalance -= DebitAmount;
			else 
			System.err.println("Insufficient Funds");
		}
	
		
	public String getBalance() {
		return "Balance is: " + this.accountBalance;
		}


public static void main(String[] args) {
	
	
	BankAccount act1 = new BankAccount(3000);
			act1.CreditAmount(3500);
			act1.DebitAmount(4000);
			act1.CreditAmount(700);
			String bal = act1.getBalance();
			System.out.println(bal);
			
			
}
}
