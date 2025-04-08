package com.xworkz.dlapp;

import com.xworkz.dlapp.drivinglicense.DrivingLicense;
import com.xworkz.dlapp.drivinglincensedto.DrivingLicenseDto;

public class DrivingLicenseRunner {
        public static void main(String[] args) {
            DrivingLicenseDto dto = new DrivingLicenseDto();

            dto.setApplicantName("Kiran Kumar");
            dto.setDob("12-03-1996");
            dto.setAddress("Mysore, Karnataka");
            dto.setVehicleCategory("MCWG");
            dto.setIdProof("Voter ID");

            DrivingLicense dl = new DrivingLicense();
            boolean approved = dl.startRegistration(dto);

            if(approved == true) {
                System.out.println("DL Application Submitted!");
            }
        }
    }


