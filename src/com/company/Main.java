package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 4000, 5, 100);
        System.out.println("Your final score was " + highScore);

        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 8;
        int bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int scorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Alex", scorePosition);

        scorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jill", scorePosition);

        scorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", scorePosition);

        scorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Lexi", scorePosition);
    }



    // Create a method called displayHighScorePosition
    // It should take a players name as a parameter, and a 2nd parameter as a position in the
    // high score table
    // You should display the player's name along with a message like "managed to get into position"
    // and the position they got and a further message " on the high score table"
    //
    // Create a second method called calculateHighScorePosition
    // It should be sent one argument only, the player score
    // It should return an int
    // The return data should be
    // 1 if the score is > 1000
    // 2 if the score is > 500 and < 1000
    // 3 if the score is > 100 and < 500
    // 4 in all other cases
    // call both methods and display the results of the following
    // a score of 1500, 900. 400, and 50


    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the "
        + "high score table.");
    }
}
