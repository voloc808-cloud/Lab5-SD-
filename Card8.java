package e2.solutions8;

import java.util.IdentityHashMap;
import java.util.Map;

import e2.chapter4.Rank;
import e2.chapter4.Suit;

class Card8 {

    private static final Map<Rank, Map<Suit, Card8>> CARDS = new IdentityHashMap<>();

    private Rank aRank;
    private Suit aSuit;

    public static Card8 get(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;
        Map<Suit, Card8> innerMap = CARDS.getOrDefault(pRank, new IdentityHashMap<>());
        CARDS.putIfAbsent(pRank, innerMap);
        if (!innerMap.containsKey(pSuit)) {
            innerMap.put(pSuit, new Card8(pRank, pSuit));
        }
        return innerMap.get(pSuit);
    }

    private Card8(Rank pRank, Suit pSuit) {
        assert pRank != null && pSuit != null;
        aRank = pRank;
        aSuit = pSuit;
    }

    public Rank rank() {
        return aRank;
    }

    public Suit suit() {
        return aSuit;
    }
}