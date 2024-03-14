public class JavaFactoryPatternExample
{
public static void main(String[] args)
{
Pay pay = PayFactory.getMoney("True");
pay.payMoney();
pay = PayFactory.getMoney("Line");
pay.payMoney();
pay = PayFactory.getMoney("Credit");
pay.payMoney();
}
}
