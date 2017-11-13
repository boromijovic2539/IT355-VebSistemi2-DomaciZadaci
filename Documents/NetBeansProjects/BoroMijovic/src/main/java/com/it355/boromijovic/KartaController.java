/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic;

import com.it355.boromijovic.model.Karta;
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
 * @author vesna.lazarevic
 */
@Controller
public class KartaController {

    @Autowired
    private MessageSource messageSource;

    // GET method
    @RequestMapping(value = "/karta", method = RequestMethod.GET)
    public ModelAndView karta() {
        System.out.println("Calling MessageSource");
        System.out.println(messageSource.getMessage("domacin", null, new Locale(("en-Latn-US"))));
        return new ModelAndView("addkarta", "command", new Karta());
    }

    // POST method
    @RequestMapping(value = "/addKarta", method = RequestMethod.POST)
    public String addKarta(@ModelAttribute Karta karta, ModelMap model) {
        model.addAttribute("domacin", karta.getDomacin());
        model.addAttribute("gost", karta.getGost());
        model.addAttribute("vreme_utakmice", karta.getVreme_utakmice());
        model.addAttribute("cena_karte", karta.getCena_karte());
        model.addAttribute("sektor", karta.getSektor());
        model.addAttribute("broj_sedista", karta.getBroj_sedista());
        // prosledjivanje na stranu prikaza karta.jsp
        return "karta";
    }

    @RequestMapping(value = "/pre", method = RequestMethod.GET)
    public String preview(@ModelAttribute Karta karta, ModelMap model) {

        return "addkarta";
    }
}
