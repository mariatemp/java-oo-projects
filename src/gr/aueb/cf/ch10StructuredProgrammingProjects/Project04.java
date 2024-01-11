package gr.aueb.cf.ch10StructuredProgrammingProjects;

import java.util.Random;
import java.util.Scanner;

/**
 * Implements a simple console-based
 * Tic-Tac-Toe game for two players.
 */
public class Project04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] board = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

        printBoard(board);

        while (true) {
            player1Turn(board, in);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);

            player2Turn(board, in);
            if (isGameFinished(board)) {
                break;
            }
            printBoard(board);
        }
    }

    private static boolean isGameFinished(char[][] board) {

        if (winnerTerms(board, 'X')) {
            printBoard(board);
            System.out.println("Player 1 wins!");
            return true;
        }

        if (winnerTerms(board, 'O')) {
            printBoard(board);
            System.out.println("Player 2 wins!");
            return true;
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        printBoard(board);
        System.out.println("No winner..");
        return true;
    }

    private static boolean winnerTerms(char[][] board, char symbol) {
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) ) {
            printBoard(board);
            return true;
        }
        return false;
    }

    private static void player2Turn(char[][] board, Scanner in) {
        String userInput;
        while (true) {
            System.out.println("Player 2. Where would you like to play? (1-9");
            userInput = in.nextLine();
            if (validMove(board, Integer.parseInt(userInput))) {
                break;
            } else {
                System.out.println(userInput + "Not valid move");
            }
        }
        placeMove(board, userInput, 'O');
    }


    public static void printBoard(char[][] board) {
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }

    public static void player1Turn(char[][] board, Scanner in) {
        String userInput;
        while (true) {
            System.out.println("Player 1. Where would you like to play? (1-9");
            userInput = in.nextLine();
            if (validMove(board, Integer.parseInt(userInput))) {
                break;
            } else {
                System.out.println(userInput + "Not valid move");
            }
        }
        placeMove(board, userInput, 'X');
    }

    private static void placeMove(char[][] board, String position, char symbol) {
        switch (position) {
            case "1":
                board[0][0] = symbol;
                break;
            case "2":
                board[0][1] = symbol;
                break;
            case "3":
                board[0][2] = symbol;
                break;
            case "4":
                board[1][0] = symbol;
                break;
            case "5":
                board[1][1] = symbol;
                break;
            case "6":
                board[1][2] = symbol;
                break;
            case "7":
                board[2][0] = symbol;
                break;
            case "8":
                board[2][1] = symbol;
                break;
            case "9":
                board[2][2] = symbol;
                break;
            default:
                System.out.println(":(");
        }
    }

    public static boolean validMove (char[][] board, int position) {
        switch (position) {
            case 1:
                if (board[0][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (board[0][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (board[0][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 4:
                if (board[1][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (board[1][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (board[1][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (board[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (board[2][1] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (board[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            default:
                return true;
        }
    }
}