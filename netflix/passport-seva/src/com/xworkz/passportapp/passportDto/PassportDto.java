package com.xworkz.passportapp.passportDto;

import com.xworkz.passportapp.cpvlocation.CpvLocation;
import com.xworkz.passportapp.pol.POL;

public class PassportDto {
    private CpvLocation cpvLocation;
   private POL postOfficeLocation;
   private String givenName;
   private String surName;
    private String dob;
    private String email;
    private boolean emailLoginSame;
    private String loginId;
    private String pwd;
    private String confirmPwd;
    private String hintQuestion;
    private String hintAns;
    private String captcha;

    public void setCpvLocation(CpvLocation cpvLocation) {
        this.cpvLocation = cpvLocation;
    }

    public CpvLocation getCpvLocation() {
        return cpvLocation;
    }

    public void setPostOfficeLocation(POL postOfficeLocation) {
        this.postOfficeLocation = postOfficeLocation;
    }

    public POL getPostOfficeLocation() {
        return postOfficeLocation;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    public String getGivenName() {
        return givenName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getSurName() {
        return surName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDob() {
        return dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmailLoginSame(boolean emailLoginSame) {
        this.emailLoginSame = emailLoginSame;
    }

    public boolean getEmailLoginSame(boolean emailLoginSame){
        return emailLoginSame;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setConfirmPwd(String confirmPwd) {
        this.confirmPwd = confirmPwd;
    }

    public String getConfirmPwd() {
        return confirmPwd;
    }

    public void setHintQuestion(String hintQuestion) {
        this.hintQuestion = hintQuestion;
    }

    public String getHintQuestion() {
        return hintQuestion;
    }

    public void setHintAns(String hintAns) {
        this.hintAns = hintAns;
    }

    public String getHintAns() {
        return hintAns;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }
}
