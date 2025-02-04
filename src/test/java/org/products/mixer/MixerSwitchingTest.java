package org.products.mixer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MixerSwitchingTest {

    @Test
    void mix_ReturnsCorrectMixedWord_WhenSuccessful() {
        MixerSwitching mixer = new MixerSwitching();

        Assertions.assertEquals("steet", mixer.mix("teste"));
    }
}