//The purpose of this file to put together a new superclass so that other types of employees can extend from this class
//CSIS 312- B02 

public class Employee 
{
    private final String firstName;                              
    private final String lastName;                               
    private final String socialSecurityNumber; 
    
    public Employee (String firstName,String lastName,String socialSecurityNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
     public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 
    
   
}
