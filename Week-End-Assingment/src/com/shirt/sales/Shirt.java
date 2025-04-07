package com.shirt.sales;

public class Shirt {
    private String brandname;
    private String type;
    private int size;
    private double weight;
    private String color;
    private String fabric;
    private int length;

    public void setBrandname(String brandname)
    {
        this.brandname=brandname;
    }
    public String getBrandname() {
        return brandname;
    }
    public void setType(String type)
    {
        this.type= type;
    }
    public String getType()
    {
        return type;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public int getSize()
    {
        return size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}