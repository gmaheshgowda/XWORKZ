package com.tiles.management;
public class TilesRunner {
    public static void main(String[] args) {
        Tiles tile1 = new Tiles();
        tile1.setBrandname("Kajaria");
        tile1.setMaterial("Ceramic");
        tile1.setSize(60);
        tile1.setWeight(15.5);
        tile1.setFinishType("Glossy");
        tile1.setColor("White");
        tile1.setThickness(8);

        String material = tile1.getMaterial();
        String brandname = tile1.getBrandname();
        int size = tile1.getSize();
        double weight = tile1.getWeight();
        String finishType = tile1.getFinishType();
        String color = tile1.getColor();
        int thickness = tile1.getThickness();

        System.out.println("Brand name is : "+brandname);
        System.out.println("Material of tile :"+material);
        System.out.println("Size of tile :"+size);
        System.out.println("Weight of the tile :"+weight);
        System.out.println("Finish type :"+finishType);
        System.out.println("Color :"+color);
        System.out.println("Thickness :"+thickness+"\n");

        Tiles tile2 = new Tiles();
        tile2.setBrandname("Somany");
        tile2.setMaterial("Vitrified");
        tile2.setSize(80);
        tile2.setWeight(18.0);
        tile2.setFinishType("Matte");
        tile2.setColor("Grey");
        tile2.setThickness(10);

        String material2 = tile2.getMaterial();
        String brandname2 = tile2.getBrandname();
        int size2 = tile2.getSize();
        double weight2 = tile2.getWeight();
        String finishType2 = tile2.getFinishType();
        String color2 = tile2.getColor();
        int thickness2 = tile2.getThickness();

        System.out.println("Brand name is : "+brandname2);
        System.out.println("Material of tile :"+material2);
        System.out.println("Size of tile :"+size2);
        System.out.println("Weight of the tile :"+weight2);
        System.out.println("Finish type :"+finishType2);
        System.out.println("Color :"+color2);
        System.out.println("Thickness :"+thickness2+"\n");

        Tiles tile3 = new Tiles();
        tile3.setBrandname("Nitco");
        tile3.setMaterial("Porcelain");
        tile3.setSize(90);
        tile3.setWeight(20.5);
        tile3.setFinishType("Glossy");
        tile3.setColor("Beige");
        tile3.setThickness(9);

        String material3 = tile3.getMaterial();
        String brandname3 = tile3.getBrandname();
        int size3 = tile3.getSize();
        double weight3 = tile3.getWeight();
        String finishType3 = tile3.getFinishType();
        String color3 = tile3.getColor();
        int thickness3 = tile3.getThickness();

        System.out.println("Brand name is : "+brandname3);
        System.out.println("Material of tile :"+material3);
        System.out.println("Size of tile :"+size3);
        System.out.println("Weight of the tile :"+weight3);
        System.out.println("Finish type :"+finishType3);
        System.out.println("Color :"+color3);
        System.out.println("Thickness :"+thickness3+"\n");

        Tiles tile4 = new Tiles();
        tile4.setBrandname("Johnson");
        tile4.setMaterial("Marble");
        tile4.setSize(100);
        tile4.setWeight(25.0);
        tile4.setFinishType("Polished");
        tile4.setColor("Black");
        tile4.setThickness(12);

        String material4 = tile4.getMaterial();
        String brandname4 = tile4.getBrandname();
        int size4 = tile4.getSize();
        double weight4 = tile4.getWeight();
        String finishType4 = tile4.getFinishType();
        String color4 = tile4.getColor();
        int thickness4 = tile4.getThickness();

        System.out.println("Brand name is : "+brandname4);
        System.out.println("Material of tile :"+material4);
        System.out.println("Size of tile :"+size4);
        System.out.println("Weight of the tile :"+weight4);
        System.out.println("Finish type :"+finishType4);
        System.out.println("Color :"+color4);
        System.out.println("Thickness :"+thickness4+"\n");

        Tiles tile5 = new Tiles();
        tile5.setBrandname("OrientBell");
        tile5.setMaterial("Granite");
        tile5.setSize(70);
        tile5.setWeight(17.5);
        tile5.setFinishType("Textured");
        tile5.setColor("Brown");
        tile5.setThickness(11);

        String material5 = tile5.getMaterial();
        String brandname5 = tile5.getBrandname();
        int size5 = tile5.getSize();
        double weight5 = tile5.getWeight();
        String finishType5 = tile5.getFinishType();
        String color5 = tile5.getColor();
        int thickness5 = tile5.getThickness();

        System.out.println("Brand name is : "+brandname5);
        System.out.println("Material of tile :"+material5);
        System.out.println("Size of tile :"+size5);
        System.out.println("Weight of the tile :"+weight5);
        System.out.println("Finish type :"+finishType5);
        System.out.println("Color :"+color5);
        System.out.println("Thickness :"+thickness5);
    }
}
