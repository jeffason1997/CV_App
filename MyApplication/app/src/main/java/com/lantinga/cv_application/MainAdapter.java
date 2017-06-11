package com.lantinga.cv_application;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.lantinga.cv_application.Objects.ListItem;
import com.lantinga.cv_application.Objects.SubPages;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class MainAdapter extends ArrayAdapter {

    public MainAdapter(@NonNull Context context, ArrayList<SubPages> array ) {
    super(context,0,array);
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        SubPages pages = (SubPages) getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_listview, parent, false);
        }

        TextView pageName = (TextView) convertView.findViewById(R.id.listviewName);
        pageName.setText(pages.getPageName());

        return convertView;
    }
}