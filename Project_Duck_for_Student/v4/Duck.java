package v4;


public abstract class Duck
{
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    talk talkA;
    public Duck(){}
   
    public abstract void display();
    
    void performFly(){
        flyBehavior.fly();
    }
     void performQuack(){
        quackBehavior.quack();
        }
     void performTalk(){
          talkA.talkbaoni();
        }
     void swim(){
       System.out.println("All ducks float, even decoys!");
    }
    // ADD 2 NEW method
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior =  fb;
    }
    public void setAuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
   }
   
   public void settalkA(talk qb){
        talkA = qb;
   }
    //Ohter duck-like methods
}
