package org.example;

public class Carte {

    private static String[] couleurs = {"Trèfle","Carreau","Coeur","Pique"};
    private static String[] valeurs = {"2","3","4","5","6","7","8","9","10", "Valet", "Dame", "Roi", "As"}; //dans l'ordre de valeur, de la plus basse à la plus haute

    private String couleur;
    private int valeur; //indice de valeurs[]

    public Carte(String c, int v) {
        this.couleur = c;
        this.valeur = v;
    }

    public Carte() {}

    public int compare (Carte c) {
        return Integer.compare(this.valeur, c.valeur);
    }

    public String getCouleur() {
        return this.couleur;
    }

    public String setCouleur(String couleur) {
        return this.couleur = couleur;
    }

    public String getValeur() {
        return valeurs[this.valeur];
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public String toString(){
        return ("("+this.getCouleur()+","+this.getValeur()+")");
    }

}
