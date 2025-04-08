package com.xworkz.metroapp;

import com.xworkz.metroapp.metro.Metro;
import com.xworkz.metroapp.metrodto.MetroDto;

public class MetroRunner {
        public static void main(String[] args) {
            MetroDto dto = new MetroDto();

            dto.setPassengerName("Rahul Singh");
            dto.setGender("Male");
            dto.setDob("01-01-2000");
            dto.setStartStation("Rajajinagar");
            dto.setEndStation("Majestic");
            dto.setIdProof("PAN Card");
            dto.setTravelDuration("3 Months");

            Metro pass = new Metro();
            boolean result = pass.applyMetroPass(dto);

            if(result == true) {
                System.out.println("Metro Pass Ready to Use!");
            }
        }
    }


