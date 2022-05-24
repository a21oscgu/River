package com.example.mobileapp_programming_project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView item;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        // Variablen kopplas med textview (se item.xml)
        item = itemView.findViewById(R.id.my_item);
    }
}