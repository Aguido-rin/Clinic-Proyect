package mensajes;

import javax.swing.JOptionPane;

/**
 *
 * @author AguidoRin
 */
public class Mensajes {
    public static void MensajeMostrar(String msj){
        JOptionPane.showMessageDialog(null,msj);
    }
    public static String MensajeInput(String msj){
        return JOptionPane.showInputDialog(msj);
    }
    public static int MensajeConfirmar(String titulo,String msj){
        return JOptionPane.showConfirmDialog(null, msj, titulo, JOptionPane.YES_NO_OPTION);
    }
}