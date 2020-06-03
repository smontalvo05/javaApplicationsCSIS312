//This file is a generic class that sets and gets any generic collection.
//CSIS 312- B02 
public class Pair <F,S> //Set First and Second Generic Object
{
  private F f;//first object variable
  private S s;//second object variable
    
    public Pair(F f, S s)//constructor taking in the argument for first and second objects
            {
               setF(f);//call set method to set object f
               setS(s);//call set method to set object s
            }
    public F getF()//get method to call first object
    {
        return f;
    }
    public S getS()//get method to call second object
    {
        return s;
    }
    public void setF(F f)//set method to set first object
    {
        this.f = f;
    }
    
    public void setS(S s)//set method to call second object
    {
        this.s = s;
    }
}
