/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dao;

/**
 *
 * @author vesna.lazarevic
 */
public class SobaDaoImp implements SobaDao{    
    
    @Override
    public void addSoba() {
        System.out.println("Dodajem novu sobu!");
    }

    @Override
    public String addSobaRet() {
        System.out.println("Dodajem sobu i vracam novu sobu");
        
        return "novaSoba";
    }

    @Override
    public void addSobaThrowException() throws Exception {
        System.out.println("Dodajem novu sobu al se izbacuje greska");
        
        throw new Exception("Greska katastroflana");
    }

    @Override
    public void addSobaAround(String name) {
        System.out.println("Dodajem sobu sa imenom" + name);
    }
    
}
