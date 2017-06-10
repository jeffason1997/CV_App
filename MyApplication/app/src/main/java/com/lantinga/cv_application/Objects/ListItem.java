package com.lantinga.cv_application.Objects;

import java.io.Serializable;

/**
 * Created by jeffrey on 7-6-2017.
 */

public class ListItem implements Serializable {
    int name;
    int IMG;

    public ListItem(int name, int IMG) {
        this.name = name;
        this.IMG = IMG;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getIMG() {
        return IMG;
    }

    public void setIMG(int IMG) {
        this.IMG = IMG;
    }
}
