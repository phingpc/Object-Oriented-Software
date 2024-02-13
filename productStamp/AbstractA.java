

public abstract class AbstractA
{
    private int x;

    public AbstractA()
    {
        // initialise instance variables
        x = 0;
    }
    
    // ??????????????? abstract ?? method 
    abstract void sssMethod();
    
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
