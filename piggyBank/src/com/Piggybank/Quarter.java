package com.Piggybank;

public class Quarter extends Money
{
    private double value = 0.25;
    private String name = "Quarter";
    private double balance;
    private int amount;

    public Quarter(int amount)
    {
        this.amount = amount;
    }

    public Quarter()
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

