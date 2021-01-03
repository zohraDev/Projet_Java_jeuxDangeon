package com.game.projet.company;

public class Monstre{

    protected String nomMonstre;
    protected int pointsVie;
    protected Arme armePersonnage;

    public Monstre(){


    }



    public boolean estEnVie(){// fonction qui nous permet
        return this.pointsVie>0;
    }

    public boolean Attaque(Hero aventurier, int nbrecombat ){

          return aventurier.dommageAffliger(armePersonnage.getNbrPointsAttaque(),nbrecombat); // les dommage causé par le monstre à l'aventurier
                                                                                   // retune false si l'aventurier est mort sinon true

    }
    // les dommages causées par le Hero.


    public boolean dommageAffliger(int nbreDommage,int k) {
        pointsVie -= nbreDommage*k;
      if (pointsVie <= 0) {
            System.out.println("Vous avez tuer le monstre 🥳");
       }  else {
            System.out.println("Le monstre a perdu  " + nbreDommage*k + " points de vie . Il lui reste " + pointsVie+" points de vie");
       }
        return estEnVie();
    }




}
