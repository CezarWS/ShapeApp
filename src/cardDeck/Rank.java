package cardDeck;

public enum Rank {
    ACE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),
    EIGHT(9),NINE(9),TEN(10),JACK(12),QUEEN(13),KING(14);

    private final int rankValue;


    private Rank(int rankValue){
        this.rankValue = rankValue;
    }
    public int getRank(){
        return rankValue;
    }

}
