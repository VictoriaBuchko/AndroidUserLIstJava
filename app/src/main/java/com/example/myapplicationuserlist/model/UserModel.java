package com.example.myapplicationuserlist.model;

public class UserModel {
    private int avatarResource;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String city;

    public UserModel(int avatarResource, String firstName, String lastName,
                     int age, String country, String city) {
        this.avatarResource = avatarResource;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.city = city;
    }

    public int getAvatarResource() { return avatarResource; }
    public void setAvatarResource(int avatarResource) { this.avatarResource = avatarResource; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "UserModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}