package com.xworkz.snapchat;

import com.xworkz.snapchat.snapchat.Snapchat;
import com.xworkz.snapchat.snapchatdto.SnapchatDto;

public class SnapchatRunner {
        public static void main(String[] args) {
            SnapchatDto dto = new SnapchatDto();

            dto.setUserName("Shreyas_star");
            dto.setMobileNo("9090909090");
            dto.setEmail("snap24@gmail.com");
            dto.setDob("2001-06-14");
            dto.setPassword("Shrey@123");
            dto.setConfirmPassword("Snap@123");
            dto.setDisplayName("SnapStar");

            Snapchat snap = new Snapchat();
            boolean status = snap.createSnapchatAccount(dto);

            if(status == true) {
                System.out.println("User Registered on Snapchat");
            }
        }
    }


