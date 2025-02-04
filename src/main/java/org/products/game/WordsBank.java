package org.products.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordsBank {
    private List<String> words;

    public WordsBank() throws FileNotFoundException {
        File wordsFile = new File("src/main/java/org/products/words.txt");
        Scanner reader = new Scanner(wordsFile);
        while (reader.hasNextLine()) {
            this.words = List.of(reader.nextLine().split(","));
        }
    }

    public String getRandomWord() {
        Random random = new Random();

        return this.words.get(random.nextInt(0, this.words.size()));
    }
}
