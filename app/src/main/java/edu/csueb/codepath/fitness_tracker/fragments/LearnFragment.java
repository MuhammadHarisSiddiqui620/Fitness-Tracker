package edu.csueb.codepath.fitness_tracker.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.csueb.codepath.fitness_tracker.R;
import edu.csueb.codepath.fitness_tracker.WorkoutListAdapter;
import edu.csueb.codepath.fitness_tracker.adapters.LearnListAdapter;
import edu.csueb.codepath.fitness_tracker.workout_timer;

public class LearnFragment extends Fragment {

    ListView listView;
    RecyclerView rvLearningWorkout;
    CardView cardView;
    LearnListAdapter learnListAdapter;

    public LearnFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_learn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Collection collection;
        Map<String, String> categories = new HashMap<>();
        // Add entries to the map
        categories.put("push-ups.json", "Push Ups");
        categories.put("split-jump-exercise.json", "Split Jump");
        categories.put("jumping-squats.json", "Jumping Squats");
        categories.put("squats.json", "Squats");
        categories.put("jumping-jack.json", "Jumping Jacks");


        rvLearningWorkout = (RecyclerView) view.findViewById(R.id.rvLearnWorkout);
        cardView = (CardView) view.findViewById(R.id.card_learn_item);

        rvLearningWorkout.setLayoutManager(new LinearLayoutManager(getContext()));
        learnListAdapter = new LearnListAdapter(this.getContext(), categories);
        rvLearningWorkout.setAdapter(learnListAdapter);

    }
}

