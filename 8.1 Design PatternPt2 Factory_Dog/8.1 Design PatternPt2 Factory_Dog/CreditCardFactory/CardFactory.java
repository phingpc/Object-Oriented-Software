
public class CardFactory
{
    public static Card getCard(String typeCard){
        if(typeCard == "SilverCard")
        {
            return new SilverCard();
        } else if (typeCard == "Platinum")
        {
            return new PlatinumCard();
        }
        else 
        {
            return new GoldCard();
        }
    }
}
