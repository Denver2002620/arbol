import java.util.ArrayList;
import java.util.List;

class Nodo {
    String valor;
    List<Nodo> hijos;

    public Nodo(String valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }

    public void agregarHijo(Nodo hijo) {
        hijos.add(hijo);
    }
}

public class ArbolGeneral {

    public static int grado(Nodo raiz) {
        if (raiz == null) return 0;

        int maxGrado = raiz.hijos.size();
        for (Nodo hijo : raiz.hijos) {
            maxGrado = Math.max(maxGrado, grado(hijo));
        }
        return maxGrado;
    }

    public static void main(String[] args) {
        // Ejemplo 1: Árbol con grado = 2
        Nodo a1 = new Nodo("A");
        Nodo b1 = new Nodo("B");
        Nodo c1 = new Nodo("C");
        Nodo d1 = new Nodo("D");
        Nodo e1 = new Nodo("E");
        Nodo f1 = new Nodo("F");
        Nodo g1 = new Nodo("G");

        a1.agregarHijo(b1);
        a1.agregarHijo(c1);
        b1.agregarHijo(d1);
        b1.agregarHijo(e1);
        e1.agregarHijo(f1);
        c1.agregarHijo(g1);

        System.out.println("Grado del Árbol 1: " + grado(a1)); // Resultado: 2

        // Ejemplo 2: Árbol con grado = 3
        Nodo a2 = new Nodo("A");
        Nodo b2 = new Nodo("B");
        Nodo c2 = new Nodo("C");
        Nodo d2 = new Nodo("D");
        Nodo e2 = new Nodo("E");
        Nodo f2 = new Nodo("F");
        Nodo g2 = new Nodo("G");
        Nodo h2 = new Nodo("H");
        Nodo j2 = new Nodo("J");
        Nodo k2 = new Nodo("K");
        Nodo m2 = new Nodo("M");

        a2.agregarHijo(b2);
        a2.agregarHijo(c2);
        a2.agregarHijo(d2);
        b2.agregarHijo(e2);
        b2.agregarHijo(f2);
        b2.agregarHijo(g2);
        c2.agregarHijo(h2);
        c2.agregarHijo(j2);
        d2.agregarHijo(k2);
        d2.agregarHijo(m2);
        m2.agregarHijo(k2);

        System.out.println("Grado del Árbol 2: " + grado(a2)); // Resultado: 3
    }
}

