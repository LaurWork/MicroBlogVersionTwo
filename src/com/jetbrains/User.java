package com.jetbrains;


public class User {
    private String avatarUrl;
    private String username;
    private String firstName;
    private String lastName;
    private String email;

    //Blank Constructor
    public User() { }

    //Constructor that requires all User fields at creation
    public User(String avatarUrl, String username, String firstName, String lastName, String email) {
        this.avatarUrl = avatarUrl;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //Getters and setter for each field:
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Method to override the built-in toString method
    //and display a post in a format of our choosing
    @Override
    public String toString() {
        return  "User name " + this.username + "\n" +
                "Email " + this.email +
                "Name " + this.firstName + this.lastName +
                "Avatar URL: " + (this.avatarUrl != null ? this.avatarUrl : "");

    }
}