package org.products.mixer;

import java.util.List;
import java.util.Random;

public class MixerFactory {

    private static final List<Mixer> mixers = List.of(new MixerByOrder(), new MixerSwitching());

    public static Mixer getRandomMixer() {
        Random random = new Random();

        return mixers.get(random.nextInt(0, MixerFactory.mixers.size()));
    }
}
