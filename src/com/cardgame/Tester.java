package com.cardgame;

public class Tester {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.generate();

        System.out.print(deck);
    }
}
