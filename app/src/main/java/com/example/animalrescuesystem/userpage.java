package com.example.animalrescuesystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class userpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userpage);
    }

    public void sendMessageusersignup(View view) {
        Intent intent = new Intent(userpage.this, signupuser.class);
        startActivity(intent);
    }


    public void sendMessageuserlogin(View view) {
        Intent intent = new Intent(userpage.this, login_user.class);
        startActivity(intent);
    }
}
