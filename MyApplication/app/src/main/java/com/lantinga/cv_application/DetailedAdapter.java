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

import java.util.ArrayList;

/**
 * Created by Jeffrey on 11-6-2017.
 */

public class DetailedAdapter extends ArrayAdapter {

    public DetailedAdapter(@NonNull Context context, ArrayList<ListItem> array ) {
        super(context,0,array);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ListItem pages = (ListItem) getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rows_listview, parent, false);
        }

        TextView pageName = (TextView) convertView.findViewById(R.id.listviewName);
        pageName.setText(pages.getName());

        return convertView;
    }
}

