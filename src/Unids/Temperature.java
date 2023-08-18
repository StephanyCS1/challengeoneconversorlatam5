package Unids;
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

    public double getKelvin() {
        return Kelvin;
    }

    public void setKelvin(double kelvin) {
        Kelvin = kelvin;
    }

    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double celsius) {
        Celsius = celsius;
    }

    public double getFahrenheit() {
        return Fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
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
                valurResult= value * this.Kelvin;
                return valurResult;
            case "Celsius":
                valurResult= value * this.Celsius;
                return valurResult;
            case "Fahrenheit":
                valurResult= value * this.Fahrenheit;
                return valurResult;
        }
        return valurResult;
    }
}
