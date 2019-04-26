package com.Piggybank;

public class Penny extends Money
{
    private double value = 0.01;
    private String name = "Penny";
    private double balance;
    private int amount;

    public Penny(int amount)
    {
        this.amount = amount;
    }

    public Penny()
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
