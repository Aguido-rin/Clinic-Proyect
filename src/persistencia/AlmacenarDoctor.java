
package persistencia;

import estructuras.doctor.ListaDoctor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import procesos.Mensajes;

public class AlmacenarDoctor {
     public static String ARCHIVO2 = "DatosListaDoctores.bin";
    public static void guardarLista(ListaDoctor Lista){
        try {
            FileOutputStream fos = new FileOutputStream(ARCHIVO2);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Lista);
            oos.close();
        } catch (Exception e) {
            Mensajes.leerTexto("ERROR no se puede guardar "+e);
        }
    }
    
    public static ListaDoctor recuperarLista(){
        ListaDoctor Lista = new ListaDoctor();
        try {
            FileInputStream fis = new FileInputStream(ARCHIVO2);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Lista = (ListaDoctor) ois.readObject();
        } catch (Exception e) {
            Mensajes.mostrar("ERROR no se puede recuperar... "+e);
        }
        return Lista;
    }
}
