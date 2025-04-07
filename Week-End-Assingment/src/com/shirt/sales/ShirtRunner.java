package com.shirt.sales;

public class ShirtRunner {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt();
        shirt1.setBrandname("Peter England");
        shirt1.setType("Formal");
        shirt1.setSize(40);
        shirt1.setWeight(0.45);
        shirt1.setColor("Blue");
        shirt1.setFabric("Cotton");
        shirt1.setLength(30);

        String type = shirt1.getType();
        String brandname = shirt1.getBrandname();
        int size = shirt1.getSize();
        double weight = shirt1.getWeight();
        String color = shirt1.getColor();
        String fabric = shirt1.getFabric();
        int length = shirt1.getLength();

        System.out.println("Brand name is : "+brandname);
        System.out.println("Type of shirt :"+type);
        System.out.println("Size of shirt :"+size);
        System.out.println("Weight of the shirt :"+weight);
        System.out.println("Color of the shirt :"+color);
        System.out.println("Fabric of the shirt :"+fabric);
        System.out.println("Length of the shirt is :"+length+"\n");

        Shirt shirt2 = new Shirt();
        shirt2.setBrandname("Arrow");
        shirt2.setType("Casual");
        shirt2.setSize(42);
        shirt2.setWeight(0.50);
        shirt2.setColor("White");
        shirt2.setFabric("Linen");
        shirt2.setLength(32);

        String type2 = shirt2.getType();
        String brandname2 = shirt2.getBrandname();
        int size2 = shirt2.getSize();
        double weight2 = shirt2.getWeight();
        String color2 = shirt2.getColor();
        String fabric2 = shirt2.getFabric();
        int length2 = shirt2.getLength();

        System.out.println("Brand name is : "+brandname2);
        System.out.println("Type of shirt :"+type2);
        System.out.println("Size of shirt :"+size2);
        System.out.println("Weight of the shirt :"+weight2);
        System.out.println("Color of the shirt :"+color2);
        System.out.println("Fabric of the shirt :"+fabric2);
        System.out.println("Length of the shirt is :"+length2+"\n");

        Shirt shirt3 = new Shirt();
        shirt3.setBrandname("Van Heusen");
        shirt3.setType("Formal");
        shirt3.setSize(39);
        shirt3.setWeight(0.40);
        shirt3.setColor("Grey");
        shirt3.setFabric("Cotton");
        shirt3.setLength(31);

        String type3 = shirt3.getType();
        String brandname3 = shirt3.getBrandname();
        int size3 = shirt3.getSize();
        double weight3 = shirt3.getWeight();
        String color3 = shirt3.getColor();
        String fabric3 = shirt3.getFabric();
        int length3 = shirt3.getLength();

        System.out.println("Brand name is : "+brandname3);
        System.out.println("Type of shirt :"+type3);
        System.out.println("Size of shirt :"+size3);
        System.out.println("Weight of the shirt :"+weight3);
        System.out.println("Color of the shirt :"+color3);
        System.out.println("Fabric of the shirt :"+fabric3);
        System.out.println("Length of the shirt is :"+length3+"\n");

        Shirt shirt4 = new Shirt();
        shirt4.setBrandname("Zara");
        shirt4.setType("Casual");
        shirt4.setSize(41);
        shirt4.setWeight(0.47);
        shirt4.setColor("Black");
        shirt4.setFabric("Polyester");
        shirt4.setLength(33);

        String type4 = shirt4.getType();
        String brandname4 = shirt4.getBrandname();
        int size4 = shirt4.getSize();
        double weight4 = shirt4.getWeight();
        String color4 = shirt4.getColor();
        String fabric4 = shirt4.getFabric();
        int length4 = shirt4.getLength();

        System.out.println("Brand name is : "+brandname4);
        System.out.println("Type of shirt :"+type4);
        System.out.println("Size of shirt :"+size4);
        System.out.println("Weight of the shirt :"+weight4);
        System.out.println("Color of the shirt :"+color4);
        System.out.println("Fabric of the shirt :"+fabric4);
        System.out.println("Length of the shirt is :"+length4+"\n");

        Shirt shirt5 = new Shirt();
        shirt5.setBrandname("H&M");
        shirt5.setType("Casual/Formal");
        shirt5.setSize(43);
        shirt5.setWeight(0.52);
        shirt5.setColor("Navy Blue");
        shirt5.setFabric("Blended");
        shirt5.setLength(34);

        String type5 = shirt5.getType();
        String brandname5 = shirt5.getBrandname();
        int size5 = shirt5.getSize();
        double weight5 = shirt5.getWeight();
        String color5 = shirt5.getColor();
        String fabric5 = shirt5.getFabric();
        int length5 = shirt5.getLength();

        System.out.println("Brand name is : "+brandname5);
        System.out.println("Type of shirt :"+type5);
        System.out.println("Size of shirt :"+size5);
        System.out.println("Weight of the shirt :"+weight5);
        System.out.println("Color of the shirt :"+color5);
        System.out.println("Fabric of the shirt :"+fabric5);
        System.out.println("Length of the shirt is :"+length5);
    }
}