package com.Piggybank;

public abstract class Money
{
    int amount;
    double value;
    String name;

    public Money(int amount, String name, double value)
    {
        this.name = name;
        this.value = value;
        this.amount = amount;
    }

    public Money()
    {
        amount = 1;
    }

    public String getAmount()
    {
        return this.amount + " " + this.name;
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

    @Override
    public String toString()
    {
        return amount + " " + name;
    }

}
