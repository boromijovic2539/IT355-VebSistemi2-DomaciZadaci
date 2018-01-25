/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.boromijovic;

import com.it355.boromijovic.dao.KorisnikDao;
import com.it355.boromijovic.dao.KartaDao;
import com.it355.boromijovic.model.Korisnik;
import com.it355.boromijovic.model.Karta;
import com.it355.boromijovic.service.KorisnikService;
import com.it355.boromijovic.service.KartaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author vesna.lazarevic
 */
@Controller
public class KupovinaController {

    @Autowired
    KartaDao kartaDao;

    @Resource(name = "kartaService")
    KartaService kartaService;

    @Autowired
    KorisnikDao korisnikDao;

    @Resource(name = "korisnikService")
    KorisnikService korisnikService;

    @RequestMapping(value = "/karte", method = RequestMethod.GET)
    public ModelAndView karte(ModelAndView model) {
        List<Karta> karte = kartaService.getAllKarte();
        model.addObject("karte", karte);
        model.setViewName("tabla"); //tabela  /svekarte
        return model;
    }
    
        @RequestMapping(value = "/updateKarta/{id}", method = RequestMethod.GET)
    public ModelAndView updateKarta(@PathVariable("id") int id, HttpServletRequest request, ModelAndView model) {

        Karta karta = kartaDao.getByID(id);
        model.addObject("karta", karta);
        model.setViewName("updatekarta");

        return model;
    }
    
    @RequestMapping(value = "/updateKarta/{id}", method = RequestMethod.POST)
   public ModelAndView updateKartForm(@ModelAttribute("karta") Karta karta, ModelAndView model) {
        model.addObject("object", karta);
        model.setViewName("pocetna");
        System.out.println(""+ karta.getId_karta());
        kartaDao.update(karta);
        return model;
    }   
    
   
       @RequestMapping(value = "/deleteKarta/{id}", method = RequestMethod.GET)
    public String deleteKarta(@PathVariable("id") int id, HttpServletRequest request) {

        kartaDao.deleteKarta(id);

        return "pocetna";
    }
   

    @RequestMapping(value = "/addkarta", method = RequestMethod.GET)
    public String addKarta(Model model) {
        model.addAttribute("karta", new Karta());
        return "dodajkartu";
    }

    @RequestMapping(value = "/addkarta", method = RequestMethod.POST)
    public ModelAndView addHomeKartForm(@ModelAttribute("karta") Karta kar, ModelAndView model) {
        model.addObject("object", kar);
        kar.setId_karta(kartaDao.getNextID());
        kartaDao.addKarta(kar);
        model.setViewName("pocetna");
        return model;
    }
////
 

    /////////////////
    @RequestMapping(value = "/korisnici", method = RequestMethod.GET)
    public ModelAndView korisnici(ModelAndView model) {
        List<Korisnik> korisnici = korisnikService.getAllKorisnici();
        model.addObject("korisnici", korisnici);
        model.setViewName("tabela2");
        return model;
    }

    @RequestMapping(value = "/deleteKorisnik/{id}", method = RequestMethod.GET)
    public String deleteKorisnik(@PathVariable("id") int id, HttpServletRequest request) {

        korisnikDao.deleteKorisnik(id);

        return "pocetna";
    }

    @RequestMapping(value = "/updateKorisnik/{id}", method = RequestMethod.GET)
    public ModelAndView updateKorisnik(@PathVariable("id") int id, HttpServletRequest request, ModelAndView model) {

        Korisnik korisnik = korisnikDao.getByID(id);
        model.addObject("korisnik", korisnik);
        model.setViewName("updatekorisnik");

        return model;
    }
    
    @RequestMapping(value = "/updateKorisnik/{id}", method = RequestMethod.POST)
   public ModelAndView updateKForm(@ModelAttribute("korisnik") Korisnik kor, ModelAndView model) {
        model.addObject("object", kor);
        model.setViewName("pocetna");
        System.out.println(""+ kor.getId_korisnik());
        korisnikDao.update(kor);
        return model;
    }   
    
    

    @RequestMapping(value = "/addkorisnik", method = RequestMethod.GET)
    public String addKorisnik(Model model) {
        model.addAttribute("korisnik", new Korisnik());
        return "addkorisnik";
    }

    @RequestMapping(value = "/addkorisnik", method = RequestMethod.POST)
    public ModelAndView addHomeKForm(@ModelAttribute("korisnik") Korisnik kor, ModelAndView model) {
        model.addObject("object", kor);
        kor.setId_korisnik(korisnikDao.getNextID());
        korisnikDao.addKorisnik(kor);
        model.setViewName("pocetna");
        return model;
    }
}
