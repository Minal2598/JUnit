package com.program;

public class DayOfWeek {
    public static void main(String[] args) {
        try {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            int res = Utility.dayOfWeek(day, month, year);
            System.out.println("day of week::" + res);
        }catch(Exception e){
            System.out.println("read again....");
        }
    }




}
