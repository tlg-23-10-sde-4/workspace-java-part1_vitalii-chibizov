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

    public String toString() {
        return String.format("Employee's name is: %s, his hire date is: %s,\n" +
                        "his rate is - %s, his hours are - %s\n",
                getName(), getHireDate(), getRate(), getHours());
    }
}