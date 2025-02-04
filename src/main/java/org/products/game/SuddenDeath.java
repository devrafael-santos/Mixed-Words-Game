package org.products.game;

import org.products.mixer.Mixer;
import org.products.mixer.MixerFactory;

import java.io.FileNotFoundException;

public class SuddenDeath implements GameMechanic {

    private Mixer mixer;
    private WordsBank wordsBank;
    private int hearts = 1;
    private String word;
    private String modeName = "Sudden Death";
    private int round = 1;
    private int score = 0;

    public SuddenDeath() {
        this.mixer = MixerFactory.getRandomMixer();

        try {
            this.wordsBank = new WordsBank();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public String getNewMixedWord() {
        this.word = wordsBank.getRandomWord();
        return mixer.mix(this.word);
    }


    @Override
    public int getScore() {
        return score;
    }

    @Override
    public int getRound() {
        return round;
    }

    @Override
    public void nextRound() {
        this.round++;
    }

    @Override
    public String getModeName() {
        return this.modeName;
    }

    @Override
    public int getAttempts() {
        return this.hearts;
    }

    @Override
    public boolean isGameOver() {
        return hearts <= 0;
    }

    @Override
    public boolean isWordCorrect(String word) {

        if (!this.word.equals(word)) {
            this.hearts--;
            return false;
        }

        this.score += 5;
        return true;
    }

}
