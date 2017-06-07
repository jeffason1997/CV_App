package com.lantinga.cv_application;

import com.lantinga.cv_application.Objects.ListItem;
import com.lantinga.cv_application.Objects.Study;
import com.lantinga.cv_application.Objects.SubPages;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class WhenStart {

    ArrayList<ListItem> pages = new ArrayList<>();
    ArrayList<ListItem> studies = new ArrayList<>();

    public WhenStart(){
        studies.add(new Study(R.string.Mavo));
        studies.add(new Study(R.string.Havo));






        pages.add(new SubPages(R.string.Personalia));
        pages.add(new SubPages(R.string.Studies,studies));
        pages.add(new SubPages(R.string.Experiance));
        pages.add(new SubPages(R.string.Pojects));
        pages.add(new SubPages(R.string.CoursAndSkill));
    }

    public ArrayList<ListItem> getPages() {
        return pages;
    }

    public void setPages(ArrayList<ListItem> pages) {
        this.pages = pages;
    }


}
