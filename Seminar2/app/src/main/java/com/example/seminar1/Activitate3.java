package com.example.seminar1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activitate3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_activitate3);

        Intent intent = getIntent();

        String message = intent.getStringExtra("message");

        int value1 = intent.getIntExtra("value1", 0);
        int value2 = intent.getIntExtra("value2", 0);

        Toast.makeText(this, message + " " + value1  + " " + value2, Toast.LENGTH_LONG).show();

        Button button = findViewById(R.id.sendBack);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent returnIntent = new Intent();

                returnIntent.putExtra("responseMessage","data revcieved");
                returnIntent.putExtra("sum", value1+value2);

                setResult(RESULT_OK, returnIntent);
                finish();
            }
        });

    }
}