package com.ShowRoom.vehicles.showroom;

import com.ShowRoom.vehicles.manager.Manager;

public class ShowRoom {
    public String name;
    public int showroomid;
    public Manager[] manager;
    public void displayShowroom()
    {
        System.out.println("display showroom started ");
        System.out.println("showroom name is :"+name);
        System.out.println("ShowroomId is "+showroomid);
        for(Manager man:manager)
        {
            man.displayManager();
        }
        System.out.println("display showroom ended");
    }

}
