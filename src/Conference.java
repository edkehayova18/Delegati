import java.util.ArrayList;

public class Conference {

    ArrayList<Delegate> delegates;
    ArrayList<Hotel> hotels;
    ArrayList<DelegationCard> cards;


    public Conference(ArrayList<Delegate> delegates, ArrayList<Hotel> hotels, ArrayList<DelegationCard> cards) {
        this.delegates = delegates;
        this.hotels = hotels;
        this.cards = cards;
    }

    public ArrayList<Delegate> getDelegates() {
        return delegates;
    }

    public void setDelegates(ArrayList<Delegate> delegates) {
        this.delegates = delegates;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public ArrayList<DelegationCard> getCards() {
        return cards;
    }

    public void setCards(ArrayList<DelegationCard> cards) {
        this.cards = cards;
    }


}
