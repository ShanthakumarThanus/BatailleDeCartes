package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Bataille {
    public static void main(String[] args) {

        ArrayList<Carte> jeuDeCartes = new ArrayList<>();

        //Appel des tableaux static de la classe Carte
        String[] couleurs = Carte.getCouleurs();
        String[] valeurs = Carte.getValeurs();

        for (String couleur : couleurs) {
            for (int i =0; i < valeurs.length; i++) {
                Carte carte = new Carte(couleur, i);
                jeuDeCartes.add(carte);
            }
        }

        //Mélange des cartes
        Collections.shuffle(jeuDeCartes);

        //Paquets de cartes des joueurs
        ArrayList<Carte> paquet1 = new ArrayList<>();
        ArrayList<Carte> paquet2 = new ArrayList<>();

        Joueur j1 = new Joueur("Quentin", paquet1, 0);
        Joueur j2 = new Joueur("Thibault", paquet2, 0);

        //Distribution des cartes
        for (int i = 0; i < jeuDeCartes.size(); i++) {
            if (i % 2 == 0) {
                paquet1.add(jeuDeCartes.get(i)); //pour joueur1
            } else {
                paquet2.add(jeuDeCartes.get(i)); //pour joueur2
            }
        }

        // Début de la partie
        while (!paquet1.isEmpty() && !paquet2.isEmpty()) {
            // Chaque joueur tire une carte
            Carte carteJ1 = paquet1.remove(0);
            Carte carteJ2 = paquet2.remove(0);

            System.out.println(j1.getNom() + " joue: " + carteJ1);
            System.out.println(j2.getNom() + " joue: " + carteJ2);

            // Comparer les cartes
            int comparaison = carteJ1.compare(carteJ2);
            if (comparaison > 0) {
                System.out.println(j1.getNom() + " gagne ce tour!");
                j1.ajouterPoints(1); // Ajoute 1 point à Joueur 1
                j1.getPaquet().add(carteJ1); // Joueur 1 gagne la carte
                j1.getPaquet().add(carteJ2); // Ajoute également la carte de Joueur 2
            } else if (comparaison < 0) {
                System.out.println(j2.getNom() + " gagne ce tour!");
                j2.ajouterPoints(1); // Ajoute 1 point à Joueur 2
                j2.getPaquet().add(carteJ2); // Joueur 2 gagne la carte
                j2.getPaquet().add(carteJ1); // Ajoute également la carte de Joueur 1
            } else {
                System.out.println("Égalité! Les cartes sont égales.");
            }

            // Afficher le score après chaque tour
            System.out.println("Scores - " + j1.getNom() + ": " + j1.getScore() + ", " + j2.getNom() + ": " + j2.getScore());
            System.out.println("Cartes restantes - " + j1.getNom() + ": " + paquet1.size() + ", " + j2.getNom() + ": " + paquet2.size());
            System.out.println(); // Ligne vide pour une meilleure lisibilité
        }

        // Déterminer le gagnant final
        if (paquet1.isEmpty()) {
            System.out.println(j2.getNom() + " a gagné la partie! Score : " + j2.getScore() );
        } else {
            System.out.println(j1.getNom() + " a gagné la partie! Score final : " + j1.getScore());
        }
    }
}