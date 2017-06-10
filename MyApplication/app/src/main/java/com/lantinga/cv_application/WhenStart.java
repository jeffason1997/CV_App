package com.lantinga.cv_application;

import com.lantinga.cv_application.Objects.Experience;
import com.lantinga.cv_application.Objects.ListItem;
import com.lantinga.cv_application.Objects.Project;
import com.lantinga.cv_application.Objects.Study;
import com.lantinga.cv_application.Objects.SubPages;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class WhenStart {

    ArrayList<ListItem> pages = new ArrayList<>();
    ArrayList<ListItem> studies = new ArrayList<>();
    ArrayList<ListItem> experiences = new ArrayList<>();
    ArrayList<ListItem> projects = new ArrayList<>();

    public WhenStart(){
        studies.add(new Study(R.string.Mavo));
        studies.add(new Study(R.string.Havo));

//        experiences.add(new Experience());
//        experiences.add(new Experience());


        projects.add(new Project(R.string.WeerStation));
        projects.add(new Project(R.string.FestivalPlanner));
        projects.add(new Project(R.string.KidSecure));
        projects.add(new Project(R.string.CVApp));
        projects.add(new Project(R.string.VacationApp));






        pages.add(new SubPages(R.string.Personalia));
        pages.add(new SubPages(R.string.Studies,studies));
        pages.add(new SubPages(R.string.Experience,experiences));
        pages.add(new SubPages(R.string.Pojects,projects));
        pages.add(new SubPages(R.string.CoursAndSkill));
    }

    public ArrayList<ListItem> getPages() {
        return pages;
    }

    public void setPages(ArrayList<ListItem> pages) {
        this.pages = pages;
    }


}
