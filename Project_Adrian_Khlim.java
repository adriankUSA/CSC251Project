import java.util.Scanner; //allow user input

public class Project_Adrian_Khlim
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int policyNumber, age; 
      double heightInches, weightPounds;
      String providerName, firstName, lastName, smokingStatus;
      boolean isSmoker; 
      
      //asks user for Policy information, allows user input
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Provider Name: ");
      providerName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's age: ");
      age = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
      smokingStatus = keyboard.nextLine();
      
      //while smokingStatus does not equal to smoker/non-smoker, input is invalid and must repeat.
      while(!(smokingStatus.equalsIgnoreCase("smoker"))&&!(smokingStatus.equalsIgnoreCase("non-smoker")))
      {
         System.out.println("Invalid error. Please type smoker or non-smoker.");
         System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
         smokingStatus = keyboard.nextLine();         
      }
      
      //when smokingStatus equals smoker is true, isSmoker is true.
      isSmoker = smokingStatus.equalsIgnoreCase("smoker");
      
      //continue with policy information and user input
      System.out.print("Please enter the Policyholder's Height (in inches): ");
      heightInches = keyboard.nextDouble();
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      weightPounds = keyboard.nextDouble();
      
      //create a policy object titled policyInfo
      Policy policyInfo = new Policy(policyNumber, providerName, firstName, lastName, age, isSmoker, heightInches, weightPounds);
     
     //display policy information
     System.out.println(" ");
     System.out.println("Policy Number: " + policyNumber);
     System.out.println("Provider Name: " + providerName);
     System.out.println("Policyholder's First Name: " + firstName);
     System.out.println("Policyholder's Last Name: " + lastName);
     System.out.println("Policyholder's Age: " + age);
     System.out.println("Policyholder's Smoking Status: " + smokingStatus);
     System.out.printf("Policyholder's Height: %.1f inches", heightInches);
     System.out.println(" ");
     System.out.printf("Policyholder's Weight: %.1f pounds", weightPounds);
     System.out.println(" ");
     System.out.printf("Policyholder's BMI: %.2f", policyInfo.calculateBMI()); //called from the policyInfo object
     System.out.println(" ");
     System.out.printf("Policy Price: $%.2f", policyInfo.calculatePolicyPrice()); //called from the policyInfo object
     System.out.println(" ");
   }
   

}