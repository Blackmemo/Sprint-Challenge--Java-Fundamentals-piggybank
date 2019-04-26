package com.Piggybank;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {

        DecimalFormat fp = new DecimalFormat("$###,###.00");
        double balance = 0;
        ArrayList<Money> piggyBank = new ArrayList<Money>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        for (int i = 0; i < piggyBank.size(); i++)
        {
            System.out.println(piggyBank.get(i).toString());
        }

        for (int i = 0; i < piggyBank.size(); i++)
        {
            balance += piggyBank.get(i).getBalance();
        }
        System.out.println();
        System.out.println("The piggy bank holds " + fp.format(balance));
    }
}
