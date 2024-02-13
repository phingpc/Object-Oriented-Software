import java.util.ArrayList;
/**
 * Write a description of class array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//http://docs.oracle.com/javase/6/docs/api/java/util/ArrayList.html
public class DB
{
  static  ArrayList<product>  listProduct = new ArrayList<product>();  
      public DB(){
                  
      }
       public void addproduct(product p){
            listProduct.add(p);
       }
      public void addproduct(String id, int price,String name,int stamp){
            listProduct.add(new product(id,price,name));
       }
      public void deleteproduct(String pId)
      {
           // listProduct.remove();
            int i=0;                                               
            while (i<listProduct.size()){
                product z = new product();
                z = listProduct.get(i);
                if (z.getId().equals(pId)) {
                   listProduct.remove(z);
                   break;
            }   
            i = i+1;
        }
        }
      public void editproduct(String pId,int price)
      {
           // listProduct.remove();
            int i=0;                                               
            while (i<listProduct.size()){
                product z ;//= new product();
                z = listProduct.get(i);
                if (z.getId().equals(pId)){
                   z.setPrice(price);
                   break;
            }   
            i = i+1;
        }
        }
      public product search(String pId){
        int i=0; 
        product z = new product();
        while (i<listProduct.size()){
            z = listProduct.get(i);
         //   System.out.println(z.getId()+ "test product");
            if (z.getId().equals(pId)) {
               // System.out.println(z.getPrice());
                return  z;
            }   
            i = i+1;
        }
        return  null;
      }

      public void printAll()
      {
           int i=0;                          
           System.out.println("DATA in DB");
        while (i<listProduct.size()){
            product z ;
            z = listProduct.get(i);
            System.out.println(z.getId()+" "+z.getPrice());
            i = i+1;
        }
        }
    }   
