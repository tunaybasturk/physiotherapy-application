package com.tunay.physiotheraphyapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tunay.physiotheraphyapp.databinding.RecyclerRow2Binding;
import com.tunay.physiotheraphyapp.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class ExerciseSequenceAdapter extends RecyclerView.Adapter<ExerciseSequenceAdapter.ExerciseSquenceHolder>{
    ArrayList<String> ExerciseSequenceList;
    int menuID;

    public ExerciseSequenceAdapter(ArrayList<String> exerciseSequenceList, int menuID) {
        ExerciseSequenceList = exerciseSequenceList;
        this.menuID = menuID;
    }

    public ExerciseSequenceAdapter(ArrayList<String> exerciseSequenceList) {
        ExerciseSequenceList = exerciseSequenceList;

    }


    @NonNull
    @Override
    public ExerciseSequenceAdapter.ExerciseSquenceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRow2Binding recylerRowBinding = RecyclerRow2Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ExerciseSequenceAdapter.ExerciseSquenceHolder(recylerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseSequenceAdapter.ExerciseSquenceHolder holder, int position) {
        holder.binding.textView.setText(ExerciseSequenceList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),ExercisePage.class);
                intent.putExtra("menuID",menuID);
                intent.putExtra("position",holder.getAdapterPosition());

                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ExerciseSequenceList.size();
    }

    public class ExerciseSquenceHolder extends RecyclerView.ViewHolder {

        private RecyclerRow2Binding binding;
        public ExerciseSquenceHolder(RecyclerRow2Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}

