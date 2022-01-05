package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.test.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        //Blind up code to be sent to Arduino
        Button blindUpBtn = findViewById(R.id.blindUpBtnHome);
        blindUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blindUpBtn.setText("Clicked");
            }
        });

        //Blind down code to be sent to Arduino
        Button blindDownBtn = findViewById(R.id.blindDownBtnHome);
        blindDownBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blindDownBtn.setText("Clicked");
            }
        });

        //LED on code to be sent to Arduino
        Button ledOnBtn = findViewById(R.id.ledBtnOnHome);
        ledOnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ledOnBtn.setText("Clicked");
            }
        });

        //LED off code to be sent to Arduino
        Button ledOffBtn = findViewById(R.id.ledBtnOffHome);
        ledOffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ledOffBtn.setText("Clicked");
            }
        });

        //window clear code to be sent to Arduino
        Button windowOnBtn = findViewById(R.id.windowOpacityBtnOnHome);
        windowOnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                windowOnBtn.setText("Clicked");
            }
        });

        //window opaque code to be sent to Arduino
        Button windowOffBtn = findViewById(R.id.windowOpacityBtnOffHome);
        windowOffBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                windowOffBtn.setText("Clicked");
            }
        });

        //This is a new test


    }

}