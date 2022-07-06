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
public class ReservedVehicleException extends RuntimeException {
    public ReservedVehicleException() {
        System.out.println("There is already a reservation present");
    }
}
