

public class productStamp extends product
{
      private int stamp;
  productStamp(){}
  public productStamp(String x, int y, String name, int stamp ){
        super(x,y,name);
        this.stamp =stamp;
  }

  public int getStamp(){return stamp;}
  public void setStamp(int stamp){this.stamp = stamp;}
}
