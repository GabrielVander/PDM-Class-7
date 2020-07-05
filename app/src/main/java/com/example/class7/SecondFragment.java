package com.example.class7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btnCalculateAverage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double firstGrade = Double.valueOf(
                        String.valueOf(
                                ((EditText) view.findViewById(R.id.inputFirstGrade)).getText()
                        )
                );
                Double secondGrade = Double.valueOf(
                        String.valueOf(
                                ((EditText) view.findViewById(R.id.inputSecondGrade)).getText()
                        )
                );

                final double average = (firstGrade + secondGrade) / 2;
                ((EditText) view.findViewById(R.id.inputAverage)).setText(String.valueOf(average));
            }
        });
    }
}