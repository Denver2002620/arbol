public class ArbolGeneral {

    public static int grado(Nodo raiz) {
        if (raiz == null) return 0;

        int maxGrado = raiz.hijos.size();
        for (Nodo hijo : raiz.hijos) {
            maxGrado = Math.max(maxGrado, grado(hijo));
        }
        return maxGrado;
    }
