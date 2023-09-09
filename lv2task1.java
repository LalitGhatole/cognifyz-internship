// tic tac toe game
import java.util.*;

public class lv2task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        int currentPlayer = 1;
        int totalMoves = 0;
        boolean gameWon = false;

        do {
            displayBoard(board);
            int row, col;

            do {
                System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ');

            board[row][col] = (currentPlayer == 1) ? 'X' : 'O';
            totalMoves++;

            if (checkWin(board, row, col)) {
                displayBoard(board);
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
            } else if (totalMoves == 9) {
                displayBoard(board);
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        } while (!gameWon);

        scanner.close();
    }

    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int row = 0; row < 3; row++) {
            System.out.print("| ");
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static boolean checkWin(char[][] board, int row, int col) {
        char currentPlayerSymbol = board[row][col];

        if (board[row][0] == currentPlayerSymbol && board[row][1] == currentPlayerSymbol
                && board[row][2] == currentPlayerSymbol) {
            return true;
        }

        if (board[0][col] == currentPlayerSymbol && board[1][col] == currentPlayerSymbol
                && board[2][col] == currentPlayerSymbol) {
            return true;
        }

        if ((row == col || row + col == 2) &&
                ((board[0][0] == currentPlayerSymbol && board[1][1] == currentPlayerSymbol
                        && board[2][2] == currentPlayerSymbol) ||
                        (board[0][2] == currentPlayerSymbol && board[1][1] == currentPlayerSymbol
                                && board[2][0] == currentPlayerSymbol))) {
            return true;
        }

        return false;
    }
}
