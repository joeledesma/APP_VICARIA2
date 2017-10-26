package com.example.faustino.app_vicaria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import static com.example.faustino.app_vicaria.MainActivity.Information;
import static com.example.faustino.app_vicaria.RecyclerAdapter.FEED_URL;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informatiolayout);
        String name = getIntent().getStringExtra(FEED_URL);
        if (name == null) {
            name = getIntent().getStringExtra(Information);
        }
        TextView textView = (TextView) findViewById(R.id.imageName);
        textView.setText(name);

    }
}
