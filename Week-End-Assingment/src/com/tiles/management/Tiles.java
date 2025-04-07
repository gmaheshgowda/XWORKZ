package com.tiles.management;

public class Tiles {
    private String brandname;
    private String material;
    private int size;
    private double weight;
    private String finishType;
    private String color;
    private int thickness;

    public void setBrandname(String brandname)
    {
        this.brandname=brandname;
    }
    public String getBrandname() {
        return brandname;
    }
    public void setMaterial(String material)
    {
        this.material= material;
    }
    public String getMaterial()
    {
        return material;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public int getSize()
    {
        return size;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFinishType() {
        return finishType;
    }

    public void setFinishType(String finishType) {
        this.finishType = finishType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}