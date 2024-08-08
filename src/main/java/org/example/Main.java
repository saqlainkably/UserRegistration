package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name");
        String fName=sc.next();
        String pattern = "^[A-Z][a-zA-Z]{2,}$";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(fName);
        if(matcher.matches())
            System.out.println("VALID FIRST NAME");
        else
            System.out.println("INVALID FIRST NAME");

        System.out.println("Enter last name");
        String lName=sc.next();
        Matcher matcher2 = compiledPattern.matcher(lName);
        if(matcher2.matches())
            System.out.println("VALID LAST NAME");
        else
            System.out.println("INVALID LAST NAME");

        System.out.println("Enter email-id ");
        String email=sc.next();
        String pattern2 = "^[a-zA-Z0-9.%+-]+\\.[a-zA-Z0-9.%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\.[a-zA-Z]{2,6})?$";
        Pattern compiledPattern2 = Pattern.compile(pattern2);
        Matcher matcher3 = compiledPattern2.matcher(email);
        if(matcher3.matches())
            System.out.println("VALID EMAIL");
        else
            System.out.println("INVALID EMAIL");

        System.out.println("Enter mobile number with country code, space followed by 10 digit number");
        sc.nextLine();
        String phoneNumber=sc.nextLine();
        String mobileRegex = "^\\d{2} \\d{10}$";
        Pattern CompiledMobile = Pattern.compile(mobileRegex);
        Matcher matcherPhone =CompiledMobile.matcher(phoneNumber);
        if(matcherPhone.matches())
            System.out.println("VALID");
        else
            System.out.println("INVALID");

        System.out.println("Enter password minimum 8 characters");
        String password=sc.nextLine();
        Pattern compiledPassword=Pattern.compile(password);
        Matcher matchPassword=compiledPassword.matcher(password);
        if(matchPassword.matches())
            System.out.println("VALID");
        else
            System.out.println("INVALID");

    }
}