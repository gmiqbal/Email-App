package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName, lastName, email, password, department, companySuffix="GMcorp.com";
    private int mailBoxCapacity=500, defaultPasswordLength=10;
    private String alternateEmail;

    //constructor to receive the first & last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: "+ this.firstName + " " + this.lastName);

        //call a method asking for the department - return the department
        this.department = setDepartment();
        //System.out.println("Deparment: "+ this.department);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);

        //combine elements to generate email
        email = firstName.replaceAll("\\s+","").toLowerCase() + "." + lastName.replaceAll("\\s+","").toLowerCase() + "@" + department +"." + companySuffix;
    }

    //Ask for the departments
    private String setDepartment(){
        System.out.println("Welcome, " + firstName + "!");
        System.out.println("Department codes:\n 1 for Supply Chain\n 2 for Finance\n 3 for Customer Service\n " +
                "0 for none\n Enter Department Code:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1){
            return "scm";
        } else if (depChoice == 2) {
            return "fin";
        } else if (depChoice == 3) {
            return  "cs";
        }
        else {
            return "";
        }
    }
    //Generate a random password
    //??
    private String randomPassword (int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%_";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    //Set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    //Set the alternate Email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //Change the password
    public void changePassword(String password){
        this.password = password;
    }


    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nPassword: " + password +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
