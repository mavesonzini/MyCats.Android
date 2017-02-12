package com.sonzini.mave.mycatsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by mave on 2/12/17.
 */

public class ImageDisplay extends Activity {

    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_display);

        Intent i = getIntent();

        position = i.getExtras().getInt("Position");

        final Adapter adapter = new Adapter(this);
        final ImageView image = (ImageView) findViewById(R.id.imageViewDisplay);

        image.setImageResource(adapter.images[position]);

        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(position < adapter.getCount() - 1) {
                    position +=1;
                } else  {
                    position = 0;
                }

                image.setImageResource(adapter.images[position]);


            }
        });
    }
}
