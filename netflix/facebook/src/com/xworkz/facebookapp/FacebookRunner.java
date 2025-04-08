package com.xworkz.facebookapp;

import com.xworkz.facebookapp.facebookDto.FacebookDto;
import com.xworkz.facebookapp.facebook.Facebook;

public class FacebookRunner {
    public static void main(String[] args){
        FacebookDto dto = new FacebookDto();

        dto.setFirstName("Rahul");
        dto.setLastName("Verma");
        dto.setMobileOrEmail("rahul.verma@gmail.com");
        dto.setNewPassword("Rahul@123");
        dto.setConfirmPassword("Rahul@123");
        dto.setBirthDate("15-03-1995");
        dto.setGender("Male");

        Facebook book = new Facebook();
        boolean result = book.registerUser(dto);

        if(result == true){
            System.out.println("Facebook Account Created Successfully");
        }
    }
}
