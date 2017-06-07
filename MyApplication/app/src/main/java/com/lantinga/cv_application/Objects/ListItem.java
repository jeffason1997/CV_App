package com.lantinga.cv_application.Objects;

import java.io.Serializable;

/**
 * Created by jeffrey on 7-6-2017.
 */

public class ListItem implements Serializable {
    int name;

    public ListItem(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
