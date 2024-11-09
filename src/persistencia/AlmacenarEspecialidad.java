package persistencia;

import estructuras.especialidad.ArregloEspecialidad;
import mensajes.Mensajes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author AguidoRin
 */
public class AlmacenarEspecialidad {
    public static final String ARCHIVO="DatosEspecialidad.bin";
    
    public static void GuardarEspecialidad(ArregloEspecialidad Lista){
       try{
           FileOutputStream fos=new FileOutputStream(ARCHIVO);
           ObjectOutputStream oos =  new ObjectOutputStream(fos);
           oos.writeObject(Lista);
           oos.close(); 
       }catch(Exception ex){
           Mensajes.MensajeMostrar("ERROR al guardar:\n"+ex);
       }
    }
    
    public static ArregloEspecialidad RecuperarEspecialidad(){
        ArregloEspecialidad listaEspec=new ArregloEspecialidad(50);
       try{
           FileInputStream fis =  new FileInputStream(ARCHIVO);
           ObjectInputStream ois = new ObjectInputStream(fis);
           listaEspec = (ArregloEspecialidad)ois.readObject();
           ois.close();
       }catch(Exception ex){
           Mensajes.MensajeMostrar("ERROR al recuperar"+ex);
       }
       return listaEspec;
    }
}