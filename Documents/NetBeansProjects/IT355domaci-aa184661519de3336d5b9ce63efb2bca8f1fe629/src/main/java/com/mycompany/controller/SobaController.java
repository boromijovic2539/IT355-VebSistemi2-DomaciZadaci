package com.mycompany.controller;

import com.mycompany.dao.SobaDao;
import com.mycompany.dao.SobaDaoImp;
import com.mycompany.model.Soba;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Mijovic
 */
@Controller
public class SobaController {

    @Autowired
    private SobaDao sobaDao; 

    @RequestMapping(value = "/soba", method
            = RequestMethod.GET)
    public String student(ModelMap map) {
        map.addAttribute("soba", new Soba());
        return "soba";
    }

    @RequestMapping(value = "/addSoba", method
            = RequestMethod.POST)
    public String addStudent(@ModelAttribute Soba soba,
            ModelMap model) {
        model.addAttribute("kreveti", soba.getBrojKreveta());
        model.addAttribute("velicina", soba.getVelicina());
        model.addAttribute("klima", soba.getKlima());
        model.addAttribute("kupatilo", soba.getKupatilo());
        model.addAttribute("tv", soba.getTv());
        model.addAttribute("cenaPoDanu", soba.getCenaPoDanu());
        
        sobaDao.addSoba();
        
        return "prikaz";
    }
}
