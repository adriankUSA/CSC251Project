import java.util.*; 
import java.io.*; 

public class Project_Adrian_Khlim
{
   public static void main(String[] args)
   {  
     
      try
      {
                 
         //create an instance of the File class creating an object that represents the file PolicyInformation.txt
         File file = new File("PolicyInformation.txt");
           
         Scanner inputFile = new Scanner(file);
         
         //declare variables
         int policyNumber, age; 
         double heightInches, weightPounds;
         String providerName, firstName, lastName, smokingStatus;
         boolean isSmoker;   
         
         //create array list to store the Policy object
         ArrayList<Policy> policy = new ArrayList<Policy>();
         
         while(inputFile.hasNext())
         {
            policyNumber = inputFile.nextInt();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine(); 
            age = inputFile.nextInt();
            isSmoker = inputFile.nextBoolean();
            heightInches = inputFile.nextDouble();
            weightPounds = inputFile.nextDouble();
            
            if(inputFile.hasNext())
            { 
               inputFile.nextLine();
               inputFile.nextLine();
            }
            
            //create a policy object titled policyInfo
            Policy policyInfo = new Policy(policyNumber, providerName, firstName, lastName, age, isSmoker, heightInches, weightPounds);
            
            policy.add(policyInfo);
         }
         
         inputFile.close();
         
         for(int i = 0; i < policy.size(); i++)
         {
            //display policy information
            System.out.println(" ");
            System.out.println("Policy Number: " + policy.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policy.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policy.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policy.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: ");
            System.out.printf("Policyholder's Height: %.1f inches" + policy.get(i).getHeight()); //single decimal
            System.out.println(" ");
            System.out.printf("Policyholder's Weight: %.1f pounds" + policy.get(i).getWeight());
            System.out.println(" ");
            System.out.printf("Policyholder's BMI: %.2f", policy.get(i).calculateBMI()); //called from the policyInfo object
            System.out.println(" ");
            System.out.printf("Policy Price: $%.2f", policy.get(i).calculatePolicyPrice()); //called from the policyInfo object
            System.out.println(" ");
         }
      } //try block
      
      catch(IOException ex)      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }

   }
   

}