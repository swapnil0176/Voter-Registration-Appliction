package Voter;

import java.util.Scanner;

public class Eligibility {
    void checkEligibility(){
        String fname,mname,lname;
        Age a= new Age();
        int age;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first name");
        fname=sc.next();
        System.out.println("Enter your middle name");
        mname=sc.next();
        System.out.println("Enter your last name");
        lname=sc.next();
        System.out.println("Enter your first name");
        age=sc.nextInt();
        if(a.checkAge(age)){
            System.out.println("Eligible for voting");
        }
    }
}
