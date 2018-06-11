package modele;

import dao.PieceDao;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Partie {
    /* Attributs */
    private int idPartie;
    private String designation;
    private Date date;
    public List<Piece> pieces;
    public List<Joueur> joueurs;
    
    /* Constructeurs */
    public Partie() {}

    public Partie(int idPartie, String designation, Date date, List<Joueur> joueurs) {
        this.idPartie = idPartie;
        this.designation = designation;
        this.date = date;
        this.joueurs = joueurs;
        distribuer();
    }
    
    /* Getters */
    public int getIdPartie() {
        return idPartie;
    }

    public String getDesignation() {
        return designation;
    }

    public Date getDate() {
        return date;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }
    
    /* Setters */
    public void setIdPartie(int idPartie) {
        this.idPartie = idPartie;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

    /* Fonctions */
    public void distribuer() {
        try {
            List<Piece> toutesPieces = PieceDao.findAll(true);
            int nbPieces = toutesPieces.size();
            int nbFaces = 2;
            if("triomino".equals(designation)) {
                nbFaces++;
            }
            Piece p;
            pieces = new ArrayList();
            for(int i=0; i<nbPieces; i++) {
                if("domino".equals(designation)) {
                    p = (PieceDomino)toutesPieces.get(i);
                } else {
                    p = (PieceTriomino)toutesPieces.get(i);
                }
                if(p.getNomImage().length() == nbFaces) {
                    pieces.add(p);
                }
            }
            
        } catch(Exception exp) {
            
        }
    }
    
    public static int[] genererIndicesAleatoire(int nombre) {
        int ordre[] = new int[nombre];
        int rand = (int) (Math.random() * nombre);
        boolean doublon = false;
        int i, j;
        for(i=0; i<nombre; i++) {
            while(doublon) {
                for(j=0; j<i; j++) {
                    if(ordre[j] == rand) {
                        rand = (int) (Math.random() * 28);
                        doublon = true;
                        break;
                    }
                    if(j == (i - 1)) {
                        doublon = false;
                    }
                }
            }
            doublon = true;
            ordre[i] = rand;
        }
        return ordre;
    }
}