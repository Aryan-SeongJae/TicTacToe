package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.tictactoe;

public class TictactoeGUI extends JFrame {
    private tictactoe game;
    private JButton[] buttons;
    private JLabel statusLabel;

    public TictactoeGUI() {
        game = new tictactoe();
        buttons = new JButton[9];
        statusLabel = new JLabel("Player X's turn");

        setLayout(new GridLayout(4, 3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton button = (JButton) e.getSource();
                    int index = -1;
                    for (int i = 0; i < 9; i++) {
                        if (buttons[i] == button) {
                            index = i;
                            break;
                        }
                    }
                    int row = index / 3;
                    int col = index % 3;
                    if (game.getBoard()[row][col] == ' ') {
                        game.getBoard()[row][col] = game.getCurrentPlayer();
                        button.setText(String.valueOf(game.getCurrentPlayer()));
                        game.setCurrentPlayer(game.getCurrentPlayer() == 'X' ? 'O' : 'X');
                        statusLabel.setText("Player " + game.getCurrentPlayer() + "'s turn");
                        if (game.checkWinner()) {
                            statusLabel.setText("Player " + (game.getCurrentPlayer() == 'X' ? 'O' : 'X') + " wins!");
                            for (JButton b : buttons) {
                                b.setEnabled(false);
                            }
                        } else if (game.isBoardFull()) {
                            statusLabel.setText("It's a draw!");
                        }
                    }
                }
            });
            add(buttons[i]);
        }
        add(statusLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new TictactoeGUI();
    }
}