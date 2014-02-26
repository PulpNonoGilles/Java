package Metier;

/***********************************************************************
 * Module:  Arbitre.java
 * Author:  p1200886
 * Purpose: Defines the Class Arbitre
 ***********************************************************************/

import java.util.*;

public class Arbitre {
   private int numArbitre;
   private String nom;
   private String prenom;
   private Date date_de_naissance;
   private String categorie;
   private int nombreArbitrage;

    public Arbitre(int numArbitre, String nom, String prenom, Date date_de_naissance, String categorie, int nombreArbitrage) {
        this.numArbitre = numArbitre;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.categorie = categorie;
        this.nombreArbitrage = nombreArbitrage;
    }
   
   
   public boolean PeutArbitrer() {
       return (!("ITT1".equals(categorie)) && (nombreArbitrage > 4));
   }
   
}