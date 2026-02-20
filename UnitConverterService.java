package com.unitconverter.unit;
import org.springframework.stereotype.Service;
@Service
public class UnitConverterService {
    public double celsiusToFahrenheit(double value) {
        return (value * 9/5) + 32;
    }
    public double fahrenheitToCelsius(double value) {
        return (value - 32) * 5/9;
    }
    public double kilobytesToMegabytes(double value){return (value/1024);}
    public double MegabytesTokilobytes(double value){return (value*1024);}
}



