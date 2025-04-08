package com.xworkz.twitterapp.twitter;

import com.xworkz.twitterapp.twitterdto.TwitterDto;

public class Twitter {
        public boolean createTwitterAccount(TwitterDto dto) {
            boolean isCreated = false;
            boolean isValid = validateTwitterDetails(dto);

            if(isValid == true) {
                isCreated = true;
                System.out.println("Twitter Account Created Successfully");
            } else {
                System.out.println("Twitter Account Creation Failed");
            }

            return isCreated;
        }

        public boolean validateTwitterDetails(TwitterDto dto) {
            boolean isValid = false;

            boolean isUser = false;
            boolean isPhone = false;
            boolean isEmail = false;
            boolean isPwd = false;
            boolean isConfirm = false;
            boolean isBio = false;
            boolean isDob = false;

            if(dto.getUserName() != null && !dto.getUserName().isEmpty()) {
                isUser = true;
            } else System.out.println("Invalid Username");

            if(dto.getPhoneNo() != null && !dto.getPhoneNo().isEmpty()) {
                isPhone = true;
            } else System.out.println("Invalid Phone Number");

            if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
                isEmail = true;
            } else System.out.println("Invalid Email");

            if(dto.getPassword() != null && !dto.getPassword().isEmpty()) {
                isPwd = true;
            } else System.out.println("Invalid Password");

            if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
                isConfirm = true;
            } else System.out.println("Passwords do not match");

            if(dto.getBio() != null && !dto.getBio().isEmpty()) {
                isBio = true;
            } else System.out.println("Invalid Bio");

            if(dto.getDob() != null && !dto.getDob().isEmpty()) {
                isDob = true;
            } else System.out.println("Invalid Date of Birth");

            if(isUser && isPhone && isEmail && isPwd && isConfirm && isBio && isDob) {
                isValid = true;
            }

            return isValid;
        }
    }


