package com.cucumber.demo.services;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.cucumber.demo.entities.DemoEntity;

@Service
public abstract class DemoService {

    public static ArrayList<String> getAllData() {

        ArrayList<String> dumbData = new ArrayList<String>(Arrays.asList(DemoEntity.getAll()));
        
        return dumbData;
    }   


}
