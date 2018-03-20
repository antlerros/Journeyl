package com.example.antlerros95.journeyl;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by antlerros95 on 19/03/2018.
 */

public class MilestoneContentFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public MilestoneContentFragment() {}

    public static MilestoneContentFragment newInstance(int page) {
        MilestoneContentFragment fragment = new MilestoneContentFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        int page = getArguments().getInt(ARG_PAGE_NUMBER, 0);

        ViewGroup rootView;

        if (page == 0) {
            MilestoneListAdapter listAdapter;
            rootView = (ViewGroup) inflater.inflate(R.layout.fragment_milestone_list,
                    container, false);
            ListView listView = rootView.findViewById(R.id.milestonesList);
            listView.setAdapter(new MilestoneListAdapter(getActivity(), getMilestones()));

        } else {
            rootView = (ViewGroup) inflater.inflate(R.layout.fragment_create_milestone,
                    container, false);

        }
        return rootView;
    }


        ArrayList<Milestone> getMilestones() {

        // TODO: Get suggested milestones
        return new ArrayList<Milestone>();
    }

}
