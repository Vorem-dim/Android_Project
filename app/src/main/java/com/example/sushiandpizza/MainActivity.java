package com.example.sushiandpizza;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    ActivityResultLauncher<Intent> StartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if(result.getResultCode() == LogInActivity.RESULT_OK){
                        Intent intent = result.getData();
                        String str = intent.getStringExtra("message");
                        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();
                    }
                }
            });

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = (TextView)findViewById(R.id.Name_cafe);
        String str = getResources().getString(R.string.app_name);
        text.setText(str);

        ImageView image = (ImageView)findViewById(R.id.Pizza_main);
        Drawable draw = getResources().getDrawable(R.drawable.pizza_main_screen, getTheme());
        image.setImageDrawable(draw);

        image = (ImageView)findViewById(R.id.Sushi_main);
        draw = getResources().getDrawable(R.drawable.sushi_main_screen, getTheme());
        image.setImageDrawable(draw);

        Button profile = (Button)findViewById(R.id.Profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "The button \"Log in to your profile\" is pressed");
                onProfileClick(view);
            }
        });

        Button registration = (Button)findViewById(R.id.Registration);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "The button \"Registration\" is pressed");
            }
        });
    }

    public void onProfileClick(View view) {
        Intent intent = new Intent(this, LogInActivity.class);
        intent.putExtra("message", getResources().getString(R.string.profile_line));
        StartForResult.launch(intent);
    }

    public void onMenuClick(View view) {
        Log.i(TAG, "The button \"Open menu\" is pressed");
    }
}