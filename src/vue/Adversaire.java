package vue;

import java.awt.Container;
import java.awt.Image;
import java.lang.reflect.Method;

public class Adversaire extends MonFond {
    /* Attributs */
    private String type;
    
    /* Constructeur */
    public Adversaire(Image image, String type) {
        super(image);
        this.type = type;
        initComponents();
    }
    
    /* Code généré par netbeans */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ordinateurButton = new javax.swing.JButton();
        humainButton = new javax.swing.JButton();
        retourButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel3.setOpaque(false);

        ordinateurButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        ordinateurButton.setText("Ordinateur");
        ordinateurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordinateurButtonActionPerformed(evt);
            }
        });

        humainButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        humainButton.setText("Humain");
        humainButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humainButtonActionPerformed(evt);
            }
        });

        retourButton2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        retourButton2.setText("Retour");
        retourButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Adversaire");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ordinateurButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(humainButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(retourButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(ordinateurButton)
                .addGap(18, 18, 18)
                .addComponent(humainButton)
                .addGap(65, 65, 65)
                .addComponent(retourButton2)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* Fonctions */
    public void goToNombreAdversaire(String type, String typeAdversaire) {
        Container parent = getParent().getParent().getParent();
        Method m;
        try {
            Class[] typeArgs = new Class[2];
            typeArgs[0] = String.class;
            typeArgs[1] = String.class;
            m = parent.getClass().getMethod("goToNombreAdversaire", typeArgs);
            m.invoke(parent, new Object[]{type, typeAdversaire});
        } catch (Exception ex) {
        }
    }
    
    /* Attribution des actions aux boutons */
    private void ordinateurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordinateurButtonActionPerformed
        goToNombreAdversaire(type, "ordinateur");
    }//GEN-LAST:event_ordinateurButtonActionPerformed

    private void humainButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humainButtonActionPerformed
        goToNombreAdversaire(type, "humain");
    }//GEN-LAST:event_humainButtonActionPerformed

    private void retourButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButton2ActionPerformed
        Container parent = getParent().getParent().getParent();
        Method m;
        try {
            m = parent.getClass().getMethod("precedent", null);
            m.invoke(parent, null);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_retourButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton humainButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton ordinateurButton;
    private javax.swing.JButton retourButton;
    private javax.swing.JButton retourButton1;
    private javax.swing.JButton retourButton2;
    private javax.swing.JButton scoreButton;
    private javax.swing.JButton scoreButton1;
    // End of variables declaration//GEN-END:variables
}
