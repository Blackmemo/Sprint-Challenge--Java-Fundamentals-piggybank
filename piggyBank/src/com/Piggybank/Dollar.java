package com.Piggybank;

public class Dollar extends Money
{
    private double value = 1.00;
    private String name = "Dollar";
    private double balance;
    private int amount;

    public Dollar(int amount)
    {
        this.amount = amount;
    }

    public Dollar()
    {
        this.amount = 1;
    }


    public double getBalance()
    {
        return value * amount;
    }

    @Override
    public String getAmount()
    {
        return this.amount + " " + this.name;
    }

    @Override
    public String toString()
    {
        return "$" + amount;
    }
}
