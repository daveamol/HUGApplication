package com.example.amoldave.hugdemoapplication;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startAssetsActivity(View view)
    {
        Intent intent = new Intent(this,AssetsDemoActivity.class);
        startActivity(intent);
    }

    public void startResActivity(View view)
    {
        Intent intent = new Intent(this,ResDemoActivity.class);
        startActivity(intent);
    }

    public void startStyleActivity(View view)
    {
        Intent intent = new Intent(this,StyleThemeActivity.class);
        startActivity(intent);
    }

    public void startIntent1Activity(View view)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.addCategory(Intent.CATEGORY_DEFAULT);
        //This is just key value pairs but for send action use Intent.EXTRA_TEXT
        intent.putExtra(Intent.EXTRA_TEXT, "HUG Intent message");
        intent.setType("text/plain");
        startActivity(intent);
    }

    public void startBroadcastActivity(View view)
    {
        Intent intent = new Intent(this,BroadcastReceiverActivity.class);
        startActivity(intent);
    }
}
