package org.nerolac.Paints.paint;

public class Paint {
    private String brandName;
    private String type;
    private int price;
    private String color;
    private int paintId;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPaintId() {
        return paintId;
    }

    public void setPaintId(int paintId) {
        this.paintId = paintId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
