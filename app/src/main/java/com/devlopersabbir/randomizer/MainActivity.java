package com.devlopersabbir.randomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    TextView countElement;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // output
        countElement = findViewById(R.id.count);
        Button inc = findViewById(R.id.inc);
        Button dec = findViewById(R.id.dec);
        Button reset = findViewById(R.id.reset);


       inc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               countAmount(count += 1);
           }
       });

       dec.setOnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View view) {
               countAmount(count -= 1);
           }
       });

       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               countAmount(0);
           }
       });

    }

    public void countAmount(int count) {
        if(count == 0){
            countElement.setText("0");
        }else {
            countElement.setText(String.valueOf(count));
        }
    }
}