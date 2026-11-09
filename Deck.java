package TugasKartu;

public class Deck {
    Card[] cardArray = new Card[52];
    int nextCard = 0;

    public Deck() {
        int cardCount = 0;

        for (int suits = 1; suits <= 4; suits++) {
            for (int type = 1; type <= 13; type++) {
                cardArray[cardCount] = new Card(suits, type);
                cardCount++;
            }
        }
    }

    public void shuffle() {
        for (int i = cardArray.length - 1; i > 0; i--) {
            int randomIndex = (int) (Math.random() * (i + 1));

            Card temp = cardArray[i];
            cardArray[i] = cardArray[randomIndex];
            cardArray[randomIndex] = temp;
        }

        nextCard = 0;
    }

    public Card dealCard() {
        if (nextCard >= cardArray.length) {
            return null;
        }

        return cardArray[nextCard++];
    }

    public void print() {
        for (Card card : cardArray) {
            System.out.println(card);
        }
    }
}
