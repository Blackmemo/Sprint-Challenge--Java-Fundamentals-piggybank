package com.Piggybank;

public class Nickel extends Money
{

    public Nickel(int amount)
    {
        super(amount, "Nickel", 0.05);
    }

    public Nickel()
    {
        super(1, "Nickel", 0.05);
    }

}
