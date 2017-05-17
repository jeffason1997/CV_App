package com.lantinga.cv_application;

import java.util.ArrayList;

/**
 * Created by Jeffrey on 16-5-2017.
 */

public class WhenStart {

    ArrayList<SubPages> pages = new ArrayList<>();
    ArrayList<SubPages> Opleidingen = new ArrayList<>();

    public WhenStart(){
        pages.add(new SubPages("Personalia"));
        pages.add(new SubPages("Opleidingen"));
        pages.add(new SubPages("Werkervaring"));
        pages.add(new SubPages("Mijn Projecten"));
        pages.add(new SubPages("Cursussen en ervaringen"));
        Opleidingen.add(new SubPages("VMBO-tl/MAVO"));
        Opleidingen.add(new SubPages("HAVO"));



    }

    public ArrayList<SubPages> getPages() {
        return pages;
    }

    public void setPages(ArrayList<SubPages> pages) {
        this.pages = pages;
    }


}
