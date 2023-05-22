public class ArbolBinarioADLL {
    public static void main(String[] args) {
        ArbolBinarioADLL ab = new ArbolBinarioADLL();

        ab.raiz = new Nodo(1);
        ab.raiz.izquierda = new Nodo(2);
        ab.raiz.derecha = new Nodo(3);
        ab.raiz.izquierda.izquierda = new Nodo(4);
        ab.raiz.izquierda.derecha = new Nodo(5);
        ab.raiz.derecha.izquierda = new Nodo(6);
        ab.raiz.derecha.derecha = new Nodo(7);

        ab.convertirbaToDLL(ab.raiz);
        ab.mostrar();

    }

    public static class Nodo {
        int dato;
        Nodo derecha;
        Nodo izquierda;

        public Nodo(int dato) {
            this.dato = dato;
            this.izquierda = null;
            this.derecha = null;
        }
    }

    public Nodo raiz;
    Nodo cabeza, cola = null;

    public void convertirbaToDLL(Nodo nodo) {
        if (nodo == null)
            return;
        convertirbaToDLL(nodo.izquierda);
        if (cabeza == null) {
            cabeza = cola = nodo;
        } else {
            cola.derecha = nodo;
            nodo.izquierda = cola;
            cola = nodo;
        }
        convertirbaToDLL(nodo.derecha);
    }

    public void mostrar(){
        Nodo actual = cabeza;
        if (cabeza == null) {
            System.out.println("Lista vacía");
        }
        System.out.println("Nodos de doble lista enlazada generados: ");
        while (actual != null) {
            System.out.println(actual.dato + " ");
            actual = actual.derecha;
        }
        System.out.println();
    }
}
