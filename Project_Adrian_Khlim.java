import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_Adrian_Khlim
{
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      int numSmokers = 0;
      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      //create and open the file
      File file = new File("PolicyInformation.txt");
      Scanner inputFile = new Scanner(file);
      
      //process all information in the file
      while(inputFile.hasNext())
      {  
         policyNumber = inputFile.nextLine();
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         inputFile.nextLine();
         smokingStatus = inputFile.nextLine();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputFile.hasNext())
            inputFile.nextLine();
         if(inputFile.hasNext())
            inputFile.nextLine();
            
         //create a Policy object and add it to our ArrayList
         PolicyHolder policyholder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
         policyList.add(new Policy(policyNumber, providerName, policyholder));
      
      }
      
      //print out information about each Policy object
      for(Policy policy : policyList)
      { 
         //display information about the Policy
         System.out.print(policy.toString());
         
         if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
            numSmokers++;
      }

      //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) ); 
   }
}