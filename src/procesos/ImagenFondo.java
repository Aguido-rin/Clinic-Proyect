package procesos;
/**
 *
 * @author Jorge Flores
 */
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class ImagenFondo implements Border {
    public BufferedImage back;

    public ImagenFondo() {
        try {
            // Intenta cargar la imagen
            URL imagePath = getClass().getResource("../resources/portadahistoriaclinico.jpg");
            if (imagePath != null) {
                back = ImageIO.read(imagePath);
            } else {
                System.err.println("No se pudo encontrar la imagen en la ruta especificada.");
                System.out.println("ruta imagne "+imagePath);
            }
        } catch (IOException ex) {
            System.err.println("Error al cargar la imagen: " + ex.getMessage());
        }
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        if (back != null) {
            // Dibuja la imagen centrada
            g.drawImage(back, x + (width - back.getWidth()) / 2, y + (height - back.getHeight()) / 2, null);
        }
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(0, 0, 0, 0);
    }

    @Override
    public boolean isBorderOpaque() {
        return false;
    }
}
