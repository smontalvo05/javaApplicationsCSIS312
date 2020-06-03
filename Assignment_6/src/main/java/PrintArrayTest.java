//This file adds rndm numbers to an array and then use recursive method calls to print the results to the user
//CSIS 312- B02 
import java.util.Random;

public class PrintArrayTest {

    
    
    public static void main(String args[]) 
    {
        System.out.println("Steve Montalvo-Assignment 6");//my name and assignment number
        int [] intArray = new int[100];//initiate new array object with 100 elements
        Random rndm = new Random();//initiate random API
        
        for (int i = 0;  i < intArray.length; i++)//for loop to add random number to intArray
        {
            intArray[i]= rndm.nextInt(100);
           
        }
      
        printArray(intArray,0);//call recursive method
    }
    
    public static int printArray(int[] array,int i)//recursive method to print elements within the array
    {
 
        if(array.length>i)//if statement to go through array elements and print
        {

            System.out.println(array[i]);
            
           return printArray(array,i+1);
           
        }
      else//termination clause
        {
          return 0;
          
        }
       
    }
}
