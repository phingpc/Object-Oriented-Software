
/**
 * Write a description of class super_gold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class super_gold extends customer
{
    public super_gold (String n,String sn,double prv)
    {
        super(n,sn,prv);
    }
    public void super_g()
    {
        System.out.println("Super : "+getMoney()*2+" hospital/day : 1000");
    }
}
