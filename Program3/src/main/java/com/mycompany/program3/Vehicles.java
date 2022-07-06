/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.program3;

import java.util.*;

/**
 *
 * @author EjAzike
 */
public class Vehicles {
    private static Vehicle[] agency_vehicles = new Vehicle[11];
    private int current;
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        agency_vehicles[0] = new Car("Chevrolet Camaro - 2018", 30, 2, "HK4GM4564GD");
        agency_vehicles[1] = new Car("Ford Fusion - 2018", 34, 2, "AB4EG5689GM");
        agency_vehicles[2] = new Car("Ford Fusion Hybrid - 2017", 32, 4, "KU4EG3245RW");
        agency_vehicles[3] = new Car("Chevrolet Impala - 2019", 30, 4, "RK3BM4356YH");

        agency_vehicles[4] = new SUV("Honda Odyssey - 2020", 28, 7, "VM9RE2635TD");
        agency_vehicles[5] = new SUV("Dodge Caravan - 2019", 25, 5, "QK3FL4273ME");
        agency_vehicles[6] = new SUV("Ford Expedition - 2018", 20, 5, "JK2RT9264HY");

        agency_vehicles[7] = new Truck("Ten-Foot", 12, 2810, "EJ5KU2435BC");
        agency_vehicles[8] = new Truck("Eighteenteen-Foot", 10, 5930, "KG4DM5472RK");
        agency_vehicles[9] = new Truck("Twenty-Four-Foot", 7, 6500, "EB2WR3082QB");
        agency_vehicles[10] = new Truck("Twenty-Four-Foot", 8, 6500, "TV3GH4290EK");

