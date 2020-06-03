//This file is to test Numbers class and show results to user.
//CSIS 312- B02 
public class IntergerTest {
   
    public static void main(String args[]) 
    {
        System.out.println("Steve Montalvo - Assignment");//My name and assignment number
        
        Numbers numbers = new Numbers();//instantiate numbers class
                   
        System.out.println("Numbers in the List:");//Tell the user what numbers have been generated in the list.
       
        numbers.display();//display numbers method
        
        numbers.sortLinkedList();//sort method 
        
        System.out.println("This is the numbers after sorting the List:");//tell user the numbers have been sorted in order
       
        numbers.display();//display the numbers sorted in order
        
        System.out.printf("Total of all the numbers together is %d%n",numbers.addNumbersTogether());//tell the user the numbers have been added together and display
        
        System.out.printf("Average of all the numbers together in a float: %f", numbers.averageNumbersTogether());//tell the user that average number in float and display
    }
    
}
