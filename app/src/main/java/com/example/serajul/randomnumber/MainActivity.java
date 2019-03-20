package com.example.serajul.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText number;
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand=new Random();
        randomNumber=rand.nextInt(21);
    }

    public void winnerCheack(View view) {

        number = findViewById(R.id.inputNumberId);
        int userInput = Integer.parseInt(number.getText().toString());

        if (userInput>=20){
            Toast.makeText(this, "Please Enter Less Than 20", Toast.LENGTH_SHORT).show();
        }
        if (userInput>randomNumber){
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }

        else if (userInput<randomNumber){
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "Congrates!!You are winner", Toast.LENGTH_SHORT).show();
        }
    }
}
