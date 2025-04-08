package com.xworkz.twitterapp.twitterdto;

public class TwitterDto {
        private String userName;
        private String phoneNo;
        private String email;
        private String password;
        private String confirmPassword;
        private String bio;
        private String dob;

        public void setUserName(String userName) {
            this.userName = userName;
        }
        public String getUserName() {
            return userName;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }
        public String getPhoneNo() {
            return phoneNo;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String getEmail() {
            return email;
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

        public void setBio(String bio) {
            this.bio = bio;
        }
        public String getBio() {
            return bio;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }
        public String getDob() {
            return dob;
        }
    }


