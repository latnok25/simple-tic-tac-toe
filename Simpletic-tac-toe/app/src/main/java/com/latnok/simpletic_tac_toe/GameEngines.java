package com.latnok.simpletic_tac_toe;

import java.util.Random;

/**
 * Created by k on 4/6/2018.
 */

public class GameEngines {

    private static final Random RANDOM = new Random();
    private char[] elts;
    private char currentPlayer;
    private boolean ended;

    public GameEngines() {
        elts = new char[250];
        newGame();
    }

    public boolean isEnded() {
        return ended;
    }

    public char play(int x, int y) {
        if (!ended && elts[5 * y + x] == ' ') {
            elts[5 * y + x] = currentPlayer;
            changePlayer();
        }

        return checkEnd();
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'x' ? 'o' : 'x');
    }

    public char elt(int x, int y) {
        return elts[5 * y + x];
    }

    public void newGame() {
        for (int i = 0; i < elts.length; i++) {
            elts[i] = ' ';
        }

        currentPlayer = 'x';
        ended = false;
    }

    public char checkEnd() {
        for (int i = 0; i < 5; i++) {
            //checking vertical
            if (elt(i, 0) != ' ' && elt(i, 0) == elt(i, 1) && elt(i, 1) == elt(i, 2)) {
                ended = true;
                return elt(i, 0);
            }

            if (elt(i, 2) != ' ' && elt(i, 2) == elt(i, 3) && elt(i, 3) == elt(i, 4)) {
                ended = true;
                return elt(i, 2);
            }
            //checking horizontal
            if (elt(0, i) != ' ' && elt(0, i) == elt(1, i) && elt(1, i) == elt(2, i)) {
                ended = true;
                return elt(0, i);
            }

            if (elt(2, i) != ' ' && elt(2, i) == elt(3, i) && elt(3, i) == elt(4, i)) {
                ended = true;
                return elt(2, i);
            }
        }

        if (elt(0, 0) != ' ' && elt(0, 0) == elt(1, 1) && elt(1, 1) == elt(2, 2)) {
            ended = true;
            return elt(0, 0);
        }

        if (elt(2, 0) != ' ' && elt(2, 0) == elt(1, 1) && elt(1, 1) == elt(0, 2)) {
            ended = true;
            return elt(2, 0);
        }

        for (int i = 0; i < 25; i++) {
            if (elts[i] == ' ')
                return ' ';
        }

        return 'T'; //tie/draw
    }

    public char computer() {
        if (!ended) {
            int position = -1;

            do {
                position = RANDOM.nextInt(25);
            } while (elts[position] != ' ');

            elts[position] = currentPlayer;
            changePlayer();
        }

        return checkEnd();
    }

}
