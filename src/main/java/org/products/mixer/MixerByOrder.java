package org.products.mixer;

import java.util.Arrays;

public class MixerByOrder implements Mixer {

    @Override
    public String mix(String word) {
        char[] ar = word.toCharArray();
        Arrays.sort(ar);
        return String.valueOf(ar);
    }
}
