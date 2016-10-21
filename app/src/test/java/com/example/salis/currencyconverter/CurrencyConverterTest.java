package com.example.salis.currencyconverter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CurrencyConverterTest {

    /*
    ** Epsilon is the value that the 2 numbers can be off by.
    ** So it will assert to true as long as Math.abs(expected - actual) < epsilon
    **/

    @Test
    public void shouldConvert1INRTo200IDR() throws Exception {

        assertThat(CurrencyConverter.convertINRToIDR(1), is(200d));

    }

    @Test
    public void shouldConvert100INRTo20000IDR() throws Exception {

        assertThat(CurrencyConverter.convertINRToIDR(100), is(20000d));
    }

    @Test
    public void shouldConvert200IDRTo1INR() throws Exception {

        assertThat(CurrencyConverter.convertIDRToINR(200), is(1d));

    }

    @Test
    public void shouldConvert1IDRTo005INR() throws Exception {

        // should return 0.005 INR
        assertThat(CurrencyConverter.convertIDRToINR(1), is(0.005d));
    }
}