//This file adds rndm numbers to an array and then use recursive method calls to print the results to the user
//CSIS 312- B02 
public class PairTest 
{


    public static void main(String args[]) 
    {
        int number = 5;
        String name = "Steve";
        Pair <Integer, String> p1 = new Pair(number,name);
        
        System.out.printf("Pair one object one is %s and Pair one object 2 is %s%n",p1.getF(),p1.getS());
        
        Pair <String,Integer> p2 = new Pair (name, number);
        System.out.printf("New Pair Object one is %s and Object 2 is %s%n",p2.getF(),p2.getS());
        
        Pair <Character, String> p3 = new Pair ('B',"Hello Everyone");
        System.out.printf("New Pair number three the first Object is %s and Object 2 is %s%n",p3.getF(),p3.getS());
    }
}
