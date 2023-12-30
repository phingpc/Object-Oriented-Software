import java.util.*;
public class DB
{
    public static ArrayList<customer> DBLis; 
    
    DB(){ DBLis = new ArrayList<customer>(); }
    
    public void add(customer c){
        DBLis.add(c);
    }
    public int search(String c ){
       // change for loop
       //System.out.println(c);
       for (int i=0 ; i< DBLis.size();i++){
           if (DBLis.get(i).getName().equals(c))
              {
                  System.out.println( getCustomerList(i).getSurname());
                  return i;
                }
        }
        
       return -1;
    }
    public customer getCustomerList(int i){return DBLis.get(i);  }
    public void delete(customer c){
        DBLis.remove(c);
    }
    public void showCust()
    {
        for (int i=0 ; i< DBLis.size();i++){
          System.out.println( DBLis.get(i).getSurname());
             
        }
    }
    
}
