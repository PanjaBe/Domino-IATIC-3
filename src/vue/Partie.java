package vue;

import java.awt.Container;
import java.awt.Image;
import java.lang.reflect.Method;

public class Partie extends MonFond {
    /* Constructeur */
    public Partie(Image image) {
        super(image);
        initComponents();
    }

    /* Code généré par netbeans */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dominoButton = new javax.swing.JButton();
        triominoButton = new javax.swing.JButton();
        retourButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        dominoButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        dominoButton.setText("Domino");
        dominoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dominoButtonActionPerformed(evt);
            }
        });

        triominoButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        triominoButton.setText("Triomino");
        triominoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triominoButtonActionPerformed(evt);
            }
        });

        retourButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Jeu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dominoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(triominoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(102, 102, 102))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(dominoButton)
                .addGap(18, 18, 18)
                .addComponent(triominoButton)
                .addGap(65, 65, 65)
                .addComponent(retourButton)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* Fonctions */
    public void goToChoixAdversaire(String type) {
        Container parent = getParent().getParent().getParent();
        Method m;
        try {
            Class[] typeArgs = new Class[1];
            typeArgs[0] = String.class;
            m = parent.getClass().getMethod("goToChoixAdversaire", typeArgs);
            m.invoke(parent, new Object[]{type});
        } catch (Exception ex) {
        }
    }
    
    /* Attribution des actions aux boutons */
    private void triominoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triominoButtonActionPerformed
        goToChoixAdversaire("domino");
    }//GEN-LAST:event_triominoButtonActionPerformed

    private void dominoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dominoButtonActionPerformed
        goToChoixAdversaire("triomino");
    }//GEN-LAST:event_dominoButtonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Container parent = getParent().getParent().getParent();
        Method m;
        try {
            m = parent.getClass().getMethod("precedent", null);
            m.invoke(parent, null);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_retourButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dominoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton triominoButton;
    // End of variables declaration//GEN-END:variables
}
