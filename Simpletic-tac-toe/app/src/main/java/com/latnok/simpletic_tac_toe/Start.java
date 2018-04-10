package com.latnok.simpletic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void startGame(View view) {
        startActivity(new Intent(getApplicationContext(), SinglePlayer.class));
    }
    public void startGames(View view) { startActivity(new Intent(getApplicationContext(), DoublePlayer.class));}

    public void startGamesa(View view) { startActivity(new Intent(getApplicationContext(), FiveGridSinglePlayer.class));}

    public void startGamesab(View view) { startActivity(new Intent(getApplicationContext(), FiveGridDoublePlayer.class));}



    //disable return button
    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {

        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (event.getKeyCode()) {
                case KeyEvent.KEYCODE_BACK:
                    return true;
            }
        }

        return super.dispatchKeyEvent(event);
    }
}
