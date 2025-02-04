package org.products.mixer;

public class MixerSwitching implements Mixer {

    @Override
    public String mix(String word) {
        char[] charArray = word.toCharArray();

        for (int i = 0; i < word.length() - 2; i++) {
            char cAux = charArray[i];
            charArray[i] = charArray[i + 2];
            charArray[i + 2] = cAux;
        }

        return String.valueOf(charArray);
    }
}
