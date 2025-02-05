package org.products.game;

import org.products.mixer.MixerFactory;

import java.util.List;
import java.util.Random;

public class GameMechanicFactory {

    private static final List<GameMechanic> mechanics = List.of(new SuddenDeath(), new Survival());

    public static GameMechanic getRandomGameMechanic() {
        Random random = new Random();

        return mechanics.get(random.nextInt(0, GameMechanicFactory.mechanics.size()));
    }

}
