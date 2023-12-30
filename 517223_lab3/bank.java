
/**
 * Write a description of class bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bank
{
    public static void main () 
    {
        // Customer
        int count = 0;
        Customer cust1 = new Customer("jakkaphat","katchapong",500.00);
        count ++;
        Customer cust2 = new Customer("mudjarin","samartkul",2500.00);
        count ++;
        Customer cust3 = new Customer("tantima","katchapong",200.00);
        count ++;
        //year 1
        System.out.println("ปีที่ 1");
        cust1.computeinterest();
        cust1.plusMoney();
        cust2.computeinterest();
        cust2.plusMoney();
        cust3.computeinterest();
        cust3.plusMoney();
        System.out.println("year 1 "+cust1.name +" "+cust1.lastname+" อัตราดอกเบี้ย : "+cust1.per_income*10+"% เงินต้น : "
        +cust1.starter_money+" ยอดเงิน : "+cust1.sum);
        System.out.println("year 1 "+cust2.name +" "+cust2.lastname+" อัตราดอกเบี้ย : "+cust2.per_income*10+"% เงินต้น : "
        +cust2.starter_money+" ยอดเงิน : "+cust2.sum);
        System.out.println("year 1 "+cust3.name +" "+cust3.lastname+" อัตราดอกเบี้ย : "+cust3.per_income*10+"% เงินต้น : "
        +cust3.starter_money+" ยอดเงิน : "+cust3.sum);
        // years 2
        System.out.println("ปีที่ 2");
        cust1.computeinterest();
        cust1.plusMoney();
        cust2.computeinterest();
        cust2.plusMoney();
        cust3.computeinterest();
        cust3.plusMoney();
        System.out.println("year 2 "+cust1.name +" "+cust1.lastname+" อัตราดอกเบี้ย : "+cust1.per_income*10+"% เงินต้น : "
        +cust1.starter_money+" ยอดเงิน : "+cust1.sum);
        System.out.println("year 2 "+cust2.name +" "+cust2.lastname+" อัตราดอกเบี้ย : "+cust2.per_income*10+"% เงินต้น : "
        +cust2.starter_money+" ยอดเงิน : "+cust2.sum);
        System.out.println("year 2 "+cust3.name +" "+cust3.lastname+" อัตราดอกเบี้ย : "+cust3.per_income*10+"% เงินต้น : "
        +cust3.starter_money+" ยอดเงิน : "+cust3.sum);
        System.out.println("จำนวนลูกค้า : "+Customer.counter);
    }
}
