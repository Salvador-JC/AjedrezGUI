package objetos;

import java.util.ArrayList;

/**
 *
 * @author salvador
 */
public class Jugador {
    
    //Jugador consiste en relacionar las piezas con su color
    //Para eso guardo en un boolean el color (blanco = true) y las piezas en un arrayList
    //(pude hacerlo en un array normal pero paso de rehacer las funciones)
    private final boolean COLOR;
    private final ArrayList<Pieza> piezas;
    
    //constructor de jugador
    public Jugador(String color){
        this.COLOR = color.equals("blanco");
        piezas = new ArrayList<>();
    }
    
    //Funciones básicas con el array
    public void añadirPieza(Pieza pieza){
        piezas.add(pieza);
    }
    
    public void borrarPieza(Pieza pieza){
        piezas.remove(pieza);
    }
    
    public ArrayList<Pieza> getPiezas(){
        return piezas;
    }

    public boolean isBlanco() {
        return COLOR;
    }
    
    public Pieza buscarPiezaId(String id){
        for (Pieza pieza : piezas) {
            if(pieza.getId().equals(id)){
                return pieza;
            }
        }
        return null;
    }
    
    public Pieza buscarPiezaJaque(){
        for (Pieza pieza : piezas) {
            if(pieza.getHaceJaque()){
                return pieza;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return (COLOR)? "blancas" : "negras";
    }
}
