/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.dao.IgracDao;
import com.mycompany.dao.KartaDao;
import com.mycompany.dao.KorisnikDao;
import com.mycompany.dao.ZaposleniDao;
import com.mycompany.model.Korisnik;
import com.mycompany.model.Igrac;
import com.mycompany.model.Karta;
import com.mycompany.model.Zaposleni;
import com.mycompany.service.KorisnikService;
import com.mycompany.service.ZaposleniService;
import com.mycompany.service.IgracService;
import com.mycompany.service.KartaService;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.security.Principal;
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
public class ZaposleniController {

    @Autowired
    ZaposleniDao zaposleniDao;

    @Resource(name = "zaposleniService")
    ZaposleniService zaposleniService;

    @Autowired
    KorisnikDao korisnikDao;

    @Resource(name = "korisnikService")
    KorisnikService korisnikService;

    @Autowired
    IgracDao igracDao;

    @Resource(name = "igracService")
    IgracService igracService;

    @Autowired
    KartaDao kartaDao;

    @Resource(name = "kartaService")
    KartaService kartaService;

    @RequestMapping(value = {"/register"}, method = RequestMethod.GET)
    public ModelAndView registerPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("korisnik", new Korisnik());
        model.setViewName("brat");
        return model;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView registerPage(@ModelAttribute("korisnik") Korisnik k, ModelAndView model) {
        model.addObject("object", k);

        int idKor = korisnikDao.getNextID();

        k.setId_korisnik(idKor);
        korisnikDao.addKorisnik(k);
        int idUser = korisnikDao.getNextIDUser();

        korisnikDao.addUser(k.getId_korisnik(), k.getUsername(), k.getPassword());

        korisnikDao.addUserRole(idUser);

        model.setViewName("login");
        return model;
    }

    //////////////////////////////////////////////
    @RequestMapping(value = "/karte", method = RequestMethod.GET)
    public ModelAndView karte(ModelAndView model) {
        List<Karta> karte = kartaService.getAllKarte();
        model.addObject("karte", karte);
        model.setViewName("karte");
        return model;
    }

    //////////////////////////////////////////////
    @RequestMapping(value = "/kupiKartu/{id_karta}", method = RequestMethod.GET)
    public String kupiKartu(@PathVariable("id_karta") int id, HttpServletRequest request, Model model) {
        Karta karta = kartaDao.getKartaByID(id);
        model.addAttribute("karta", karta);
        return "kupiKartu";
    }

    @RequestMapping(value = "/kupiKartu/{id_karta}", method = RequestMethod.POST)
    public ModelAndView kupiKartu(@ModelAttribute("karta") Karta k, ModelAndView model) {
        model.addObject("object", k);

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        int idUser = korisnikDao.getIDByUsername(name);
                
        kartaDao.kupi(k.getId_karta(), idUser, k.getBroj_karata());
        
        model.setViewName("home");
        return model;
    }
    ////////////////////////////////////////

    @RequestMapping(value = {"/tickets"}, method = RequestMethod.GET)
    public ModelAndView ticketsPage() {
        ModelAndView model = new ModelAndView();
        List<Karta> karte = kartaService.getAllKarte();
        model.addObject("karte", karte);
        model.setViewName("tickets");
        return model;
    }
    //////////////////////////////////////

    @RequestMapping(value = "/zaposleni", method = RequestMethod.GET)
    public ModelAndView zaposleni(ModelAndView model) {
        List<Zaposleni> zaposleni = zaposleniService.getAllZaposleni();
        model.addObject("zaposleni", zaposleni);
        model.setViewName("zaposleni");
        return model;
    }

    @RequestMapping(value = "/igraci", method = RequestMethod.GET)
    public ModelAndView igraci(ModelAndView model) {
        List<Igrac> igraci = igracService.getAllIgraci();
        model.addObject("igraci", igraci);
        model.setViewName("igraci");
        return model;
    }

    @RequestMapping(value = "/addzaposleni", method = RequestMethod.GET)
    public String addZaposleni(Model model) {
        model.addAttribute("zaposlen", new Zaposleni());
        return "addzaposleni";
    }

    @RequestMapping(value = "/addzaposleni", method = RequestMethod.POST)
    public ModelAndView addHomeZForm(@ModelAttribute("zaposlen") Zaposleni zap, ModelAndView model) {
        model.addObject("object", zap);
        zap.setId_zaposleni(zaposleniDao.getNextID());
        zaposleniDao.addZaposleni(zap);
        model.setViewName("tabela");/// bez ovoga // proba da se prebaci odma na tabelu
        return model;
    }

    @RequestMapping(value = "/deleteZaposleni/{id}.{ime}.{prezime}", method = RequestMethod.GET)
    public String deleteZaposleni(@PathVariable("id") int id, @PathVariable("ime") String ime,
            @PathVariable("prezime") String prezime, HttpServletRequest request) {

        zaposleniDao.deleteZaposleni(id);

        return "home";
    }

    @RequestMapping(value = "/updateZaposleni/{id}", method = RequestMethod.GET)
    public ModelAndView updateZaposleni(@PathVariable("id") int id, HttpServletRequest request, ModelAndView model) {

        Zaposleni zaposlen = zaposleniDao.getByID(id);
        model.addObject("zaposlen", zaposlen);
        model.setViewName("updatezaposleni");

        return model;
    }

    @RequestMapping(value = "/updateZaposleni/{id}", method = RequestMethod.POST)
    public ModelAndView updateZForm(@ModelAttribute("zaposlen") Zaposleni zap, ModelAndView model) {
        model.addObject("object", zap);
        model.setViewName("home");
        System.out.println("" + zap.getId_zaposleni());
        zaposleniDao.update(zap);
        return model;
    }

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

        return "home";
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
        model.setViewName("home");
        System.out.println("" + kor.getId_korisnik());
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
        return model;
    }
}
