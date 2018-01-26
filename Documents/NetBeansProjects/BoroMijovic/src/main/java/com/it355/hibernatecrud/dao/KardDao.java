/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.it355.hibernatecrud.dao;

import com.it355.hibernatecrud.entity.Karta;
import com.it355.hibernatecrud.entity.Klub;
import com.it355.hibernatecrud.entity.Utakmica;
import java.util.List;

/**
 *
 * @author vesna.lazarevic
 */
public interface KardDao {

    public List<Utakmica> getUtakmice();

    public Utakmica getUtakmicaById(int id);

    public List<Klub> getKlubovi();

    public Klub getKlubById(int id);

    public void saveCart(Karta cart);

    public List<Utakmica> getUtakmiceByKlub(Klub klub);

    public List<Karta> getAllKarte();

	///public List<ShoppingCartItem> getItemsByCart(ShoppingCart cart);
    public void editKlub(Klub klub);

    public Klub addKlub(Klub klub);

    public void editUtakmica(Utakmica utakmica);

    public Utakmica addUtakmica(Utakmica utakmica);

    public void editKarta(Karta karta);

    public Karta getKartaById(Integer id);

    public int getCountUtakmiceInKlub(int klubId);

    public int getCountUtakmice();

    public void deleteUtakmica(Utakmica utakmica);

    public void deleteKlub(Klub klub);

    public void deleteKarta(Karta karta);

      //  public void deleteItem(ShoppingCartItem item);
}
