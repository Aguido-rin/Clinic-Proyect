
package estructuras.doctor;
import java.io.Serializable;
import modelo.Doctor;

public class Nodo implements Serializable{
    public Doctor doc;
    public Nodo sig;
    public Nodo(Doctor d){
        doc=d;
        sig=null;
    }
}