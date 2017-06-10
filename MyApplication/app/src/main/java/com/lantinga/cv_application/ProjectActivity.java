package com.lantinga.cv_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;


import com.lantinga.cv_application.Objects.Project;

/**
 * Created by Jeffrey on 11-6-2017.
 */

public class ProjectActivity extends AppCompatActivity {

    private Project project;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submenu);

        ImageView image = (ImageView) findViewById(R.id.picOfJeff);
        image.setImageDrawable(getResources().getDrawable(R.drawable.a_pic_of_me));

        project = (Project) getIntent().getSerializableExtra("ITEM");



    }
}
