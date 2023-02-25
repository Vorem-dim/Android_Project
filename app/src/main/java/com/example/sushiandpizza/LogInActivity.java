package com.example.sushiandpizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        TextView text = (TextView)findViewById(R.id.Name_LogIn);
        String str = getResources().getString(R.string.app_name);
        text.setText(str);

        ImageView image = (ImageView)findViewById(R.id.Pizza_LogIn);
        Drawable draw = getResources().getDrawable(R.drawable.pizza_main_screen);
        image.setImageDrawable(draw);

        image = (ImageView)findViewById(R.id.Sushi_LogIn);
        draw = getResources().getDrawable(R.drawable.sushi_main_screen);
        image.setImageDrawable(draw);

        Bundle arguments = getIntent().getExtras();
        str = arguments.get("message").toString();
        text = (TextView)findViewById(R.id.message);
        text.setText(str);

        Button button = (Button)findViewById(R.id.LogIn_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("message", "You are logged in to your profile");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}