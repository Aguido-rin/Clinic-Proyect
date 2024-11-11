
package estructuras.doctor;

import java.io.Serializable;
import javax.swing.JTextArea;
import modelo.Doctor;


public class ListaDoctor implements Serializable{
    private Nodo ini;
    private Nodo fin;
    private int ctotal;

    public ListaDoctor() {
    }
    
    public void ActualizarDoctor(Nodo actual, Doctor actualizado){
        actual.doc=actualizado;
    }

  public void EliminarDoctor(Nodo actual){
      Nodo anterior=ini;
      while(anterior.sig!=actual && anterior.sig!=null){
          anterior=anterior.sig;
      }
      if(actual!=null){
          if(ini == actual){
              ini = actual.sig;
          }else{
              anterior.sig=actual.sig;
          }
      }
  }//fin eliminar  
    
     //metodo que agrega un objeto al inicio de la lista
    public void AgregarAlInicio(Nodo nuevo){
        if(ini==null && fin==null){
            ini=fin=nuevo; 
        }else{
            nuevo.sig=ini;
            ini = nuevo;
        }
    }
    //metodo que agrega un nodo al inicio de la lista
    public void AgregarAlFinal(Nodo nuevo){
        if(ini==null && fin==null){
            ini=fin=nuevo; 
        }else{
            fin.sig=nuevo;
        }
        fin=nuevo;
        fin.sig=null;
    }
    
    //Metodo que busca un estudiante por medio de su DNI
    public Nodo BuscarPorCodigo(String codbuscado){
        Nodo aux=ini;
        while(aux!=null){
            if(codbuscado.equals(aux.doc.getCodigo())){
                return aux;
            }
            aux= aux.sig;
        }
        return null;
    }

    public Nodo getIni() {
        return ini;
    }

    public void setIni(Nodo ini) {
        this.ini = ini;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    public int getCtotal() {
        return ctotal;
    }

    public void setCtotal(int ctotal) {
        this.ctotal = ctotal;
    }
    
}
