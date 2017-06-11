package com.lantinga.cv_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.lantinga.cv_application.Objects.ListItem;
import com.lantinga.cv_application.Objects.SubPages;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<SubPages> pages = new ArrayList<>();
    ListView listView;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WhenStart whenStart = new WhenStart();
        pages = whenStart.getPages();

        listView = (ListView) findViewById(R.id.allMenus);
        adapter = new MainAdapter(this.getApplicationContext(), pages);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        ImageView image = (ImageView) findViewById(R.id.picOfJeff);
        image.setImageDrawable(getResources().getDrawable(R.drawable.a_pic_of_me));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        System.out.println(i);
        SubPages page = (SubPages) pages.get(i);
        Intent intent = new Intent(getApplicationContext(),SubMenuActivity.class);
        intent.putExtra("SUB_PAGE",page);
        startActivity(intent);
    }
}
