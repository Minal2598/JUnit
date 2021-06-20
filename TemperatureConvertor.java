package com.program;

public class TemperatureConvertor {
    public static void main(String[] args) {
        System.out.println("Enter 1 to convert from Celcius to fahrenheit::");
        System.out.println("Enter 2 to convert from fahrenheit to Celcius::");
        int choice = Utility.getUserSpecificInteger();
        double temperature = 0.0;
        double converted = 0.0;
        if (choice == 1) {
            System.out.println("Enter the temperature in celcius::");
            temperature = Utility.getUserSpecificDouble();
            converted = 9 / 5.0 * temperature + 32;

            System.out.println("Temperature in fahrenheit::" +converted);
        } else if (choice == 2) {
            System.out.println("Enter the temperature in fahrenheit::");
            temperature = Utility.getUserSpecificDouble();

            converted = 5 / 9.0 * (temperature - 32);
            System.out.println("Temperature in Celcius::" +converted);
        }else{
            System.out.println("Wrong input.......please try again!!!!!");

        }
    }
}
