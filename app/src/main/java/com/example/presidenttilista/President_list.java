package com.example.presidenttilista;

import java.util.ArrayList;
import java.util.List;

public class President_list {

    private List<President> presidents;
    private static final President_list ourInstance = new President_list();

    public static President_list getInstance() {
        return ourInstance;
    }

    private President_list() {
        presidents = new ArrayList<>();
    }

    public List<President>getPresidents(){
        return presidents;
    }
}
