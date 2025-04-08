package com.xworkz.aadharportal;

import com.xworkz.aadharportal.aadhar.Aadhar;
import com.xworkz.aadharportal.aadhardto.AadharDto;

public class AadharRunner {
        public static void main(String[] args) {
            AadharDto dto = new AadharDto();

            dto.setFullName("Raghav Sharma");
            dto.setBirthYear("1995");
            dto.setAddress("Sector 10, Gurugram, Haryana");
            dto.setMobileNumber("9123456789");
            dto.setOtp("894561");

            Aadhar id = new Aadhar();
            boolean card = id.registerAadhar(dto);

            if(card == true) {
                System.out.println("You will receive your Aadhar card soon.");
            }
        }
    }



