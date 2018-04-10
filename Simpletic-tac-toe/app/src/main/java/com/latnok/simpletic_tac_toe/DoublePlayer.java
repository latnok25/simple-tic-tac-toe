package com.latnok.simpletic_tac_toe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class DoublePlayer extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    int turn;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                        b1.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b2.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b2.setText("O");
                        b2.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b3.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b3.setText("O");
                        b3.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b4.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b4.setText("O");
                        b4.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b5.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b5.setText("O");
                        b5.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b6.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b6.setText("O");
                        b6.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b7.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b7.setText("O");
                        b7.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b8.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b8.setText("O");
                        b8.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b9.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b9.setText("O");
                        b9.setTextColor(Color.RED);
                    }

                }
                endGame();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_new_game) {
            startActivity(new Intent(getApplicationContext(), DoublePlayer.class));

        }
        return super.onOptionsItemSelected(item);
    }


    public void endGame() {
        String a, b, c, d, e, f, g, h, i;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }

        if (a.equals("X") && e.equals("X") && i.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }

        if (a.equals("O") && e.equals("O") && i.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(DoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }

        if (end) {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        startActivity(new Intent(getApplicationContext(), Start.class));


        return super.dispatchKeyEvent(event);
    }

}