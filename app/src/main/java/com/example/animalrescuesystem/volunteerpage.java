package com.example.animalrescuesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class volunteerpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteerpage);
    }


    public void sendMessagesignupvol(View view) {
        Intent intent = new Intent(volunteerpage.this, signup_volunteer.class);
        startActivity(intent);
    }



    public void sendMessageloginvol(View view) {
        Intent intent = new Intent(volunteerpage.this, login_volunteer.class);
        startActivity(intent);
    }
}