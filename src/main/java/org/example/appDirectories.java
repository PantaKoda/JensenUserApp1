package org.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public final class appDirectories {

    public  static void createDirectoryIfNotExists(String userName) {
        // Get the current working directory
        String currentDir = System.getProperty("user.dir");

        // Create a Path object for the new directory
        Path newDirPath = Paths.get(currentDir, "Users", userName, "Data");

        try {
            // Check if directory exists, if not create it
            if (!Files.exists(newDirPath)) {
                Files.createDirectories(newDirPath);
                System.out.println("Directory created at: " + newDirPath.toString());
                createDB(newDirPath);
            } else {
                System.out.println("Directory already exists at: " + newDirPath.toString());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the directory: " + e.getMessage());
        }
    }

    private static void createDB(Path dirPath){

        // Create a Path object for the new .db file
        Path dbFilePath = Paths.get(dirPath.toString(), "DATABASE.db");

        try {
            Files.createFile(dbFilePath);
            System.out.println("DB file created at: " + dbFilePath.toString());
        }
        catch (IOException e) {
            System.out.println("An error occurred while creating the DB file: " + e.getMessage());
        }

    }

}
