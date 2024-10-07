package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Joueur {
    private String nom;
    private ArrayList<Carte> listeDeCarte = new ArrayList<>();
    private int scoreCount;

    public Joueur(String n, int scoreCount) {
        this.nom = n;
        this.listeDeCarte = new ArrayList<Carte>();
        this.scoreCount = scoreCount;
    }

    public String getNom() {
        return this.nom;
    }

    public String setNom(String nom) {
        return this.nom = nom;
    }

    public void tirerCarte() {
        Carte c = new Carte();

    }
}
