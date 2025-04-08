package com.xworkz.instagramapp;

import com.xworkz.instagramapp.instagramDto.InstagramDto;
import com.xworkz.instagramapp.instagram.Instagram;

public class InstagramRunner {
    public static void main(String[] args){
        InstagramDto dto = new InstagramDto();

        dto.setFullName("Rohit Sharma");
        dto.setUserName("Rohit");
        dto.setMobileNumberOrEmail("Sharma@gmail.com");
        dto.setPassword("Rohit@123");
        dto.setConfirmPassword("Rohit@123");
        dto.setDateOfBirth("10-05-1990");
        dto.setGender("Male");

        Instagram social = new Instagram();
        boolean result = social.registerUser(dto);

        if(result == true){
            System.out.println("Instagram Account Created Successfully");
        }
    }
}
