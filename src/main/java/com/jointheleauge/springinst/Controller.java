package com.jointheleauge.springinst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

/**
 * Created by league on 12/6/18.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    DataLoader dataLoader;

    String modelToString(Model m){
        m.addAttribute("", dataLoader.getPosts());
        return "index";
    }


}
