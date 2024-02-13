
/**
 * Write a description of class product here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class product
{
  private String id ;
  private int    price;
  private String name;
 
  public product(){};
  public product(String x, int y, String name ){
        id = x;
        price = y;
        this.name = name;
    }
  public void setId(String x){id = x;}
  public void setPrice(int x){price = x;}
  public String getId(){return id;}
  public int getPrice(){return price;}
  public String getName(){return name;}

      
  
}
