package com.jetbrains;
import java.util.Scanner;
import java.util.ArrayList;

public class PostMenu {


    private ArrayList<Post> postLog;
    private ArrayList<User> userLog;

    public PostMenu() {
        this.postLog = new ArrayList();
        this.userLog = new ArrayList();
    }


    public void runMenu() {
        welcome();

        int selection;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("1. Create a New User");
            System.out.println("2. Create a Post");
            System.out.println("3. Print all posts");
            System.out.println("4. Print all users");
            System.out.println("0. Quit");
            selection = keyboard.nextInt();
            keyboard.skip("\n");
            if (selection != 0) {
                processSelection(selection);
            }
        } while(selection != 0);

        System.out.println("See ya later!");
    }

    private void welcome() {System.out.println("Main Menu");}
    private void processSelection(int selection) {
        switch (selection) {
            case 1:
                selection = 1;
                UserGenerator userGenerator = new UserGenerator();
                User user = userGenerator.createUser();
                userLog.add(user);
                break;
            case 2:
                selection = 2;
                PostGenerator postGenerator = new PostGenerator();
                Post post = postGenerator.generatePost();
                postLog.add(post);
                break;
            case 3:
                selection = 3;
                viewPosts();
                break;
            case 4:
                selection = 4;
                viewUsers();
                break;
        }
    }

    private void viewPosts(){
        for (Post post : postLog){
            System.out.println("-----------------");
            System.out.println(post.toString());
        }
    }

    private void viewUsers(){
        for (User users: userLog){
            System.out.println("----------------");
            System.out.println(users.toString());
        }
    }



}
