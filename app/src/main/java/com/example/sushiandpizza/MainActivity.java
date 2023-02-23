package com.example.sushiandpizza;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onCreate");
        Log.w(TAG, "warning in onCreate");
        Log.i(TAG, "info in onCreate");
        Log.d(TAG, "degub in onCreate");
        Log.v(TAG, "verbose in onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onStart");
        Log.w(TAG, "warning in onStart");
        Log.i(TAG, "info in onStart");
        Log.d(TAG, "degub in onStart");
        Log.v(TAG, "verbose in onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onStop");
        Log.w(TAG, "warning in onStop");
        Log.i(TAG, "info in onStop");
        Log.d(TAG, "degub in onStop");
        Log.v(TAG, "verbose in onStop");
        if (isFinishing())
            finish();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onDestroy");
        Log.w(TAG, "warning in onDestroy");
        Log.i(TAG, "info in onDestroy");
        Log.d(TAG, "degub in onDestroy");
        Log.v(TAG, "verbose in onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onPause");
        Log.w(TAG, "warning in onPause");
        Log.i(TAG, "info in onPause");
        Log.d(TAG, "degub in onPause");
        Log.v(TAG, "verbose in onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onResume");
        Log.w(TAG, "warning in onResume");
        Log.i(TAG, "info in onResume");
        Log.d(TAG, "degub in onResume");
        Log.v(TAG, "verbose in onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
        Log.e(TAG, "error in onRestart");
        Log.w(TAG, "warning in onRestart");
        Log.i(TAG, "info in onRestart");
        Log.d(TAG, "degub in onRestart");
        Log.v(TAG, "verbose in onRestart");
    }
}