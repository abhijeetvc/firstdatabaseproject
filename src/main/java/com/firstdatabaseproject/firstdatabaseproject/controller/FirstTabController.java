package com.firstdatabaseproject.firstdatabaseproject.controller;

import com.firstdatabaseproject.firstdatabaseproject.impl.FirstTabImpl;
import com.firstdatabaseproject.firstdatabaseproject.model.FirstTab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 23/07/18.
 */

@RestController
public class FirstTabController {

    @Autowired
    FirstTabImpl firstTabImpl;

    @RequestMapping(value="/savedata")
    public String saveData(@RequestBody FirstTab firstTab){
        firstTabImpl.saveData(firstTab);
        return "Data saved successfully";
    }
}
