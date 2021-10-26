package com.androidauthority.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int value1;
    int value2;

    TextView helloButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNewNumbers ();

        helloButton  = (TextView) findViewById(R.id.helloButton);
    }

    public void onSubmitClick (View view){
        TextView Answer = findViewById(R.id.Answer);
        EditText Attempt = findViewById(R.id.Attempt);
        int userAnswer = Integer.parseInt(Attempt.getText().toString());
        if(userAnswer == value1+value2) {
            Answer.setText("Correct!");
        } else {
            Answer.setText("Wrong Answer! The correct answer is: " + (value1+value2));
        }
        setNewNumbers ();
    }

    private void setNewNumbers () {
        Random r = new Random();
        value1 = r.nextInt(999);
        value2 = r.nextInt(999);
        TextView Number1 = findViewById(R.id.Number1);
        Number1.setText("" + value1);
        TextView Number = findViewById(R.id.Number);
        Number.setText("" + value2);
        EditText Attempt = findViewById(R.id.Attempt);
        Attempt.setText("");
    }
    public void onHelloButtonClick (View v) {
        helloButton.setText("Star Platinum! ZA WARLD");
    }
}
