package com.jetbrains;
import java.util.Scanner;

public class PostGenerator {

    private Scanner keyboard;

    public PostGenerator() {
        this.keyboard = new Scanner(System.in);
    

    public Post generatePost (){
        Post post = new Post();
        System.out.println("What's your username?");
        post.setUser(keyboard.nextLine());
        System.out.println("What would you like to say?");
        post.setContent(keyboard.nextLine());
        System.out.println("Type your URL here.");
        post.setUrl(keyboard.nextLine());
        post.getID();
        return post;

    }
}
