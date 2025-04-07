package org.nerolac.Paints.paint;

public class PaintRunner {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.setBrandName("Nerolac");
        paint.setPaintId(7);
        paint.setType("Distemper");
        paint.setColor("Yellow");
        paint.setPrice(8394);

         String brandName = paint.getBrandName();
         String type=paint.getType();
         int price = paint.getPrice();
         String color = paint.getColor();
         int paintId = paint.getPaintId();

        System.out.println("brand name is "+brandName);
        System.out.println("type of the paint is :"+type);
        System.out.println("price of the paint is :"+price);
        System.out.println("color of the paint is :"+color);
        System.out.println("id of the paint is :"+paintId);
    }
}
