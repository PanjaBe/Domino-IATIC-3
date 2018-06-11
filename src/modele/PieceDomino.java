package modele;

public class PieceDomino extends Piece {
    /* Fonctions */
    @Override
    public boolean poser(Piece p2) {
        if(!p2.getFace().get(0).estDisponible() && !p2.getFace().get(1).estDisponible()) {
            return false;
        }
        int i, j;
        for(i=0; i<2;i++) {
            for(j=0; j<2; j++) {
                
            }
        }
        return false;
    }

}