package org.hospital.managingApp.room;

import org.hospital.managingApp.patients.Patients;

public class Rooms {
    public String type;
    public Patients[] patients;

    public void getRoomDetails()
    {
        System.out.println("the type of the room was :"+type);
        for(Patients patient1 : patients)
        {
            String name = patient1.getName();
            long Phone = patient1.getPhone();
            String adress = patient1.getAdress();
            char gender = patient1.getGender();
            System.out.println("Name of the Patient is :"+name);
            System.out.println("Phone no of the patient is :"+Phone);
            System.out.println("Adress of the patient is ;"+adress);
            System.out.println("Gender of the Patient is :"+gender);
        }
    }
}
