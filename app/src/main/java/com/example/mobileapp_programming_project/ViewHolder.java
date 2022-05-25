package com.example.mobileapp_programming_project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView textViewItem;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        // Variablen kopplas med textview (se item.xml)
        textViewItem = itemView.findViewById(R.id.item);
    }
}