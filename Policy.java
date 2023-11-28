public class Policy
{  //fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyholder;
   
   public static int numPolicy = 0;
   
   /**
   Constructor that accepts arguments for each field
   @param pNumber The Policy number
   @param pName The Policy Provider's Name
   */
   public Policy(String pNumber, String pName, PolicyHolder policy)
   {
      policyNumber = pNumber;
      providerName = pName;
      policyholder = new PolicyHolder(policy);//we use the copy contructor of the PolicyHolder class to avoid security holes
      numPolicy++; //increment
   }
   
   //getters//
   /**
   @return The Policy Number
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   @return The Policy holder's Name
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   getTextBook method
   @return - return a reference to a copy of this course's TextBook object
   */

   
   public PolicyHolder getPolicyHolder()
   {
      return policyholder; 
   }
      
   //setters//
   
   /**
   @param pNumber The Policy Number
   */
   public void setPolicyNumber(String pNumber)
   {
      policyNumber = pNumber;
   }
   
   /**
   @param pName The Policy holder's name
   */
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   public void setPolicyHolder(PolicyHolder policy)
   {
      policyholder = new PolicyHolder(policy);
   }
         
   /**
   Calculates the Policy's price
   @return The price of the Policy
   */
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(policyholder.getAge() > AGE_THRESHOLD)
         price += ADDITIONAL_FEE_AGE;
         
      if(policyholder.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING;
      
      if(policyholder.getBMI() > BMI_THRESHOLD)
         price += ((policyholder.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI);
         
      return price;
   }
   
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
      "\nProvider Name: " + providerName +
      policyholder.toString() +
      "\nPolicy Price: $%.2f\n", getPrice());
   }

   //Not included in the instructions but can be added...
   /*Displays information about the Policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
   */
}