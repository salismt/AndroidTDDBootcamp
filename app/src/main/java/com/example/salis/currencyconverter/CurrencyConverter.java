package com.example.salis.currencyconverter;

public class CurrencyConverter {


    private static final int CURRENCY_CONVERSION = 200;

    public static double convertINRToIDR(int currency) {
        return currency * CURRENCY_CONVERSION;
    }

    public static double convertIDRToINR(int currency) {
        return currency / CURRENCY_CONVERSION;
    }
}
