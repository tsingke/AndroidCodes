package com.example.lifecycle;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.content.ContentValues.TAG;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate: 方法被执行");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.i(TAG, "onStart: 方法被调用");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.i(TAG, "onResume: 方法被调用");
    }

    //---------------------------------------------------

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.i(TAG, "onRestart: 方法被执行");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.i(TAG, "onPause: 方法被执行");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.i(TAG, "onStop: 方法被调用");

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 方法被调用");
    }
}
