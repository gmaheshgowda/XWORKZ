package com.xworkz.scholorshipapp;

import com.xworkz.scholorshipapp.scholorshipDto.ScholarshipDto;
import com.xworkz.scholorshipapp.scholorship.Scholorship;

public class ScholoshipRunner {
        public static void main(String[] args) {
            ScholarshipDto dto = new ScholarshipDto();

            dto.setApplicantName("Anjali Kumari");
            dto.setInstituteName("National Science College");
            dto.setCourseName("B.Sc Physics");
            dto.setIncomeCertificate("INCOME2024CERT");
            dto.setBankAccountNumber("123456789012");

            Scholorship seva = new Scholorship();
            boolean result = seva.submitApplication(dto);

            if(result == true) {
                System.out.println("Application Submitted");
            }
        }
    }

