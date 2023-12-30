
/**
 * Write a description of class csutomer_gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class customer_gold extends customer
{
    public customer_gold (String n,String sn,double prv)
    {
        super(n,sn,prv);
    }
    public void insurance()
    {
        System.out.println("Gold : "+getMoney()*3);
    }
}
