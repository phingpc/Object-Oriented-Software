public class JavaFactoryPatternExample
{
public static void main(String[] args)
{
// create a small dog
Cat cat = CatFactory.getCat("Thai");
cat.speak();
// create a big dog
cat = CatFactory.getCat("LongHair");
cat.speak();
// create a working dog
cat = CatFactory.getCat("ShortHair");
cat.speak();
}
}
