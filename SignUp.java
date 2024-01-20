package Voter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SignUp extends VoterDetails{
    BufferedReader br;
    VoterDetails voter= new VoterDetails();
    long aadhar,pno;
    void personalDetails(){
        if(created){
            System.out.println("Already account is created");
            return;
        }
        br=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("\n---> Fill Personal details <---");
            System.out.print("Enter first name: ");
            voter.fname=br.readLine();
            System.out.print("Enter middle name: ");
            voter.mname=br.readLine();
            System.out.print("Enter last name: ");
            voter.lname=br.readLine();
            System.out.print("Enter address: ");
            voter.address=br.readLine();
            System.out.print("Enter age: ");
            voter.age=Integer.parseInt(br.readLine());
            Age a=new Age();
            if(a.checkAge(voter.age)){}
            else {
                return;
            }
            contactDetails();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    void contactDetails(){
        System.out.println("\n---> Fill Contact  details <---");
        try {
            voter.phoneno=new PhoneAadharVerify().checkPhone();
            voter.aadhar=new PhoneAadharVerify().checkAadhar();
            createUserName();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    void createUserName(){
        try {
            System.out.println("Create user name");
            setUsername(br.readLine());
            System.out.println("Create password");
            setPassword(br.readLine());
            created=true;
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    void viewDetail(){
        String user,pass;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter username");
        user=sc.next();
        System.out.println("Enter password");
        pass=sc.next();
        boolean result=false;
        if(getUsername().equals( user) && getPassword() .equals(pass)){
                result=true;
                System.out.println("\nPersonal Detail\n---------------------");
                System.out.println("Name:-"+voter.fname+" "+voter.mname+" "+voter.lname);
                System.out.println("Address:-"+voter.address);
                System.out.println("Age:-"+voter.age+"\nContact Detail\n-----------------");
                System.out.println("Addhar No:-"+voter.aadhar+"\nPhone No:-"+voter.phoneno);

        }
        if(!result){
            System.out.println("Record not found");
        }
    }
}

