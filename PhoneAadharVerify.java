package Voter;

import java.util.Scanner;

public class PhoneAadharVerify {
    Scanner sc= new Scanner(System.in);
    long checkAadhar(){
        int count=0;
        long temp,addhar;
        System.out.println("enter 12 digit addhar no");
        temp=addhar=sc.nextLong();
        while(temp!=0){
            temp/=10;
            count++;
        }
        if(count==12){
            return addhar;
        }
        else {
            System.out.println("Aadhar no is not 12 digit please");
            checkAadhar();
        }
        return addhar;
    }

    long checkPhone() {
        int count = 0;
        long temp, phone;
        System.out.println("enter 10 digit phone no");
        temp = phone = sc.nextLong();
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        if (count == 10) {
            return phone;
        } else {
            System.out.println("Phone no is not 10 digit please");
            checkPhone();
        }
        return phone;
    }
}
