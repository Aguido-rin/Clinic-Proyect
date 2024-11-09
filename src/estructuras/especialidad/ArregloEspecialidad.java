package estructuras.especialidad;

import modelo.Especialidad;

/**
 *
 * @author AguidoRin
 */
public class ArregloEspecialidad {
    Especialidad[] listEspec = new Especialidad[3];
    public static int cant;
    
    public ArregloEspecialidad(int cant){
        listEspec = new Especialidad[cant];
        cant=0;
    }
    
    public void AgregarEspecialidad(Especialidad espec){
        listEspec[cant]=espec;
        cant++;
    }
    
    public void EditarEspecialidad(Especialidad actual,int posicion){
        listEspec[posicion]=actual;
    }
    
    public Especialidad ObtenerEspecialidad(int posicion){
        return listEspec[posicion];
    }
    
    public void EliminarEspecialidad(int posicion){
        for(int i=posicion;i<cant-1;i++){
            listEspec[i]=listEspec[i+1];
            break;
        }
        listEspec[cant-1]=null;
        cant--;
    }
    
    public int Buscar(String cod){
        for(int i=0;i<cant;i++){
            if(cod.equalsIgnoreCase(listEspec[i].getId()))
                return i;
        }
        return -1;
    }
}