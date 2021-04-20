import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.imageio.ImageIO;


public class DeckOfCards {
    private ArrayList<Card> deck;
    
    public DeckOfCards(ArrayList<Card> deck) throws IOException {
        this.deck = deck;
    }


    public DeckOfCards() throws IOException
    {
        List<String> suits = new ArrayList<String>(); 
        suits.add("clubs");
        suits.add("diamonds");
        suits.add("hearts");
        suits.add("spades");
        List<String> faceValues = new ArrayList<String>();
        faceValues.add("2");
        faceValues.add("3");
        faceValues.add("4");
        faceValues.add("5");
        faceValues.add("6");
        faceValues.add("7");
        faceValues.add("8");
        faceValues.add("9");
        faceValues.add("10");
        faceValues.add("jack");
        faceValues.add("queen");
        faceValues.add("king");
        faceValues.add("ace");
        deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceValue:faceValues)
                deck.add(new Card(faceValue,suit));
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public Card deal()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

  
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}
