package com.example.phonsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class galaxiesAdapter extends ArrayAdapter<galaxies> {

    List<galaxies> galaxyList;

    public galaxiesAdapter(@NonNull Context context, int resource, @NonNull List<galaxies> objects) {
        super(context, resource, objects);
        galaxyList = objects;
    }

    @NonNull
    @Override
    public View  getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.rowgalaxies,parent,false);

        galaxies cuurentGalaxy = galaxyList.get(position);

        TextView galaxyName = view.findViewById(R.id.galaxyname);
        TextView galaxyConstellation = view.findViewById(R.id.galaxycons);
        ImageView img = view.findViewById(R.id.imageView);

galaxyName.setText(cuurentGalaxy.getGalaxyName());
galaxyConstellation.setText(cuurentGalaxy.getGalaxyConstellation());
img.setImageResource(cuurentGalaxy.getGalaxyImage());
        return view;
    }

}

