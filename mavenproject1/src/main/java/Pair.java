//This file adds rndm numbers to an array and then use recursive method calls to print the results to the user
//CSIS 312- B02 
public class Pair <F,S> 
{
  private F f;
  private S s;
    
    public Pair(F f, S s)
            {
               setF(f);
               setS(s);
            }
    public Object getF()
    {
        return f;
    }
    public Object getS()
    {
        return s;
    }
    public void setF(F f)
    {
        this.f = f;
    }
    
    public void setS(S s)
    {
        this.s = s;
    }
}
