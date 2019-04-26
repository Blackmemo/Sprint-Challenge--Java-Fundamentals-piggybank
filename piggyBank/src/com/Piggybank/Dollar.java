package com.Piggybank;

public class Dollar extends Money
{

    public Dollar(int amount)
    {
        super(amount, "Dollar", 1.00);
    }

    public Dollar()
    {
        super(1, "Dollar", 1.00);
    }

    @Override
    public String toString()
    {
        return "$" + amount;
    }
}
