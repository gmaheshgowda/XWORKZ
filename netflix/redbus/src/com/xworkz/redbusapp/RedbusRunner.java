package com.xworkz.redbusapp;

import com.xworkz.redbusapp.redbus.Redbus;
import com.xworkz.redbusapp.redbusdto.RedbusDto;

public class RedbusRunner {
        public static void main(String[] args) {
            RedbusDto dto = new RedbusDto();

            dto.setUserName("nikhil_rider");
            dto.setContactNumber("9988776655");
            dto.setEmailAddress("nikhil@redbus.com");
            dto.setPassword("Bus@321");
            dto.setConfirmPassword("Bus@321");

            Redbus bus = new Redbus();
            boolean result = bus.doRegistration(dto);

            if(result == true) {
                System.out.println("Welcome to Redbus ");
            }
        }
    }


