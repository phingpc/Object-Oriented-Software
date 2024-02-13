package v4;

public class MallardDuck extends Duck
{
    public MallardDuck(){
     quackBehavior = new Quack(); 
     flyBehavior = new FlywithWings();
     talkA4 = new notalking();
   }
   public void display(){
     System.out.println("I'm a real Mallard duck"); 
  }
}
