/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.g3lab5;

/**
 *
 * @author LENOVO
 */
public class Student extends Person{ 
        //Instance variables = ตัวแปรของ Obj
    private String program;
    private int year;
    private double fee;
        //Constructor
    public Student(String name, String address, String program, int year, double fee) {
        //เรียกจาก class แม่ ใช้ super
        super(name,address);//Constructor call to super class (chaining)
        this.program = program;
        this.fee=fee;
        this.year=year;
         System.out.println("Invoke Student(String name, String address, String program, int year, double fee)");
    }
    //Accessor Methods
    public String getProgram() {
        return program;
    }
    //Mutator Medthod
    public void setProgram(String program) {
        this.program = program;
    }
        //Accessor Methods
    public int getYear() {
        return year;
    }
        //Mutator Medthod
    public void setYear(int year) {
        this.year = year;
    }
        //Accessor Methods
    public double getFee() {
        return fee;
    }
        //Mutator Medthod
    public void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString () {
    return String.format("Student[%s, program=%s, year=%d, fee=%f", super.toString(), program,year,fee);
    }
}

