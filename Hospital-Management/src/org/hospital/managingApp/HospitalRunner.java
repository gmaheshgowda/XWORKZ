package org.hospital.managingApp;

import org.hospital.managingApp.floor.Floors;
import org.hospital.managingApp.hospital.Hospital;
import org.hospital.managingApp.patients.Patients;
import org.hospital.managingApp.room.Rooms;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.hospitalName = "Apollo";
        Floors[] floors = new Floors[2];
        //floor1--->
        Floors floor1 = new Floors();
        floor1.floorno = 1;
        Rooms []rooms = new Rooms[2];
        Rooms room1 = new Rooms();
        room1.type = "icu";
        Patients []patients= new Patients[2];
        Patients patient1 = new Patients();
        patient1.setName("abcdefgw");
        patient1.setPhone(2738837292L);
        patient1.setAdress("Los angles");
        patient1.setGender('M');

        Patients patients2 = new Patients();
        patients2.setName("avcdo");
        patients2.setPhone(4646389303L);
        patients2.setAdress("newyork");
        patients2.setGender('M');

        patients[0]=patient1;
        patients[1]=patients2;

        room1.patients=patients;

        Rooms rooms2 = new Rooms();
        rooms2.type = "general ward";
        Patients [] patient2 = new Patients[2];
        Patients patients1 = new Patients();
        patients1.setName("jack");
        patients1.setPhone(4679268293L);
        patients1.setAdress("singapore");
        patients1.setGender('M');

        Patients patient2s = new Patients();
        patient2s.setName("jack");
        patient2s.setPhone(4679268293L);
        patient2s.setAdress("singapore");
        patient2s.setGender('M');

        patient2[0]=patients1;
        patient2[1]=patient2s;
        rooms2.patients=patient2;

        rooms[0]=room1;
        rooms[1]=rooms2;

        floor1.rooms=rooms;

        //floor2-->>>
        Floors floors2 = new Floors();
        floors2.floorno=2;
        Rooms[] rrooms = new Rooms[2];
        Rooms rooms1 = new Rooms();
        rooms1.type = "Scanning";
        Patients [] patients3 = new Patients[2];
        Patients patients4 = new Patients();
        patients4.setName("uyyrew");
        patients4.setPhone(6548764321L);
        patients4.setAdress("newzealand");
        patients4.setGender('M');

        Patients patients5 = new Patients();
        patients5.setName("uutvyyrew");
        patients5.setPhone(6666664321L);
        patients5.setAdress("austria");
        patients5.setGender('M');
        patients3[0]=patients4;
        patients3[1]=patients5;
        rooms1.patients=patients3;

        Rooms rooms3 = new Rooms();
        rooms3.type="medical store";
        Patients[]patients6=new Patients[2];
        Patients patients7 = new Patients();
        patients7.setName("eewqw");
        patients7.setPhone(650000064321L);
        patients7.setAdress("germany");
        patients7.setGender('M');

        Patients patients8 = new Patients();
        patients8.setName("hitler");
        patients8.setPhone(800000064321L);
        patients8.setAdress("Germany");
        patients8.setGender('M');

        patients6[0]=patients7;
        patients6[1]=patients8;

        rooms3.patients=patients6;
        rrooms[0]=rooms1;
        rrooms[1]=rooms3;
        floors2.rooms=rrooms;


        floors[0]=floor1;
        floors[1]=floors2;
        hospital.floors=floors;
        hospital.displayHospitalDetails();





    }
}
