package com.latnok.simpletic_tac_toe;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

public class SinglePlayer extends AppCompatActivity {

    private BoardView boardView;
    private GameEngine gameEngine;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boardView = (BoardView) findViewById(R.id.board);
        gameEngine = new GameEngine();
        boardView.setGameEngine(gameEngine);
        boardView.setMainActivity(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_new_game) {
            newGame();
        }
        return super.onOptionsItemSelected(item);
    }

    public void gameEnded(char c) {
        String msg = (c == 'T') ? "Game Ended. Tic" : "GameEnded. " + c + " win";

        new AlertDialog.Builder(this).
                setTitle("Tic Tac Toe").
                setMessage(msg).
                setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialogInterface) {
                        newGame();
                    }
                }).show();

        if (c == 'x') {
            score++;
            Intent intent = new Intent(getApplicationContext(), score.class);
            intent.putExtra("LOAD", score);
            startActivity(intent);
        }
        if (c == 'o') {
            score++;
            Intent intent = new Intent(getApplicationContext(), score.class);
            intent.putExtra("ROAD", score);
            startActivity(intent);
        }

    }

    private void newGame() {
        gameEngine.newGame();
        boardView.invalidate();
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        startActivity(new Intent(getApplicationContext(), Start.class));


        return super.dispatchKeyEvent(event);
    }
}
