class CatFactory
{
public static Cat getCat(String criteria)
{
if ( criteria.equals("Thai") )
return new Siamese();
else if ( criteria.equals("LongHair") )
return new Persian();
else if ( criteria.equals("ShortHair") )
return new AmericanShorthair();
return null;
}
}
