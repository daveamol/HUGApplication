package com.example.amoldave.hugdemoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentDemo1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo1);
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Intent intent = getIntent();
        String extraData = intent.getStringExtra(Intent.EXTRA_TEXT);

        TextView textView = (TextView) findViewById(R.id.intent_1_text);
        textView.setText(extraData);
    }
}
