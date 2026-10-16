package e2.solutions8;

import e2.chapter4.Rank;
import e2.chapter4.Suit;

public class Exercise08 {
    public static void main(String[] args) {
        Card8 card1 = Card8.get(Rank.ACE, Suit.CLUBS);
        Card8 card2 = Card8.get(Rank.ACE, Suit.CLUBS);
        System.out.println("Are they the same object? " + (card1 == card2));
    }
}