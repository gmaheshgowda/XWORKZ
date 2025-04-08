package com.xworkz.oyoapp;

import com.xworkz.oyoapp.oyo.Oyo;
import com.xworkz.oyoapp.oyoDto.OyoDto;

public class OyoRunner {
        public static void main(String[] args) {
            OyoDto dto = new OyoDto();

            dto.setFullName("Shruthan");
            dto.setMobileNumber("9876543210");
            dto.setEmailId("Shru.oyo@gmail.com");
            dto.setPassword("Shru@123");
            dto.setConfirmPassword("Shru@123");

            Oyo room = new Oyo();
            boolean response = room.registerCustomer(dto);

            if(response == true) {
                System.out.println("Welcome to OYO Rooms");
            }
        }
    }


