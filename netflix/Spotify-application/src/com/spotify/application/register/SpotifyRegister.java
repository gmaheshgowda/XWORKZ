package com.spotify.application.register;

import com.spotify.application.spotifydata.Spotify;

public class SpotifyRegister {
    public boolean registerUser(Spotify spotify)
    {
        boolean isUserValid = false;
        if(validateUser(spotify))
        {
             isUserValid = true;
        }
      return isUserValid;


    }
    public boolean validateUser(Spotify spotify1)
    {
        boolean isDataCorrect = false;
        boolean isfirstNameValid = false;
        boolean islastNameValid = false;
        boolean isageValid = false;
        boolean isgenderValid = false;
        boolean islanguagesValid = false;
        boolean isemailValid = false;
        boolean isphoneValid = false;
        boolean issubscriptionValid = false;
        boolean ispasswordValid = false;
        boolean isconfirmPasswordValid = false;
    if(spotify1.getFirstName()!=null&&spotify1.getFirstName().length()>4) isfirstNameValid = true;
    else System.out.println("please enter valid first name");

    if(spotify1.getLastName() != null)  islastNameValid = true;
    else System.out.println("please enter valid lastname ");

    if(spotify1.getAge() != 0 && spotify1.getAge() > 18) isageValid = true;
    else System.out.println("please enter valid age or you are not elgible");

    if(spotify1.getGender()!=null) isgenderValid = true;
    else System.out.println("please enter the gender");

    if(spotify1.getLanguages() != null) islanguagesValid = true;
    else System.out.println("please enter your language");

    if(spotify1.getEmail() != null) isemailValid = true;
    else System.out.println("enter proper emailId");

    if(spotify1.getPhone() != 0) isphoneValid = true;
    else System.out.println("please enter valid 10 digit phone number");

    if(spotify1.getSubscription()) issubscriptionValid = true;
    else System.out.println("please comfirm your subscription");

    if(spotify1.getPassword()!= null) ispasswordValid = true;
    else System.out.println("please enter valid password details");

    if(spotify1.getConfirmPassword() != null && spotify1.getPassword() == spotify1.getConfirmPassword()) isconfirmPasswordValid = true;
    else System.out.println("please enter same as password");

    if(isfirstNameValid && islastNameValid && isageValid && isgenderValid && islanguagesValid && isemailValid && isphoneValid && ispasswordValid && isconfirmPasswordValid && issubscriptionValid) {
        isDataCorrect = true;
    }
    return isDataCorrect;

    }

}
