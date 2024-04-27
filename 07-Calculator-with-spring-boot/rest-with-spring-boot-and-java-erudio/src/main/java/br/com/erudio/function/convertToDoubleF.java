package br.com.erudio.function;

public class convertToDoubleF {

    isNumericf isNumericf = new isNumericf();

    public double convertToDouble(String strNumber) {
        if(strNumber == null) return 0D;
        String number = strNumber.replaceAll(",",".");
        if(isNumericf.isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

}
