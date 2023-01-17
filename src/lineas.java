import java.awt.Color;
import javax.swing.JFrame;

public class lineas {
    public static void main(String[] args) {
        JFrame aplicacion = new JFrame();

        LineasRectsOvalosJPanel panel = new LineasRectsOvalosJPanel();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);
        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);
    }
}
