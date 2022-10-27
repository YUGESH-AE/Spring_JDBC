package com.example.spring_jdbc.enity;



public class Customer {
    private Long phoneNumber;
    private String name;
    private Integer age;
    private String gender;
    private String address;
    private Integer planId;

    public Customer(Long phoneNumber, String name, Integer age, String gender, String address, Integer planId) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.planId = planId;
    }

    public Customer() {
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    @Override
    public String toString() {
        return "CustomerDto{" +
                "phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", planId=" + planId +
                '}';
    }

}
