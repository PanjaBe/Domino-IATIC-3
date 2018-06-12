package vue;

import java.awt.Image;

public class Regle extends MonFond {
    /* Constructeur */
    public Regle(Image image) {
        super(image);
        initComponents();
    }

    /* Code généré par netbeans */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        jTabbedPane1.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Poor Richard", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Le jeu se joue avec 28 Dominos et de 2 à 4 joueurs. Les pièces de domino sont habituellement deux fois plus longues que large et\nsont constituées (pour le jeu le plus courant, double-six) d’un nombre de 0 à 6 sur une moitié de domino et sur l’autre moitié \négalement.\n\nIl y a donc au total 7 × (7+1) / 2 = 28 pièces.\n\nLe but du jeu est de poser les Dominos les uns à la suite des autres sur une table en les combinant, c'est-à-dire qu'un des côtés du\ndomino posé doit porter le même nombre de points que le domino sur la table. \n\nLe joueur ayant le double le plus élevé (le double 6 donc) commence la partie de domino. Si personne ne possède ce domino, ce\nsera le joueur ayant le double le plus fort. Le joueur suivant doit à son tour poser un domino ayant le même nombre de points sur\nau moins un côté du domino précédemment posé. Les Dominos forment une chaîne.\n\nChaque joueur garde ses dominos cachés, hors de la vue des autres joueurs. Pour une partie à 2 joueurs, chaque joueur pioche 7\nDominos et pour une partie à 3 ou 4 joueurs, chacun pioche 6 Dominos. Celui qui a le domino le plus fort commence. Lorsqu'un\njoueur n'a pas de domino à jouer il passe son tour. Le premier qui a posé tous ses dominos a gagné. Si personne ne pose tous ses\ndominos, c'est celui à qui il en reste le moins qui gagne.\n\nVariante : avec pioche\nLorsqu'un joueur n'a pas de domino à jouer il pioche dans le talon jusqu'à ce qu'il tire un domino qu'il peut placer. Le premier qui\na posé tous ses dominos a gagné. Si personne ne pose tous ses dominos, c'est celui à qui il en reste le moins qui gagne.");
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane1.addTab("Domino", jScrollPane1);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Poor Richard", 0, 16)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("Le jeu se joue avec 56 Triominos et de 2 à 4 joueurs. \n\nLe but du jeu est d’obtenir un maximum de points en plaçant ses Triominos de façon stratégique. Pour une partie à 2 joueurs, \nchaque joueur pioche 9 Triominos et pour une partie à 3 ou 4 joueurs, chacun pioche 7 Triominos. Le reste des Triominos\nconstitue la pioche. \n\nPour décider qui commence la partie, chaque joueur pioche un Triominos. Celui qui obtient le plus fort total en additionnant\nles chiffres de sa tuile devient le premier joueur (en cas d’égalité, piocher de nouveau). Ces tuiles retournent ensuite dans la\npioche.\n\nPour débuter la partie, le premier joueur choisit l’un de ses Triominos et le pose au milieu de la surface de jeu. \n\nIl marque un score correspondant au total des chiffres inscrits sur la tuile jouée. Son tour est alors terminé. La partie se poursuit \ndans le sens des aiguilles d’une montre. On ne peut jouer qu’un seul Triominos par tour.\n\nLe joueur dont c’est le tour doit placer un Triominos à côté d’une tuile déjà posée. Pour que ce coup soit valide, ces 2 Triominos \ndoivent avoir un coté en commun, ce qui signifie que les deux pointes doivent correspondre.\n\nSi un joueur ne peut pas (ou ne veut pas) poser de Triominos, il pioche une tuile et tente aussitôt de la placer. S’il n’y parvient\npas, il en pioche une seconde et tente de la placer. En cas d’insuccès, il pioche une troisième et dernière tuile qu’il tente\négalement de placer.\n\nPour chaque Triominos pioché, ce joueur déduit 5 points de son score. Si après avoir pioché 3 fois il ne peut toujours pas jouer,\nil perd encore 10 points supplémentaires : soit un total de 25 points (5+5+5+10 points de pénalité). On considère alors que son\ntour est fini, c’est au tour du joueur suivant.\n\nSi un joueur doit piocher et que la pioche est vide, il passe son tour et ne change rien à son score.\n\nSi plus personne ne peut jouer, la partie s’arrête. Les joueurs comptabilisent respectivement les points restant de leur\nTriominos et les soustraient de leur total. \n\nLe score est donc calculé en additionnant les trois chiffres du Triominos qui vient d’être placé (voir exemples). Mais en plus de\nla valeur du Triominos posé, il est possible de marquer des points bonus en formant certaines figures :\n-40 points supplémentaires pour un PONT (fig. F). Pour former un pont, il faut un espace vide de chaque côté du Triominos\n\tjoué et que la pointe opposée corresponde.\n-50 points supplémentaires pour un  HEXAGONE (fig. G).\n-60 points supplémentaires pour un DOUBLE HEXAGONE (fig. H).\n-70 points supplémentaires pour un TRIPLE HEXAGONE (fig. I).");
        jScrollPane2.setViewportView(jTextArea2);

        jTabbedPane1.addTab("Triomino", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
