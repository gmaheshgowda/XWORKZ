package com.xworkz.netflixapp.netflixdto;

public class NetflixDto {
        private String fullName;
        private String email;
        private String mobileNumber;
        private String password;
        private String confirmPassword;
        private String profileName;
        private String planType;

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
        public String getFullName() {
            return fullName;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() {
            return email;
        }

        public void setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
        }
        public String getMobileNumber() {
            return mobileNumber;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public String getPassword() {
            return password;
        }

        public void setConfirmPassword(String confirmPassword) {
            this.confirmPassword = confirmPassword;
        }
        public String getConfirmPassword() {
            return confirmPassword;
        }

        public void setProfileName(String profileName) {
            this.profileName = profileName;
        }
        public String getProfileName() {
            return profileName;
        }

        public void setPlanType(String planType) {
            this.planType = planType;
        }
        public String getPlanType() {
            return planType;
        }
    }


