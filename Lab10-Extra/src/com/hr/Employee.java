package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee implements AutoCloseable{
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    // option 4 - nested exception
    public void goToWork() throws WorkException {
        Car c = new Car("qwe123", "Toyota", "RAV4");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to ger to work ", e);
        }
        finally {
            c.stop();
        }
        System.out.println("Arrived at work");
    }

    // option 3
   /* public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("qwe123", "Toyota", "RAV4");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            // use JavaMail API to send email to Lisa Herbold to complain
            throw e;
            //System.out.println(e);
        }
        finally {
            c.stop();
        }
        System.out.println("Arrived at work");
    }*/



/*    public void goToWork2() throws DestinationUnreachableException {

        Car c = new Car("qwe123", "Toyota", "RAV4");

        try (Employee )
        {
            c.start();
            c.moveTo("West Seattle");
        } finally {
            c.stop();
        }
    }*/

    @Override
    public void close() throws Exception {

    }
    /*    //  another version of the same stuff under it (option 2)
    public void goToWork() throws DestinationUnreachableException {

        Car c = new Car("qwe123", "Toyota", "RAV4");
        try {
            c.start();
            c.moveTo("West Seattle");
        } finally {
            c.stop();
        }
    }*/

/*      // option 1 - stops here / for re throw - go to option 3
        public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("qwe123", "Toyota", "RAV4");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            System.out.println(e);
          //  e.printStackTrace();
        }
        finally {
            c.stop();
        }
        System.out.println("Arrived at work");
    }*/

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}