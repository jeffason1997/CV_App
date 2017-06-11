package com.lantinga.cv_application.Objects;

import java.io.Serializable;

/**
 * Created by jeffrey on 7-6-2017.
 */

public class ListItem implements Serializable {
    int name;
    int IMG;
    int text;

    public ListItem(int name, int IMG, int text) {
        this.name = name;
        this.IMG = IMG;
        this.text = text;
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

    public int getText() {
        return text;
    }

    public void setText(int text) {
        this.text = text;
    }
}
