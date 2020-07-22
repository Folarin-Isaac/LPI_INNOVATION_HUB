package com.example.lpi_innovation_hub.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.lpi_innovation_hub.R;

public class MainActivity extends AppCompatActivity {
   private Toolbar toolbar;
   ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //appBar to be displayed when activity is opened
        toolbar = (Toolbar)findViewById(R.id.app_bar);
        imageView= findViewById(R.id.image);
        setSupportActionBar(toolbar);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Members.class);
                startActivity(intent);
            }
        });

    }
}
