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
class ArrayFullException extends RuntimeException {
    public ArrayFullException() {
        System.out.println("Too many vechicles stores in the array");
    }
}
