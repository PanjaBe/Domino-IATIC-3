package modele;

public class DetailScore {
    /* Attributs */
    private int idDetailScore;
    private int points;   
    private Partie partie;
    private Joueur joueur;
    
    /* Constructeur */
    public DetailScore() {}

    public DetailScore(int idDetailScore, int points, Partie partie, Joueur joueur) {
        this.idDetailScore = idDetailScore;
        this.points = points;
        this.partie = partie;
        this.joueur = joueur;
    }

    /* Getters */
    public int getIdDetailScore() {
        return idDetailScore;
    }

    public int getPoints() {
        return points;
    }

    public Partie getPartie() {
        return partie;
    }

    public Joueur getJoueur() {
        return joueur;
    }
    
    /* Setters */
    public void setIdDetailScore(int idDetailScore) {
        this.idDetailScore = idDetailScore;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}