package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.zomato.Zomato;
import com.xworkz.zomatoapp.zomatodto.ZomatoDto;

public class ZomatoRunner {
        public static void main(String[] args) {
            ZomatoDto dto = new ZomatoDto();

            dto.setFullName("Ayesha Rao");
            dto.setMobile("9876543210");
            dto.setEmail("ayesha@zomato.com");
            dto.setUserPassword("Zomato@2025");
            dto.setRetypePassword("Zomato@2025");

            Zomato food = new Zomato();
            boolean success = food.performSignup(dto);

            if(success == true) {
                System.out.println("Welcome to Zomato");
            }
        }
    }


