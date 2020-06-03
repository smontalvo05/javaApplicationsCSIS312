//This file test the Pair Generic Class
//CSIS 312- B02 
public class PairTest 
{


    public static void main(String args[]) 
    {
        int number = 5;//Int variable
        String name = "Steve";//String Variable
        Pair <Integer, String> p1 = new Pair(number,name);//instantiate first object
        
        System.out.printf("Pair one object one is %s and Pair one object 2 is %s%n",p1.getF(),p1.getS());//print results to user
        
        Pair <String,Integer> p2 = new Pair (name, number);//instantiate Second object
        System.out.printf("New Pair Object one is %s and Object 2 is %s%n",p2.getF(),p2.getS());//print results to user
        
        Pair <Character, String> p3 = new Pair ('B',"Hello Everyone");//instantiate third object
        System.out.printf("New Pair number three the first Object is %s and Object 2 is %s%n",p3.getF(),p3.getS());//print results to user
    }
    
    
}
