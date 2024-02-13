package v4;


public class ModelDuck extends Duck
{
 public ModelDuck(){ 
     quackBehavior = new Quack(); 
     flyBehavior = new FlyNoWay();
     talkA = new talking();
  }
  public void display(){
    System.out.println("I'm a model duck");
  }
  
}
