
package modelo;

import java.io.Serializable;


public class Doctor implements Serializable {
    private String codigo;
    private String dni;
    private String nombres;
    private String telefono;
    private String direccion;
    private Especialidad especialidad;

    public Doctor() {
    }
    
    public Object[]Registro(int num){
        Object[]fila={num,codigo,nombres,telefono,direccion,especialidad};
        return fila;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Especialidad getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    
    
    
    
}
