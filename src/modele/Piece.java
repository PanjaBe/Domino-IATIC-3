package modele;

import java.util.List;

public class Piece {
    /* Attributs */
    private int idPiece;
    private int orientation;
    private int etat;
    private String nomImage;
    private List<Face> face;
    
    /* Constructeur */
    public Piece() {}

    public Piece(int idPiece, int orientation, int etat, String nomImage, List<Face> face) {
        this.idPiece = idPiece;
        this.orientation = orientation;
        this.etat = etat;
        this.nomImage = nomImage;
        this.face = face;
    }

    /* Getters */    
    public int getIdPiece() {
        return idPiece;
    }

    public int getOrientation() {
        return orientation;
    }

    public int getEtat() {
        return etat;
    }

    public String getNomImage() {
        return nomImage;
    }
    
    public List<Face> getFace() {
        return face;
    }    

    /* Setters */
    public void setIdPiece(int idPiece) {
        this.idPiece = idPiece;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }
    
    public void setFace(List<Face> face) {
        this.face = face;
    }

    /* Fonctions */
    public boolean poser(Piece p2) { 
        return true;
    }
}