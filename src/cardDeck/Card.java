package cardDeck;

public class Card {

        private Suit suit;
        private Rank rank;
        private boolean isFaceUp;

        public Card(Rank rank, Suit suit){
            this.rank = rank;
            this.suit = suit;
            isFaceUp = true;
        }

    public Card() {

    }

    public String getSuit(){
            return suit.printSuit();
    }
    public int getRank(){
            return rank.getRank();
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                ", isFaceUp=" + isFaceUp +
                '}';
    }
}
