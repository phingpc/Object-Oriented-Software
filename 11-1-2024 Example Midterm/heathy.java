

public class heathy extends personal
{
    public int money_heathy = 0;
    public heathy (String personal_id,String name,String country,int age,int money) 
    {
        super(personal_id,name,country,age,money);
        money_heathy = age*100;
    }
}
