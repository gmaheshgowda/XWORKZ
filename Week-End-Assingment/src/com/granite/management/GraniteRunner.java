package com.granite.management;

public class GraniteRunner {
    public static void main(String[] args) {
        Granite granite1 = new Granite();
        granite1.setBrandname("Classic Stone");
        granite1.setType("Polished");
        granite1.setThickness(15);
        granite1.setWeight(50.5);
        granite1.setColor("Black Galaxy");
        granite1.setOrigin("Andhra Pradesh");
        granite1.setLength(240);

        String type = granite1.getType();
        String brandname = granite1.getBrandname();
        int thickness = granite1.getThickness();
        double weight = granite1.getWeight();
        String color = granite1.getColor();
        String origin = granite1.getOrigin();
        int length = granite1.getLength();

        System.out.println("Brand name is : "+brandname);
        System.out.println("Type of granite :"+type);
        System.out.println("Thickness of granite :"+thickness);
        System.out.println("Weight of the granite :"+weight);
        System.out.println("Color of the granite :"+color);
        System.out.println("Origin of the granite :"+origin);
        System.out.println("Length of the granite slab is :"+length+"\n");

        Granite granite2 = new Granite();
        granite2.setBrandname("Stonex India");
        granite2.setType("Flamed");
        granite2.setThickness(18);
        granite2.setWeight(60.0);
        granite2.setColor("Steel Grey");
        granite2.setOrigin("Karnataka");
        granite2.setLength(250);

        String type2 = granite2.getType();
        String brandname2 = granite2.getBrandname();
        int thickness2 = granite2.getThickness();
        double weight2 = granite2.getWeight();
        String color2 = granite2.getColor();
        String origin2 = granite2.getOrigin();
        int length2 = granite2.getLength();

        System.out.println("Brand name is : "+brandname2);
        System.out.println("Type of granite :"+type2);
        System.out.println("Thickness of granite :"+thickness2);
        System.out.println("Weight of the granite :"+weight2);
        System.out.println("Color of the granite :"+color2);
        System.out.println("Origin of the granite :"+origin2);
        System.out.println("Length of the granite slab is :"+length2+"\n");

        Granite granite3 = new Granite();
        granite3.setBrandname("Regatta Granites");
        granite3.setType("Honed");
        granite3.setThickness(20);
        granite3.setWeight(70.25);
        granite3.setColor("Rosy Pink");
        granite3.setOrigin("Rajasthan");
        granite3.setLength(260);

        String type3 = granite3.getType();
        String brandname3 = granite3.getBrandname();
        int thickness3 = granite3.getThickness();
        double weight3 = granite3.getWeight();
        String color3 = granite3.getColor();
        String origin3 = granite3.getOrigin();
        int length3 = granite3.getLength();

        System.out.println("Brand name is : "+brandname3);
        System.out.println("Type of granite :"+type3);
        System.out.println("Thickness of granite :"+thickness3);
        System.out.println("Weight of the granite :"+weight3);
        System.out.println("Color of the granite :"+color3);
        System.out.println("Origin of the granite :"+origin3);
        System.out.println("Length of the granite slab is :"+length3+"\n");

        Granite granite4 = new Granite();
        granite4.setBrandname("Indian Natural Stones");
        granite4.setType("Bush Hammered");
        granite4.setThickness(16);
        granite4.setWeight(55.0);
        granite4.setColor("Tan Brown");
        granite4.setOrigin("Telangana");
        granite4.setLength(245);

        String type4 = granite4.getType();
        String brandname4 = granite4.getBrandname();
        int thickness4 = granite4.getThickness();
        double weight4 = granite4.getWeight();
        String color4 = granite4.getColor();
        String origin4 = granite4.getOrigin();
        int length4 = granite4.getLength();

        System.out.println("Brand name is : "+brandname4);
        System.out.println("Type of granite :"+type4);
        System.out.println("Thickness of granite :"+thickness4);
        System.out.println("Weight of the granite :"+weight4);
        System.out.println("Color of the granite :"+color4);
        System.out.println("Origin of the granite :"+origin4);
        System.out.println("Length of the granite slab is :"+length4+"\n");

        Granite granite5 = new Granite();
        granite5.setBrandname("RK Marbles");
        granite5.setType("Leather Finish");
        granite5.setThickness(22);
        granite5.setWeight(75.0);
        granite5.setColor("Kashmir White");
        granite5.setOrigin("Tamil Nadu");
        granite5.setLength(270);

        String type5 = granite5.getType();
        String brandname5 = granite5.getBrandname();
        int thickness5 = granite5.getThickness();
        double weight5 = granite5.getWeight();
        String color5 = granite5.getColor();
        String origin5 = granite5.getOrigin();
        int length5 = granite5.getLength();

        System.out.println("Brand name is : "+brandname5);
        System.out.println("Type of granite :"+type5);
        System.out.println("Thickness of granite :"+thickness5);
        System.out.println("Weight of the granite :"+weight5);
        System.out.println("Color of the granite :"+color5);
        System.out.println("Origin of the granite :"+origin5);
        System.out.println("Length of the granite slab is :"+length5);
    }
}

