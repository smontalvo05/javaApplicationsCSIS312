//This is the test class to test Sentence.
//CSIS 312- B02 
public class SentenceTest 
{

    
    public static void main(String args[]) 
    {
        System.out.println("Steve Montalvo - Assignment 4");//my name and assignment number
        
//for loop to loop in creating new sentence 20 times.
        for(int j = 1; j<=20;j++)
        {
            Sentence sentence = new Sentence ();//create sentence object
            System.out.println(sentence.getSentence());//print out results
        }
        
        
    }
}
