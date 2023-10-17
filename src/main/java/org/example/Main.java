package org.example;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        var scan1 = new Scanner(System.in);

        Welcome.printTextInBox();
        System.out.println("Who will use the app ? Enter your user name : ");

        String username = scan1.nextLine();
        //Directory to store the user's database
        appDirectories.createDirectoryIfNotExists(username);


    }
}