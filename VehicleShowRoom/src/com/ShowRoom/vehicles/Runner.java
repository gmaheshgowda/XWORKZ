package com.ShowRoom.vehicles;

import com.ShowRoom.vehicles.manager.Manager;
import com.ShowRoom.vehicles.showroom.ShowRoom;
import com.ShowRoom.vehicles.staff.Staff;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started ");
        ShowRoom sh1 = new ShowRoom();
        sh1.name= "CarShowRoom";
        sh1.showroomid = 7;

        Manager[] managers = new Manager[1];
        Manager man1 = new Manager();//-->>
        man1.manName = "surya";
        man1.manId = 70;
        Staff[] staff = new Staff[2];
        Staff stf1 = new Staff();
        stf1.name = "abed";
        stf1.work = "nonTechnical";
        stf1.salary = 45000;

        Staff stf2 = new Staff();
        stf2.name = "acked";
        stf2.work = "Technical";
        stf2.salary = 55000; //-->>
        staff[0] = stf1;
        staff[1] = stf2;
        man1.staff=staff;
        sh1.manager=managers;
        managers[0]=man1;
        sh1.displayShowroom();
        System.out.println("main ended ");
    }
}
