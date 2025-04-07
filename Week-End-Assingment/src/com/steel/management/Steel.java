package com.steel.management;

public class Steel {
    private String brandname;
    private String shape;
    private int radiusOrWidth;
    private double weight;
    private double quantityOfIron;
    private double quantityOfSteel;
    private int lengthAvailable;

    public void setBrandname(String brandname)
    {
        this.brandname=brandname;
    }
    public String getBrandname() {
        return brandname;
    }
    public void setShape(String shape)
    {
        this.shape= shape;
    }
    public String getShape()
    {
        return shape;
    }
    public void setRadiusOrWidth(int radiusOrWidth)
    {
        this.radiusOrWidth = radiusOrWidth;
    }
    public int getRadiusOrWidth()
    {
        return radiusOrWidth;
    }

    public int getLengthAvailable() {
        return lengthAvailable;
    }

    public void setLengthAvailable(int lengthAvailable) {
        this.lengthAvailable = lengthAvailable;
    }

    public double getQuantityOfIron() {
        return quantityOfIron;
    }

    public void setQuantityOfIron(double quantityOfIron) {
        this.quantityOfIron = quantityOfIron;
    }

    public double getQuantityOfSteel() {
        return quantityOfSteel;
    }

    public void setQuantityOfSteel(double quantityOfSteel) {
        this.quantityOfSteel = quantityOfSteel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
