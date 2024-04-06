package com.example.theroos.firebasenotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(MainActivity.this);


        FirebaseMessaging.getInstance().subscribeToTopic("all");

        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
    }
}