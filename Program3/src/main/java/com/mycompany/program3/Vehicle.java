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
public abstract class Vehicle {

    private String description;
    private int mpg;
    private String vin;
    private Reservation resv;

    public Vehicle(String description, int mpg, String vin) {
        this.description = description;
        this.mpg = mpg;
        this.vin = vin;
        resv = null;
    }

    public int getMPG() {
        return mpg;
    }

    public String getVIN() {
        return vin;
    }

    public String getDescription() {
        return description;
    }

    public Reservation getReservation() {
        return resv;
    }

    public abstract String toString();

    public boolean isReserved() {
        if (resv == null) {
            return false;
        } else
            return true;
    }

    public void reserve(Reservation r) throws ReservedVehicleException {
        if (resv != null) {
            throw new ReservedVehicleException();
        }
        this.resv = r;
    }

    public void cancelReservation() throws UnReservedVehicleException {
        if (resv == null)
            throw new UnReservedVehicleException();
        resv = null;
    }
}
