package com.xworkz.passportapp.passportseva;

import com.xworkz.passportapp.passportDto.PassportDto;

public class PassportSeva {
    public boolean registerUser(PassportDto passportDto){
        boolean isUserRegistered = false;
   boolean userValidate = validateUser(passportDto);
       if(userValidate==true){
           isUserRegistered=true;
       }
       else{
           System.out.println("Registration failed");
       }
       return isUserRegistered;
    }

    public boolean validateUser(PassportDto passportDto){
       boolean isValidateUser = false;
       boolean isCpvLocation = false;
       boolean isPostOfficeLocation = false;
       boolean isGivenName = false;
       boolean isSurName = false;
       boolean isDob = false;
       boolean isEmail = false;
       boolean isLoginId = false;
       boolean isPwd = false;
       boolean isConfirmPwd = false;
       boolean isHintQuestion = false;
       boolean isHintAns = false;
       boolean isCaptcha = false;

       if(!passportDto.getCpvLocation().toString().isEmpty() && passportDto.getCpvLocation()!=null){
           isCpvLocation=true;
       }
       else System.out.println("Invalid Cpv location");

       if(!passportDto.getPostOfficeLocation().toString().isEmpty() && passportDto.getPostOfficeLocation()!=null){
           isPostOfficeLocation=true;
       }
       else System.out.println("Invalid Post Office Location");

       if(!passportDto.getGivenName().isEmpty() && passportDto.getGivenName()!=null){
           isGivenName=true;
       }
       else System.out.println("Invalid Given Name");

       if(!passportDto.getSurName().isEmpty() && passportDto.getSurName()!=null){
           isSurName = true;
       }
       else System.out.println("Surname");

       if(passportDto.getDob()!=null){
           isDob = true;
       }

       if(passportDto.getEmail()!=null){
           isEmail=true;
       }
       else System.out.println("Invalid Email");


       if(passportDto.getLoginId()!=null){
           isLoginId=true;
       }
       else System.out.println("Invalid Login Id");

       if(passportDto.getPwd()!=null){
           isPwd=true;
       }
       else System.out.println("Invalid Password");

       if(passportDto.getConfirmPwd()!=null && passportDto.getConfirmPwd().equals(passportDto.getPwd())){
           isConfirmPwd = true;
       }
       else System.out.println("Confirm Password should be PassWord ");

       if(passportDto.getHintQuestion()!=null){
           isHintQuestion=true;
       }
       else System.out.println("Invalid Hint Question");

       if(passportDto.getHintAns()!=null){
           isHintAns=true;
       }
       else System.out.println("Invalid Hint answer");

       if(passportDto.getCaptcha()!=null){
           isCaptcha=true;
       }
       else System.out.println("Invalid Captcha");

       if(isCpvLocation && isPostOfficeLocation && isGivenName && isSurName && isDob && isEmail  && isLoginId && isPwd && isConfirmPwd && isHintQuestion && isHintAns && isCaptcha  ){
           isValidateUser =true;
       }
       return isValidateUser;
    }

}
