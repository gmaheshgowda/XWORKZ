package com.xworkz.phonepeapp;

import com.xworkz.phonepeapp.phonepe.Phonepe;
import com.xworkz.phonepeapp.phonepedto.PhonepeDto;

public class PhonepeRunner {
        public static void main(String[] args) {
            PhonepeDto dto = new PhonepeDto();

            dto.setFullName("Sneha Mehra");
            dto.setMobileNumber("9876543210");
            dto.setEmailId("sneha@gmail.com");
            dto.setUpiPin("1234");
            dto.setConfirmPin("1234");
            dto.setBankName("HDFC");
            dto.setReferralCode("SNEHA2025");

            Phonepe pay = new Phonepe();
            boolean status = pay.registerUserPhonePe(dto);

            if(status == true) {
                System.out.println("Welcome to PhonePe!");
            }
        }
    }


