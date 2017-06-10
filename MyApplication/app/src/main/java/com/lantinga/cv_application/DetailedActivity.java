package com.lantinga.cv_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


import com.lantinga.cv_application.Objects.ListItem;

/**
 * Created by Jeffrey on 11-6-2017.
 */

public class DetailedActivity extends AppCompatActivity {

    private ListItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        item = (ListItem) getIntent().getSerializableExtra("ITEM");

        if (item.getIMG()!=0){
            setContentView(R.layout.activity_detailed_image);
        } else if (item.getIMG()==0){
            setContentView(R.layout.activity_detailed);
        } else {
            System.err.println("This is not supposed toe happen");
        }


        ImageView image = (ImageView) findViewById(R.id.picOfJeff);
        image.setImageDrawable(getResources().getDrawable(R.drawable.a_pic_of_me));

    }
}
