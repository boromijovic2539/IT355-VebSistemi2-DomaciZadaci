package com.company.jmsdomaci.app.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vesna.lazarevic
 */
import com.company.jmsdomaci.app.model.Pecivo;
import com.company.jmsdomaci.app.service.PecivoService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplicationController {

    @Autowired
    PecivoService pecivoService;

    @RequestMapping(value = {"/"}, method  //, /home
            = RequestMethod.GET)
    public String preparePecivo(ModelMap model) {
        return "index";
    }

    @RequestMapping(value = {"/newPecivo"}, method //Product
            = RequestMethod.GET)
    public String preparePecivoP(ModelMap model) {
        Pecivo pecivo = new Pecivo();
        model.addAttribute("pecivo", pecivo);
        return "pecivo";
    }

    @RequestMapping(value = {"/newPecivo"}, method
            = RequestMethod.POST)
    public String sendPecivo(@Valid Pecivo pecivo, BindingResult result,
            ModelMap model) {
        if (result.hasErrors()) {
            return "pecivo";
        }
        pecivoService.sendPecivo(pecivo);
        model.addAttribute("success", "Pecivo for "
                + pecivo.getNaziv()+ " registered.");
        return "pecivoSuccess";
    }

    @RequestMapping(value = {"/checkStatus"}, method
            = RequestMethod.GET)
    public String checkPecivoStatus(ModelMap model) {
        model.addAttribute("peciva",
                pecivoService.getAllPecivo());
        return "pecivoStatus";
    }
}
