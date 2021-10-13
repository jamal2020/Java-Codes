package org.example.model;

public class BankAccount //Java Bean
{
    private String name; // protected
    private int balance;
    private static  BankAccount acc;
    public static BankAccount getAccount()
    {
        if(acc==null) {
            BankAccount account = new BankAccount();
            acc=account;
        }
        return acc;

    }
    private BankAccount() // public default constructor
    {
        System.out.println("Singleton bank object created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
