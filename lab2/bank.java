
/**
 * Write a description of class bank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bank
{
    private static double interestRate = 0.1;

   public static void main()
   {   
       // test
       customer c1 = new customer("อครเดช","อภินิหารเกรียงไกร ณ วังกระแสน้ำวน",50.0);
       c1.setInterestRat(interestRate);
       c1.coputeInterest();
       c1.plusMoney();
       System.out.println("year : 1 //"+c1.getName()+" "+c1.getSurname()+" "+" "+" เงินต้น "+c1.getPrvMoney()+" เงินต้นรวมดอกเบี้ย "+c1.getMoney());
       System.out.println("normal : "+c1.getMoney());
       
       customer_gold go = new customer_gold("จักรพัชร","นามสกุล",200);
       customer c_test = go;
       c_test.setInterestRat(interestRate);
       c_test.coputeInterest();
       c_test.plusMoney();
       System.out.println("year : 1 //"+go.getName()+" "+go.getSurname()+" "+" "+" เงินต้น "+go.getPrvMoney()+" เงินต้นรวมดอกเบี้ย "+go.getMoney());
       go.insurance();
       
       
       
        
        super_gold su = new super_gold("ตันติมา","นามสกุล",700);
        customer c_test2 = su;
        c_test2.setInterestRat(interestRate);
        c_test2.coputeInterest();
        c_test2.plusMoney();
        System.out.println("year : 1 //"+su.getName()+" "+su.getSurname()+" "+" "+" เงินต้น "+su.getPrvMoney()+" เงินต้นรวมดอกเบี้ย "+su.getMoney());
        su.super_g();
        DB db = new DB();
        db.add(go);
        db.add(su);
        db.add(c1);
        
        manager m = new manager(go);
        //m.c.insurance();
   }
   

}
