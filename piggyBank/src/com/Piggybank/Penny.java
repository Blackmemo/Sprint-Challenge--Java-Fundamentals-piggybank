package com.Piggybank;

public class Penny extends Money
{

    public Penny(int amount)
    {
        super(amount, "Penny", 0.01);
    }

    public Penny()
    {
        super(1, "Penny", 0.01);
    }


}
