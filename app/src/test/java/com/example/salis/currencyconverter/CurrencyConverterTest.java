package com.example.salis.currencyconverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyConverterTest {

    /*
    ** Epsilon is the value that the 2 numbers can be off by.
    ** So it will assert to true as long as Math.abs(expected - actual) < epsilon
    **/

    @Test
    public void shouldConvert1INRTo200IDR() throws Exception {

        assertEquals(CurrencyConverter.convertINRToIDR(1), 200, 1);

    }

    @Test
    public void shouldConvert100INRTo20000IDR() throws Exception {

        assertEquals(CurrencyConverter.convertINRToIDR(100), 20000, 1);
    }

    @Test
    public void shouldConvert200IDRTo1INR() throws Exception {

        assertEquals(CurrencyConverter.convertIDRToINR(200), 1, 1);

    }
}