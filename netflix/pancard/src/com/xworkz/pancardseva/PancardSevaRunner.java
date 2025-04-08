package com.xworkz.pancardseva;

import com.xworkz.pancardseva.pancardDto.PancardDto;
import com.xworkz.pancardseva.pancard.Pancard;

public class PancardSevaRunner {
    public static void main(String[] args) {
        PancardDto dto = new PancardDto();

        dto.setApplicantName("Rajesh Kumar");
        dto.setFatherName("Mahesh Kumar");
        dto.setDob("15-06-1990");
        dto.setGender("Male");
        dto.setAadhaarNumber("987612345678");
        dto.setMobile("9876543210");
        dto.setEmail("rajesh.kumar@gmail.com");
        dto.setAddress("4th Main Road, Jayanagar, Bengaluru");
        dto.setPanType("Individual");

        Pancard seva = new Pancard();
        boolean result = seva.applyPan(dto);

        if(result == true) {
            System.out.println("PAN Card will be delivered soon");
        }
    }
}
