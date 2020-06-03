//This file is generate random numbers and it to List with LinkedList class
//CSIS 312- B02 
import java.util.Random;//import Random class
import java.util.LinkedList;//import LinkedList collection
import java.util.List;//import list collection
import java.util.Collections;//import collections

public class Numbers 
{
   private List <Integer> listNumber = new LinkedList();//instantiate class LinkedList
   Random rndm = new Random();//instantiate class random
   
   public Numbers()//constructor
   {
       addNumbersList();
   }
   
   public  void display ()//display whats in listNumber 
    {
        for (int number: listNumber)
        {
            System.out.printf("%d%n",number);
        }
    }
    
    public void addNumbersList()//method to add numbers together in listNumber
    {
        
         for (int i =0; i<25; i++)
        {
            listNumber.add(rndm.nextInt(100));
        }
    }
    public void sortLinkedList ()//method to sort listNumber
    {
        for (int number:listNumber)
        {
            Collections.sort(listNumber);
        }
    }
    
    public  int addNumbersTogether()//method to addNumbers together in listnumber
    {
        int i=0;
        for (int number:listNumber)
        {
            i = number +i;
        }
        return i;
    }
    
    public float averageNumbersTogether()//method to average numbers together in listNumber
    {
        float i = 0;
        
        for (int number:listNumber)
        {
           i = addNumbersTogether()/listNumber.size();
        }
        return i;
        
    }
    
    public List getRndmNumberArray()//method to call listNumber
    {
        return listNumber;
    }
   
}
