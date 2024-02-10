package com.tunay.physiotheraphyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tunay.physiotheraphyapp.databinding.ActivityExerciseSequenceBinding;
import com.tunay.physiotheraphyapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class ExerciseSequence extends AppCompatActivity {

    private ActivityExerciseSequenceBinding binding;
    private ArrayList<String> Egzersizleriİsimleri;

    ExerciseSequenceAdapter exerciseSequenceAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExerciseSequenceBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        int menuID = intent.getIntExtra("menuID",0);
        System.out.println("yazıyor: "+menuID);

        if(menuID == 1){
            Egzersizleriİsimleri = new ArrayList<String>();
            Egzersizleriİsimleri.add("Boyun Egzersizi 1");
            Egzersizleriİsimleri.add("Boyun Egzersizi 2");
            Egzersizleriİsimleri.add("Boyun Egzersizi 3");
            Egzersizleriİsimleri.add("Boyun Egzersizi 4");
            Egzersizleriİsimleri.add("Boyun Egzersizi 5");
            Egzersizleriİsimleri.add("Boyun Egzersizi 6");
            Egzersizleriİsimleri.add("Boyun Egzersizi 7");
            binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
            exerciseSequenceAdapter = new ExerciseSequenceAdapter(Egzersizleriİsimleri,1);
            binding.RecyclerView.setAdapter(exerciseSequenceAdapter);

        }
        if(menuID == 2){
            Egzersizleriİsimleri = new ArrayList<String>();
            Egzersizleriİsimleri.add("Omuz Egzersizi 1");
            Egzersizleriİsimleri.add("Omuz Egzersizi 2");
            Egzersizleriİsimleri.add("Omuz Egzersizi 3");
            Egzersizleriİsimleri.add("Omuz Egzersizi 4");
            Egzersizleriİsimleri.add("Omuz Egzersizi 5");
            Egzersizleriİsimleri.add("Omuz Egzersizi 6");
            Egzersizleriİsimleri.add("Omuz Egzersizi 7");
            Egzersizleriİsimleri.add("Omuz Egzersizi 8");
            Egzersizleriİsimleri.add("Omuz Egzersizi 9");
            Egzersizleriİsimleri.add("Omuz Egzersizi 10");
            Egzersizleriİsimleri.add("Omuz Egzersizi 11");
            Egzersizleriİsimleri.add("Omuz Egzersizi 12");
            binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
            exerciseSequenceAdapter = new ExerciseSequenceAdapter(Egzersizleriİsimleri,2);
            binding.RecyclerView.setAdapter(exerciseSequenceAdapter);

        }
        if(menuID == 3){
            Egzersizleriİsimleri = new ArrayList<String>();
            Egzersizleriİsimleri.add("Bel Egzersizi 1");
            Egzersizleriİsimleri.add("Bel Egzersizi 2");
            Egzersizleriİsimleri.add("Bel Egzersizi 3");
            Egzersizleriİsimleri.add("Bel Egzersizi 4");
            Egzersizleriİsimleri.add("Bel Egzersizi 5");
            Egzersizleriİsimleri.add("Bel Egzersizi 6");
            Egzersizleriİsimleri.add("Bel Egzersizi 7");
            binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
            exerciseSequenceAdapter = new ExerciseSequenceAdapter(Egzersizleriİsimleri,3);
            binding.RecyclerView.setAdapter(exerciseSequenceAdapter);

        }

        if(menuID == 4){
            Egzersizleriİsimleri = new ArrayList<String>();
            Egzersizleriİsimleri.add("Kalça Egzersizi 1");
            Egzersizleriİsimleri.add("Kalça Egzersizi 2");
            Egzersizleriİsimleri.add("Kalça Egzersizi 3");
            Egzersizleriİsimleri.add("Kalça Egzersizi 4");
            Egzersizleriİsimleri.add("Kalça Egzersizi 5");
            Egzersizleriİsimleri.add("Kalça Egzersizi 6");
            binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
            exerciseSequenceAdapter = new ExerciseSequenceAdapter(Egzersizleriİsimleri,4);
            binding.RecyclerView.setAdapter(exerciseSequenceAdapter);
        }

        if(menuID == 5){
            Egzersizleriİsimleri = new ArrayList<String>();
            Egzersizleriİsimleri.add("Diz Egzersizi 1");
            Egzersizleriİsimleri.add("Diz Egzersizi 2");
            Egzersizleriİsimleri.add("Diz Egzersizi 3");
            Egzersizleriİsimleri.add("Diz Egzersizi 4");
            Egzersizleriİsimleri.add("Diz Egzersizi 5");
            binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
            exerciseSequenceAdapter = new ExerciseSequenceAdapter(Egzersizleriİsimleri,5);
            binding.RecyclerView.setAdapter(exerciseSequenceAdapter);
        }

        if(menuID == 6){
            Egzersizleriİsimleri = new ArrayList<String>();
            Egzersizleriİsimleri.add("Topuk Dikeni Egzersizi 1");
            Egzersizleriİsimleri.add("Topuk Dikeni Egzersizi 2");
            Egzersizleriİsimleri.add("Topuk Dikeni Egzersizi 3");
            binding.RecyclerView.setLayoutManager(new LinearLayoutManager(this));
            exerciseSequenceAdapter = new ExerciseSequenceAdapter(Egzersizleriİsimleri,6);
            binding.RecyclerView.setAdapter(exerciseSequenceAdapter);
        }



    }
}