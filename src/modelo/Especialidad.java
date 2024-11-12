package modelo;

/**
 *
 * @author AguidoRin
 */
public class Especialidad {
    private String id;
    private String tipo;

    public Especialidad() {}
    
    public Object[] Registrar(int num){
        Object[] objc={num,id,tipo};
        return objc;
    }
    
    public void mostrarInfo() {
        System.out.println("ID de Especialidad: " + tipo);
        System.out.println("Especialidad: " + tipo);
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Especialidad{" + "id=" + id + ", tipo=" + tipo + '}';
    }
    
    
}