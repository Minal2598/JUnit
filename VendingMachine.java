package com.program;

public class VendingMachine
{

    public static void main(String[] args)
    {
        try
        {

            System.out.println("Enter the amount :: ");
            int value=Utility.getUserSpecificInteger();

            Utility.note(value);

        }
        catch(Exception e)
        {
            System.out.println("please enter integer value");

        }
    }

}
