package com.example.buylist_main;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void main_addClick(View view) {
        Intent add_intent = new Intent(this, activity_addList.class);
        startActivity(add_intent);
    }
}