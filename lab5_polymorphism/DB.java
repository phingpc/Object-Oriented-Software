
/**
 * Write a description of class DB here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class DB
{
    public static ArrayList<product> newDB; 
    
    public DB(){ newDB = new ArrayList<product>(); }
    
    public void addproduct(product c){
        newDB.add(c);
    }
    public int pay() {
        int totalPrice = 0;
        for (product product : newDB) {
            totalPrice += product.price;
        }
        return totalPrice;
    }
}
