package com.tunay.physiotheraphyapp;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tunay.physiotheraphyapp.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class Mainmenuadapter extends RecyclerView.Adapter<Mainmenuadapter.MenuHolder>{

    ArrayList<Menu> MenuArrayList;

    public Mainmenuadapter(ArrayList<Menu> menuArrayList) {
        MenuArrayList = menuArrayList;
    }

    @NonNull
    @Override
    public MenuHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recylerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new MenuHolder(recylerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuHolder holder, int position) {
        holder.binding.imageView.setImageBitmap(MenuArrayList.get(position).image);
        holder.binding.textView.setText(MenuArrayList.get(position).areaname);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),ExerciseSequence.class);
                intent.putExtra("menuID",holder.getAdapterPosition()+1);
                holder.itemView.getContext().startActivity(intent);




            }
        });



    }

    @Override
    public int getItemCount() {
        return MenuArrayList.size();
    }

    public class MenuHolder extends RecyclerView.ViewHolder {
        private RecyclerRowBinding binding;
        public MenuHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
