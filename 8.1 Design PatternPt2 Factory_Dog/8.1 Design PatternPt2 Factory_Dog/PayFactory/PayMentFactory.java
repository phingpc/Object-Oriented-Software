class PayMentFactory
{
public static Pay getMoney(String criteria)
{
if ( criteria.equals("Credit") )
return new CreditCard();
else if ( criteria.equals("Line") )
return new LinePay();
else if (criteria.equals("True"))
return new TrueMoney();
return null;
}
}
