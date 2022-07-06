/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.program3;

/**
 *
 * @author EjAzike
 */
public class Truck extends Vehicle {
    private int load;

    public Truck(String description, int mpg, int load, String vin) {
        super(description, mpg, vin);
        this.load = load;

    }

    public String toString() {
        return "Truck description: " + super.getDescription() + "(Truck), milage is: " + super.getMPG()
                + " Load capacity is: " + load + " Ibs" + " VIN is: " + super.getVIN();
    }

}
