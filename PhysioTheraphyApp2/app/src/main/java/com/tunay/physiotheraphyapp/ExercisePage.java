package com.tunay.physiotheraphyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.tunay.physiotheraphyapp.databinding.ActivityExercisePageBinding;

import java.util.ArrayList;


public class ExercisePage extends AppCompatActivity {

    private ActivityExercisePageBinding binding;
    DBHelper DB;
    ArrayList<Exercise> exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExercisePageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        DB = new DBHelper(this);
        Intent intent = getIntent();
        int menuID = intent.getIntExtra("menuID",0);
        int position =intent.getIntExtra("position",0);

        System.out.println("Menu Id: "+menuID+" position: "+position);

        if(menuID==1){
           exercises= DB.get_data_exercise("boyun",position+1);
           binding.textView2.setText(exercises.get(0).text);
           binding.imageView2.setImageBitmap(exercises.get(0).image);
           binding.textView3.setText("Not: Egzersizlerin 10 ar tekrarlı sabah ve akşam olmak üzere günde 2 defa yapılması önerilir");
        }
        if(menuID==2){
            exercises= DB.get_data_exercise("omuz",position+1);
            binding.textView2.setText(exercises.get(0).text);
            binding.imageView2.setImageBitmap(exercises.get(0).image);
            binding.textView3.setText("Not: Egzersizlerin 10 ar tekrarlı sabah ve akşam olmak üzere günde 2 defa yapılması önerilir");
        }
        if(menuID==3){
            exercises= DB.get_data_exercise("bel",position+1);
            binding.textView2.setText(exercises.get(0).text);
            binding.imageView2.setImageBitmap(exercises.get(0).image);
            binding.textView3.setText("Not: Egzersizlerin 10 ar tekrarlı sabah ve akşam olmak üzere günde 2 defa yapılması önerilir");
        }
        if(menuID==4){
            exercises= DB.get_data_exercise("kalca",position+1);
            binding.textView2.setText(exercises.get(0).text);
            binding.imageView2.setImageBitmap(exercises.get(0).image);
            binding.textView3.setText("Not: Egzersizlerin 10 ar tekrarlı sabah ve akşam olmak üzere günde 2 defa yapılması önerilir");
        }
        if(menuID==5){
            exercises= DB.get_data_exercise("diz",position+1);
            binding.textView2.setText(exercises.get(0).text);
            binding.imageView2.setImageBitmap(exercises.get(0).image);
            binding.textView3.setText("Not: Egzersizlerin 10 ar tekrarlı sabah ve akşam olmak üzere günde 2 defa yapılması önerilir");
        }
        if(menuID==6){
            exercises= DB.get_data_exercise("ayak",position+1);
            binding.textView2.setText(exercises.get(0).text);
            binding.imageView2.setImageBitmap(exercises.get(0).image);
            binding.textView3.setText("Not: Egzersizleri her sabah ve her akşam uygulayın");
        }






    }
}