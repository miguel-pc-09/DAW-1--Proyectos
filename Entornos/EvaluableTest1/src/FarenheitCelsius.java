/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class FarenheitCelsius {
     public double CelsiusToFarenheit(double celsius) {
        double farenheit;
        farenheit = (celsius * 1.8) + 32;
        return farenheit;
    }

    public double FarenheitToCelsius(double farenheit) {
        double celsius;
        celsius = Math.round((farenheit - 32) / 1.8);
        return celsius;
    }
    
}
