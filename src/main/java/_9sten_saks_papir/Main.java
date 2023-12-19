package _9sten_saks_papir;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        TextUI ui = new TextUI();

        ui.displayMessage("Hello and welcome to rock, paper, scissors.");
        String input = ui.getInput("Please select an option:\n1) Singleplayer\n2) Multiplayer\n3) Quit");

        int userInput = Integer.parseInt(input);

        switch (userInput) {
            case 1:
                String playerName = ui.getInput("Please enter your name: ");
                Player singleplayer = new Player(playerName);
                ui.displayMessage("Hello " + singleplayer.getName());
                playSingleplayerGame();
            case 2:
                String player1Name = ui.getInput("Please enter player 1 name: ");
                String player2Name = ui.getInput("Please enter player 2 name: ");
                Player player1 = new Player(player1Name);
                Player player2 = new Player(player2Name);
                ui.displayMessage("Hello " + player1.getName() + " and " + player2.getName() + " the game begins!");
                playMultiplayerGame(player1, player2);
            case 3:
                System.exit(0);
        }
    }

    public static void playMultiplayerGame(Player player1, Player player2) {
        TextUI ui = new TextUI();

        int player1Choice = Integer.parseInt(ui.getInput(player1.getName() + ", please select one of the following:\n1) Rock\n2) Paper\n3) Scissors"));
        int player2Choice = Integer.parseInt(ui.getInput(player2.getName() + ", please select one of the following:\n1) Rock\n2) Paper\n3) Scissors"));

        if ((player1Choice == 1 || player1Choice == 2 || player1Choice == 3) && (player2Choice == 1 || player2Choice == 2 || player2Choice == 3)) {
            if (player1Choice == 1 && player2Choice == 3) {
                ui.displayMessage(player1.getName() + " played rock\n" + player2.getName() + " played scissors\n" + player1.getName() + " wins!");
            } else if (player1Choice == 2 && player2Choice == 1) {
                ui.displayMessage(player1.getName() + " played paper\n" + player2.getName() + " played rock\n" + player1.getName() + " wins!");
            } else if (player1Choice == 3 && player2Choice == 2) {
                ui.displayMessage(player1.getName() + " played scissors\n" + player2.getName() + " played paper\n" + player1.getName() + " wins!");
            } else if (player1Choice == 1 && player2Choice == 2) {
                ui.displayMessage(player1.getName() + " played rock\n" + player2.getName() + " played paper\n" + player2.getName() + " wins!");
            } else if (player1Choice == 2 && player2Choice == 3) {
                ui.displayMessage(player1.getName() + " played paper\n" + player2.getName() + " played scissors\n" + player2.getName() + " wins!");
            } else if (player1Choice == 3 && player2Choice == 1) {
                ui.displayMessage(player1.getName() + " played scissors\n" + player2.getName() + " played rock\n" + player2.getName() + " wins!");
            } else if (player1Choice == 1 && player2Choice == 1) {
                ui.displayMessage(player1.getName() + " played rock\n" + player2.getName() + " played rock\nIt's a tie!");
            } else if (player1Choice == 2 && player2Choice == 2) {
                ui.displayMessage(player1.getName() + " played paper\n" + player2.getName() + " played paper\nIt's a tie!");
            } else if (player1Choice == 3 && player2Choice == 3) {
                ui.displayMessage(player1.getName() + " played scissors\n" + player2.getName() + " played scissors\nIt's a tie!");
            }
            tryAgainMultiPlayer(player1, player2);
        } else {
            ui.displayMessage("Invalid input. please select a valid input.");
            playMultiplayerGame(player1, player2);
        }
    }

    public static void playSingleplayerGame() {
        TextUI ui = new TextUI();
        Random rd = new Random();

        String playerChoice = ui.getInput("Please select one of the following:\n1) Rock\n2) Paper\n3) Scissors");

        if (playerChoice.equals("1") || playerChoice.equals("2") || playerChoice.equals("3")) {
            int randomHand = rd.nextInt(1, 4);
            if (playerChoice.equals("1") && randomHand == 3) {
                ui.displayMessage("You played rock\nOpponent played scissors\nYou win!");
            } else if (playerChoice.equals("2") && randomHand == 1) {
                ui.displayMessage("You played paper\nOpponent played rock\nYou win!");
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
            tryAgainSingleplayer();
        } else {
            playSingleplayerGame();
        }
    }

    public static void tryAgainSingleplayer() {
        TextUI ui = new TextUI();
        String userChoice = ui.getInput("Would you like to play again? [Y/N]");
        if (userChoice.equalsIgnoreCase("y")) {
            playSingleplayerGame();
        } else if (userChoice.equalsIgnoreCase("n")) {
            System.exit(0);
        } else {
            ui.displayMessage("Invalid input please choose a valid option.");
            tryAgainSingleplayer();
        }
    }

    public static void tryAgainMultiPlayer(Player player1, Player player2) {
        TextUI ui = new TextUI();
        String userChoice = ui.getInput("Would you like to play again? [Y/N]");
        if (userChoice.equalsIgnoreCase("y")) {
            playMultiplayerGame(player1, player2);
        } else if (userChoice.equalsIgnoreCase("n")) {
            System.exit(0);
        } else {
            ui.displayMessage("Invalid input please choose a valid option.");
            tryAgainMultiPlayer(player1, player2);
        }
    }
}
