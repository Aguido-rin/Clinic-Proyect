package estructuras.paciente;

import java.io.Serializable;
import modelo.Paciente;

public class Nodo implements Serializable{
    public Paciente pac;
    public Nodo enlace;
    
    public Nodo(Paciente pac){
        this.pac = pac;
        enlace = this; //enlace a si mismo
    }
}