package Model;

// This class contains the design of the tic tac toe game which is a 3 by 3 grid
public class tictactoe {
    private char[][] board;
    private char currentPlayer;
    private int moves;

    public tictactoe() {
        board = new char[3][3];
        currentPlayer = 'X';
        moves = 0;
        initializeBoard();
    }

    // This method initializes the board with empty spaces
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                board[i][j] = ' ';
        }
    }

    // This method returns the current player
    public char getCurrentPlayer() {
        return currentPlayer;
    }

    // This method returns the number of moves
    public int getMoves() {
        return moves;
    }

    // This method returns the board
    public char[][] getBoard() {
        return board;
    }

    // This method checks if the game is over
    public boolean isGameOver() {
        return (checkWinner() || isBoardFull());
    }

    // This method checks if the board is full
    public boolean isBoardFull() {
        return (moves == 9);
    }

    // This method checks if there is a winner
    public boolean checkWinner() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }

    // This method checks the rows for a winner
    public boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[i][0], board[i][1], board[i][2]) == true)
                return true;
        }
        return false;
    }

    private boolean checkRowCol(char c, char c1, char c2) {
        return ((c != ' ') && (c == c1) && (c == c2));
    }


    // This method checks the columns for a winner
    public boolean checkColumns() {
        for (int i = 0; i < 3; i++) {
            if (checkRowCol(board[0][i], board[1][i], board[2][i]) == true)
                return true;
        }
        return false;
    }

    // This method checks the diagonals for a winner
    public boolean checkDiagonals() {
        return ((checkRowCol(board[0][0], board[1][1], board[2][2]) == true) || (checkRowCol(board[0][2], board[1][1], board[2][0]) == true));
    }

    public void setCurrentPlayer(char c) {
        this.currentPlayer = c;
    }

}
