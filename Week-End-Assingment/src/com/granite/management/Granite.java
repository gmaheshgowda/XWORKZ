package com.granite.management;


public class Granite {
    private String brandname;
    private String type;
    private int thickness;
    private double weight;
    private String color;
    private String origin;
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
    public void setThickness(int thickness)
    {
        this.thickness = thickness;
    }
    public int getThickness()
    {
        return thickness;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}