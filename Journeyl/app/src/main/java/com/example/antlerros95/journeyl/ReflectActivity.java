package com.example.antlerros95.journeyl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class ReflectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);

        ExpandableTextView descriptionExpandable = (ExpandableTextView) findViewById(R.id.expand_text_view);

        descriptionExpandable.setText("Some description");
    }
}
