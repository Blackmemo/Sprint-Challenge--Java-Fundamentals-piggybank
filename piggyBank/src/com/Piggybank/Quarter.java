package com.Piggybank;

public class Quarter extends Money
{
    public Quarter(int amount)
    {
        super(amount, "Quarter", 0.25);
    }

    public Quarter()
    {
        super(1, "Quarter", 0.25);
    }

}

