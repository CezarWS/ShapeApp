package cardDeck;

import java.util.ArrayList;
import java.util.List;

public class CardDeck extends Card {
    private List<Card> available ;
    private List<Card> used;


    public CardDeck(){
        super();
        this.available = new ArrayList<Card>(52);
    }

    public List<Card> dealHand(int cards){

        return null;
    }
    public void shuffle(){
        for (int i = 0; i < available.size() ; i++) {




        }


    }
    public void getAvailableCardCount(){

    }

    public void getUsedCardCount(){

    }


    @Override
    public String toString() {
        return "CardDeck{" +
                "dealhands=" + available +
                ", used=" + used +
                '}';
    }
}
