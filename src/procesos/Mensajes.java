package procesos;

import javax.swing.JOptionPane;

public class Mensajes {

    public static void mostrar(String msj) {
        JOptionPane.showMessageDialog(null, msj);
    }

    public static String leerTexto(String msj) {
        return JOptionPane.showInputDialog(msj);
    }

    public static int confirmar(String titulo, String msj) {
        return JOptionPane.showConfirmDialog(null,
                msj,
                titulo,
                JOptionPane.YES_NO_OPTION);
    }
}
