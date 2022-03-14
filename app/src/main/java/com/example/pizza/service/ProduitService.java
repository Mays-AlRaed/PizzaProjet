package com.example.pizza.service;

import com.example.pizza.classes.Produit;
import com.example.pizza.dao.IDAO;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDAO<Produit> {

    public ArrayList<Produit> produits = new ArrayList();
    @Override
    public boolean create(Produit o) {
        return this.produits.add(o);
    }

    @Override
    public boolean update(Produit o) {
        return false;
    }

    @Override
    public boolean delete(Produit o) {
        return this.produits.remove(o);
    }

    @Override
    public Produit findById(int id) {
        for(Produit p : this.produits)
        {
            if(p.getId() == id)
            {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return this.produits;
    }
}

