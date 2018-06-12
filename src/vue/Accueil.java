package vue;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Accueil extends javax.swing.JFrame {
    /* Attributs */
    private BufferedImage fond;
    private int numPage;
    
    /* Constructeur */
    public Accueil() {
        setTitle("Magic 6 Polyomino");
        setIconImage(new ImageIcon("src\\images\\icon.png").getImage());
        try {
            fond = ImageIO.read(new File("src\\images\\fond.jpg"));
            setContentPane(new MonFond(fond));
        } catch(IOException exp) {
        } finally {
            initComponents();  
            numPage = 0;
        }
    }  
    
    /* Code généré par netbeans */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        partieButton = new javax.swing.JButton();
        scoreButton = new javax.swing.JButton();
        regleButton = new javax.swing.JButton();
        quitterButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        partieMenuItem = new javax.swing.JMenuItem();
        precedentMenuItem = new javax.swing.JMenuItem();
        quitterMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        partieButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        partieButton.setText("Nouvelle Partie");
        partieButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partieButtonActionPerformed(evt);
            }
        });

        scoreButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        scoreButton.setText("Voir les scores");
        scoreButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreButtonActionPerformed(evt);
            }
        });

        regleButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        regleButton.setText("Voir les règles");
        regleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regleButtonActionPerformed(evt);
            }
        });

        quitterButton.setFont(new java.awt.Font("Poor Richard", 0, 18)); // NOI18N
        quitterButton.setText("Quitter");
        quitterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poor Richard", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(partieButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scoreButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(quitterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(partieButton)
                .addGap(18, 18, 18)
                .addComponent(scoreButton)
                .addGap(18, 18, 18)
                .addComponent(regleButton)
                .addGap(18, 18, 18)
                .addComponent(quitterButton)
                .addContainerGap(179, Short.MAX_VALUE))
        );

        jMenu1.setText("Programme");

        partieMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        partieMenuItem.setText("Nouvelle partie");
        partieMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partieMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(partieMenuItem);

        precedentMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        precedentMenuItem.setText("Précédent");
        precedentMenuItem.setEnabled(false);
        precedentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedentMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(precedentMenuItem);

        quitterMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        quitterMenuItem.setText("Quitter");
        quitterMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(quitterMenuItem);

        menuBar.add(jMenu1);

        jMenu2.setText("Jeu");
        jMenu2.setEnabled(false);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItem3.setText("Arrêter");
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /* Fonctions */
    public void precedent() {
        if(numPage == 1) {
            setContentPane(new MonFond(fond));
            initComponents();   
            numPage = 0;
            precedentMenuItem.setEnabled(false);         
        } else if(numPage == 2) {
            numPage = 1;
            setContentPane(new Partie(fond));
        }
        repaint();
        revalidate();
    }
    
    /* Attribution des actions aux boutons et sous-menus */
    private void scoreButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreButtonActionPerformed
        setContentPane(new Score(fond));
        repaint();
        revalidate();
        numPage = 1;
        precedentMenuItem.setEnabled(true);
    }//GEN-LAST:event_scoreButtonActionPerformed

    private void precedentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedentMenuItemActionPerformed
        precedent();
    }//GEN-LAST:event_precedentMenuItemActionPerformed

    private void partieButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partieButtonActionPerformed
        setContentPane(new Partie(fond));
        repaint();
        revalidate();
        numPage = 1;
        precedentMenuItem.setEnabled(true);
    }//GEN-LAST:event_partieButtonActionPerformed

    private void regleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regleButtonActionPerformed
        setContentPane(new Regle(fond));
        repaint();
        revalidate();
        numPage = 1;
        precedentMenuItem.setEnabled(true);
    }//GEN-LAST:event_regleButtonActionPerformed

    private void quitterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterButtonActionPerformed
        dispose();
    }//GEN-LAST:event_quitterButtonActionPerformed

    private void quitterMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterMenuItemActionPerformed
        dispose();
    }//GEN-LAST:event_quitterMenuItemActionPerformed

    private void partieMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partieMenuItemActionPerformed
        setContentPane(new Partie(fond));
        repaint();
        revalidate();
        numPage = 1;
        precedentMenuItem.setEnabled(true);
    }//GEN-LAST:event_partieMenuItemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton partieButton;
    private javax.swing.JMenuItem partieMenuItem;
    private javax.swing.JMenuItem precedentMenuItem;
    private javax.swing.JButton quitterButton;
    private javax.swing.JMenuItem quitterMenuItem;
    private javax.swing.JButton regleButton;
    private javax.swing.JButton scoreButton;
    // End of variables declaration//GEN-END:variables
}
