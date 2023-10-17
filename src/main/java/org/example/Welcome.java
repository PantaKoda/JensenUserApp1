package org.example;

public class Welcome {

    private static final String[] lines = {
            "Project for Jensen first course in Java",
            "Creator : Themis Mouliakos",
            "17/10/2023",
            "Creating a User app with basic CRUD actions and a database connection"
    };

    public static void printTextInBox() {
        int longestLineLength = 0;

        // Find the longest line
        for (String line : lines) {
            if (line.length() > longestLineLength) {
                longestLineLength = line.length();
            }
        }

        // Create the top and bottom border
        String topAndBottomBorder = "/" + "*".repeat(longestLineLength + 4) + "/";

        // Print top border
        System.out.println(topAndBottomBorder);

        // Print each line of text
        for (String line : lines) {
            System.out.printf("* %-"+ longestLineLength +"s \n", line);
        }

        // Print bottom border
        System.out.println(topAndBottomBorder);
    }
}
