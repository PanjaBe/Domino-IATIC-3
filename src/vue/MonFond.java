package vue;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JComponent;

public class MonFond extends JComponent {
    /* Attribut */
    private final Image image;
    
    /* Constructeur */
    public MonFond(Image image) {
        this.image = image;
    }
    
    /* Fonction */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
