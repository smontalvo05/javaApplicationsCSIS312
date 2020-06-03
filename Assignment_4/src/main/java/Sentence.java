//This class contructs sentence using words from Word class
//CSIS 312- B02 
public class Sentence 
{
    //variables to hold words from Word class
    private Word sentence = new Word();//instantiate word class
    private String noun;
    private String verb;
    private String preposition;
    private String article;
    
    public Sentence ()//constructor to get words from word class
    {
        this.article = sentence.getArticle();
        this.noun = sentence.getNoun();
        this.preposition = sentence.getPreposition();
        this.verb = sentence.getVerb();
        
    }
   
 public String getSentence()//get method to construct sentence
 {
StringBuilder string = new StringBuilder();//instantiate Stringbuilder to construct sentence

    return   string.append(article.substring(0,1).toUpperCase() + article.substring(1))//uppercase first letter
            .append(" ")//space
            .append(noun)
            .append(" ")//space
            .append(verb)
            .append(" ")//space
            .append(preposition)
            .append(" ")//space
            .append(article)
            .append(" ")//space
            .append(noun)
            .append(".").toString();//period at end of sentence

 }
    
   
}
