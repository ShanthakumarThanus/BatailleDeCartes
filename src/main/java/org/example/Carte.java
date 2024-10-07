package org.example;

import java.util.Random;

public class Carte {

    private static String[] couleurs = {"Trèfle","Carreau","Coeur","Pique"};
    private static String[] valeurs = {"2","3","4","5","6","7","8","9","10", "Valet", "Dame", "Roi", "As"}; //dans l'ordre de valeur, de la plus basse à la plus haute

    private String couleur;
    private int indiceValeur; //indice du tableau valeurs[]

    public Carte(String c, int v) {
        this.couleur = c;
        this.indiceValeur = v;
    }

    //Constructeur par défaut pour créer une carte aléatoire
    public Carte() {
        Random random = new Random();
        this.couleur = couleurs[random.nextInt(couleurs.length)];
        this.indiceValeur = random.nextInt(valeurs.length);
    }

    public int compare (Carte c) {
        return Integer.compare(this.indiceValeur, c.indiceValeur);
    }

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleurs(String couleur) {
        this.couleur = couleur;
    }

    public String getValeur() {
        return valeurs[this.indiceValeur];
    }

    public void setValeurs(int valeur) {
        this.indiceValeur = valeur;
    }

    public static String[] getCouleurs() {
        return couleurs;
    }

    public static String[] getValeurs() {
        return valeurs;
    }

    public String toString(){
        return ("("+this.couleur +","+this.getValeur()+")");
    }

}
