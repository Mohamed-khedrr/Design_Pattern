/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbuilder;

import java.text.DecimalFormat;

/**
 *
 * @author khedr
 */
public class Car {
    private String color ;
    private String model ;
    private double price ;
    
    public Car(double price , String color ,String model){
        
        this.price = price ;
        this.model = model ;
        this.color = color ;
    }
    
       @Override
          public String toString(){
              return String.format("Car price:%.1f%nCar color: %s%nCar model: %s%n",price , color , model );
          }
    
}
