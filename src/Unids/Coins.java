package Unids;

/**
 * @author Stephany Castro Salas
 */
public class Coins implements convertTo {
    /**
     * This is the Coins class contains the values for the conversions to another coins
     * You must provide the actual values for each coin, the parameters are
     * @param euro
     * @param dollar
     * @param yen
     * @param won
     * @param poundSterling
     * @param cop(Colombian peso)
     * the type of these parameters are double
     */
    private double euro, dollar, yen, won, poundSterling, cop;

    public Coins() {
    }

    public Coins(double euro, double dollar, double yen, double won, double poundSterling, double cop) {
        this.euro = euro;
        this.dollar = dollar;
        this.yen = yen;
        this.won = won;
        this.poundSterling = poundSterling;
        this.cop = cop;
    }

    public double getEuro() {
        return euro;
    }

    public double getDollar() {
        return dollar;
    }

    public double getYen() {
        return yen;
    }

    public double getWon() {
        return won;
    }

    public double getPoundSterling() {
        return poundSterling;
    }

    public double getCop() {
        return cop;
    }

    /**
     * This is an inteface method is called to determine the converted value, you must pass this parameters
     *
     * @param from  initial coin or currency
     * @param to    end coin or currency for conversion
     * @param value to be converted
     * @return the converted value
     */
    @Override
    public double convertTo(String from, String to, double value) {
        double resultValue = 0;
        switch (to) {
            case "Peso Colombiano":
                resultValue = value * this.cop;
                return resultValue;
            case "Euro":
                resultValue = value * this.euro;
                return resultValue;
            case "Dollar":
                resultValue = value * this.dollar;
                return resultValue;
            case "Yen":
                resultValue = value * this.yen;
                return resultValue;
            case "Won":
                resultValue = value * this.won;
                return resultValue;
            case "poundSterling":
                resultValue = value * this.poundSterling;
                return resultValue;
        }
        return resultValue;
    }

    @Override
    public String toString() {
        return "Coins{" +
                "euro=" + euro +
                ", dollar=" + dollar +
                ", yen=" + yen +
                ", won=" + won +
                ", poundSterling=" + poundSterling +
                ", cop=" + cop +
                '}';
    }
}

