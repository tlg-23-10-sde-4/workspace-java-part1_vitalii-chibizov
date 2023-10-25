package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee
        extends Employee {

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

    // abstract methods
    @Override
    public void payTaxes() {
        System.out.printf("\n%s paid taxes of %s", getName(), SALARIED_TAX_RATE*getSalary());
    }

    // business methods
    @Override
    public void pay(){
        System.out.printf("%s is getting paid: %s\n", getName(), getSalary());
    }

    // get / set
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("his salary is - %s", getSalary());
    }
}
