package com.program;
import java.util.Scanner;

public class Utility {
    private static final Scanner sc = new Scanner(System.in);
   

    public static int getUserSpecificInteger() {
        return sc.nextInt();
    }
    
    public static double getUserSpecificDouble() {
        return sc.nextDouble();
    }

            //Vending Machine//
    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};
    static int total, i;
    static void note(int value)


    {

        if(value/notes[i] != 0)
        {
            total += (value/notes[i]);
            System.out.println(total);
            System.out.println(notes[i]+" is notes "+value/notes[i]);
            value = value % notes[i];

        }
        i++;
        if(value == 0)
        {
            System.out.println("Total notes :: "+total);
            return;
        }
        note(value);
    }

}
