package modele;

import java.util.Date;
import java.util.List;

public class Triomino extends Partie {
    /* Conctructeur */
    public Triomino(int idPartie, String designation, Date date, List<Joueur> joueurs) {
        super(idPartie, designation, date, joueurs);
    }
    
    /* Fonctions */
    @Override
    public void distribuer() {
        super.distribuer();
        int nbJoueurs = joueurs.size();
        int ordre[] = Partie.genererIndicesAleatoire(56);
        int i, j, k = 0, limite = 9;
        if(nbJoueurs>2) {
            limite = 7;
        }
        for(i=0; i<limite; i++) {
            for(j=0; j<nbJoueurs; j++) {
                joueurs.get(j).getPiece().add(pieces.get(ordre[k]));
                k++;
            }
        }
    }
}