package _9sten_saks_papir;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TextUI ui = new TextUI();
        String playerName = ui.getInput("Please enter your name: ");
        Player player = new Player(playerName);
        ui.displayMessage("Hello " + player.getName() + ", and welcome to rock, paper, scissors.");
        playGame();
    }

    private static void playGame() {
        TextUI ui = new TextUI();
        Random rd = new Random();
        String playerChoice = ui.getInput("Please select one of the following:\n1) Rock\n2) Paper\n3) Scissors");

        if (playerChoice.equals("1") || playerChoice.equals("2") || playerChoice.equals("3")) {
            int randomHand = rd.nextInt(1, 4);
            if (playerChoice.equals("1") && randomHand == 3) {
                ui.displayMessage("You played rock\nOpponent played scissors\nYou win!");
            } else if (playerChoice.equals("2") && randomHand == 1) {
                ui.displayMessage("You played raper\nOpponent played rock\nYou win!");
            } else if (playerChoice.equals("3") && randomHand == 2) {
                ui.displayMessage("You played scissors\nOpponent played paper\nYou win!");
            } else if (playerChoice.equals("1") && randomHand == 2) {
                ui.displayMessage("You played rock\nOpponent played paper\nOpponent wins!");
            } else if (playerChoice.equals("2") && randomHand == 3) {
                ui.displayMessage("You played paper\nOpponent played scissors\nOpponent wins!");
            } else if (playerChoice.equals("3") && randomHand == 1) {
                ui.displayMessage("You played scissors\nOpponent played rock\nOpponent wins!");
            } else if (playerChoice.equals("1") && randomHand == 1) {
                ui.displayMessage("You played rock\nOpponent played rock\nIt's a tie!");
            } else if (playerChoice.equals("2") && randomHand == 2) {
                ui.displayMessage("You played paper\nOpponent played paper\nIt's a tie!");
            } else if (playerChoice.equals("3") && randomHand == 3) {
                ui.displayMessage("You played scissors\nOpponent played scissors\nIt's a tie!");
            }
            tryAgain();
        } else {
            playGame();
        }
    }

    public static void tryAgain() {
        TextUI ui = new TextUI();
        String userChoice = ui.getInput("Would you like to play again? [Y/N]");
        if (userChoice.equalsIgnoreCase("y")) {
            playGame();
        } else if (userChoice.equalsIgnoreCase("n")) {
            System.exit(0);
        } else {
            ui.displayMessage("Invalid input please choose a valid option.");
            tryAgain();
        }
    }
}
