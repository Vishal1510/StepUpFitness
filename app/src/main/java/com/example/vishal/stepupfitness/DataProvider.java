package com.example.vishal.stepupfitness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by VISHAL on 4/9/2016.
 */
public class DataProvider {
    private String title;
    private String desc;

    public ArrayList<String> exercise= new ArrayList<String>();
    public DataProvider(String title) {
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return title + "\n" + desc;
    }
}
