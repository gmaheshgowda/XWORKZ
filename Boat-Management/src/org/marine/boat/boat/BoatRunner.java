package org.marine.boat.boat;

public class BoatRunner {
    public static void main(String[] args) {
        Boat boat = new Boat();
        boat.setName("black Pearl");
        boat.setBoatId(98);
        boat.setType("tourism");
        boat.setCost(6738467593L);
        String name = boat.getName();
        int id =boat.getBoatId();
        String boatType = boat.getType();
        long cost = boat.getCost();
       // boat.getBoatDetails();
        System.out.println("the name of the boat is :"+name);
        System.out.println("the Id of the Boat is :"+id);
        System.out.println("the type of the boat was :"+boatType);
        System.out.println("the cost of the boat was :"+cost);


    }
}
