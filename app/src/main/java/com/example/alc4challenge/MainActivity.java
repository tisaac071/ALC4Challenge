package com.example.alc4challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goToAbouALC(View view) {
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);
    }

    public void goToMyprofile(View view) {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
}
