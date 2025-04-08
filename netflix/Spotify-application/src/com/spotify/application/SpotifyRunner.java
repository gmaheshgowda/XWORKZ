package com.spotify.application;

import com.spotify.application.constants.Gender;
import com.spotify.application.constants.Languages;
import com.spotify.application.register.SpotifyRegister;
import com.spotify.application.spotifydata.Spotify;

public class SpotifyRunner {
    public static void main(String[] args) {
        Spotify spotify = new Spotify();
        spotify.setFirstName("Mahesh");
        spotify.setLastName("gowda");
        spotify.setAge(21);
        spotify.setGender(Gender.Male);
        spotify.setLanguages(Languages.telugu);
        spotify.setEmail("gmaheah@gmail.com");
        spotify.setPhone(9019463973L);
        spotify.setPassword("1245dkfosm@kdl");
        spotify.setConfirmPassword("1245dkfosm@kdl");
        spotify.setSubscription(true);

        SpotifyRegister register = new SpotifyRegister();
        boolean ref1 ;
        ref1 = register.registerUser(spotify);
        if(ref1) System.out.println("Congratulations Your Spotify Registration is SuccessFull");
        else System.out.println("Sorry your  Registration is Unsuccessfull Please try again");


    }
}
