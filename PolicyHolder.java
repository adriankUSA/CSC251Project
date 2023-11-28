public class PolicyHolder
{ //fields
   private String FirstName;
   private String LastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   public PolicyHolder()
   {
      FirstName = "";
      LastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   /**
   Constructor that accepts arguments for each field
   @param fName The Policyhodler's first name
   @param lName The Policyholder's last name
   @param a The Policyholder's age
   @param sStatus The Policyholder's smoking status
   @param h The Policyholder's height
   @param w The Policytholder's weight
   */
   public PolicyHolder(String fName, String lName,int a, String sStatus, double h, double w)
   {
      FirstName = fName;
      LastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   
   /**
   @return The Policyholder's first name
   */
   public String getFirstName()
   {
      return FirstName;
   }
   
   /**
   @return The Policyholder's last name
   */
   public String getLastName()
   {
      return LastName;
   }
   
   /**
   @return The Policyholder's age
   */
   public int getAge()
   {
      return age;
   }
   
   /**
   @return The Policyholder's smoking status
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
   @return The Policyholder's height
   */
   public double getHeight()
   {
      return height;
   }
   
   /**
   @return The Policyholder's weight
   */
   public double getWeight()
   {
      return weight;
   }
   //setters
   
   /**
   @param fName The Policy holder's first name
   */
   public void setFirstName(String fName)
   {
      FirstName = fName;
   }
   
   /**
   @param lName The Policy holder's last name
   */
   public void setLastName(String lName)
   {
      LastName = lName;
   }
   
   /**
   @param a The Policy holder's age
   */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
   @param sStatus The Policy holder's smoking status
   */
   public void setSmokingStatus(String sStatus)
   {
      smokingStatus = sStatus;
   }
   
   /**
   @param h The Policy holder's height
   */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
   @param w The Policy holder's weight
   */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
   Calculates the Policyholder's BMI
   @return The BMI of the Policyholder
   */
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }


}