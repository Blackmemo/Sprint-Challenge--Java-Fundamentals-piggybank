package com.Piggybank;

public class Dime extends Money
{
    private double value = 0.10;
    private String name = "Dime";
    private double balance;
    private int amount;

    public Dime(int amount)
    {
        this.amount = amount;
    }

    public Dime()
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
        return amount + " " + name;
    }
}
