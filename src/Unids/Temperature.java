package Unids;

import java.util.Scanner;

/**
 * @author Stephany Castro Salas
 */
public class Temperature implements convertTo {
    /**
     * This is the Temperature class contains the values for the conversions to another temperature
     * You must provide the actual values for each temperature, the parameters are
     * @param name
     * @param Kelvin
     * @param Celsius
     * @param Fahrenheit
     * the type of these parameters are double
     */
    private String name;
    private double Kelvin, Celsius, Fahrenheit;

    public Temperature() {
    }
    public Temperature(String name, double kelvin, double celsius, double fahrenheit) {
        this.name = name;
        Kelvin = kelvin;
        Celsius = celsius;
        Fahrenheit = fahrenheit;
    }
    /**
     * This is an interface method is called to determine the converted value, you must pass this parameters
     *
     * @param from  initial temperature or currency
     * @param to    end temperature or currency for conversion
     * @param value to be converted
     * @return the converted value
     */
    @Override
    public double convertTo(String from, String to, double value) {
        double valurResult= 0;
        switch (to) {
            case "Kelvin":
                if (from.equalsIgnoreCase("Celsius")) {
                    valurResult = value + 273.15;
                } else if (from.equalsIgnoreCase("Fahrenheit")) {
                    valurResult = (value - 32) * 5 / 9 + 273.15;
                }
                return valurResult;

            case "Celsius":
                if (from.equalsIgnoreCase("Kelvin")) {
                    valurResult = value - 273.15;
                } else if (from.equalsIgnoreCase("Fahrenheit")) {
                    valurResult = (value - 32) * 5 / 9;
                }
                return valurResult;

            case "Fahrenheit":
                if (from.equalsIgnoreCase("Celsius")) {
                    valurResult = value * 9 / 5 + 32;
                } else if (from.equalsIgnoreCase("Kelvin")) {
                    valurResult = (value - 273.15) * 9 / 5 + 32;
                }
                return valurResult;
        }
        return valurResult;
    }

}
