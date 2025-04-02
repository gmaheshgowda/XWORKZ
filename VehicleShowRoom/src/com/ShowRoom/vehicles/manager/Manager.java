package com.ShowRoom.vehicles.manager;

import com.ShowRoom.vehicles.staff.Staff;

public class Manager {

    public String manName;
    public int manId;
    public Staff[] staff;
    public void displayManager()
    {
        System.out.println("display manager started");
        System.out.println("Manager name is :"+manName);
        System.out.println("managerId is "+manId);
        for(Staff st1:staff)
        {
            st1.displayStaff();
        }
        System.out.println("display manager ended");
    }
}
