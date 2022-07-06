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
public class Reservation {
    private String creditCardNum;
    private TimeSpan rentalPeriod;
    private boolean insuranceSelected;

    public Reservation(String creditCardNum, TimeSpan rentalPeriod, boolean insuranceSelected) {
        this.creditCardNum = creditCardNum;
        this.rentalPeriod = rentalPeriod;
        this.insuranceSelected = insuranceSelected;
    }

    public String getCardNum() {
        return creditCardNum;
    }

    public TimeSpan getRentalPeriod() {
        return rentalPeriod;
    }

    public boolean getIsInsuranceSelected() {
        return insuranceSelected == true;
    }

    public String toString() {
        return "Card number is " + creditCardNum + ", rental period is " + rentalPeriod + " , insurance: "
                + getIsInsuranceSelected();
    }

}
