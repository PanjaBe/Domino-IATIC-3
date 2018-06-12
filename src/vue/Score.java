package vue;

import dao.DetailScoreDao;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import modele.DetailScore;

public class Score extends MonFond {    
    /* Constructeur */
    public Score(Image image) {
        super(image);
        initComponents();
        try {
            List<DetailScore> scores = DetailScoreDao.findAll(true);
            List<DetailScore> scoresDomino = new ArrayList();
            List<DetailScore> scoresTriomino = new ArrayList();
            int taille = scores.size(), tailleDomino = 0, tailleTriomino = 0;
            DetailScore detail;
            for(int i=0; i<taille; i++) {
                detail = scores.get(i);
                if("domino".equals(detail.getPartie().getDesignation())) {
                    scoresDomino.add(detail);
                    tailleDomino++;
                } else {
                    scoresTriomino.add(detail);
                    tailleTriomino++;
                }
            }
            DefaultTableModel model = new DefaultTableModel();
            model.addRow(new Object[]{1,new Date(),"huhu",10});
            tableauDomino.setModel(model);
        } catch(Exception exp) { 
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane = new javax.swing.JScrollPane();
        tableauDomino = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableauTriomino = new javax.swing.JTable();

        tableauDomino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Numéro", "Date", "Joueur", "Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tableauDomino);

        jScrollPane1.setViewportView(jScrollPane);

        jTabbedPane1.addTab("Domino", jScrollPane1);

        tableauTriomino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numéro", "Date", "Joueur", "Points"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tableauTriomino);

        jScrollPane3.setViewportView(jScrollPane4);

        jTabbedPane1.addTab("Triomino", jScrollPane3);

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
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableauDomino;
    private javax.swing.JTable tableauTriomino;
    // End of variables declaration//GEN-END:variables
}
