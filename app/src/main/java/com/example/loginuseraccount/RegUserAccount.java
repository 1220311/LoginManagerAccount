package com.example.loginuseraccount;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RegUserAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sub);

        Button returnButton = findViewById(R.id.return_button);

        // lambda式
        returnButton.setOnClickListener(v -> finish());
    }

}