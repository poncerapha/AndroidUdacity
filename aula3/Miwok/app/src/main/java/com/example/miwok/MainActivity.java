package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbersTextView = findViewById(R.id.numbers);
        TextView phrasesTextView = findViewById(R.id.phrases);
        TextView familyTextView = findViewById(R.id.family);
        TextView colorsTextView = findViewById(R.id.colors);


        numbersClickListener(numbersTextView);
        phrasesClickListener(phrasesTextView);
        familyClickListener(familyTextView);
        colorsClickListener(colorsTextView);

    }

    public void openNumbersList(View view) {
        Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
        startActivity(intent);
    }

    public void openPhrasesList(View view){
        Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
        startActivity(intent);
    }

    public void openFamilyList(View view){
        Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
        startActivity(intent);
    }

    public void openColorsList(View view){
        Intent intent = new Intent(MainActivity.this, ColorsActivity.class);
        startActivity(intent);
    }

    private void numbersClickListener(TextView numbersTextView) {
        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumbersList(v);
            }
        });
    }

    private void phrasesClickListener(TextView phrasesTextView) {
        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPhrasesList(v);
            }
        });
    }

    private void familyClickListener(TextView familyTextView) {
        familyTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFamilyList(v);
            }
        });
    }

    private void colorsClickListener(TextView colorsTextView) {
        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openColorsList(v);
            }
        });
    }
}
