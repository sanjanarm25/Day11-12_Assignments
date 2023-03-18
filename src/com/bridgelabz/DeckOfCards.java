package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        // create the deck of cards
        List<String> deck = new ArrayList<>();
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck.add(rank + " of " + suit);
            }
        }

        // shuffle the deck
        Collections.shuffle(deck, new Random());

        // distribute 9 cards to each of the 4 players
        String[][] players = new String[4][9];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck.get(i * 9 + j);
            }
        }

        // print the cards received by the 4 players
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
