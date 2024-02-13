package v4;

public class MiniDuckSimulator
{
   public static void main(String[] args){
    
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    // 
    Duck model = new ModelDuck();
    model.performQuack();
    model.performFly();
    model.performTalk();
    
    
    
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
     model.performQuack();
    
    Duck decayDuck = new DecayDuck();
    decayDuck.performQuack();
    //mallard.performFly();
    /*flywithWings wf = new fly();
 
    model.setFlyBehavior(wf);
    
    
    decayDuck.setFlyBehavior(decayDuck.flyBehavior);*/
    }
}
