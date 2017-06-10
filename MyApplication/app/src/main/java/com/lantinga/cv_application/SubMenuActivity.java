package com.lantinga.cv_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.lantinga.cv_application.Objects.ListItem;
import com.lantinga.cv_application.Objects.SubPages;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubMenuActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listView;
    private ArrayAdapter adapter;
    private ArrayList<ListItem> items;
    private SubPages page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = (ImageView) findViewById(R.id.picOfJeff);
        image.setImageDrawable(getResources().getDrawable(R.drawable.a_pic_of_me));

        page = (SubPages) getIntent().getSerializableExtra("SUB_PAGE");


        listView = (ListView) findViewById(R.id.allMenus);
        Log.i("message", listView.toString());
        items = page.getContent();
        adapter = new IntroductionAdapter(this.getApplicationContext(),items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        Log.i("message", items.toString());
        System.out.println("message" + i);

        ListItem item = items.get(i);
        Intent intent = new Intent(getApplicationContext(),ProjectActivity.class);
        intent.putExtra("ITEM",item);
        startActivity(intent);
    }
}
