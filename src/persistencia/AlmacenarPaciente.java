package persistencia;

import estructuras.paciente.ListacPaciente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import procesos.Mensajes;

public class AlmacenarPaciente {
    public static String ARCHIVO = "DatosListaPacientes.bin";
    public static void guardarLista(ListacPaciente Lista){
        try {
            FileOutputStream fos = new FileOutputStream(ARCHIVO);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Lista);
            oos.close();
        } catch (Exception e) {
            Mensajes.leerTexto("ERROR no se puede guardar "+e);
        }
    }
    
    public static ListacPaciente recuperarLista(){
        ListacPaciente Lista = new ListacPaciente();
        try {
            FileInputStream fis = new FileInputStream(ARCHIVO);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Lista = (ListacPaciente) ois.readObject();
        } catch (Exception e) {
            Mensajes.mostrar("ERROR no se puede recuperar... "+e);
        }
        return Lista;
    }
}
