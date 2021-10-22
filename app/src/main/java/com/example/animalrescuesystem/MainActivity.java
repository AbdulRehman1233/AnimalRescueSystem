package com.example.animalrescuesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;




public class MainActivity extends AppCompatActivity {

    //ImageButton iButton = (ImageButton) findViewById(R.id.imageButton);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //iButton.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v) {
                //Intent intent = new Intent(MainActivity.this, animalshelterpage.class);
                //startActivity(intent);
            //}
        //});

    }

    public void sendMessage1(View view) {
        Intent intent = new Intent(MainActivity.this, animalshelterpage.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        Intent intent = new Intent(MainActivity.this, volunteerpage.class);
        startActivity(intent);
    }

    public void sendMessage3(View view) {
        Intent intent = new Intent(MainActivity.this, userpage.class);
        startActivity(intent);
    }

    public void sendMessageadminlogin(View view) {
        Intent intent = new Intent(MainActivity.this, admin_login.class);
        startActivity(intent);
    }
}