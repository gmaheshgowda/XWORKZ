package com.xworkz.passportapp;

import com.xworkz.passportapp.cpvlocation.CpvLocation;
import com.xworkz.passportapp.passportDto.PassportDto;
import com.xworkz.passportapp.passportseva.PassportSeva;
import com.xworkz.passportapp.pol.POL;

public class PassportRunner {
    public static void main(String[] args) {
        PassportDto passportDto = new PassportDto();
        passportDto.setCpvLocation(CpvLocation.CPVDehli);
        passportDto.setPostOfficeLocation(POL.Bengaluru);
        passportDto.setGivenName("Virat");
        passportDto.setSurName("Kohli");
        passportDto.setEmail("virat12@gmail.com");
        passportDto.setDob("18-8-1987");
        passportDto.setEmailLoginSame(true);
        passportDto.setLoginId("Virad@56");
        passportDto.setPwd("Kohli@18");
        passportDto.setConfirmPwd("Kohli@18");
        passportDto.setHintQuestion("Birth Place");
        passportDto.setHintAns("Bengaluru");
        passportDto.setCaptcha("AGHT21");


        PassportSeva passportSeva = new PassportSeva();
       boolean message = passportSeva.registerUser(passportDto);

       if(message == true){
           System.out.println("User Registration Successful");
       }
       else System.out.println("User Registration Unsuccessful");
    }
}