package com.example.dicegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         cpuDice = findViewById(R.id.computerDice);
         playerDice = findViewById(R.id.gamerDice);

         buttonLower = findViewById(R.id.lowerButton);
         buttonHigher = findViewById(R.id.higherButton);

         textViewResult = findViewById(R.id.resultText);buttonLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandom();
                if (cpuRandom < playerRandom) {
                    textViewResult.setText("Computer Win!");
                } else if (cpuRandom > playerRandom) {
                    textViewResult.setText("Player Win!");
                } else {
                    textViewResult.setText("It's a Tie");
                }
            }
        });
        buttonHigher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generateRandom();
                if (cpuRandom > playerRandom) {
                    textViewResult.setText("Computer Win!");
                } else if (cpuRandom < playerRandom) {
                    textViewResult.setText("Player Win!");
                } else {
                    textViewResult.setText("It's a Tie");
                }
            }
        });
    }

    private void generateRandom() {
        cpuRandom = random.nextInt(6) + 1;
        playerRandom = random.nextInt(6) + 1;
        rollDice(cpuRandom, playerRandom);
    }

    private void rollDice(int cpuRandom, int playerRandom) {
        char dice1 = (char) (cpuRandom + '0');
        char dice2 = (char) (playerRandom + '0');
        switch (dice1) {
            case '1':
                cpuDice.setImageResource(R.drawable.dice1);
                break;
            case '2':
                cpuDice.setImageResource(R.drawable.dice2);
                break;
            case '3':
                cpuDice.setImageResource(R.drawable.dice3);
                break;
            case '4':
                cpuDice.setImageResource(R.drawable.dice4);
                break;
            case '5':
                cpuDice.setImageResource(R.drawable.dice5);
                break;
            case '6':
                cpuDice.setImageResource(R.drawable.dice6);
                break;
            default:
        }
        switch (dice2) {
            case '1':
                playerDice.setImageResource(R.drawable.dice1);
                break;
            case '2':
                playerDice.setImageResource(R.drawable.dice2);
                break;
            case '3':
                playerDice.setImageResource(R.drawable.dice3);
                break;
            case '4':
                playerDice.setImageResource(R.drawable.dice4);
                break;
            case '5':
                playerDice.setImageResource(R.drawable.dice5);
                break;
            case '6':
                playerDice.setImageResource(R.drawable.dice6);
                break;
            default:
        }
    }
}