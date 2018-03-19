package com.example.antlerros95.journeyl;

import android.content.Context;
import android.database.DataSetObserver;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by antlerros95 on 19/03/2018.
 */

public class GoalListAdapter extends ArrayAdapter<Goal> implements android.widget.ListAdapter {

    private ArrayList<Goal> mGoalList;

    public GoalListAdapter(Context context, ArrayList<Goal> goals) {
        super(context, 0, goals);
        this.mGoalList = goals;
    }

//    @Override
//    public boolean areAllItemsEnabled() {
//        return false;
//    }
//
//    @Override
//    public boolean isEnabled(int i) {
//        return false;
//    }
//
//    @Override
//    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
//
//    }
//
//    @Override
//    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
//
//    }

    @Override
    public int getCount() {
        return mGoalList.size();
    }

    @Override
    public Goal getItem(int i) {
        return mGoalList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

//    @Override
//    public boolean hasStableIds() {
//        return false;
//    }

    @Override
    public View getView(int i, View convertView, @NonNull ViewGroup parent) {
        RecyclerView.ViewHolder viewHolder;
        View v = convertView;

        Goal goal = mGoalList.get(i);
        if (v == null) {
            v = LayoutInflater.from(getContext()).inflate(R.layout.item_goal, parent, false);
        }
        TextView textView = v.findViewById(R.id.goal_name);
        textView.setText(goal.getName());
        return v;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return mGoalList.size() == 0;
    }
}
