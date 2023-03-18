package com.bridgelabz;

import java.util.*;


import static com.bridgelabz.ModifiedDeckOfCards.RANKS;

public class ModifiedDeckOfCards {
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

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

        // create players and deal cards
        Queue<Player> players = new LinkedList<>();
        for (int i = 1; i <= 4; i++) {
            Player player = new Player("Player " + i);
            for (int j = 0; j < 9; j++) {
                player.addCard(deck.remove(0));
            }
            players.add(player);
        }

        // sort the cards in each player's hand by rank
        for (Player player : players) {
            player.sortCards();
        }

        // print the cards received by each player
        for (Player player : players) {
            System.out.println(player.getName() + ":");
            for (String card : player.getHand()) {
                System.out.println(card);
            }
            System.out.println();
        }
    }
}

class Player {
    private String name;
    private Queue<String> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new LinkedList<>();
    }

    public void addCard(String card) {
        hand.offer(card);
    }

    public void sortCards() {
        List<String> sortedCards = new ArrayList<>(hand);
        Collections.sort(sortedCards, new Comparator<String>() {
            @Override
            public int compare(String card1, String card2) {
                int rank1 = Arrays.asList(RANKS).indexOf(card1.split(" ")[0]);
                int rank2 = Arrays.asList(RANKS).indexOf(card2.split(" ")[0]);


                return Integer.compare(rank1, rank2);
            }
        });
        hand = new LinkedList<>(sortedCards);
    }

    public String getName() {
        return name;
    }

    public List<String> getHand() {
        return new ArrayList<>(hand);
    }

}
