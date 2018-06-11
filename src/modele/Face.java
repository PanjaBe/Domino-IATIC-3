package modele;

public class Face {
    /* Attributs */
    private int numero;
    private boolean disponibilite;

    /* Getters */
    public int getNumero() {    
        return numero;
    }

    /* Setters */
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /* Fonctions */
    public boolean estDisponible() {
        return disponibilite;
    }
}