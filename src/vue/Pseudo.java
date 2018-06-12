package vue;

import java.awt.Container;
import java.awt.Image;
import java.lang.reflect.Method;
import java.util.Enumeration;
import javax.swing.AbstractButton;

public class Pseudo extends MonFond {
    /* Attributs */
    private String type;
    private String typeAdversaire;
    private String nbJoueur;        

    /* Construceur */
    public Pseudo(Image image, String type, String typeAdv) {
        super(image);
        this.type = type;
        this.typeAdversaire = typeAdv;
        initComponents();
        buttonGroup1.add(radio2Joueurs);
        buttonGroup1.add(radio3Joueurs);
        buttonGroup1.add(radio4Joueurs); 
        if("humain".equals(typeAdv)) {
            pseudoJoueur2.setEditable(true);
            pseudoJoueur2.setText("Joueur2");
            pseudoJoueur3.setText("Joueur3");
            pseudoJoueur4.setText("Joueur4");
        }
    }

    /* Code généré par netbeans */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jouerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        retourButton = new javax.swing.JButton();
        pseudoJoueur1 = new javax.swing.JTextField();
        pseudoJoueur2 = new javax.swing.JTextField();
        pseudoJoueur3 = new javax.swing.JTextField();
        pseudoJoueur4 = new javax.swing.JTextField();
        radio2Joueurs = new javax.swing.JRadioButton();
        radio3Joueurs = new javax.swing.JRadioButton();
        radio4Joueurs = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setOpaque(false);

        jouerButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jouerButton.setText("Jouer");
        jouerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jouerButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Adversaire");

        retourButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        retourButton.setText("Retour");
        retourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourButtonActionPerformed(evt);
            }
        });

        pseudoJoueur1.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        pseudoJoueur1.setText("Joueur 1");

        pseudoJoueur2.setEditable(false);
        pseudoJoueur2.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        pseudoJoueur2.setText("IA_1");

        pseudoJoueur3.setEditable(false);
        pseudoJoueur3.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        pseudoJoueur3.setText("IA_2");

        pseudoJoueur4.setEditable(false);
        pseudoJoueur4.setFont(new java.awt.Font("Poor Richard", 0, 14)); // NOI18N
        pseudoJoueur4.setText("IA_3");

        radio2Joueurs.setFont(new java.awt.Font("Poor Richard", 0, 16)); // NOI18N
        radio2Joueurs.setForeground(new java.awt.Color(204, 204, 204));
        radio2Joueurs.setSelected(true);
        radio2Joueurs.setText("2 Joueurs");
        radio2Joueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        radio3Joueurs.setFont(new java.awt.Font("Poor Richard", 0, 16)); // NOI18N
        radio3Joueurs.setForeground(new java.awt.Color(204, 204, 204));
        radio3Joueurs.setText("3 Joueurs");
        radio3Joueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        radio4Joueurs.setFont(new java.awt.Font("Poor Richard", 0, 16)); // NOI18N
        radio4Joueurs.setForeground(new java.awt.Color(204, 204, 204));
        radio4Joueurs.setText("4 Joueurs");
        radio4Joueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nombre des Joueurs :");

        jLabel3.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Pseudo des joueurs :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(radio2Joueurs)
                                    .addComponent(radio4Joueurs)
                                    .addComponent(radio3Joueurs)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pseudoJoueur3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pseudoJoueur1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pseudoJoueur2)
                                    .addComponent(pseudoJoueur4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(retourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jouerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio2Joueurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio3Joueurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radio4Joueurs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pseudoJoueur1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pseudoJoueur2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pseudoJoueur3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pseudoJoueur4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jouerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(retourButton)
                .addContainerGap(147, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /* Attribution des actions aux boutons */
    private void jouerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jouerButtonActionPerformed
        Container parent = getParent().getParent().getParent();
        Method m;
        try {
            Class[] typeArgs = new Class[1];
            typeArgs[0] = String.class;
            m = parent.getClass().getMethod("goToPartie", typeArgs);
            m.invoke(parent, new Object[]{type});
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jouerButtonActionPerformed

    private void retourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourButtonActionPerformed
        Container parent = getParent().getParent().getParent();
        Method m;
        try {
            m = parent.getClass().getMethod("precedent", null);
            m.invoke(parent, null);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_retourButtonActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        for (Enumeration<AbstractButton> buttons = buttonGroup1.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                nbJoueur = button.getText();
            }
        }
        if("humain".equals(typeAdversaire)) {
            switch (nbJoueur) {
                case "2 Joueurs":
                    pseudoJoueur1.setEditable(true);
                    pseudoJoueur2.setEditable(true);
                    pseudoJoueur3.setEditable(false);
                    pseudoJoueur4.setEditable(false);
                    break;
                case "3 Joueurs":
                    pseudoJoueur1.setEditable(true);
                    pseudoJoueur2.setEditable(true);
                    pseudoJoueur3.setEditable(true);
                    pseudoJoueur4.setEditable(false);
                    break;
                default:
                    pseudoJoueur1.setEditable(true);
                    pseudoJoueur2.setEditable(true);
                    pseudoJoueur3.setEditable(true);
                    pseudoJoueur4.setEditable(true);
                    break;
            }
        }
    }//GEN-LAST:event_nombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jouerButton;
    private javax.swing.JTextField pseudoJoueur1;
    private javax.swing.JTextField pseudoJoueur2;
    private javax.swing.JTextField pseudoJoueur3;
    private javax.swing.JTextField pseudoJoueur4;
    private javax.swing.JRadioButton radio2Joueurs;
    private javax.swing.JRadioButton radio3Joueurs;
    private javax.swing.JRadioButton radio4Joueurs;
    private javax.swing.JButton retourButton;
    // End of variables declaration//GEN-END:variables
}
