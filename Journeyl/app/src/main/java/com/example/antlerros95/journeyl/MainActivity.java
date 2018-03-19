package com.example.antlerros95.journeyl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button addGoalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addGoalButton = findViewById(R.id.buttonAddGoal);

        addGoalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CreateGoalActivity.class));
            }
        });

        ListView goalList = findViewById(R.id.list_goals);
        GoalListAdapter goalListAdapter = new GoalListAdapter(this, getGoals());
        goalList.setAdapter(goalListAdapter);

        goalList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?>adapter, View v, int position, long id){
                Goal goal = (Goal) adapter.getItemAtPosition(position);

                Intent intent = new Intent(MainActivity.this, RoadmapActivity.class);
                //based on item add info to intent
                intent.putExtra("goalName", goal.getName());
                startActivity(intent);
            }
        });

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    ArrayList<Goal> getGoals() {

//        TODO: get goals from database
        return new ArrayList<Goal>();
    }
}
