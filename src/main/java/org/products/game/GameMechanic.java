package org.products.game;

public interface GameMechanic {

    boolean isGameOver();

    boolean isWordCorrect(String word);

    String getNewMixedWord();

    String getModeName();

    int getAttempts();

    int getRound();

    void nextRound();

    int getScore();


}
