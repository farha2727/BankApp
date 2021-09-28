package com.example.bank.app;

public class BankAccount {
    private double checkingBalance= 0.00;
    private double savingsBalance= 0.00;
//    private final double checkingOpeningDeposit;
//    private final double savingsOpeningDeposit;


    public BankAccount( double checkingOpeningDeposit,double savingsOpeningDeposit ) {
//        this.checkingOpeningDeposit=checkingOpeningDeposit;
//        this.savingsOpeningDeposit=savingsOpeningDeposit;
        //this.checkingBalance+=checkingOpeningDeposit

        this.checkingBalance +=checkingOpeningDeposit;
        this.savingsBalance += savingsOpeningDeposit;

    }
    public double getCheckingBalance() {

        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }


    public void checkingWithdrawal(double withdrawalAmount) {
        if (checkingBalance < withdrawalAmount && (checkingBalance + savingsBalance) < withdrawalAmount) {
            System.out.println("You don't have available funds");
            return;
        }
        if (checkingBalance < withdrawalAmount && (checkingBalance + savingsBalance) >= withdrawalAmount) {
            System.out.println("Your checking account balance is not sufficient.Please transfer from savings account");

        } else {
            checkingBalance -= withdrawalAmount;

        }
        System.out.println("Checking Account Balance after withdrawal :" + this.checkingBalance);

    }
    public void savingWithdrawal(double withdrawalAmount) {
        if (savingsBalance < withdrawalAmount && (checkingBalance + savingsBalance) < withdrawalAmount) {
            System.out.println("You don't have available funds");
            return;
        }
        if (savingsBalance < withdrawalAmount && (checkingBalance + savingsBalance) >= withdrawalAmount) {
            System.out.println("Your checking account balance is not sufficient.Please transfer from checkings account");

        } else {
            savingsBalance -= withdrawalAmount;

        }
        System.out.println("Saving Account Balance after withdrawal :" + this.savingsBalance);

    }
    public void transferToChecking( double transferAmount) {
        if(this.savingsBalance < transferAmount) {
            System.out.println("Savings Balance is not sufficient");
        }
        else {
            this.savingsBalance -= transferAmount;
            this.checkingBalance += transferAmount;
            System.out.println("Transfer complete.Checking Balance:" + this.checkingBalance + "\n" + "Savings Balance :" + this
                    .savingsBalance);
        }


    }
    public void transferToSaving( double transferAmount) {
        if(this.checkingBalance < transferAmount) {
            System.out.println("Checking Balance is not sufficient");
        }
        else {
            this.checkingBalance -= transferAmount;
            this.savingsBalance += transferAmount;
            System.out.println("Transfer complete.Savings Balance:" + this.savingsBalance + "\n" + "Checkings Balance :" + this
                    .checkingBalance);
        }


    }
    public void checkingDeposit(double depositAmount ) {
        checkingBalance+=depositAmount ;
        System.out.println("Checking Balance is:"+this.checkingBalance);
    }
    public void savingsDeposit(double depositAmount ) {
        savingsBalance+=depositAmount ;
        System.out.println("Savings Balance is:"+this.savingsBalance);
    }
/*
   public void printBal() {
     System.out.println(checkingBalance);
      System.out.println(savingsBalance);
  }

*/
}
