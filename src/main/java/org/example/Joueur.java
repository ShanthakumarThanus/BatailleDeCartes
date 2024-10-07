package org.example;

import java.util.ArrayList;

public class Joueur {
    private String nom;
    private ArrayList<Carte> listeDeCarte = new ArrayList<>();
    private int scoreCount;

    public Joueur(String n, ArrayList<Carte> lst1, int scoreCount) {
        this.nom = n;
        this.scoreCount = scoreCount;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
         this.nom = nom;
    }

    public int getScoreCount() {
        return this.scoreCount;
    }

    public void setScoreCount() {
        this.scoreCount = scoreCount;
    }

    public void tirerCarte() {
        Carte c = new Carte();
        listeDeCarte.add(c);
    }

    public void ajouterCarte(Carte c) {
        this.listeDeCarte.add(c);
    }

    public void ajouterPoints(int points) {
        this.scoreCount += points;
    }

    public int getScore() {
        return this.scoreCount;
    }

    public ArrayList<Carte> getPaquet() {
        return this.listeDeCarte;
    }

    public void ajouterCartes(ArrayList<Carte> cartes) {
        this.listeDeCarte.addAll(cartes);  // Ajoute plusieurs cartes à la liste
    }
}
