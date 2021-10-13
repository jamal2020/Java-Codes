package org.example.model;

import org.springframework.beans.factory.annotation.Autowired;

public class AccountHolder {
    private String name;
    private String address;
    @Autowired
    private Account account;
    public  AccountHolder(String name,String address,Account account)
    {
        this.name=name;
        this.address= address;
        this.account=account;
        System.out.println("Account Holder created with default"+name);
    }
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public AccountHolder()
    {
        System.out.println("Account Holder created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
