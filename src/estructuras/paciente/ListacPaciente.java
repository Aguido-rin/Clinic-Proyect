package estructuras.paciente;

import modelo.Paciente;

public class ListacPaciente {

    public Nodo lc;

    public ListacPaciente() {
        lc = null;
    }

    public void InsertarFinal(Paciente pac) {
        Nodo nuevo = new Nodo(pac);
        if (lc != null) {
            nuevo.enlace = lc.enlace;
            lc.enlace = nuevo;
        }
        lc = nuevo;
    }

    public Nodo BuscarDni(String dnibuscado) {
        Nodo actual = lc.enlace; //1er nodo
        if (lc != null) {
            do {
                if (actual.pac.getDni().equals(dnibuscado)) {
                    return actual;
                }
                actual = actual.enlace;
            } while (actual != lc.enlace); //recorre hasta volver al 1er nodo
        }

        return null; //dni no encontrado
    }

    public void EliminarNodo(String dnieliminar) {
        Nodo actual;
        boolean encontrado = false;
        actual = lc;
        while (actual.enlace != lc && !encontrado) {
            encontrado = (actual.enlace.pac.getDni().equals(dnieliminar));
            if (!encontrado) {
                actual = actual.enlace;
            }
        }

        encontrado = (actual.enlace.pac.getDni().equals(dnieliminar)); //verificando
        if (encontrado) {
            Nodo p; //nodo a eliminar
            p = actual.enlace;
            if (lc == lc.enlace) { //si tiene un solo nodo
                lc = null;
            } else {
                if (p == lc) {
                    lc = actual;
                    actual.enlace = p.enlace;
                }
            }
        }
    }

}
