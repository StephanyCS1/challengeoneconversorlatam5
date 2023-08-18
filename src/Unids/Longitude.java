package Unids;
/**
 * @author Stephany Castro Salas
 */
public class Longitude implements convertTo{
    /**
     * This is the longitude class contains the values for the conversions to another longitude
     * You must provide the actual values for each longitude, the parameters are
     * @param name
     * @param mm
     * @param cm
     * @param m
     * @param km
     */
    private String name;
    private double mm, cm, m, km;

    public Longitude() {
    }

    public Longitude(String name, double mm, double cm, double m, double km) {
        this.name = name;
        this.mm = mm;
        this.cm = cm;
        this.m = m;
        this.km = km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMm() {
        return mm;
    }

    public void setMm(double mm) {
        this.mm = mm;
    }

    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    /**
     * This is an interface method is called to determine the converted value, you must pass this parameters
     *
     * @param from  initial longitude or currency
     * @param to    end longitude or currency for conversion
     * @param value to be converted
     * @return the converted value
     */
    @Override
    public double convertTo(String from, String to, double value) {
        double resultValue = 0;
        switch (to){
            case "mm":
                resultValue= value * this.mm;
                return resultValue;
            case "cm":
                resultValue= value * this.cm;
                return resultValue;
            case "m":
                resultValue= value * this.m;
                return resultValue;
            case "km":
                resultValue= value * this.km;
                return resultValue;
        }
        return resultValue;
    }
}
