package com.xworkz.netflixapp.netflix;

import com.xworkz.netflixapp.netflixdto.NetflixDto;

public class Netflix {
        public boolean registerNetflixUser(NetflixDto dto) {
            boolean isRegistered = false;
            boolean isValid = verifyNetflixInfo(dto);

            if(isValid == true) {
                isRegistered = true;
                System.out.println("Netflix Registration Successful");
            } else {
                System.out.println("Netflix Registration Failed");
            }

            return isRegistered;
        }

        public boolean verifyNetflixInfo(NetflixDto dto) {
            boolean isValid = false;

            boolean isFull = false;
            boolean isEmail = false;
            boolean isMobile = false;
            boolean isPwd = false;
            boolean isConfirm = false;
            boolean isProfile = false;
            boolean isPlan = false;

            if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
                isFull = true;
            } else System.out.println("Invalid Full Name");

            if(dto.getEmail() != null && !dto.getEmail().isEmpty()) {
                isEmail = true;
            } else System.out.println("Invalid Email");

            if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
                isMobile = true;
            } else System.out.println("Invalid Mobile Number");

            if(dto.getPassword() != null && !dto.getPassword().isEmpty()) {
                isPwd = true;
            } else System.out.println("Invalid Password");

            if(dto.getConfirmPassword() != null && dto.getConfirmPassword().equals(dto.getPassword())) {
                isConfirm = true;
            } else System.out.println("Passwords must match");

            if(dto.getProfileName() != null && !dto.getProfileName().isEmpty()) {
                isProfile = true;
            } else System.out.println("Invalid Profile Name");

            if(dto.getPlanType() != null && !dto.getPlanType().isEmpty()) {
                isPlan = true;
            } else System.out.println("Invalid Plan Type");

            if(isFull && isEmail && isMobile && isPwd && isConfirm && isProfile && isPlan) {
                isValid = true;
            }

            return isValid;
        }
    }


