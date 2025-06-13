package juegoxo.eventos;

public class Posiciones {

    private int[] botonesUsados = new int[9]; // 0 = libre, 1 = jugador X, 2 = jugador O

    public boolean esValida(int posicion) {
        return botonesUsados[posicion] == 0;
    }

    public void registrarMovimiento(int posicion, int jugador) {
        if (esValida(posicion)) {
            botonesUsados[posicion] = jugador; // 1 = X, 2 = O
        }
    }

    public int getGanador() {
        int[][] combinaciones = {
            {0, 1, 2}, {3, 4, 5}, {6, 7, 8}, // filas
            {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, // columnas
            {0, 4, 8}, {2, 4, 6} // diagonales
        };

        for (int[] c : combinaciones) {
            int a = botonesUsados[c[0]];
            int b = botonesUsados[c[1]];
            int cVal = botonesUsados[c[2]];
            if (a != 0 && a == b && b == cVal) {
                return a; // devuelve 1 o 2
            }
        }

        return 0; // sin ganador
    }

    public void reiniciar() {
        for (int i = 0; i < botonesUsados.length; i++) {
            botonesUsados[i] = 0;
        }
    }
}
