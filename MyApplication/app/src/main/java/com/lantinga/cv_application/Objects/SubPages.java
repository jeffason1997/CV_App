package com.lantinga.cv_application.Objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubPages extends ListItem implements Serializable {

    private ArrayList content;

    public SubPages(int pageName, ArrayList arraylist) {
        super(pageName,0);
        content = arraylist;
    }

    public SubPages(int pageName) {
        super(pageName,0);
    }

    public ArrayList getContent() {
        return content;
    }

}
