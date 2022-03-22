package com.foysaldev.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        first = findViewById(R.id.First);
        second = findViewById(R.id.second);

        Handler handler = new Handler();

        first.setOnClickListener(handler);
        second.setOnClickListener(handler);
    }

    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.First) {
               textView.setText("first button is clicked");
            } else if (view.getId() == R.id.second) {
                textView.setText("second button is clicked");
            }
        }
    }
}