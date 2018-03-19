package com.example.antlerros95.journeyl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateGoalActivity extends AppCompatActivity {
    private Button saveButton;
    private EditText goalEditText;
    private EditText descriptionEditText;
    // TODO: tags???

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_goal);

        saveButton = findViewById(R.id.saveGoalButton);
        goalEditText = findViewById(R.id.enterGoal);
        descriptionEditText = findViewById(R.id.enterDescription);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (goalEditText.getText().toString().isEmpty()) {
                    Toast.makeText(CreateGoalActivity.this, "Please enter your goal", Toast.LENGTH_SHORT).show();
                }
//                if (descriptionEditText.getText().toString().isEmpty()) {
//                    Toast.makeText(CreateGoalActivity.this, "Please enter description for  your goal", Toast.LENGTH_SHORT).show();
//
//                }
                /* TODO: Save goal to database? */

                Intent intent = new Intent(CreateGoalActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
