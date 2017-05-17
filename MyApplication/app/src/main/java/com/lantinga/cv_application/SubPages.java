package com.lantinga.cv_application;

import java.io.Serializable;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class SubPages implements Serializable {

    String pageName;

    public SubPages(String pageName) {
        this.pageName = pageName;
    }


    public String getPageName(){
        return pageName;
    }
}
