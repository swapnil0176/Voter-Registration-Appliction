package Voter;

public class Age {
     boolean checkAge(int age){
          if(age>=18){
               return true;
          }
          else {
               try{
                    throw new NotEligibleForVoting("Your age is less than 18");
               }
               catch (Exception e){
                    e.printStackTrace();
               }
          }
          return false;
     }
}
