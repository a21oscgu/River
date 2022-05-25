package com.example.mobileapp_programming_project;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView itemRiverName;
    public ImageView itemRiverImg;
    public TextView itemContinent;
    public TextView itemContinentData;
    public TextView itemCountries;
    public TextView itemCountriesData;


    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        // Variabler kopplas med widgets (se list_items.xml)
        itemRiverName = itemView.findViewById(R.id.river_name);
        //itemRiverImg = (ImageView) itemView.findViewById(R.id.river_img);
        itemContinent = itemView.findViewById(R.id.continent);
        itemContinentData = itemView.findViewById(R.id.continent_data);
        itemCountries = itemView.findViewById(R.id.countries);
        itemCountriesData = itemView.findViewById(R.id.countries_data);
    }
}