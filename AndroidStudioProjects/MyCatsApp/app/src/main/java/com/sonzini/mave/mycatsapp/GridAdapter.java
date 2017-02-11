package com.sonzini.mave.mycatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by mave on 2/11/17.
 */

public class GridAdapter extends BaseAdapter {

    private int icons[];
    private String cats[];
    private Context context;
    private LayoutInflater inflater;


    public GridAdapter(Context context, int icons[], String cats[]) {
        this.context = context;
        this.icons = icons;
        this.cats = cats;
    }
    @Override
    public int getCount() {
        return cats.length;
    }

    @Override
    public Object getItem(int position) {
        return cats[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View gridView = convertView;
        if (convertView == null) {
            inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            gridView = inflater.inflate(R.layout.custom_layout, null);
        }

        ImageView icon = (ImageView) gridView.findViewById(R.id.imageView);

        icon.setImageResource(icons[position]);

        return gridView;
    }
}
