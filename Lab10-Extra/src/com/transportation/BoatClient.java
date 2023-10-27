package com.transportation;

class BoatClient {

    public static void main(String[] args) {
        Boat boat = new Boat("3231231");
        boat.moveTo("West Seattle");

        //Vehicle boat = new Boat("Completely Normal Car");

       /* public void impoundAll(Vehicle[] vehicles){
            for (Vehicle vehicle : vehicles){
                vehicle.moveTo("Impound Lot");
            }
        }*/

    }

}