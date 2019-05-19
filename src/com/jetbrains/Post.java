package com.jetbrains;

public class Post {
    //Static variable that stores how many posts have been created
    //so the id of each post is unique
    private static int postCounter = 0;

    private User user;
    private int id;
    private String content;
    private String url;

    // Blank Constructor
    public Post() { }

    //Constructor to create new Post object with just user and content
    public Post(User user, String content) {
        //Updates static post counter variable by 1
        postCounter++;
        //Sets post id to current post counter value
        this.id = postCounter;
        this.user = user;
        this.content = content;
    }

    //Constructor to create new Post object with user, content, and url
    public Post(User user, String content, String url) {
        //Updates static post counter variable by 1
        postCounter++;
        //Sets post id to current post counter value
        this.id = postCounter;
        //Fills fields with data added with the constructor
        this.user = user;
        this.content = content;
        this.url = url;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
       return url ;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    //Getter to return the post id
    public int getId() {
        return this.id;
    }

    //Method to override the built-in toString method
    //and display a post in a format of our choosing
    @Override
    public String toString() {
        return  "Post number: " + this.id + "\n" +
                this.content + "\n" +
                "Written by: " + this.user + "\n" +
                //The expression below checks if the url
                //field is null. If not, it displays the url.
                //If it is, it just displays an empty string
                "URL: " + (this.url != null ? this.url : "");

    }


}
