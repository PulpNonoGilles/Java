package Metier;

/***********************************************************************
 * Module:  Match.java
 * Author:  p1200886
 * Purpose: Defines the Class Match
 ***********************************************************************/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Match {
   private static int numMatch = 0;
   private Date date_heure;
   private String heure;
   private int type, categorie;
   private Court court;

    public Match(String date, String heure, int type, Court court, int categorie) throws ParseException {
        this.numMatch =+ numMatch;
        String s = date.concat(" ").concat(heure);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mi:ss");
        Date fdate = sdf.parse(s);
        this.date_heure = fdate;
        this.type = type;
        this.court = court;
        this.categorie = categorie;
    }
   
   
   public void modifier(String date, String heure, int type, Court court, int categorie) throws ParseException {
        String s = date.concat(" ").concat(heure);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy hh:mi:ss");
        Date fdate = sdf.parse(s);
        this.date_heure = fdate;
        this.type = type;
        this.court = court;
        this.categorie = categorie;
   }
 
   
   /** @pdOid 9f652d57-00cd-4ba5-84f3-09f6a5d95bcf */
   public void AffecterArbitre() {
      // TODO: implement
   }

}