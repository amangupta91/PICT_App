package com.application.pict_app.App;

import com.application.pict_app.App.View.Retrofit.RetrofitView;
import com.application.pict_app.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button_1,button_2,button_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiliazation();
        generateEvents();
    }

    private void generateEvents() {
        button_1.setOnClickListener(MainActivity.this);
        button_2.setOnClickListener(MainActivity.this);
        button_3.setOnClickListener(MainActivity.this);
    }

    private void initiliazation() {
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button_1:
                Intent intent1 = new Intent(MainActivity.this, RetrofitView.class);
                startActivity(intent1);
                break;
        }
    }
}