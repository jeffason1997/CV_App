package com.lantinga.cv_application.Objects;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubPages implements Serializable {

    int pageName;
    private ArrayList content;

    public SubPages(int pageName, ArrayList arraylist) {
        this.pageName = pageName;
        content = arraylist;
    }

    public SubPages(int pageName) {
        this.pageName=pageName;
    }

    public int getPageName() {
        return pageName;
    }

    public void setPageName(int pageName) {
        this.pageName = pageName;
    }

    public void setContent(ArrayList content) {
        this.content = content;
    }

    public ArrayList getContent() {
        return content;
    }

}
