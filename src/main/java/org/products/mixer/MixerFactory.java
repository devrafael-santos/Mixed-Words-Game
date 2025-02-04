package org.products.mixer;

import java.util.List;
import java.util.Random;

public class MixerFactory {

    private static final List<Mixer> mixers = List.of(new MixerByOrder(), new MixerSwitching());

    public static Mixer getRandomMixer() {
        Random random = new Random();

        if (random.nextBoolean()) {
            return mixers.getFirst();
        }

        return mixers.get(1);
    }
}
