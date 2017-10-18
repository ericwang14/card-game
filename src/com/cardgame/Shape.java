package com.cardgame;

public enum Shape {
    DIAMONDS(Color.RED), CLUBS(Color.BLACK), HEARTS(Color.RED), SPADES(Color.BLACK);

    Color color;

    Shape(Color color) {
        this.color = color;
    }
}
