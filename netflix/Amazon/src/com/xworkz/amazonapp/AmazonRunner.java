package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazonDto.AmazonDto;
import com.xworkz.amazonapp.amazon.Amazon;

public class AmazonRunner {
    public static void main(String[] args){
        AmazonDto dto = new AmazonDto();

        dto.setUserName("Anjali");
        dto.setMobileNumberOrEmail("anjali.k@amazonmail.com");
        dto.setCreatePassword("Anjali@789");
        dto.setRetypePassword("Anjali@789");
        dto.setAddress("123, JP Nagar, Bangalore");
        dto.setCountry("India");
        dto.setOtp("A1B2C3");

        Amazon shop = new Amazon();
        boolean status = shop.processRegistration(dto);

        if(status == true){
            System.out.println("Amazon Account Created Successfully");
        }
    }
}
