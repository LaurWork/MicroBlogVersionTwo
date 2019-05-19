
package com.jetbrains;
import java.util.Scanner;

public class PostGenerator {

    public Scanner keyboard;

    public PostGenerator() {
        this.keyboard = new Scanner(System.in);
    }

       public Post generatePost(User user) {
            Post post = new Post();
            post.setUser(user);
            System.out.println("What would you like to say?");
            post.setContent(keyboard.nextLine());
            System.out.println("Type your URL here.");
            post.setUrl(keyboard.nextLine());
            post.getId();
            return post;

        }

    }
