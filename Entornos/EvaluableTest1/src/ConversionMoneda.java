/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class ConversionMoneda {
    
    public double dolarEuro(double Dolar){
           double Euro;
           Euro = Dolar * 0.85;
           Euro = Math.round(Euro * 100d) / 100d;
           return Euro;
    }
    
    public double euroDolar (double Euro){
           double Dolar;
           Dolar = Euro / 0.85;
           Dolar = Math.round(Dolar * 100d) / 100d;
           return Dolar;
    
    }
}
