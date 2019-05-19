package com.jetbrains;
import java.util.Scanner;
import java.util.ArrayList;

public class PostMenu {

    private ArrayList<Post> postLog;
    private ArrayList<User> userLog;

    private User currentUser;
    private Scanner keyboard;

    public PostMenu() {
        this.postLog = new ArrayList();
        this.userLog = new ArrayList();
        this.keyboard = new Scanner(System.in);
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

        System.out.println("Thanks for visiting our blog!");
    }

    private void welcome() {System.out.println("Main Menu");}
    private void processSelection(int selection) {
        switch (selection) {
            case 1:
                UserGenerator userGenerator = new UserGenerator();
                User user = userGenerator.createUser();
                this.userLog.add(user);
                break;
            case 2:
                if (userLog.size() == 0) {
                    System.out.println("You must create a user before posting.");
                break; }
                System.out.println("What's your username?");
                viewUsers();
                int userNumber = keyboard.nextInt();
                keyboard.nextLine();
                User selectedUser = userLog.get(userNumber);
                PostGenerator postGenerator = new PostGenerator();
                Post post = postGenerator.generatePost(selectedUser);
                this.postLog.add(post);
                break;

            case 3:
                viewPosts();
                break;
            case 4:
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


    public void viewUsers(){
        for (int i = 0; i < userLog.size(); i++) {
            System.out.println("------");
            System.out.println(i + " " + userLog.get(i).toString());
        }
        System.out.println("-----");
        System.out.println(" ");



        }
    }

