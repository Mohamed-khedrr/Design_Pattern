/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.testbuilder;

/**
 *
 * @author khedr
 */
public class TestBuilder {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Car c1 = new CarBuilder()
                .setColor("red")
                .setModel("s5")
                .setPrice(1111.2)
                .build();
                
        System.out.println(c1.toString()) ;
    }
}
