package com.marker.management;

public class MarkerRunner {
    public static void main(String[] args) {
        Marker marker1 = new Marker();
        marker1.setBrandname("Faber-Castell");
        marker1.setColor("Black");
        marker1.setThickness(1);
        marker1.setWeight(0.02);
        marker1.setType("Permanent");
        marker1.setInkType("Oil-based");
        marker1.setLength(14);

        String color = marker1.getColor();
        String brandname = marker1.getBrandname();
        int thickness = marker1.getThickness();
        double weight = marker1.getWeight();
        String type = marker1.getType();
        String inkType = marker1.getInkType();
        int length = marker1.getLength();

        System.out.println("Brand name is : "+brandname);
        System.out.println("Color of marker :"+color);
        System.out.println("Thickness of marker :"+thickness);
        System.out.println("Weight of the marker :"+weight);
        System.out.println("Type of the marker :"+type);
        System.out.println("Ink type :"+inkType);
        System.out.println("Length of the marker :"+length+"\n");

        Marker marker2 = new Marker();
        marker2.setBrandname("Camlin");
        marker2.setColor("Red");
        marker2.setThickness(2);
        marker2.setWeight(0.025);
        marker2.setType("Whiteboard");
        marker2.setInkType("Alcohol-based");
        marker2.setLength(13);

        String color2 = marker2.getColor();
        String brandname2 = marker2.getBrandname();
        int thickness2 = marker2.getThickness();
        double weight2 = marker2.getWeight();
        String type2 = marker2.getType();
        String inkType2 = marker2.getInkType();
        int length2 = marker2.getLength();

        System.out.println("Brand name is : "+brandname2);
        System.out.println("Color of marker :"+color2);
        System.out.println("Thickness of marker :"+thickness2);
        System.out.println("Weight of the marker :"+weight2);
        System.out.println("Type of the marker :"+type2);
        System.out.println("Ink type :"+inkType2);
        System.out.println("Length of the marker :"+length2+"\n");

        Marker marker3 = new Marker();
        marker3.setBrandname("Reynolds");
        marker3.setColor("Blue");
        marker3.setThickness(1);
        marker3.setWeight(0.021);
        marker3.setType("Sketch");
        marker3.setInkType("Water-based");
        marker3.setLength(15);

        String color3 = marker3.getColor();
        String brandname3 = marker3.getBrandname();
        int thickness3 = marker3.getThickness();
        double weight3 = marker3.getWeight();
        String type3 = marker3.getType();
        String inkType3 = marker3.getInkType();
        int length3 = marker3.getLength();

        System.out.println("Brand name is : "+brandname3);
        System.out.println("Color of marker :"+color3);
        System.out.println("Thickness of marker :"+thickness3);
        System.out.println("Weight of the marker :"+weight3);
        System.out.println("Type of the marker :"+type3);
        System.out.println("Ink type :"+inkType3);
        System.out.println("Length of the marker :"+length3+"\n");

        Marker marker4 = new Marker();
        marker4.setBrandname("Luxor");
        marker4.setColor("Green");
        marker4.setThickness(2);
        marker4.setWeight(0.03);
        marker4.setType("Highlight");
        marker4.setInkType("Gel-based");
        marker4.setLength(12);

        String color4 = marker4.getColor();
        String brandname4 = marker4.getBrandname();
        int thickness4 = marker4.getThickness();
        double weight4 = marker4.getWeight();
        String type4 = marker4.getType();
        String inkType4 = marker4.getInkType();
        int length4 = marker4.getLength();

        System.out.println("Brand name is : "+brandname4);
        System.out.println("Color of marker :"+color4);
        System.out.println("Thickness of marker :"+thickness4);
        System.out.println("Weight of the marker :"+weight4);
        System.out.println("Type of the marker :"+type4);
        System.out.println("Ink type :"+inkType4);
        System.out.println("Length of the marker :"+length4+"\n");

        Marker marker5 = new Marker();
        marker5.setBrandname("Cello");
        marker5.setColor("Purple");
        marker5.setThickness(1);
        marker5.setWeight(0.019);
        marker5.setType("Calligraphy");
        marker5.setInkType("Water-based");
        marker5.setLength(14);

        String color5 = marker5.getColor();
        String brandname5 = marker5.getBrandname();
        int thickness5 = marker5.getThickness();
        double weight5 = marker5.getWeight();
        String type5 = marker5.getType();
        String inkType5 = marker5.getInkType();
        int length5 = marker5.getLength();

        System.out.println("Brand name is : "+brandname5);
        System.out.println("Color of marker :"+color5);
        System.out.println("Thickness of marker :"+thickness5);
        System.out.println("Weight of the marker :"+weight5);
        System.out.println("Type of the marker :"+type5);
        System.out.println("Ink type :"+inkType5);
        System.out.println("Length of the marker :"+length5);
    }
}
