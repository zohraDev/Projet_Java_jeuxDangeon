package com.game.projet.company;

import java.util.Scanner;

public class Dangeon {
            
    Piece[] pieceDangeon = new Piece[5];

            public Dangeon(){

                for (int i=0; i<pieceDangeon.length;i++){

                 pieceDangeon[i]= new Piece();//Création des 5 pièces
            }
            }




    public void entreDangeon(Hero aventurier) { // méthode qui fait rentre le Héro dans le Dangeon

                int i=0;
        Scanner scanner =new Scanner(System.in);

        while (aventurier.estEnVie()&&(i < 5)){  //condition d'arrêt : si le joueur est tjrs en vie
                                                // Je continue jusqu'à la 5 pièce


            System.out.println("\nVous rentrez dans la pièce N°"+ (i+1) +"\n");
            System.out.println("\n"+pieceDangeon[i].monstre.nomMonstre+" se cache derière la porte\n");

            pieceDangeon[i].entrePiece(aventurier); // l'aventurier entre dans la pièce pour combatre le monstre



                    i++;

        }
        if (aventurier.estEnVie()){  // si l'aventurier est en vie, il rècupère le trèsor.
             System.out.println("Bravo, vous avez reccuperé le trésor 🤩  🥳");
        }

                
    }
}
