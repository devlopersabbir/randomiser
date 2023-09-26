package com.devlopersabbir.randomizer;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // output
        TextView countElement = findViewById(R.id.count);
        Button inc = findViewById(R.id.inc);
        Button dec = findViewById(R.id.dec);
        Button reset = findViewById(R.id.reset);


       inc.setOnClickListener(new View.OnClickListener() {
           int count = Integer.parseInt(countElement.getText().toString());
           @Override
           public void onClick(View view) {
               countAmount(count += 1);
           }

           public void countAmount(int count) {
               if(count == 0){
                   countElement.setText("0");
               }else {
                   countElement.setText(String.valueOf(count));
               }
           }

       });

       dec.setOnClickListener(new View.OnClickListener() {

           int count = Integer.parseInt(countElement.getText().toString());
           @Override
           public void onClick(View view) {
               countAmount(count -= 1);
           }

           public void countAmount(int count) {
               if(count == 0){
                   countElement.setText("0");
               }else {
                   countElement.setText(String.valueOf(count));
               }
           }
       });

       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               countElement.setText("0");
           }
       });

    }
}