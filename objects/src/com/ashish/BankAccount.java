package com.ashish;

public class BankAccount {
    private int account_number;
    private double balance;
    private String costumer_name;
    private String emailid;
    private long number;

    public BankAccount(){
        System.out.println("Empty constructor");
    }

    public BankAccount(int account_number, double balance, String costumer_name,
                       String emailid, long number){
        this.balance = balance;
        this.account_number = account_number;
        this.costumer_name = costumer_name;
        this.emailid = emailid;
        this.number = number;
    }

    public void deposit(double depositamount){
        this.balance += depositamount;
        System.out.println("The amount deposited ="+ depositamount +". New balance = "+ balance);
    }
    public void withdrawl(double withdrawlamount){
        if(this.balance - withdrawlamount <=0){
            System.out.println("only "+ this.balance+"left for withdrawl");
        }else{
            this.balance -= withdrawlamount;
            System.out.println("Withdrawl of amount = "+withdrawlamount+ ". New balance is"+ balance);
        }
    }


    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCostumer_name(String costumer_name) {
        this.costumer_name = costumer_name;
    }

    public String getCostumer_name() {
        return costumer_name;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public long getNumber() {
        return number;
    }
}
