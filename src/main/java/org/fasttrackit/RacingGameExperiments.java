package org.fasttrackit;

import java.util.Scanner;

public class RacingGameExperiments {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name!");
        Player player = new Player(scanner.next());
        System.out.println("Player name is: " + player.getName());
    }

}
