package Metier;

/***********************************************************************
 * Module:  Joueur.java
 * Author:  p1200886
 * Purpose: Defines the Class Joueur
 ***********************************************************************/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Joueur extends Equipe {
   private int numLicence;
   private String nom;
   private String prenom;
   private Date date_de_naissance;
   private boolean qualifie;

    public Joueur(int numEquipe,int numLicence, String nom, String prenom, String date_de_naissance, boolean qualifie) throws ParseException {
        super(numEquipe);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date fdate = sdf.parse(date_de_naissance);
        this.numLicence = numLicence;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = fdate;
        this.qualifie = qualifie;
    }
   

   
   public boolean estQualifie() {
      return qualifie;
   }
   
}