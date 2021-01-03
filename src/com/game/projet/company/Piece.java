package com.game.projet.company;

import java.util.Scanner;

public class Piece {

    Monstre monstre;

    public Piece(){   // constructeur de la pièce qui initialise le monstre soit à Magicien ou barbar

        if(Math.random()<0.5){  //Magicien
            monstre=new Magicien();

        }else {
            monstre=new Barbar();
        }

    }



    public boolean entrePiece(Hero aventurier){
        
        Scanner scanner =new Scanner(System.in);
        boolean etatBarbar=true;

        int nombreCombat =0;

        while (aventurier.estEnVie()&& monstre.estEnVie()){

            nombreCombat++;

                if(monstre.nomMonstre.equals("magicien")) {  // si c'est un magicien qui attaque

                    System.out.println("Vous êtes attaqué par un magicien");

                    monstre.Attaque(aventurier,1); // le combat


                    if (Math.random() < 0.1) { // 10% de chance que le magicien paralyse le hero


                        System.out.println("Le magicien vous a paralysé, vous ne pourrez pas l'attaquer\n ");

                    }else{
                        System.out.print("Pour attaquer le magicien vous devez choisir \"FlaqueEau\" " +"comme arme.\n"
                                        +"Entrez votre choix ici :...");


                        if ((scanner.nextLine()).equals("FlaqueEau")) { // si Le joueur a mal saisi le nom de l'arme,
                                                                        // il ne pourra pas attaquer
                            aventurier.Attaque(monstre, nombreCombat);
                        }else{
                            System.out.println("Vous avez fait une erreur de saisie");
                        }

                    }

                        //******************** le monstre dans la piece c'est Le barbar
                }else {

                        if(etatBarbar){ // le barbar n'est pas paralysé
                            System.out.println("Vous êtes attaqué par un barbar");

                            if (Math.random() < 0.3) {                  // le barbar a 30 % de chance de donner un coup double
                                                                        // (on double ses point d'attaque pour cette partie seulement )
                                monstre.Attaque(aventurier,2);// c'est pourquoi le  "2"
                            }else {
                                monstre.Attaque(aventurier,1); // sinon attaque habituelle
                            }
                        }

                      System.out.print("Vous devez choisir \"Epee\" pour combattre le barbar\n"+
                                        "Entrez votre choix ici :...");

                        if((scanner.nextLine()).equals("Epee")){     //    Si le joueur saisi correctement le nom de l'arme

                            aventurier.Attaque(monstre,1); //   il combatera le barbar et
                            if (Math.random()<0.1){                  //   il a 10% de lui donner un dur
                                etatBarbar=false;                    //   Donc il ne combatera prochaine tour.
                                System.out.println("Vous avez paralyser le barbars");
                            }

                        }else{
                            System.out.println("Vous avez fait une erreur de saisie");
                        }

                }



        };

        return aventurier.estEnVie();
    }



}








