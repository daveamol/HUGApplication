package com.example.amoldave.hugdemoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_demo);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        TextView stringResourceView = (TextView) findViewById(R.id.stringResource);
        stringResourceView.setText(R.string.demo_string);
    }
}
