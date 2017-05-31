package com.lantinga.cv_application;

import java.io.Serializable;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubPages implements Serializable {

    int pageName;

    public SubPages(int pageName) {
        this.pageName = pageName;
    }


    public int getPageName(){
        return pageName;
    }
}
