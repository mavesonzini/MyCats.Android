package com.sonzini.mave.mycatsapp;

/**
 * Created by mave on 2/12/17.
 */
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import static com.sonzini.mave.mycatsapp.R.layout.image_cell;

public class Adapter extends BaseAdapter{

    int[] images = {R.drawable.cat10, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5, R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9};

    private Context context;

    public Adapter(Context context){

        this.context = context;

    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(image_cell, null);

            ImageView image = (ImageView) convertView.findViewById(R.id.cellImage);
            image.setImageResource(images[position]);
        }
        return convertView;
    }
}
