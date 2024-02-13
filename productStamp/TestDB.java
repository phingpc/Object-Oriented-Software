
/**
 * Write a description of class System here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestDB
{
    // instance variables - replace the example below with your own
 static DB newDB;
 
   private static int Stamp(product p){
      //    System.out.println(p.getClass());
        if( p instanceof productStamp) {
            productStamp s = (productStamp)p;          
               System.out.println(s.getClass());
                return s.getStamp(); }
        else if( p instanceof product) {
            System.out.println(p.getClass() );
            return 0;
            }
       
        return 0;
    }
    static void initDB(){
          // ?????????????????????????????????????? ????????????????? default ??????
            product s = new product();    
            s.setId("12");
            s.setPrice(40);
           // s.setStamp(0);
            newDB.addproduct(s);
            product s1 = new product();
            s1.setId("14");
            s1.setPrice(100);
           // s1.setStamp(5);
            newDB.addproduct(s1);
            newDB.addproduct(new productStamp("11",300,"jj",3));
            newDB.addproduct(new productStamp("111",30,"kk",4));
            newDB.addproduct(new product("555",50,"ww"));
            newDB.addproduct(new product("999",12,"ee"));
            
    }
    public static void main()
    {
        newDB = new DB();  
        initDB();
        product p = new product();
        System.out.println("Data in DB on Start ");
        newDB.printAll();
        p = newDB.search("12");
        p.setPrice(400);
        System.out.println("Data in DB after chage  edit 12 correct DB");
        newDB.printAll();
        newDB.editproduct("12",700);
        System.out.println(p.getId() + " " + p.getPrice() + "Stamp "  +Stamp(p));
        System.out.println("Data in DB after chage delete 12 ");
        //newDB.printAll();
        p = newDB.search("12");
        newDB.deleteproduct("12");
       // ?????????? 11
       product c = newDB.search("555");
       System.out.println( c.getPrice() );
       System.out.println( c.getName() + " " + c.getPrice() + " stamp "  +         Stamp(c)  );
       c = newDB.search("11");
       System.out.println( c.getName() + " " + c.getPrice() + " stamp "  +         Stamp(c)  );  
        
      
    }

}