        do {
            choice = menu();
            if (choice == 1) {
                for (int i = 0; i < agency_vehicles.length; i++) {
                    System.out.println((i + 1) + ":" + agency_vehicles[i]);
                }
            }

            else if (choice == 2) {
                for (int i = 0; i < agency_vehicles.length; i++) {
                    if (agency_vehicles[i].isReserved() == false) {
                        System.out.println("This vehicle is available: " + agency_vehicles[i]);
                    }
                }
            } else if (choice == 3) {
                boolean insuranceSelected = false;
                System.out.println("which vehicle do you want to reserve");
                int i = cin.nextInt();
                if (agency_vehicles[i - 1].isReserved() == false) {
                    System.out.print("Enter Credit Card: ");
                    String card = cin.next();
                    System.out.print(
                            "Enter 'D' or 'W' or 'M' for day, week or month. Then enter how many days you would like to reserve it for ");
                    char c = cin.next().charAt(0);

                    int d = cin.nextInt();
                    TimeSpan time = new TimeSpan(c, d);
                    System.out.println("Do you want to purchase insurance(Y/N): ");
                    String insurance = cin.next();
                    if (insurance == "Y" || insurance == "y") {
                        insuranceSelected = true;
                    }
                    Reservation r = new Reservation(card, time, insuranceSelected);
                    agency_vehicles[i - 1].reserve(r);
                    System.out.println("Your reservation has been made for " + agency_vehicles[i - 1] + " for " + d
                            + " " + c + " with insurance selected = " + insuranceSelected);
                } else
                    System.out.println(
                            "This vehicle is already reserved, please return to the menu and reserve another vehichle");
                menu();

            } else if (choice == 4) {
                System.out.println("To get reservation enter vehicle's VIN number");
                String VIN = cin.next();
                for (int i = 0; i < agency_vehicles.length; i++) {
                    if (VIN.equals(agency_vehicles[i].getVIN())) {
                        if (agency_vehicles[i].getReservation() != null) {
                            System.out.println(agency_vehicles[i].getReservation());
                        }
                    }
                }
            } else if (choice == 5) {
                System.out.println("Enter VIN for the vechicle you would like to cancel");
                String VIN = cin.next();
                for (int i = 0; i < agency_vehicles.length; i++) {
                    if (VIN.equals(agency_vehicles[i].getVIN())) {
                        agency_vehicles[i].cancelReservation();
                    }
                }
            } else if (choice == 6) {
                System.out.println("Is vechicle a Car, Suv or Truck");
                String type = cin.next();
                if (type.equals("Car") || type.equals("car")) {
                    System.out.println("Enter the description");
                    String description = cin.next();
                    System.out.println("Enter the MPG");
                    int MPG = cin.nextInt();
                    System.out.println("Enter the number of seats");
                    int seating = cin.nextInt();
                    System.out.println("Enter the VIN");
                    String VIN = cin.next();
                    Vehicle v = new Car(description, MPG, seating, VIN);
                    add(v);
                } else if (type.equals("Suv") || type.equals("suv")) {
                    System.out.println("Enter the description");
                    String description = cin.next();
                    System.out.println("Enter the MPG");
                    int MPG = cin.nextInt();
                    System.out.println("Enter the number of seats");
                    int seating = cin.nextInt();
                    System.out.println("Enter the VIN");
                    String VIN = cin.next();
                    Vehicle v = new SUV(description, MPG, 4, VIN);
                    add(v);
                } else if (type.equals("Truck") || type.equals("truck")) {
                    System.out.println("Enter the description");
                    String description = cin.next();
                    System.out.println("Enter the MPG");
                    int MPG = cin.nextInt();
                    System.out.println("Enter the load capacity");
                    int load = cin.nextInt();
                    System.out.println("Enter the VIN");
                    String VIN = cin.next();
                    Vehicle v = new Truck(description, MPG, load, VIN);
                    add(v);
                }
                // System.out.println("Which vehicle would you like to add to the collection
                // \nEnter description, mpg and VIN");
                // String description = cin.next();
                // System.out.println("MPG");
                // int mpg = cin.nextInt();
                // System.out.println("VIN");
                // String VIN = cin.next();
                // Vehicle v = new Car(description,mpg,4,VIN);
                // add(v);

            } else if (choice == 7) {
                System.out.println("Which vehicle would you like to remove from the collection \nEnter the VIN");
                String VIN = cin.next();
                for (int i = 0; i < agency_vehicles.length; i++) {
                    if (VIN.equals(agency_vehicles[i].getVIN())) {
                        remove(VIN);
                    }
                }
            } else if (choice < 1 || choice > 8) {
                System.out.println("\nEnter a number between 1 and 8");
            } else
                break;

        } while (choice != 8);
    }

    public Vehicles(int current) {

        this.current = current;
    }

    public void array() {

    }

    public static void add(Vehicle v) throws ArrayFullException {

        for (int i = 0; i < agency_vehicles.length; i++) {
            if (agency_vehicles[i] == null) {
                agency_vehicles[i] = v;
                break;
            } else
                throw new ArrayFullException();
        }

    }

    public static void remove(String VIN) throws VINNotFoundException {
        for (int i = 0; i < agency_vehicles.length; i++) {
            if (agency_vehicles[i].getVIN().equals(VIN)) {

                agency_vehicles[i] = null;

            }
        }
    }

    public Vehicle getVehicle(String VIN) throws VINNotFoundException {
        for (int i = 0; i < agency_vehicles.length; i++) {
            if (!agency_vehicles[i].getVIN().equals(VIN)) {
                throw new VINNotFoundException();

            } else if (agency_vehicles[i].getVIN().equals(VIN)) {
                return agency_vehicles[i];
            }
        }
        return null;
    }

    public void getArray(int i) {
        System.out.println(agency_vehicles[i]);
    }

    public String toString() {
        return super.toString();
    }

    public static int menu() {
        System.out.println("            ");
        System.out.println("------------");
        System.out.println("MENU");
        System.out.println("1 - Display all vehicles");
        System.out.println("2 - Display available vehicles");
        System.out.println("3 - Reserve a vehicle");
        System.out.println("4 - Display a reservation");
        System.out.println("5 - Cancel a reservation");
        System.out.println("6 - Add a vehicle");
        System.out.println("7 - Remove a vehicle");
        System.out.println("8 - Quit\n");
        int ans = cin.nextInt();
        return ans;

    }

}
