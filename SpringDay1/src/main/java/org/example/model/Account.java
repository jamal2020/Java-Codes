package org.example.model;

public class Account { // Java Bean
    private String name;
    private int balance;

    public Account(){
        System.out.println("Account initialized from Spring Context");
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
