package vue;

import java.awt.Container;
import java.awt.Image;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        jButton1 = new javax.swing.JButton();
        scoreButton = new javax.swing.JButton();
        retourButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        jButton1.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jButton1.setText("Domino");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scoreButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        scoreButton.setText("Triomino");
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
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
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(scoreButton)
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

    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton scoreButton;
    // End of variables declaration//GEN-END:variables
}
