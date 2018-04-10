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

public class FiveGridDoublePlayer extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14,
            b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25;

    int turn;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b10 = (Button) findViewById(R.id.b10);
        b11 = (Button) findViewById(R.id.b11);
        b12 = (Button) findViewById(R.id.b12);
        b13 = (Button) findViewById(R.id.b13);
        b14 = (Button) findViewById(R.id.b14);
        b15 = (Button) findViewById(R.id.b15);
        b16 = (Button) findViewById(R.id.b16);
        b17 = (Button) findViewById(R.id.b17);
        b18 = (Button) findViewById(R.id.b18);
        b19 = (Button) findViewById(R.id.b19);
        b20 = (Button) findViewById(R.id.b20);
        b21 = (Button) findViewById(R.id.b21);
        b22 = (Button) findViewById(R.id.b22);
        b23 = (Button) findViewById(R.id.b23);
        b24 = (Button) findViewById(R.id.b24);
        b25 = (Button) findViewById(R.id.b25);


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

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b10.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b10.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b10.setText("O");
                        b10.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b11.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b11.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b11.setText("O");
                        b11.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b12.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b12.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b12.setText("O");
                        b12.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b13.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b13.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b13.setText("O");
                        b13.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b14.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b14.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b14.setText("O");
                        b14.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b15.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b15.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b15.setText("O");
                        b15.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b16.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b16.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b16.setText("O");
                        b16.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b17.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b17.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b17.setText("O");
                        b17.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b18.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b18.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b18.setText("O");
                        b18.setTextColor(Color.RED);
                    }

                }
                endGame();

            }
        });

        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b19.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b19.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b19.setText("O");
                        b19.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b20.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b20.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b20.setText("O");
                        b20.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b21.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b21.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b21.setText("O");
                        b21.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b22.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b22.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b22.setText("O");
                        b22.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b23.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b23.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b23.setText("O");
                        b23.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b24.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b24.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b24.setText("O");
                        b24.setTextColor(Color.RED);
                    }

                }
                endGame();
            }
        });

        b25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b25.getText().toString().equals("")) {
                    if (turn == 1) {
                        turn = 2;
                        b25.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b25.setText("O");
                        b25.setTextColor(Color.RED);
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
            startActivity(new Intent(getApplicationContext(), FiveGridDoublePlayer.class));

        }
        return super.onOptionsItemSelected(item);
    }


    public void endGame() {
        String a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y;
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
        j = b10.getText().toString();
        k = b11.getText().toString();
        l = b12.getText().toString();
        m = b13.getText().toString();
        n = b14.getText().toString();
        o = b15.getText().toString();
        p = b16.getText().toString();
        q = b17.getText().toString();
        r = b18.getText().toString();
        s = b19.getText().toString();
        t = b20.getText().toString();
        u = b21.getText().toString();
        v = b22.getText().toString();
        w = b23.getText().toString();
        x = b24.getText().toString();
        y = b25.getText().toString();


        if (a.equals("X") && b.equals("X") && c.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (b.equals("X") && c.equals("X") && d.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }

        if (c.equals("X") && d.equals("X") && e.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (a.equals("X") && f.equals("X") && k.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (k.equals("X") && p.equals("X") && u.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (f.equals("X") && g.equals("X") && h.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (h.equals("X") && i.equals("X") && j.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (k.equals("X") && l.equals("X") && m.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (l.equals("X") && m.equals("X") && n.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (m.equals("X") && n.equals("X") && o.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (p.equals("X") && q.equals("X") && r.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (q.equals("X") && r.equals("X") && s.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (r.equals("X") && s.equals("X") && t.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (u.equals("X") && v.equals("X") && w.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (v.equals("X") && w.equals("X") && x.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (w.equals("X") && x.equals("X") && y.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (b.equals("X") && g.equals("X") && l.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (l.equals("X") && q.equals("X") && v.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (c.equals("X") && h.equals("X") && m.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (m.equals("X") && r.equals("X") && w.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (d.equals("X") && i.equals("X") && n.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (n.equals("X") && s.equals("X") && x.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (e.equals("X") && j.equals("X") && o.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (o.equals("X") && t.equals("X") && y.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (a.equals("X") && g.equals("X") && m.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (b.equals("X") && h.equals("X") && n.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (c.equals("X") && i.equals("X") && o.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (f.equals("X") && l.equals("X") && r.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (g.equals("X") && m.equals("X") && s.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (h.equals("X") && n.equals("X") && t.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (k.equals("X") && q.equals("X") && w.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (l.equals("X") && r.equals("X") && x.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (m.equals("X") && s.equals("X") && y.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (c.equals("X") && g.equals("X") && k.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (d.equals("X") && h.equals("X") && l.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (e.equals("X") && i.equals("X") && m.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (h.equals("X") && l.equals("X") && p.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (i.equals("X") && m.equals("X") && q.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (j.equals("X") && n.equals("X") && r.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (m.equals("X") && q.equals("X") && u.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (n.equals("X") && r.equals("X") && v.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }
        if (o.equals("X") && s.equals("X") && w.equals("X")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player X!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("SCORE", score);
            startActivity(intent);
        }

        //for o
        if (a.equals("O") && b.equals("O") && c.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (b.equals("O") && c.equals("O") && d.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }

        if (c.equals("O") && d.equals("O") && e.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (a.equals("O") && f.equals("X") && k.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (k.equals("O") && p.equals("O") && u.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (f.equals("O") && g.equals("O") && h.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (h.equals("O") && i.equals("O") && j.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (k.equals("O") && l.equals("O") && m.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (l.equals("O") && m.equals("O") && n.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (m.equals("O") && n.equals("O") && o.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (p.equals("O") && q.equals("O") && r.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (q.equals("O") && r.equals("O") && s.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (r.equals("O") && s.equals("O") && t.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (u.equals("O") && v.equals("O") && w.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (v.equals("O") && w.equals("O") && x.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (w.equals("O") && x.equals("O") && y.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (b.equals("O") && g.equals("O") && l.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (l.equals("O") && q.equals("O") && v.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (c.equals("O") && h.equals("O") && m.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (m.equals("O") && r.equals("O") && w.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (d.equals("O") && i.equals("O") && n.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (n.equals("O") && s.equals("O") && x.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (e.equals("O") && j.equals("O") && o.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (o.equals("O") && t.equals("O") && y.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (a.equals("O") && g.equals("O") && m.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (b.equals("O") && h.equals("O") && n.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (c.equals("O") && i.equals("O") && o.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (f.equals("O") && l.equals("O") && r.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (g.equals("O") && m.equals("O") && s.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (h.equals("O") && n.equals("O") && t.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (k.equals("O") && q.equals("O") && w.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (l.equals("O") && r.equals("O") && x.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (m.equals("O") && s.equals("O") && y.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (c.equals("O") && g.equals("O") && k.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (d.equals("O") && h.equals("O") && l.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (e.equals("O") && i.equals("O") && m.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
        }
        if (h.equals("O") && l.equals("O") && p.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (i.equals("O") && m.equals("O") && q.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (j.equals("O") && n.equals("O") && r.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (m.equals("O") && q.equals("O") && u.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (n.equals("O") && r.equals("O") && v.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player O!", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
            intent.putExtra("DOOR", score);
            startActivity(intent);
        }
        if (o.equals("O") && s.equals("O") && w.equals("O")) {
            Toast.makeText(FiveGridDoublePlayer.this, "Winner Player !O", Toast.LENGTH_LONG).show();
            end = true;
            score++;
            Intent intent = new Intent(getApplicationContext(), result2.class);
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
            b10.setEnabled(false);
            b11.setEnabled(false);
            b12.setEnabled(false);
            b13.setEnabled(false);
            b14.setEnabled(false);
            b15.setEnabled(false);
            b16.setEnabled(false);
            b17.setEnabled(false);
            b18.setEnabled(false);
            b19.setEnabled(false);
            b20.setEnabled(false);
            b21.setEnabled(false);
            b22.setEnabled(false);
            b23.setEnabled(false);
            b24.setEnabled(false);
            b25.setEnabled(false);

        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        startActivity(new Intent(getApplicationContext(), Start.class));


        return super.dispatchKeyEvent(event);
    }

}
