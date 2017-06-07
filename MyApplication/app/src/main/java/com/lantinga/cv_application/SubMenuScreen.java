package com.lantinga.cv_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.lantinga.cv_application.Objects.SubPages;

import java.io.Serializable;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubMenuScreen extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayAdapter adapter;
    private SubPages page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);

        ImageView image = (ImageView) findViewById(R.id.picOfJeff);
        image.setImageDrawable(getResources().getDrawable(R.drawable.a_pic_of_me));

        page = (SubPages) getIntent().getSerializableExtra("SUB_PAGE");


        listView = (ListView) findViewById(R.id.allMenus);
        Log.i("message", listView.toString());
        adapter = new IntroductionAdapter(this.getApplicationContext(),page.getContent());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getApplicationContext(),SubMenuScreen.class);
        startActivity(intent);
    }
}
