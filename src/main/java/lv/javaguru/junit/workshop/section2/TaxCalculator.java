package lv.javaguru.junit.workshop.section2;

public class TaxCalculator {

    public static final double BORDER = 20000;
    public static final double TOP_BORDER = 50000;

    public double calculateTax(double income) {
        // Provide implementation after writing tests!

        if (income <= BORDER) {
            return income * 0.25;
        } else if(income > BORDER && income <= TOP_BORDER ){
            return income * 0.4;
        } else {
            return income * 0.5;
        }
    }

}
