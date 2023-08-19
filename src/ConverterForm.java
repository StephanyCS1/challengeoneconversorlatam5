import Unids.Coins;
import Unids.Longitude;
import Unids.Temperature;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ConverterForm {
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JComboBox coinFrom;
    private JComboBox coinTo;
    private JTextField coinValue;
     private JTextField ResultCoin;
    private JComboBox longFrom;
    private JComboBox longTo;
    private JTextField longitudeValue;
    private JTextField resultLong;
    private JComboBox tempTo;
    private JComboBox tempFrom;
    private JTextField tempValue;
    private JTextField resultTemp;

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public JComboBox getCoinFrom() {
        return coinFrom;
    }

    public JComboBox getCoinTo() {
        return coinTo;
    }

    public JTextField getResultCoin() {
        return ResultCoin;
    }

    public void setResultCoin(JTextField resultCoin) {
        this.ResultCoin = resultCoin;
    }

    public JTextField getCoinValue() {
        return coinValue;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public void setCoinFrom(JComboBox coinFrom) {
        this.coinFrom = coinFrom;
    }

    public void setCoinTo(JComboBox coinTo) {
        this.coinTo = coinTo;
    }

    public void setCoinValue(JTextField coinValue) {
        this.coinValue = coinValue;
    }

    public JComboBox getLongFrom() {
        return longFrom;
    }

    public void setLongFrom(JComboBox longFrom) {
        this.longFrom = longFrom;
    }

    public JComboBox getLongTo() {
        return longTo;
    }

    public void setLongTo(JComboBox longTo) {
        this.longTo = longTo;
    }

    public JTextField getLongitudeValue() {
        return longitudeValue;
    }

    public void setLongitudeValue(JTextField longitudeValue) {
        this.longitudeValue = longitudeValue;
    }

    public JTextField getResultLong() {
        return resultLong;
    }

    public void setResultLong(JTextField resultLong) {
        this.resultLong = resultLong;
    }

    public JComboBox getTempTo() {
        return tempTo;
    }

    public void setTempTo(JComboBox tempTo) {
        this.tempTo = tempTo;
    }

    public JComboBox getTempFrom() {
        return tempFrom;
    }

    public void setTempFrom(JComboBox tempFrom) {
        this.tempFrom = tempFrom;
    }

    public JTextField getTempValue() {
        return tempValue;
    }

    public void setTempValue(JTextField tempValue) {
        this.tempValue = tempValue;
    }

    public JTextField getResultTemp() {
        return resultTemp;
    }

    public void setResultTemp(JTextField resultTemp) {
        this.resultTemp = resultTemp;
    }

    public ConverterForm() {
        final String[] valueFrom = {""};
        final String[] valueTo = {""};
        final double[] valueToConvert = {1.0};
        final String[] valueLongFrom = {""};
        final String[] valueLongTo = {""};
        final double[] valueLongToConvert = {1.0};
        final String[] valueTempFrom = {""};
        final String[] valueTempTo = {""};
        final double[] valueTempToConvert = {1.0};

        coinFrom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueFrom[0] = Objects.requireNonNull(getCoinFrom().getSelectedItem()).toString();
            }
        });
        coinTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueTo[0] = Objects.requireNonNull(getCoinTo().getSelectedItem()).toString();            }
        });
        coinValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueToConvert[0] = Double.parseDouble(getCoinValue().getText().toString());
                if (valueToConvert[0] < 1) {
                    throw new IllegalArgumentException("Valor invalido");
                }else {
                    ResultCoin.setText(String.valueOf(resultCoinValue(valueFrom[0], valueTo[0], valueToConvert[0])));
                }
            }
        });
        longFrom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueLongFrom[0] = Objects.requireNonNull(getLongFrom().getSelectedItem()).toString();
            }
        });
        longTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueLongTo[0] = getLongTo().getSelectedItem().toString();
            }
        });
        longitudeValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueLongToConvert[0] = Double.parseDouble(getLongitudeValue().getText().toString());
                if (valueLongToConvert[0] < 1) {
                    throw new IllegalArgumentException("Valor invalido");
                }else {
                    resultLong.setText(String.valueOf(resultLongValue(valueLongFrom[0], valueLongTo[0], valueLongToConvert[0])));
                }
            }
        });
        tempFrom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueTempFrom[0] = getTempFrom().getSelectedItem().toString();
            }
        });
        tempTo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueTempTo[0] = getTempTo().getSelectedItem().toString();
            }
        });
        tempValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valueTempToConvert[0] = Double.parseDouble(getTempValue().getText());
                resultTemp.setText(String.valueOf(resultTempValue(valueTempFrom[0], valueTempTo[0], valueTempToConvert[0])));
            }
        });
    }

    public double resultCoinValue(String valueFrom, String valueTo , double valueToConvert){
        double result = 0;
        if(valueFrom.equals(valueTo)) return result =valueToConvert;
        if (valueToConvert <0) return result=valueToConvert;
        Coins cop = new Coins(0.00023, 0.00025, 0.037, 0.34, 0.00020, 1);
        Coins euro = new Coins(1, 1.09, 158.78, 1459.77, 0.86, 4408.65);
        Coins poundStr = new Coins(1.16, 1.27, 184.57, 1696.84, 1, 5124.32);
        Coins dollar = new Coins(0.92, 1, 145.49, 1337.69, 0.79, 4040);
        Coins won = new Coins(0.00069, 0.00075, 0.11, 1, 0.00059, 3.02);
        Coins yen = new Coins(0.00069, 0.00075, 0.11, 1, 0.0054, 27.76);

        if (valueFrom.equalsIgnoreCase("Peso Colombiano")) {
             result = cop.convertTo(valueFrom, valueTo, valueToConvert);
        } else if (valueFrom.equalsIgnoreCase("Euro")) {
             result = euro.convertTo(valueFrom, valueTo, valueToConvert);
        } else if (valueFrom.equalsIgnoreCase("poundSterling")) {
             result =poundStr.convertTo(valueFrom, valueTo, valueToConvert);
        } else if (valueFrom.equalsIgnoreCase("Dollar")) {
             result =dollar.convertTo(valueFrom, valueTo, valueToConvert);
        } else if (valueFrom.equalsIgnoreCase("Won")) {
             result =won.convertTo(valueFrom, valueTo, valueToConvert);
        } else if (valueFrom.equalsIgnoreCase("Yen")) {
             result =yen.convertTo(valueFrom, valueTo, valueToConvert);
        }
        return result;
    }
    public double resultLongValue(String valueLongFrom, String valueLongTo , double valueLongToConvert){
        double longResult = 0;
        if(valueLongFrom.equals(valueLongTo)) return longResult =valueLongToConvert;
        if (valueLongToConvert <0) return longResult=valueLongToConvert;
        Longitude mm = new Longitude("mm", 1, 0.1, 0.001, 0.000001);
        Longitude cm = new Longitude("cm", 10, 1, 0.01, 0.00001);
        Longitude m = new Longitude("m", 1000, 100, 1, 0.001);
        Longitude km = new Longitude("km", 1000000, 100000, 1000, 1);

        if (valueLongFrom.equalsIgnoreCase("mm")) {
            longResult = mm.convertTo(valueLongFrom, valueLongTo, valueLongToConvert);
        } else if (valueLongFrom.equalsIgnoreCase("cm")) {
            longResult = cm.convertTo(valueLongFrom, valueLongTo, valueLongToConvert);
        } else if (valueLongFrom.equalsIgnoreCase("m")) {
            longResult = m.convertTo(valueLongFrom, valueLongTo, valueLongToConvert);
        } else if (valueLongFrom.equalsIgnoreCase("km")){
            longResult = km.convertTo(valueLongFrom, valueLongTo, valueLongToConvert);
        }
        return longResult;
    }
    public double resultTempValue(String valueTempFrom, String valueTempTo ,double valueTempToConvert){
        System.out.println(valueTempFrom + " " + valueTempTo + " " + valueTempToConvert);
        Temperature temp = new Temperature();
        double tempResult = 0;
        if(valueTempFrom.equals(valueTempTo)){
            return valueTempToConvert;
        }else {
            tempResult= temp.convertTo(valueTempFrom, valueTempTo, valueTempToConvert);
        }
        return tempResult;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ConverterForm form = new ConverterForm();

            JFrame frame = new JFrame("Unit Converter");
            frame.setContentPane(form.getPanel1());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        });
    }

}

