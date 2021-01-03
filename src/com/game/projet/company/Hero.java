package com.game.projet.company;


public class Hero{
    Arme[] armeHero = new Arme[2];
    //Arme armeHero;
    int pointsVie;

    public Hero() {
        pointsVie = 200;
       // armeHero = new Arme();

        armeHero[0]=new Epee();
        armeHero[1]=new FlaqueEau();
    }


    public boolean estEnVie(){// fonction qui nous permet
        return this.pointsVie>0;
    }


    public boolean Attaque(Monstre monstre, int nbrecombat){

        if(monstre.armePersonnage.equals("magicien")){

            return monstre.dommageAffliger(armeHero[1].getNbrPointsAttaque(),nbrecombat);

        }else return monstre.dommageAffliger(armeHero[0].getNbrPointsAttaque(), nbrecombat);// retune false si le monstre e est mort sinon true

    }


    // dommages causées par  le monstre

    public boolean dommageAffliger(int nbreDommage, int nbrecombat) {

        pointsVie -= nbreDommage*nbrecombat;

        if (pointsVie <= 0) {
            System.out.println("Vous êtes mort 🤪");
        }else {
            System.out.println("Vous avez perdu  " +nbreDommage*nbrecombat+ " points de vie"+". Il vous reste " + pointsVie+" points de vie");
        }
        return estEnVie();
    }
}