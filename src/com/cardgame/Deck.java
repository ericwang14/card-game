package com.cardgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private final List<Card> cards = new ArrayList<>();

    public void generate() {
        buildCards();
        shuffle();
    }

    private void buildCards() {
        for (CardNumber number : CardNumber.values()) {
            for (Shape shape : Shape.values()) {
                cards.add(new Card(number, shape, shape.color));
            }
        }
    }

    private void shuffle() {
        Random random = new Random();

        for (int i = cards.size() - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);

            Card randomCard = cards.get(randomIndex);
            cards.set(randomIndex, cards.get(i));
            cards.set(i, randomCard);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Card card: cards) {
            sb.append(card + "\n\r");
        }

        return sb.toString();
    }
}
