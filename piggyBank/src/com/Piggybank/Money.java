package com.Piggybank;

public abstract class Money
{
    int amount;
    double value;
    double balance;
    String name;

    public Money(int amount)
    {
        this.amount = amount;
    }

    public Money()
    {
        amount = 1;
    }

    public String getAmount()
    {
        return this.amount + " ";
    }

    public double getValue()
    {
        return value;
    }


    public double getBalance()
    {
        return value * amount;
    }


    public String getName()
    {
        return name;
    }

}
