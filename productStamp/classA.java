
/**
 * Write a description of class classA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class classA extends AbstractA implements interfA, interfB
{
    // instance variables - replace the example below with your own
    private int x;
    public int sampleMethod (int y)
    {
        return 999;
    }
    public int callsampleMethod(int y)
    {
        return super.sampleMethod(y);
    }
}
