package com.example.seminar1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activitatea2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitatea2);

        Button button = findViewById(R.id.butonDeschideAc3);

        button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(Activitatea2.this, Activitate3.class);

                    intent.putExtra("message", "second activity");
                    intent.putExtra("value1", 10);
                    intent.putExtra("value2", 20);

                    startActivityForResult(intent,1);
                }
            });
        }

        @Override
        protected void onActivityResult(int requestCode, int resultCode, Intent data){
            super.onActivityResult(requestCode, resultCode, data);
            if(requestCode == 1 & resultCode == RESULT_OK)
            {
                String responseMessage = data.getStringExtra("responseMessage");
                int sum = data.getIntExtra("sum", 0);

                Toast.makeText(this, responseMessage + "Sum: " + sum, Toast.LENGTH_LONG).show();
            }
        }
    }