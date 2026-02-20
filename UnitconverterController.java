package com.unitconverter.unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class UnitconverterController {

    @Autowired
    private UnitConverterService unitConverterService;

    @GetMapping("/celsiusToFahrenheit")
    public double celsiusToFahrenheit(@RequestParam double value) {
        return unitConverterService.celsiusToFahrenheit(value);
    }

    @GetMapping("/fahrenheitToCelsius")
    public double fahrenheitToCelsius(@RequestParam double value) {
        return unitConverterService.fahrenheitToCelsius(value);
    }

    @GetMapping("/kilobytesToMegabytes")
    public double kilobytesToMegabytes(@RequestParam double value) {
        return unitConverterService.kilobytesToMegabytes(value);
    }
    @GetMapping("/MegabytesTokilobytes")
    public double MegabytesTokilobytes(@RequestParam double value) {
        return unitConverterService.MegabytesTokilobytes(value);
    }
}

