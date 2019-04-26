package com.Piggybank;

public class Nickel extends Money
{
    private double value = 0.05;
    private String name = "Nickel";
    private double balance;
    private int amount;

    public Nickel(int amount)
    {
        this.amount = amount;
    }

    public Nickel()
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
