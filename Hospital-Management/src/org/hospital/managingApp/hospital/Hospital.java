package org.hospital.managingApp.hospital;

import org.hospital.managingApp.floor.Floors;

public class Hospital {
    public String hospitalName;
    public Floors[] floors;
    public void displayHospitalDetails()
    {
        System.out.println("Name of the Hospital was : "+hospitalName);
        for(Floors floor:floors)
        {
            floor.displayFloors();
        }
    }
}
