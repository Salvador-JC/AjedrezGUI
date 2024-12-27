package juego;

import Frame.MenuIni;
import objetos.*;

/**
 *
 * @author salvador
 */
public class Ajedrez {
    
    //Antes ajedrez tenía toda la logica del juego, peso ahora cada jframe se 
    //encarga de su parte, por lo que ajedrez, ahora simplemente inicia el tablero
    //los jugadores y el primer jframe
    private int turno;
    private final Jugador blanco;
    private final Jugador negro;
    private Jugador jugadorAct;
    private Jugador jugadorAus;
    private final Tablero juego;
    private boolean victoria;
    private boolean asterisco;

    public Ajedrez() {
        this.blanco = new Jugador("blanco");
        this.negro = new Jugador("negro");
        this.juego = new Tablero(blanco, negro);
        this.jugadorAct = null;
        this.jugadorAus = null;
        this.turno = 0;
        this.victoria = false;
        this.asterisco = false;
    }

    public int getTurno() {
        return turno;
    }

    public Tablero getJuego() {
        return juego;
    }

    public Jugador getBlanco() {
        return blanco;
    }

    public Jugador getNegro() {
        return negro;
    }

    public boolean getVictoria() {
        return victoria;
    }

    public boolean getAsterisco() {
        return asterisco;
    }

    public void masTurno() {
        turno++;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    public void setAsterisco(boolean asterisco) {
        this.asterisco = asterisco;
    }
    
    public Jugador getJugadorAct(){
        return jugadorAct;
    }
    
    public Jugador getJugadorAus(){
        return jugadorAus;
    }

    public void setJugadorAct(int turno) {
        jugadorAct = (turno % 2 != 0) ? blanco : negro;
        jugadorAus = (turno % 2 != 0) ? negro : blanco;
    }

    public static void main(String[] args) {
        MenuIni menuIni = new MenuIni();
        menuIni.setVisible(true);
    }
}
