package com.hr.personnel;
import java.time.LocalDate;

public class Executive extends SalariedEmployee{

    // TODO: finish the class later on

    //  constructor's
    public Executive(){
        super();
    }
    public Executive(String name, LocalDate hireDate){
        super(name, hireDate);
    }
    public Executive(String name, LocalDate hireDate, double salary){
        super(name, hireDate, salary);
    }

    @Override
    public void fileReturn(){
        System.out.println("Return filed electronically");
    }
    @Override
    public void work(){
        System.out.printf("%s enjoying a nice round of golf", getName());
    }
}