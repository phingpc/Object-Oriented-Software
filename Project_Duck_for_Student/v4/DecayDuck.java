package v4;


public class DecayDuck extends Duck
{
 public DecayDuck(){
     quackBehavior = new MuteQuack(); 
    // flyBehavior = new FlywithWings();   
   }
   public void display(){
     System.out.println("I'm a real DecayDuck"); 
  }
}
