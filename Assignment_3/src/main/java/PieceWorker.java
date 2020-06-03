//PieceWorker Extends from Employee
//CSIS 312- B02 
public class PieceWorker extends Employee
{
    //variables to hold pieces and wages
    private double pieces;
    private double wage;
    
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double pieces, double wage)//constructor
       {
           super (firstName, lastName, socialSecurityNumber);

           this.pieces = pieces;
           this.wage = wage;

       } 

    @Override
        public double earnings()//override abstract method from Employee
        {

            return wage*pieces;//earnings calculations
        }
        
    @Override
    public String toString()//Override toString method to print out polymorphically
    {
        return String.format("Piece Worker Employee: %s%n%s: $%,.2f", super.toString(), "Earnings", earnings());
    }
    
}
