package com.xworkz.trainapp;

import com.xworkz.trainapp.irctc.Irctc;
import com.xworkz.trainapp.irctcdto.IrctcDto;

public class IrctcRunner {
        public static void main(String[] args) {
            IrctcDto dto = new IrctcDto();

            dto.setUserName("Sharath");
            dto.setMobileNumber("9994432100");
            dto.setEmailId("sharath@irctc.in");
            dto.setPassword("Train@123");
            dto.setConfirmPassword("Train@123");

            Irctc train = new Irctc();
            boolean result = train.initiateRegistration(dto);

            if(result == true) {
                System.out.println("Enjoy booking with IRCTC!");
            }
        }
    }


