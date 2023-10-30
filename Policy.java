

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
      lastName = " "
      age = 0;
      isSmoker = false;
      heightInches = 0;
      weightPounds = 0;
   }
   
   /** This is a constructor that accepts all arguments
   @param 
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
   
   public double calculatePolicyPrice()
   {
      final int BASE_FEE = 600;
      final int SENIOR = 50;
      final int SENIOR_FEE = 75;
      final int SMOKER_FEE = 100;
      final int BMI_LIMIT = 35;
      final int BMI_FEE_CONSTANT = 20;
      double BMI = calculateBMI();
      price = BASE_FEE;
      
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
   }
   
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   
   public void setIsSmoker(boolean isSmoker)
   {
      this.isSmoker = isSmoker;
   }
   
   public void setHeight(double heightInches)
   {
      this.heightInches = heightInches;
   }
   
   public void setWeight(double weightPounds)
   {
      this.weightPounds = weightPounds;
   }
   
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
