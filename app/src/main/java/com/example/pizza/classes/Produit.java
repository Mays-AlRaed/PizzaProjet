package com.example.pizza.classes;

import java.io.Serializable;

public class Produit implements Serializable {
    private int id;
    private String nom;
    private int nbrIngredient;
    private  int photo;
    private float duree;
    private String detailsIngred;
    private String description;
    private String preparation;

    private static int comp=0;

    public Produit() {
    }

    public Produit(String nom, int nbrIngredient, int photo, float duree, String detailsIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredient = nbrIngredient;
        this.photo = photo;
        this.duree = duree;
        this.detailsIngred = detailsIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredient() {
        return nbrIngredient;
    }

    public void setNbrIngredient(int nbrIngredient) {
        this.nbrIngredient = nbrIngredient;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public float getDuree() {
        return duree;
    }

    public void setDuree(float duree) {
        this.duree = duree;
    }

    public String getDetailsIngred() {
        return detailsIngred;
    }

    public void setDetailsIngred(String detailsIngred) {
        this.detailsIngred = detailsIngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbrIngredient=" + nbrIngredient +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detailsIngred='" + detailsIngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                '}';
    }
}


