package org.car.managing.car;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrandName("Mercedes Benz");
        car.setType("SUV");
        car.setWheelDrive("4 wheel");
        car.setModel("G-class");
        car.setPrice(18000033L);

        String brandName = car.getBrandName();
        String typecar=car.getType();
        long price=car.getPrice();
        String wheelDrive = car.getWheelDrive();
        String model=car.getModel();

        System.out.println("brand name of the car is :"+brandName);
        System.out.println("type of the car is :"+typecar);
        System.out.println("type of wheel drive :"+wheelDrive);
        System.out.println("price of the car is :"+price);
        System.out.println("Model of the car is :"+model);
    }
}
