package com.example.presidenttilista;

import java.util.ArrayList;

public class President {
    private ArrayList arrayList;
    private String name;
    private int startYear;
    private int finishYear;
    private String description;

    public President(String name, int startYear, int finishYear, String description){
        this.name = name;
        this.startYear = startYear;
        this.finishYear = finishYear;
        this.description = description;
    }
}
