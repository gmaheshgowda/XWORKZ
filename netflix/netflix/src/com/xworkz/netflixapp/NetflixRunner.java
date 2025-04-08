package com.xworkz.netflixapp;

import com.xworkz.netflixapp.netflix.Netflix;
import com.xworkz.netflixapp.netflixdto.NetflixDto;

public class NetflixRunner {
        public static void main(String[] args) {
            NetflixDto dto = new NetflixDto();

            dto.setFullName("Jackie");
            dto.setEmail("jackie@continental.com");
            dto.setMobileNumber("9012345678");
            dto.setPassword("jackie@1");
            dto.setConfirmPassword("jackie@1");
            dto.setProfileName("JW Profile");
            dto.setPlanType("Premium");

            Netflix ott = new Netflix();
            boolean status = ott.registerNetflixUser(dto);

            if(status == true) {
                System.out.println("Netflix Account Created");
            }
        }
    }


