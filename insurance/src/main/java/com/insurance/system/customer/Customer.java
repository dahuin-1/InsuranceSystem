package com.insurance.system.customer;

enum DiseaseHistory {
    CANCER, HIGH_BLOOD_PRESSURE, DIABETES, NOTE
}

enum FamilyDiseaseHistory {
    CANCER, HIGH_BLOOD_PRESSURE, DIABETES, NOTE
}

enum Job {
    OFFICE_JOB,TECHNICAL_JOB,DANGEROUS_JOB,DRIVING_JOB, NONE
}

public class Customer {
    private boolean accidentIn3m;
    private int age;
    private int birth;
    private int customerID;
    private FamilyDiseaseHistory familyDiseaseHistory;
    private boolean gender;
    private DiseaseHistory diseaseHistory;
    private Job job;
    private String name;
    private int phoneNumber;
    private int property;

    public DiseaseHistory getDiseaseHistory() {
        return diseaseHistory;
    }

    public FamilyDiseaseHistory getFamilyDiseaseHistory() {
        return familyDiseaseHistory;
    }

    public int getAge() {
        return age;
    }

    public int getBirth() {
        return birth;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getProperty() {
        return property;
    }

    public Job getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public void setAccidentIn3m(boolean accidentIn3m) {
        this.accidentIn3m = accidentIn3m;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setDiseaseHistory(DiseaseHistory diseaseHistory) {
        this.diseaseHistory = diseaseHistory;
    }

    public void setFamilyDiseaseHistory(FamilyDiseaseHistory familyDiseaseHistory) {
        this.familyDiseaseHistory = familyDiseaseHistory;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProperty(int property) {
        this.property = property;
    }
}

