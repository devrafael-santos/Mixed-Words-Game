package org.products;

import org.products.game.GameMechanic;
import org.products.game.GameMechanicFactory;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GameMechanic gameMechanic = GameMechanicFactory.getRandomGameMechanic();

        System.out.println(" --- Bem vindo ao Mixed Words Game! --- ");
        System.out.println("Mode: " + gameMechanic.getModeName());
        if (!gameMechanic.getModeName().equals("Sudden Death")) {
            System.out.println("Attempts: " + gameMechanic.getAttempts());
        }

        while (!gameMechanic.isGameOver()) {

            if (gameMechanic.getRound() > 1) {
                System.out.println("Deseja continuar? (S/N)");
                String entrada = input.nextLine().toUpperCase();

                if (entrada.equals("N")) {
                    break;
                } else if(!entrada.equals("S")) {
                    System.out.println("Informe uma entrada válida!");
                    continue;
                }

                System.out.println("\n\nRound: " + gameMechanic.getRound());
            }

            System.out.println("\n\nPalavra: " + gameMechanic.getNewMixedWord());

            System.out.println("Adivinhe a palavra (0 para finalizar o jogo): ");
            String entrada = input.nextLine();

            if (entrada.equals("0")) {
                break;
            }

            if (gameMechanic.isWordCorrect(entrada)) {
                System.out.println("Muito bem!! Você acertou a palavra!");
            } else {
                System.out.println("Não foi dessa vez...");
            }

            gameMechanic.nextRound();

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\nJogo finalizado!");

        System.out.println("\n\n\nQuantidade de pontos final: " + gameMechanic.getScore());
        if (!gameMechanic.getModeName().equals("Sudden Death")) {
            System.out.println("\nVidas restantes: " + gameMechanic.getAttempts());
        }

    }
}