package org.products.game;

import java.util.List;
import java.util.Random;

public class GameMechanicFactory {

    private static final List<GameMechanic> mechanics = List.of(new SuddenDeath(), new Survival());

    public static GameMechanic getRandomGameMechanic() {
        Random random = new Random();

        if (random.nextBoolean()) {
            return mechanics.getFirst();
        }

        return mechanics.get(1);
    }

}
