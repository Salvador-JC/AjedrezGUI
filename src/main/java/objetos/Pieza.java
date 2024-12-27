package objetos;

import cons.Constantes;

/**
 *
 * @author salvador
 */
public class Pieza/* extends JButton*/{

    //Las piezas consisten en un id con el nombre de la pieza, el color de la pieza que
    //se guarda a partir del jugador, la posición de la pieza(para asegurarla y guardarla)
    //el dibujo que sirve para el toString, el color(que solo sirve para las casillas vacías)
    //movido, que es una variable para la funcion comprobarEnroque
    //haceJaque es para el jaque mate
    private String id;
    private final Jugador jugador;
    private int[] posicion;
    private String dibujo;
    private boolean movido;
    private boolean haceJaque;

    //Constructor para las piezas
    public Pieza(String id, Jugador jugador, int[] posicion, String dibujo) {
        this.id = id;
        this.jugador = jugador;
        this.posicion = posicion;
        this.dibujo = dibujo;
        this.movido = false;
        this.haceJaque = false;
    }
    
    //Constructor para las casillas vacias
    public Pieza(String id, int[] posicion, String dibujo) {
        this.id = id;
        this.posicion = posicion;
        this.dibujo = dibujo;
        this.jugador = null;
    }
    
    //Esto sólo sirve en el movimiento de la reina para crear torres y alfiles de forma rápida
    public Pieza(String id){
        this.id = id;
        this.jugador = null;
    }

    //Funciones básicas
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Jugador getJugador() {
        return jugador;
    }

    public int[] getPosicion() {
        return posicion;
    }

    public void setPosicion(int[] posicion) {
        this.posicion = posicion;
    }
    
    public void setDibujo(String dibujo) {
        this.dibujo = dibujo;
    }
    
    public boolean getHaceJaque(){
        return haceJaque;
    }

    @Override
    public String toString() {
        return dibujo;
    }
    
    //Para ver si es vacía compruebo sus ids
    public boolean esVacia(){
        return Constantes.ID_CASV_B.equals(this.id) || Constantes.ID_CASV_N.equals(this.id);
    }
    
    //Para el enroque
    public boolean esMovida(){
        return movido;
    }
    
    public void mover(){
        this.movido = true;
    }
    
    //Para el jaque mate
    public void haceJaque(){
        this.haceJaque = true;
    }
    
    public void noHaceJaque(){
        this.haceJaque = false;
    }
}
