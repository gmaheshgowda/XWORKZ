package com.marker.management;


public class Marker {
    private String brandname;
    private String color;
    private int thickness;
    private double weight;
    private String type;
    private String inkType;
    private int length;

    public void setBrandname(String brandname)
    {
        this.brandname=brandname;
    }
    public String getBrandname() {
        return brandname;
    }
    public void setColor(String color)
    {
        this.color= color;
    }
    public String getColor()
    {
        return color;
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

    public String getInkType() {
        return inkType;
    }

    public void setInkType(String inkType) {
        this.inkType = inkType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
