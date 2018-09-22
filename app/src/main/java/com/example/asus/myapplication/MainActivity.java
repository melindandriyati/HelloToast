package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnToast, btnCount;
    private TextView tvCount;

    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToast = findViewById(R.id.button_toast);
        btnCount = findViewById(R.id.button_count);
        tvCount = findViewById(R.id.show_count);

        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Test", Toast.LENGTH_SHORT);

                mCount = 0;
                tvCount.setText(Integer.toString(mCount));
            }
        });

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               mCount++;
               if(tvCount != null){
                   tvCount.setText(Integer.toString(mCount));
               }
            }
        });
    }
}
