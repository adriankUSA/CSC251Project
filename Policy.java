

public class Policy
{

   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private boolean isSmoker;
   private double heightInches;
   private double weightPounds;

   //no-arg constructor to set default values for all fields
   public Policy()
   {
      policyNumber = 0;
      providerName = " ";
      firstName = " ";
      lastName = " ";
      age = 0;
      isSmoker = false;
      heightInches = 0;
      weightPounds = 0;
   }
   
   /** This is a constructor that accepts all arguments
   @param policyNumber This is the policy number passed into the method
   @param providerName This is the policy provider name passed into the method
   @param firstName This is the policy holder's first name passed into the method
   @param lastName This is the policy holder's last name passed into the method
   @param age This is the policy holder's age passed into the method
   @param isSmoker This is the smoking status of the policy holder passed into the method
   @param heightInches This is the policy holder's height in inches passed into the method
   @param weightPounds This is the policy holder's weight in pounds passed into the method
   */
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, boolean isSmoker, double heightInches, double weightPounds)
   {
      this.policyNumber = policyNumber; //using the same variable name inside main, so I use "this." keyword to define the variable inside the object
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.isSmoker = isSmoker;
      this.heightInches = heightInches;
      this.weightPounds = weightPounds;
   }
   
   /**
      The calculateBMI uses weight, height, and a constant to determine a holder's body mass index
      @return BMI (body mass index)
   */
   public double calculateBMI()
   {
      final int BMI_CONSTANT = 703;
      double BMI = (weightPounds * BMI_CONSTANT)/(heightInches * heightInches);
      return BMI;
   }
   /**
      The calculatePolicyPrice uses a formula, weight, and height and calculateBMI() to determine total policy price
   */
   public double calculatePolicyPrice()
   {
      final int BASE_FEE = 600; //used constants for all flat numbers to allow flexibility/change
      final int SENIOR = 50;
      final int SENIOR_FEE = 75;
      final int SMOKER_FEE = 100;
      final int BMI_LIMIT = 35;
      final int BMI_FEE_CONSTANT = 20;
      double BMI = calculateBMI();
      double price = BASE_FEE;
      
      if(age > SENIOR)
      {
         price += SENIOR_FEE;
      }
      
      if(isSmoker)
      {
         price += SMOKER_FEE;
      }
      
      if(BMI > BMI_LIMIT)
      {
         price += (BMI-BMI_LIMIT)*BMI_FEE_CONSTANT;
      }
      return price;
   }
   
   // sets policy number
   // @param policyNumber The policy number the user inputs
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   // sets policy provider name
   // @param providerName The policy provider name
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   // sets first name
   // @param firstName The policy holder's first name
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   // sets last name
   // @param lastName The policy holder's last name
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   // sets age
   // @param age The policy holder's age
   public void setAge(int age)
   {
      this.age = age;
   }
   
   // sets smoking status
   // @param isSmoker Sets smoking status to true or fals
   public void setIsSmoker(boolean isSmoker)
   {
      this.isSmoker = isSmoker;
   }
   
   // sets height
   // @param heightInches The policy holder's height in inches
   public void setHeight(double heightInches)
   {
      this.heightInches = heightInches;
   }
   
   // sets weight
   // @param weightPounds The policy holder's weight in pounds
   public void setWeight(double weightPounds)
   {
      this.weightPounds = weightPounds;
   }
   
   // gets policyNumber
   // @return policyNumber
   public int getPolicyNumber()
   {  
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public boolean getIsSmoker()
   {
      return isSmoker;
   }
   
   public double getHeight()
   {
      return heightInches;
   }
   
   public double getWeight()
   {
      return weightPounds;
   }
}
