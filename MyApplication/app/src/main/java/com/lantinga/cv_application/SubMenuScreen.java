package com.lantinga.cv_application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubMenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);

        SubPages page = (SubPages) getIntent().getSerializableExtra("SUB_PAGE");




    }
}
