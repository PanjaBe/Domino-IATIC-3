package controleur;

import dao.DetailScoreDao;
import dao.JoueurDao;
import dao.PartieDao;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modele.DetailScore;
import modele.Domino;
import modele.Humain;
import modele.Ia;
import modele.Joueur;
import modele.Partie;
import modele.Piece;
import modele.PieceDomino;
import modele.Triomino;
import utilitaire.UtilDB;

public class PartieControleur {
    /* Attributs */
    private int nbJoueurs;
    private Partie partie;

    /* Setters */
    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }
    
    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    /* Fonctions */
    public void lancer(String designation, ArrayList<String> pseudos) {
        ArrayList<Joueur> joueurs = new ArrayList();
        nbJoueurs = pseudos.size();
        Joueur joueur;
        String pseudo;
        for(int i=0; i<nbJoueurs; i++) {
            pseudo = pseudos.get(i);
            if(pseudo.length()>=3 && "IA".equals(pseudo.substring(0,2))) {
                joueur = new Ia();
            } else {
                joueur = new Humain();
            }
            joueur.setPseudo(pseudo);
            joueurs.add(joueur);
        }
        if("domino".equals(designation)) {
            partie = new Domino(0, designation, new Date(), joueurs);            
        } else {            
            partie = new Triomino(0, designation, new Date(), joueurs);
        }
    }
    
    public void enregistrer(int points[]) {
        try {
            List<Joueur> joueurs = JoueurDao.findAll(true);
            ArrayList<String> pseudos = new ArrayList();
            int i, taille = joueurs.size();
            for(i=0; i<taille; i++) {
                pseudos.add(joueurs.get(i).getPseudo());
            }
            List<Joueur> joueursPartie = partie.getJoueurs();
            Joueur joueur;
            for(i=0; i<nbJoueurs; i++) {
                joueur = joueursPartie.get(i);
                if(!pseudos.contains(joueur.getPseudo())) {
                    joueur.setIdJoueur(UtilDB.getNextId("joueur"));
                    JoueurDao.save(joueur);
                }
            }
            partie.setIdPartie(UtilDB.getNextId("partie"));
            PartieDao.save(partie);
            DetailScore detailScore;
            for(i=0; i<nbJoueurs; i++) {
                joueur = joueursPartie.get(i);
                detailScore = new DetailScore(UtilDB.getNextId("detailscore"), points[i], partie, joueur);
                DetailScoreDao.save(detailScore);
            }
            JOptionPane.showMessageDialog(null, "Scores enregistrés.", "Enregistrement", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(Exception exp) {
            JOptionPane.showMessageDialog(null, "Erreur lors de l'enregistrement.", "Enregistrement", JOptionPane.ERROR_MESSAGE);
        }
    }
}
