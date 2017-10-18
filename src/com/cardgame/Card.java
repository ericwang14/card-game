package com.cardgame;

public class Card {
    private Shape shape;
    private Color color;
    private CardNumber number;

    public Card(CardNumber number, Shape shape, Color color) {
        this.number = number;
        this.color = color;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Card is " + number + " " + shape + " " + color;
    }
}
