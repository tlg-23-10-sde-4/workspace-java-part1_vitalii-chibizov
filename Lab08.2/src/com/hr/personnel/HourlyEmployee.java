package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    public HourlyEmployee() {
    }
    private double rate, hours;

    // ctor
    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setHours(hours);
        setRate(rate);
    }

    // business methods
    @Override
    public void pay(){
        System.out.printf("%s is working %s hours, at this rate: %s\n", getName(), getHours(), getRate());
    }

    // get / set
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("his rate is - %s, his hours are - %s", getRate(), getHours());
    }
}