
/**
 * Write a description of class initDB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class initDB
{
    public static void initDB()
    {
        product s = new product(); 
        s.setId("12");
        s.setPrice(40);
        // s.setStamp(0);
        DB newDB = new DB();
        //newDB.addproduct(s) ;
        product s1 = new product();
        s1.setId("14");
        s1.setPrice(100);
        // s1.setStamp(5);
        newDB.addproduct(s1);
        newDB.addproduct(new productstamp("11",300,"jj",3));
        newDB.addproduct(new productstamp("111",30,"kk",4));
        newDB.addproduct(new product("555",50,"ww"));
        newDB.addproduct(new product("999",12,"ee"));
        System.out.println("ราคารวม : "+newDB.pay());
    }
}
