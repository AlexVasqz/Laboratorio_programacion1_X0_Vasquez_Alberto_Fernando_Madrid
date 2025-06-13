package juegoxo.eventos;

public class Jugador {
    
    public static Jugador jugadorLog = null;
    public static boolean logged = false;
    public static int UsuariosTotal = 0;

    public static Jugador[] jugadores = new Jugador[50];

    public String username;
    public String password;
    public int puntos = 0;
    public int partidas = 0;

    public Jugador(String username, String password) {
        this.username = username;
        this.password = password;
        this.puntos = 0;
        this.partidas = 0;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }   

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getPartidas() {
        return partidas;
    }

    public boolean validarPass(String pass) {
        return this.password.equals(pass);
    }
}
