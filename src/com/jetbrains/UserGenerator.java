package com.jetbrains;
import java.util.Scanner;

public class UserGenerator {

    private Scanner keyboard;

    public UserGenerator() {
        this.keyboard = new Scanner(System.in);
    }

//    public User generateUser() {
//        User user = createUser();
//        String validate;
//        User newUser;
//        do {
//            newUser = createUser();
//            System.out.println("\n" + newUser.toString() + "\n");
//            System.out.println("Would you like to make a new user now? (Enter \"y\" for yes)");
//            validate = keyboard.nextLine();
//        } while (!validate.toLowerCase().equals("y"));
//        return newUser;
//    }



    public User createUser(){
        User user = new User();
        System.out.println("What's your first name?");
        user.setFirstName(keyboard.nextLine());
        System.out.println("What's your last name?");
        user.setLastName(keyboard.nextLine());
        System.out.println("What's your email address?");
        user.setEmail(keyboard.nextLine());
        System.out.println("What would you like your username to be?");
        user.setUsername(keyboard.nextLine());
        System.out.println("What's the URL to your avatar picture?");
        user.setAvatarUrl(keyboard.nextLine());
        return user;
    }

}


