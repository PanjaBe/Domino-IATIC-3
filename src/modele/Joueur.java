package modele;

import java.util.List;

public class Joueur {
    /* Attributs */
    private int idJoueur;
    private String pseudo;
    public List<Piece> piece;
    
    /* Constructeur */
    public Joueur() {}

    public Joueur(int idJoueur, String pseudo, List<Piece> piece) {
        this.idJoueur = idJoueur;
        this.pseudo = pseudo;
        this.piece = piece;
    }

    /* Getters */
    public int getIdJoueur() {
        return idJoueur;
    }

    public String getPseudo() {
        return pseudo;
    }

    public List<Piece> getPiece() {
        return piece;
    }
    
    /* Setters */
    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setPiece(List<Piece> piece) {
        this.piece = piece;
    }

    /* Fonctions */
    public boolean poserPiece() { return true; }
}