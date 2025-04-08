package com.xworkz.fastagapp;

import com.xworkz.fastagapp.fastag.Fastag;
import com.xworkz.fastagapp.fastagdto.FastagDto;

public class FastagRunner {
        public static void main(String[] args) {
            FastagDto dto = new FastagDto();

            dto.setVehicleNumber("KA01AB1234");
            dto.setOwnerName("Meena Reddy");
            dto.setVehicleType("Car");
            dto.setMobileNo("9876543210");
            dto.setKycDocument("Aadhar Card");

            Fastag toll = new Fastag();
            boolean registered = toll.processFastag(dto);

            if(registered == true) {
                System.out.println("FASTag ready for toll use!");
            }
        }
    }


