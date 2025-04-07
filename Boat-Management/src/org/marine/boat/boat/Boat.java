package org.marine.boat.boat;

public class Boat {
    private String name;
    private String type;
    private int boatId;
    private long cost;

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBoatId(int boatId) {
        this.boatId = boatId;
    }

    public long getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getBoatId() {
        return boatId;
    }

//    public void getBoatDetails()
//    {
//        System.out.println("the name of the boat is :"+getName());
//        System.out.println("the Id of the Boat is :"+getBoatId());
//        System.out.println("the type of the boat was :"+getType());
//        System.out.println("the cost of the boat was :"+getCost());;
//
//    }
}
