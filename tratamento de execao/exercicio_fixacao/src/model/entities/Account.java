package model.entities;

import model.exceptions.MinhaException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(Double amount) {
        balance += amount;

    }

    public void withdraw(Double amount) {
        if (amount > withdrawLimit) {
            throw new MinhaException("The amount exceeds withdraw limit");
        } else if (amount > balance) {
            throw new MinhaException("Not enough balance");
        }
        balance -= amount;
    }

}
