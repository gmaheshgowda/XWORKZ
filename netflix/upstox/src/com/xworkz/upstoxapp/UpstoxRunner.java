package com.xworkz.upstoxapp;

import com.xworkz.upstoxapp.upstoxDto.UpstoxDto;
import com.xworkz.upstoxapp.upstox.Upstox;

public class UpstoxRunner {
    public static void main(String[] args) {
        UpstoxDto dto = new UpstoxDto();

        dto.setFullName("Baba");
        dto.setMobile("9876543210");
        dto.setEmail("baba@upstox.com");
        dto.setDob("18-07-1996");
        dto.setPanNumber("SMRTP1234K");
        dto.setLoginId("BabaBoss@45");
        dto.setPassword("Upstox@2025");
        dto.setConfirmPassword("Upstox@2025");
        dto.setBrokeragePlan("Basic");
        dto.setNomineeName("Baba Son");

        Upstox seva = new Upstox();
        boolean result = seva.processAccount(dto);

        if(result == true){
            System.out.println("Upstox Account Created Successfully");
        }
    }
}
