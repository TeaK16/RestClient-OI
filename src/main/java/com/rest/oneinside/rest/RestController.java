package com.rest.oneinside.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private Service service;

    @GetMapping("/img")
    public ModelAndView getModel(ModelMap map) throws IOException {
        map.addAttribute("src", this.service.getImage());
        System.out.println(this.service.getImage());
        return new ModelAndView("index.html", map);
    }

    @GetMapping("/myimg")
    public ModelAndView getMyModel(ModelMap map){
        map.addAttribute("mysrc","https://www.cityguide-dubai.com/fileadmin/_processed_/3/3/csm_img-worlds-of-adventures-teaser_40e4184da1.jpg");
        return new ModelAndView("myindex.html", map);
    }


}
