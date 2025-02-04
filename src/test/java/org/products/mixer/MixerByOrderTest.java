package org.products.mixer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MixerByOrderTest {

    @Test
    void mix_ReturnsCorrectMixedWord_WhenSuccessful() {
        MixerByOrder mixer = new MixerByOrder();

        Assertions.assertEquals("eestt", mixer.mix("teste"));
    }
}