package com.junitec.bta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.level;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final TextView level_textview = (TextView) findViewById(R.id.level_textview);
        Button plus = (Button) findViewById(R.id.plus_button);
        Button minus = (Button) findViewById(R.id.minus_button);

        level_textview.setText(level);

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                level_textview.setText("1");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                level_textview.setText("3");
            }
        });*/
    }
}
