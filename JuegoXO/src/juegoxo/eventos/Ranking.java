/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegoxo.eventos;

public class Ranking {

    public static String generarRankingTexto() {
        String texto = "<html><b>Ranking:</b><br>";

        // para ordernarlos por puntos
        for (int i = 0; i < Jugador.UsuariosTotal - 1; i++) {
            for (int j = i + 1; j < Jugador.UsuariosTotal; j++) {
                Jugador jugadorI = Jugador.jugadores[i];
                Jugador jugadorJ = Jugador.jugadores[j];

                if (jugadorJ != null && jugadorI != null
                        && jugadorJ.getPuntos() > jugadorI.getPuntos()) {

                    // lo hice para intercambiar las posiciones
                    Jugador temp = Jugador.jugadores[i];
                    Jugador.jugadores[i] = Jugador.jugadores[j];
                    Jugador.jugadores[j] = temp;
                }
            }
        }

        // se genera para odernarlos
        for (int i = 0; i < Jugador.UsuariosTotal; i++) {
            Jugador j = Jugador.jugadores[i];
            if (j != null) {
                texto += (i + 1) + ". " + j.getUsername() + " - " + j.getPuntos() + " pts<br>";
            }
        }

        texto += "</html>";
        return texto;
    }
}
