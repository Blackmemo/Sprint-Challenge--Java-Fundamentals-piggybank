package com.Piggybank;

public class Dime extends Money
{
    public Dime(int amount)
    {
        super(amount, "Dime", 0.10);
    }

    public Dime()
    {
        super(1, "Dime", 0.10);
    }

}
