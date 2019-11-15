package com.vks.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static com.vks.dicee.R.*;
import static com.vks.dicee.R.id.rollButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);





        Button rollButton = (Button) findViewById(id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(id.image_leftDice);
        final ImageView rightDice = (ImageView) findViewById(id.image_rightDice);

        final int[] diceArray = new int[]{drawable.dice1,
                drawable.dice2,
                drawable.dice3,
                drawable.dice4,
                drawable.dice5,
                drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Dicee", "The button has been pressed.");

                Random randomNumGenerator = new Random();

                int randomNumber1 = randomNumGenerator.nextInt(6);
                int randomNumber2 = randomNumGenerator.nextInt(6);

                Log.d("Dicee", "The random number1 is " +randomNumber1);
                Log.d("Dicee", "The random number2 is " +randomNumber2);

                leftDice.setImageResource(diceArray[randomNumber1]);
                rightDice.setImageResource(diceArray[randomNumber2]);

            }
        });
    }
}
