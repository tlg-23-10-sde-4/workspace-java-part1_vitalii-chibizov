package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    public SalariedEmployee() {
    }

    private double salary;

    // ctor
    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // get / set

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return String.format("Employee's name is: %s, his hire date is: %s,\n" +
                        "his salary is - %s\n",
                getName(), getHireDate(), getSalary());
    }
}
