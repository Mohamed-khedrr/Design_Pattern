/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbuilder;

/**
 *
 * @author khedr
 */
public class CarBuilder {
    double price=0 ;
    String color="" ;
    String model="" ;
    
    
    public CarBuilder setPrice(double price ){
        this.price = price ;
        return this ;
    }
    
       public CarBuilder setColor(String color ){
        this.color = color ;
        return this ;
    }
       
          public CarBuilder setModel(String model ){
        this.model = model ;
        return this ;
    }
          
          public Car build(){
              return new Car(price , color , model);
          }
          
       
          
          
}
