package modele;

import java.util.Date;
import java.util.List;

public class Domino extends Partie {
    /* Constructeur */
    public Domino(int idPartie, String designation, Date date, List<Joueur> joueurs) {
        super(idPartie, designation, date, joueurs);
    }
    
    /* Fonctions */
    @Override
    public void distribuer() {
        super.distribuer();
        int nbJoueurs = joueurs.size();
        int ordre[] = Partie.genererIndicesAleatoire(28);
        int i, j, k = 0, limite = 7;
        if(nbJoueurs>2) {
            limite = 6;
        }
        for(i=0; i<limite; i++) {
            for(j=0; j<nbJoueurs; j++) {
                joueurs.get(j).getPiece().add(pieces.get(ordre[k]));
                k++;
            }
        }
    }
}