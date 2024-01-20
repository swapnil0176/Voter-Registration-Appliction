package Voter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SignUp signup=new SignUp();
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("\n1)Register for voter card\n2)View details\n3)Check Eligibility\n4)" +
                    "Exit\nEnter choice");
            switch (sc.nextInt()){
                case 1-> signup.personalDetails();
                case 2->signup.viewDetail();
                case 3->new Eligibility().checkEligibility();
                case 4->System.exit(0);
            }
        }while (true);
    }
}