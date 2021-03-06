package com.example.mobileapp_programming_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

//import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<River> rivers;
    public Adapter(ArrayList<River> rivers) {
        this.rivers = rivers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemRiverName.setText(rivers.get(position).getName());
        // Picasso template:
        // Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(imageView);
        //Picasso.with(context).load(rivers.get(position).getAuxdata().getImg()).resize(0, 300).into(holder.itemRiverImg);
        holder.itemContinentData.setText(rivers.get(position).getCompany());
        holder.itemCountriesData.setText(rivers.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return rivers.size();
    }
}