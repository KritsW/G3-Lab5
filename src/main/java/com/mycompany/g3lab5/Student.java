/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3lab5;

/**
 *
 * @author LENOVO
 */
public class Student _____________________ {
    private String program;
    private int year;
    private double fee;
    public Student(String name, String address, String program, int year, double fee) {
        __________________(name,address);
        this.program = program;
        this.fee=fee;
        this.year=year;
         System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }
    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public String toString () {
    return String.format("_________________________________", _____.toString(), program,year,fee);
    }
}

