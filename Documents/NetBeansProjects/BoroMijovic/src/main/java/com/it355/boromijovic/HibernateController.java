/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic;

import com.it355.hibernatecrud.dao.KardDao;
import com.it355.hibernatecrud.entity.Klub;
import com.it355.hibernatecrud.entity.Utakmica;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vesna.lazarevic
 */
@Controller
public class HibernateController {

    @Autowired
    KardDao kardDao;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }

    @RequestMapping(value = "/addUtakmica", method = RequestMethod.GET)
    public String addUtakmica(Model model) {
        model.addAttribute("utakmica", new Utakmica());
        model.addAttribute("klubovi", kardDao.getKlubovi());
        return "addUtakmica";
    }

    @RequestMapping(value = "/editUtakmica/{id}", method = RequestMethod.GET)
    public String addUtakmica(@PathVariable("id") int id, Model model) {
        Utakmica utakmica = kardDao.getUtakmicaById(id);
        model.addAttribute("utakmica", utakmica);
        model.addAttribute("klubovi", kardDao.getKlubovi());
        return "addUtakmica";
    }

    @RequestMapping(value = "/addUtakmica", method = RequestMethod.POST)
    public ModelAndView addUtakmica(@ModelAttribute("utakmica") Utakmica uta, ModelAndView model) {
        //   uta.setEnabled(Boolean.TRUE);   ako ne radi dodati atribut
        uta = kardDao.addUtakmica(uta);
        model.addObject("klubovi", kardDao.getKlubovi());
        model.addObject("successMsg", "Utakmica successfully added");
        model.addObject("utakmica", uta);
        return model;
    }

    @RequestMapping(value = "/addKlub", method = RequestMethod.GET)
    public String addKlub(Model model) {
        model.addAttribute("klub", new Klub());
        return "addKlub";
    }

    @RequestMapping(value = "/addKlub", method = RequestMethod.POST)
    public ModelAndView addKlub(@ModelAttribute("klub") Klub klu, ModelAndView model) {
     //   klu.setEnabled(Boolean.TRUE);
        //  klu.setId_klub(10);
        System.out.println("aaa " + klu.toString());
        kardDao.addKlub(klu);
        model.addObject("successMsg", "klub successfully added");
        return model;
    }

    @RequestMapping(value = "/seeutakmice", method = RequestMethod.GET)
    public ModelAndView getUtakmice(ModelAndView model) {
        model.addObject("utakmice", kardDao.getUtakmice());
        model.addObject("utakmica", new Utakmica());
        return model;
    }

    @RequestMapping(value = "/deleteutakmica/{id}", method = RequestMethod.GET)
    public String deleteUtakmica(@PathVariable("id") int id, HttpServletRequest request) {
        System.out.println("Fetching & Deleting utakmica with id " + id);
        Utakmica utakm = kardDao.getUtakmicaById(id);
        if (utakm == null) {
            System.out.println("Unable to delete. Utakmica with id " + id + " not found");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

        kardDao.deleteUtakmica(utakm);
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;
    }
}
