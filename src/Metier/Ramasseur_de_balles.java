package Metier;

/***********************************************************************
 * Module:  Ramasseur_de_balles.java
 * Author:  p1200886
 * Purpose: Defines the Class Ramasseur_de_balles
 ***********************************************************************/

import java.util.*;

public class Ramasseur_de_balles extends EquipeRamasseurs {
   private int numRamasseur;
   private String nom;
   private String prenom;
   private String date_de_naissance;

    public Ramasseur_de_balles(int numRamasseur, String nom, String prenom, String date_de_naissance, int numEquipe) {
        super(numEquipe);
        this.numRamasseur = numRamasseur;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
    }

}