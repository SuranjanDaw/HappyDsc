package com.example.suranjan.happydsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change(View view) {
        if(count % 2 == 0)
        {
            TextView t = findViewById(R.id.text);
            ImageView i = findViewById(R.id.image);
            i.setImageResource(R.drawable.yay);
            t.setText("Now I am a Developper");
        }
        else
        {
            TextView t = new TextView(this);
            t.setId(R.id.text);
            ImageView i = findViewById(R.id.image);
            i.setImageResource(R.drawable.noob1);
            t.setText("Now I am a noob Developper");
        }
        count++;

    }
}
