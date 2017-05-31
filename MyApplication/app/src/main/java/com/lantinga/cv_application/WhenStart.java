package com.lantinga.cv_application;

import com.lantinga.cv_application.Objects.Study;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class WhenStart {

    ArrayList<SubPages> pages = new ArrayList<>();
    ArrayList<Study> studies = new ArrayList<>();

    public WhenStart(){
        pages.add(new SubPages(R.string.Personalia));
        pages.add(new SubPages(R.string.Studies));
        pages.add(new SubPages(R.string.Experiance));
        pages.add(new SubPages(R.string.Pojects));
        pages.add(new SubPages(R.string.CoursAndSkill));
        studies.add(new Study("VMBO-tl/MAVO"));
        studies.add(new Study("HAVO"));



    }

    public ArrayList<SubPages> getPages() {
        return pages;
    }

    public void setPages(ArrayList<SubPages> pages) {
        this.pages = pages;
    }


}
