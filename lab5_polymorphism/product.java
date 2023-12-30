
public class product
{
    public String id;
    public int price = 0;
    public String name;
   public product (){}
   public product (String id , int price , String name)
   {
       this.id = id;
       this.price = price;
       this.name = name;
       
   }
   public void setId(String id)
   {
       this.id = id;
   }
   public void setPrice(int price)
   {
       this.price = price;
   }
}
