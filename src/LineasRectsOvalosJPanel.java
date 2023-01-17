import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class LineasRectsOvalosJPanel  extends  JPanel{

    public void paintComponent (Graphics g){
        super.paintComponent(g);


        int [] puntosX = {300,300,400,400,500,600,600,700,700,500};
        int [] puntosY = {100,600,600,300,400,300,600,600,100,300};

        g.drawPolygon(puntosX,puntosY,10);
    }

}
