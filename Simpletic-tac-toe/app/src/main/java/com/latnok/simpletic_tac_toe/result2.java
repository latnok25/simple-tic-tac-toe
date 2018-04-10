package com.latnok.simpletic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by k on 4/9/2018.
 */

public class result2 extends AppCompatActivity {

    public static int round4 = 0;
    public static int roundb4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        displayround4(0);
        displayroundb4(0);

    }

    public void displayround4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.round4);
        int fly = getIntent().getIntExtra("SCORE", 0);
        scoreView.setText(fly + "");

    }

    public void displayroundb4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.roundb4);
        int ant = getIntent().getIntExtra("DOOR", 0);
        scoreView.setText(ant + "");
    }


    public void newGame(View view) throws IOException {
        startActivity(new Intent(getApplicationContext(), FiveGridDoublePlayer.class));


    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        startActivity(new Intent(getApplicationContext(), Start.class));


        return super.dispatchKeyEvent(event);
    }


}
