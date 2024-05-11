# Tic Tac Toe Game

This is a simple implementation of the classic game Tic Tac Toe in Java using Swing for the GUI.

## Files

The project consists of two main files:

- `TictactoeGUI.java`: This file contains the GUI for the game. It creates a 3x3 grid of buttons for the game board. When a button is clicked, it displays the current player's symbol (X or O) and then switches to the other player. The game checks for a winner after each move.

- `tictactoe.java`: This file contains the logic for the game. It keeps track of the current player, the game board, and the number of moves. It also checks if the game is over (either because the board is full or because there is a winner).

## How to Run

To run the game, compile and run the `TictactoeGUI.java` file. This will open a new window with the game board. Players take turns clicking on the buttons to make their move. The game ends when one player has three of their symbols in a row (horizontally, vertically, or diagonally) or when the board is full.

## Libraries Used

This application uses several libraries from Java's standard library:

1. `javax.swing.*`: This library is used for creating the graphical user interface (GUI) of the application. It provides classes like `JFrame` for the application window, `JButton` for the clickable buttons, and `JLabel` for displaying text.

2. `java.awt.*`: This library is used for creating user interfaces and for painting graphics and images. The `GridLayout` class from this library is used to arrange the buttons in a grid.

3. `java.awt.event.*`: This library is used for handling events like button clicks. The `ActionEvent` and `ActionListener` classes from this library are used to handle the button click events.

These libraries are all part of Java's standard library, so you don't need to install anything extra to use them. They provide the basic functionality needed to create a simple GUI application like this Tic Tac Toe game.
## Future Improvements

- Add the ability to play against a computer opponent.
- Improve the user interface, for example by highlighting the winning line at the end of the game.
