package org.hospital.managingApp.floor;

import org.hospital.managingApp.room.Rooms;

public class Floors {
    public int floorno;
    public Rooms[] rooms;

    public void displayFloors()
    {
        System.out.println("Floor number was :"+floorno);
        for(Rooms room : rooms)
        {
            room.getRoomDetails();
        }

    }
}
