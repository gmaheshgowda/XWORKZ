package com.xworkz.twitterapp;

import com.xworkz.twitterapp.twitter.Twitter;
import com.xworkz.twitterapp.twitterdto.TwitterDto;

public class TwitterRunner {
        public static void main(String[] args) {
            TwitterDto dto = new TwitterDto();

            dto.setUserName("elon_musk");
            dto.setPhoneNo("9876543210");
            dto.setEmail("elon@tesla.com");
            dto.setPassword("Starlink@2025");
            dto.setConfirmPassword("Starlink@2025");
            dto.setBio("Engineer, Inventor, Meme-Lord");
            dto.setDob("1971-06-28");

            Twitter x = new Twitter();
            boolean status = x.createTwitterAccount(dto);

            if(status == true) {
                System.out.println("User Registered on Twitter");
            }
        }
    }


