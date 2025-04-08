package com.xworkz.jiohotstarapp;

import com.xworkz.jiohotstarapp.jiohotstarDto.JioHotstarDto;
import com.xworkz.jiohotstarapp.jiohotstar.JioHotstar;

public class JioHotstarRunner {
    public static void main(String[] args) {
        JioHotstarDto dto = new JioHotstarDto();

        dto.setFullName("Sneha Reddy");
        dto.setMobileNumber("9123456780");
        dto.setEmailId("sneha.reddy@gmail.com");
        dto.setSubscriptionPlan("Premium");
        dto.setDeviceType("Smart TV");

        JioHotstar stream = new JioHotstar();
        boolean result = stream.registerAccount(dto);

        if(result == true) {
            System.out.println("Jio Hotstar Access Granted");
        }
    }
}
