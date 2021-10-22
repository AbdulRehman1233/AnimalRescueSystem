package com.example.animalrescuesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class animalshelterpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalshelterpage);
    }

    public void sendMessagesignup(View view) {
        Intent intent = new Intent(animalshelterpage.this, signup_animalshelter.class);
        startActivity(intent);
    }


    public void sendMessagelogin(View view) {
        Intent intent = new Intent(animalshelterpage.this, login_animalshelter.class);
        startActivity(intent);
    }
}