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
public class SUV extends Vehicle {
    private int seating;

    public SUV(String description, int mpg, int seating, String vin) {
        super(description, mpg, vin);
        this.seating = seating;
    }

    public String toString() {
        return "SUV description: " + super.getDescription() + "(SUV), milage is: " + super.getMPG()
                + " Number of seats is: " + seating + " VIN is: " + super.getVIN();
    }

}
