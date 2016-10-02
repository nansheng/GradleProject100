package com.udacity.gradle.androidjokes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokesFragment extends Fragment {

    public JokesFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_jokes, container, false);

        if (savedInstanceState == null) {
            String joke = getActivity().getIntent().getStringExtra("joke");
            TextView jokeText = (TextView) rootView.findViewById(R.id.jokeTextView);
            jokeText.setText(joke);
        }

        return rootView;
    }

}
