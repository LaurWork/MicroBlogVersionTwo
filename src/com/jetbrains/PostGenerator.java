package com.jetbrains;
import java.util.Scanner;

public class PostGenerator {

    private Scanner keyboard;

    public PostGenerator() {
        this.keyboard = new Scanner(System.in);
    }

    public Post generatePost() {
        User user = createUser();
        String validate;
        Post newPost;
        do {
            newPost = createPost(user);
            System.out.println("\n" + newPost.toString() + "\n");
            System.out.println("Would you like to make a new post now? (Enter \"y\" for yes)");
            validate = keyboard.nextLine();
        } while (!validate.toLowerCase().equals("y"));
        return newPost;
    }

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


    public Post createPost (User user){
        Post post = new Post();
        System.out.println("What would you like to say?");
        post.setContent(keyboard.nextLine());
        System.out.println("Type your URL here.");
        post.setUrl(keyboard.nextLine());
        return post;

    }
}
//        post.getUser();
//                post.getId();