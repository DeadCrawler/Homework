package com.company.controller;

import com.company.Main;
import com.company.executors.Executable;
import com.company.executors.Factory;
import com.company.maper.IModelToStringConverter;
import com.company.model.Person;
import com.company.utils.FileHelper;
import com.company.utils.ScannerFileName;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Scanner;


public class UserDialog {

    private Scanner scanner;
    private Scanner scanner1;

    public ScannerFileName scannerFileName = new ScannerFileName();
    Person person = new Person();
    FileHelper fileHelper;
    IModelToStringConverter converter;

    public UserDialog() {
        this.fileHelper = new FileHelper();
        this.converter = converter;
        scanner = new Scanner(System.in);
        scanner1 = new Scanner(System.in);
    }

    public void startApp() throws IOException, ClassNotFoundException, NullPointerException {

        while (true) {
            System.out.println("Commands to use:");
            System.out.printf("%-30.30s  %-30.30s%n", "1. Create", "5. Exit");
            System.out.printf("%-30.30s  %-30.30s%n", "2. Update", "6. Help");
            System.out.printf("%-30.30s  %-30.30s%n", "3. Read", "7. Switch");
            System.out.printf("%-30.30s  %-30.30s%n", "4. Delete", "8. Start");

            System.out.println("Enter the command number you want to use:");
            int commandMainMenu = scanner.nextInt();

            while (commandMainMenu < 1 || commandMainMenu > 8) {
                System.out.println(" Sorry! Incorrect choice. Enter again:");
                commandMainMenu = scanner.nextInt();
            }

            switch (commandMainMenu) {
                case 1:
                    scannerFileName.scannerFileNameAndCreateFile();
                    getExecutable().write(fileHelper.createPerson());
                    getExecutable().read();
                    break;
                case 2:
                    scannerFileName.scannerFileNameAndCreateFile();
                    getExecutable().read();
                    System.out.println("Enter your id : ");
                    int id = scanner.nextInt();
                    getExecutable().update(getExecutable().read(), id);
                    break;
                case 3:
                    scannerFileName.scannerFileNameAndCreateFile();
                    getExecutable().read();
                    break;
                case 4:
                    scannerFileName.scannerFileNameAndCreateFile();
                    List<Person> personToDelete = getExecutable().read();
                    getExecutable().delete(personToDelete);
                    break;
                case 5:
                    exit();
                    break;
                case 6:
                    help();
                    break;
                case 7:
                    startApp();
                    break;
                case 8:
                    start();
                    break;
                default:

            }

        }
    }


    public void start() {
        System.out.println("Yours data saved.");
    }

    private void exit() throws IOException {
        while (true) {
            System.out.println("Are you sure that you want to quit the app?");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String answer = reader.readLine();
            if (answer.toLowerCase().equals("yes")) System.exit(0);
            else if (!answer.toLowerCase().equals("no")) System.out.println("Please answer \"yes\" or \"no\"");
            else break;
        }
    }

    private void help() throws NullPointerException {
        System.out.println(" *** Help *** ");
        System.out.print(" 1. CREATE Command  is used to record a new file. If the file does not exist, the program will create it. \n" +
                " To write to a file you need to type: id, first name, last name, age, city. \n" +
                " 2. READ Command  is used to read information from a file. \n" +
                " 3. UPDATE Command changes one of the Person parameters (first name, last name, age, city) by id. \n " +
                " For this you need to enter: id, which parameter you want to replace (for example, first name) and the text to which you want to change (for example, Peter). \n" +
                " 4. DELETE Command deletes the data of one Person by id. \n" +
                " 5. After the EXIT Command, the application is exited.\n" +
                " 6. After the HELP Command, the available commands and their format are displayed.\n" +
                " 7. After the SWITCH Command, you return to the main menu. \n" +
                " 8. After the START Command, the changed data is saved.");
    }

    private Executable getExecutable() {
        Factory factory = new Factory();
        Executable executable = (Executable) factory.getInstanceByFormat(scannerFileName.getFileExtension(ScannerFileName.fileName));
        return executable;
    }
}

