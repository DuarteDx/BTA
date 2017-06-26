package com.junitec.bta;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.level;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_ENABLE_BT = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] level = {0};

        final TextView level_textview = (TextView) findViewById(R.id.level_textview);
        Button plus = (Button) findViewById(R.id.plus_button);
        Button minus = (Button) findViewById(R.id.minus_button);

        level_textview.setText(""+ level[0]);

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(level[0] <3) {
                    level[0]++;
                    level_textview.setText(""+ level[0]);
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(level[0] >0) {
                    level[0]--;
                    level_textview.setText(""+ level[0]);
                }
            }
        });

        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (mBluetoothAdapter == null) {
            // Device does not support Bluetooth
        }


        
    }
}
