package com.xworkz.phonepeapp.phonepe;

import com.xworkz.phonepeapp.phonepedto.PhonepeDto;

public class Phonepe {
        public boolean registerUserPhonePe(PhonepeDto dto) {
            boolean isRegistered = false;
            boolean isValidated = validatePhonePeDetails(dto);

            if(isValidated == true) {
                isRegistered = true;
                System.out.println("PhonePe Registration Successful");
            } else {
                System.out.println("PhonePe Registration Failed");
            }

            return isRegistered;
        }

        public boolean validatePhonePeDetails(PhonepeDto dto) {
            boolean isValid = false;

            boolean isName = false;
            boolean isMobile = false;
            boolean isEmail = false;
            boolean isPin = false;
            boolean isConfirm = false;
            boolean isBank = false;
            boolean isReferral = false;

            if(dto.getFullName() != null && !dto.getFullName().isEmpty()) {
                isName = true;
            } else System.out.println("Invalid Full Name");

            if(dto.getMobileNumber() != null && !dto.getMobileNumber().isEmpty()) {
                isMobile = true;
            } else System.out.println("Invalid Mobile Number");

            if(dto.getEmailId() != null && !dto.getEmailId().isEmpty()) {
                isEmail = true;
            } else System.out.println("Invalid Email ID");

            if(dto.getUpiPin() != null && !dto.getUpiPin().isEmpty()) {
                isPin = true;
            } else System.out.println("Invalid UPI PIN");

            if(dto.getConfirmPin() != null && dto.getConfirmPin().equals(dto.getUpiPin())) {
                isConfirm = true;
            } else System.out.println("UPI PIN and Confirm PIN must match");

            if(dto.getBankName() != null && !dto.getBankName().isEmpty()) {
                isBank = true;
            } else System.out.println("Invalid Bank Name");

            if(dto.getReferralCode() != null) {
                isReferral = true;
            }

            if(isName && isMobile && isEmail && isPin && isConfirm && isBank && isReferral) {
                isValid = true;
            }

            return isValid;
        }
    }


