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
class TimeSpan {
    private char timeUnit;
    private int numUnits;
    private String time;

    public TimeSpan(char timeUnits, int numUnits) {
        this.timeUnit = timeUnit;
        this.numUnits = numUnits;
    }

    public char getTimeUnits() {
        return timeUnit;
    }

    public int getNumUnits() {
        return numUnits;
    }

    public String toString() {
        return "you have rented for " + numUnits + " " + timeUnit;

    }

}
