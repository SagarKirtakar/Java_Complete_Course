package in.sagarcoding.challenge78;

import java.util.Scanner;

class BankAccount {

    private long accountNumber;

    private String accountHolderName;

    private double balance;

    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public void depositeMoney(double money) {
        if(money <= 0) {
            System.out.println("Invalid deposite..");
        } else {
            System.out.println("Deposite money: "+money);
            balance += money;
            System.out.println("Total balance is: "+balance);
        }
    }

    public void WithdrawMoney(double money) {
        if(money <= 0){
            System.out.println("Invalid Withdraw");
        } else if(balance >= money) {
            balance -= money;
            System.out.println("Withdraw money: "+money);
            System.out.println("Total balance is: "+balance);
        } else {
            money = balance;
            balance = 0;
        }
    }

}
