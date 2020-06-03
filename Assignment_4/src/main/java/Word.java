//This class creates String Arrays and utilizes Random API to get words from the array
//CSIS 312- B02 
import java.util.Random;//import Random API

public class Word 
{
    //String arrays variables.
        private String [] article;
        private String [] noun;
        private String [] verb;
        private String [] preposition;
        private Random random = new Random();//instantiate random class
        private int randmInt;//variable to hold random number
        
        public Word ()
        {
            //constructor to hold string arrays in variables
            article = new String[] {"the", "a","one", "some", "any"};
            noun = new String [] {"boy", "girl", "dog", "town", "car"};
            verb = new String [] {"drove", "jumped","ran", "walked", "skipped"};
            preposition = new String [] {"to", "from", "over", "under", "on"};
            
        }
        
        public String getArticle()//get method
        {
             randmInt = random.nextInt(article.length);//store random number to get number between max length of array
             return article[randmInt];//return word from array
        }
        
        public String getNoun()//get method
        {
            randmInt = random.nextInt(noun.length);//store random number to get number between max length of array
            return noun[randmInt];//return word from array
        }
        
        public String getVerb ()//get method
        {
            randmInt = random.nextInt(verb.length);//store random number to get number between max length of array
            return verb[randmInt];//return word from array
        }
        
        public String getPreposition()//get method
        {
            randmInt = random.nextInt(preposition.length);//store random number to get number between max length of array
            return preposition[randmInt];//return word from array
        }
}
