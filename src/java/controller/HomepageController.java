/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CategoryService;

/**
 *
 * @author HP
 */
@Controller
@RequestMapping(value = "/home")
public class HomepageController {
    @Autowired
    CategoryService categoryService;
    
    @RequestMapping(value = "/index")
    public String index(ModelMap map ){
        map.put("listCategory",categoryService.getAllcategory());
         return "pages/index";
    }
}
