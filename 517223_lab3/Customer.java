
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    public String name;
    public String lastname;
    public String currency;
    public double income;
    public double sum = 0;
    public double starter_money;
    public double per_income = 0.35;
    public static int counter = 0;
    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        
    }
    public Customer(String name , String lastname)
    {
        this.name = name;
        this.lastname = lastname;
    }
    public Customer (String name, String lastname,double money)
    {
        this.name = name;
        this.lastname = lastname;
        this.starter_money = money;
        this.sum += money;
        counter++;
    }
    void plusMoney()
    {
        this.sum +=this.income;
    }
    void computeinterest()
    {
        this.income = this.sum * per_income;
    }

}
