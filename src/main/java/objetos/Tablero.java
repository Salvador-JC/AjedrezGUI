package objetos;

import cons.Constantes;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author salvador
 */
public class Tablero {

    //El tablero consiste en guardar en una matriz todas las piezas en sus posiciones correspondientes
    private final Pieza[][] mapa;

    //Constructor que sirve para colocar las piezas en las posiciones iniciales
    public Tablero(Jugador blanco, Jugador negro) {
        //Tablero del ajedrez 8x8
        mapa = new Pieza[8][8];

        //Colocar las piezas consiste en crear las piezas con los atributos correspondientes
        //colocar en el tablero la pieza
        //añadir la pieza a la lista de piezas del jugador correspondiente
        //Piezas negras(false)--------------------------------------------------
        Pieza pieza = new Pieza(Constantes.ID_TORRE, negro, new int[]{0, 0}, Constantes.DIB_TORRE_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_TORRE, negro, new int[]{0, 7}, Constantes.DIB_TORRE_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_CABALLO, negro, new int[]{0, 1}, Constantes.DIB_CABALLO_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_CABALLO, negro, new int[]{0, 6}, Constantes.DIB_CABALLO_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_ALFIL, negro, new int[]{0, 2}, Constantes.DIB_ALFIL_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_ALFIL, negro, new int[]{0, 5}, Constantes.DIB_ALFIL_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_REINA, negro, new int[]{0, 3}, Constantes.DIB_REINA_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_REY, negro, new int[]{0, 4}, Constantes.DIB_REY_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_PEON, negro, new int[]{1, 0}, Constantes.DIB_PEON_N);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        negro.añadirPieza(pieza);
        for (int i = 1; i < mapa[1].length; i++) {
            pieza = new Pieza(Constantes.ID_PEON, negro, new int[]{1, i}, Constantes.DIB_PEON_N);
            this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
            negro.añadirPieza(pieza);
        }

        //Piezas blancas(true)------------------------------------------------
        pieza = new Pieza(Constantes.ID_TORRE, blanco, new int[]{7, 0}, Constantes.DIB_TORRE_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_TORRE, blanco, new int[]{7, 7}, Constantes.DIB_TORRE_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_CABALLO, blanco, new int[]{7, 1}, Constantes.DIB_CABALLO_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_CABALLO, blanco, new int[]{7, 6}, Constantes.DIB_CABALLO_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_ALFIL, blanco, new int[]{7, 2}, Constantes.DIB_ALFIL_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_ALFIL, blanco, new int[]{7, 5}, Constantes.DIB_ALFIL_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_REINA, blanco, new int[]{7, 3}, Constantes.DIB_REINA_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);
        pieza = new Pieza(Constantes.ID_REY, blanco, new int[]{7, 4}, Constantes.DIB_REY_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);

        pieza = new Pieza(Constantes.ID_PEON, blanco, new int[]{6, 0}, Constantes.DIB_PEON_B);
        this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
        blanco.añadirPieza(pieza);
        for (int i = 1; i < mapa[6].length; i++) {
            pieza = new Pieza(Constantes.ID_PEON, blanco, new int[]{6, i}, Constantes.DIB_PEON_B);
            this.mapa[pieza.getPosicion()[0]][pieza.getPosicion()[1]] = pieza;
            blanco.añadirPieza(pieza);
        }

        //Casillas vacias-------------------------------------------------------
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                colocarCasVacia(new int[]{i, j});
            }
        }
    }

    //Funcion que sirve para colocar una casilla vacía, el problema se reduce a saber si es blanca o negra
    private void colocarCasVacia(int[] casillas) {
        Pieza cb = new Pieza(Constantes.ID_CASV_B, new int[]{0, 0}, Constantes.DIB_CASV);
        Pieza cn = new Pieza(Constantes.ID_CASV_N, new int[]{0, 0}, Constantes.DIB_CASV);

        //En las filas pares, en las columnas pares hay casillas blancas 
        //y al reves en las filas impares
        if (casillas[0] % 2 == 0) {
            if (casillas[1] % 2 == 0) {
                cb.setPosicion(casillas);
                this.mapa[cb.getPosicion()[0]][cb.getPosicion()[1]] = cb;
            } else {
                cn.setPosicion(casillas);
                this.mapa[cn.getPosicion()[0]][cn.getPosicion()[1]] = cn;
            }
        } else {
            if (casillas[1] % 2 == 0) {
                cn.setPosicion(casillas);
                this.mapa[cn.getPosicion()[0]][cn.getPosicion()[1]] = cn;
            } else {
                cb.setPosicion(casillas);
                this.mapa[cb.getPosicion()[0]][cb.getPosicion()[1]] = cb;
            }
        }
    }

    //Funciones basicas
    public Pieza getPieza(int[] casilla) {
        return mapa[casilla[0]][casilla[1]];
    }

    public boolean esCasillaVacia(int[] casillaAct) {
        return mapa[casillaAct[0]][casillaAct[1]].esVacia();
    }

    public boolean comprobarColor(int[] casillaAct) {
        return mapa[casillaAct[0]][casillaAct[1]].getJugador().isBlanco();
    }

    //En windows y en linux salen distinto, pero sirve.
    //Aunque en este caso, como utilizo un GUI, el toString no lo voy a utilizar
    @Override
    public String toString() {
        StringBuilder tablero = new StringBuilder();
        tablero.append("     0    1    2    3   4    5    6    7\n");
        tablero.append("  |-----------------------------------|\n");
        int i = 0;
        for (Pieza[] fila : mapa) {
            tablero.append(i).append("|");
            for (Pieza columna : fila) {
                tablero.append(columna.toString()).append("|");
            }
            tablero.append("\n");
            i++;
        }
        tablero.append("  |-----------------------------------|\n");
        return tablero.toString();
    }

    //Funcion que consiste en comprobar el movimiento de la pieza, y devuelve si es posible el movimiento
    //con la casilla inicial de la pieza, la casilla a la que quiere ir, 
    //el id de la pieza a mover y el jugador contrario (solo sirve en el movimiento del rey)
    public boolean comprobarMovimiento(int[] casillaIni, int[] casillaFin, String id, Jugador ausente) {
        switch (id) {
            case Constantes.ID_TORRE -> {
                //Si la fila es igual o la columna es igual, comprueba si las casillas entre las 
                //dos casillas están vacías. Si no, devuelve falso
                if (casillaIni[0] == casillaFin[0]) {
                    if (casillaIni[1] < casillaFin[1]) {
                        //Derecha
                        for (int i = casillaIni[1] + 1; i < casillaFin[1]; i++) {
                            if (!esCasillaVacia(new int[]{casillaIni[0], i})) {
                                return false;
                            }
                        }
                        return true;
                    } else {
                        //Izquierda
                        for (int i = casillaIni[1] - 1; i > casillaFin[1]; i--) {
                            if (!esCasillaVacia(new int[]{casillaIni[0], i})) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (casillaIni[1] == casillaFin[1]) {
                    if (casillaIni[0] < casillaFin[0]) {
                        //Abajo
                        for (int i = casillaIni[0] + 1; i < casillaFin[0]; i++) {
                            if (!esCasillaVacia(new int[]{i, casillaIni[1]})) {
                                return false;
                            }
                        }
                        return true;
                    } else {
                        //Arriba
                        for (int i = casillaIni[0] - 1; i > casillaFin[0]; i--) {
                            if (!esCasillaVacia(new int[]{i, casillaIni[1]})) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else {
                    return false;
                }
            }
            case Constantes.ID_CABALLO -> {
                //El caballo al saltar piezas, es más sencillo de comprobar
                if (casillaIni[0] == casillaFin[0] + 2 || casillaIni[0] == casillaFin[0] - 2) {
                    //Si se va 2 arriba o abajo y 1 a la derecha o izquierda
                    return casillaIni[1] == casillaFin[1] + 1 || casillaIni[1] == casillaFin[1] - 1;
                } else if (casillaIni[1] == casillaFin[1] + 2 || casillaIni[1] == casillaFin[1] - 2) {
                    //Si se va 2 a la derecha o izquierda y 1 arriba o abajo
                    return casillaIni[0] == casillaFin[0] + 1 || casillaIni[0] == casillaFin[0] - 1;
                } else {
                    return false;
                }
            }
            case Constantes.ID_ALFIL -> {
                //El alfil es igual que la torre pero girado 45 grados
                if (Math.abs(casillaIni[0] - casillaFin[0]) == Math.abs(casillaIni[1] - casillaFin[1])) {
                    //Por la forma en la que lo he hecho, en la y se resta hacia arriba y en la x se resta hacia la izquierda
                    if (casillaIni[0] > casillaFin[0]) {
                        //Arriba
                        if (casillaIni[1] > casillaFin[1]) {
                            //izquierda
                            int j = casillaIni[1] - 1;
                            for (int i = casillaIni[0] - 1; i > casillaFin[0]; i--) {
                                if (!esCasillaVacia(new int[]{i, j})) {
                                    return false;
                                }
                                j--;
                            }
                            return true;
                        } else {
                            //derecha
                            int j = casillaIni[1] + 1;
                            for (int i = casillaIni[0] - 1; i > casillaFin[0]; i--) {
                                if (!esCasillaVacia(new int[]{i, j})) {
                                    return false;
                                }
                                j++;
                            }
                            return true;
                        }
                    } else {
                        //Abajo
                        if (casillaIni[1] > casillaFin[1]) {
                            //izquierda
                            int j = casillaIni[1] - 1;
                            for (int i = casillaIni[0] + 1; i < casillaFin[0]; i++) {
                                if (!esCasillaVacia(new int[]{i, j})) {
                                    return false;
                                }
                                j--;
                            }
                            return true;
                        } else {
                            //derecha
                            int j = casillaIni[1] + 1;
                            for (int i = casillaIni[0] + 1; i < casillaFin[0]; i++) {
                                if (!esCasillaVacia(new int[]{i, j})) {
                                    return false;
                                }
                                j++;
                            }
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            }
            case Constantes.ID_REINA -> {
                //La reina es el mas sencillo de todos, simplemente compruebo si es posible
                //el movimiento de una torre o de un alfil
                return comprobarMovimiento(casillaIni, casillaFin, Constantes.ID_TORRE, ausente)
                        || comprobarMovimiento(casillaIni, casillaFin, Constantes.ID_ALFIL, ausente);
            }
            case Constantes.ID_REY -> {
                //Primero pillo la posicion del rey contrario, porque un rey no puede estar a menos de una casilla del otro
                int[] posReyContrario = ausente.buscarPiezaId(Constantes.ID_REY).getPosicion();
                if ((posReyContrario[0] == casillaFin[0] + 1 || posReyContrario[0] == casillaFin[0] - 1 || posReyContrario[0] == casillaFin[0])
                        && (posReyContrario[1] == casillaFin[1] + 1 || posReyContrario[1] == casillaFin[1] - 1 || posReyContrario[1] == casillaFin[1])) {
                    return false;
                } else if ((casillaIni[0] == casillaFin[0] + 1 || casillaIni[0] == casillaFin[0] - 1 || casillaIni[0] == casillaFin[0])
                        && (casillaIni[1] == casillaFin[1] + 1 || casillaIni[1] == casillaFin[1] - 1 || casillaIni[1] == casillaFin[1])) {

                    Pieza piezaOcupada = mapa[casillaFin[0]][casillaFin[1]];

                    mapa[casillaFin[0]][casillaFin[1]] = mapa[casillaIni[0]][casillaIni[1]];
                    colocarCasVacia(casillaIni);
                    for (int i = 0; i < ausente.getPiezas().size(); i++) {
                        if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY) && !Arrays.equals(ausente.getPiezas().get(i).getPosicion(), casillaFin)) {
                            if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), casillaFin, ausente.getPiezas().get(i).getId(), ausente)) {
                                mapa[casillaIni[0]][casillaIni[1]] = mapa[casillaFin[0]][casillaFin[1]];
                                mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                                return false;
                            }
                        }
                    }
                    mapa[casillaIni[0]][casillaIni[1]] = mapa[casillaFin[0]][casillaFin[1]];
                    mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                    return true;
                } else {
                    return false;
                }
            }
            case Constantes.ID_PEON -> {
                //Como los movimientos del peon dependen del color, pues tengo que comprobar las 2 posibilidades
                if (mapa[casillaIni[0]][casillaIni[1]].getJugador().isBlanco()) {
                    //Para comprobar las casillas diagonales, primero veo si se sale del tablero(si no daría un IndexOutOfBounds)
                    if (8 > casillaFin[1] + 1) {
                        if (casillaIni[0] == casillaFin[0] + 1 && casillaIni[1] == casillaFin[1] + 1 && !mapa[casillaIni[0] - 1][casillaIni[1] - 1].esVacia()) {
                            return true;
                        }
                    }
                    if (0 < casillaFin[1] - 1) {
                        if (casillaIni[0] == casillaFin[0] + 1 && casillaIni[1] == casillaFin[1] - 1 && !mapa[casillaIni[0] - 1][casillaIni[1] + 1].esVacia()) {
                            return true;
                        }
                    }
                    //Después de comprobar las diagonales compruebo si las casillas de adelante 
                    //están vacias para que se pueda mover ahí o no
                    if (mapa[casillaIni[0] - 1][casillaIni[1]].esVacia()) {
                        if (casillaIni[0] == casillaFin[0] + 1 && casillaIni[1] == casillaFin[1]) {
                            return true;
                        } else if (casillaIni[0] - 2 >= 0) {//Primer mov, puede ser 2 casillas delante
                            if (mapa[casillaIni[0] - 2][casillaIni[1]].esVacia()) {//Primer mov, puede ser 2 casillas delante
                                return casillaIni[0] == casillaFin[0] + 2 && casillaIni[1] == casillaFin[1] && casillaIni[0] == 6;
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    if (8 > casillaFin[1] + 1) {
                        if (casillaIni[0] == casillaFin[0] - 1 && casillaIni[1] == casillaFin[1] + 1 && !mapa[casillaIni[0] + 1][casillaIni[1] - 1].esVacia()) {
                            return true;
                        }
                    }
                    if (0 < casillaFin[1] - 1) {
                        if (casillaIni[0] == casillaFin[0] - 1 && casillaIni[1] == casillaFin[1] - 1 && !mapa[casillaIni[0] + 1][casillaIni[1] + 1].esVacia()) {
                            return true;
                        }
                    }
                    if (mapa[casillaIni[0] + 1][casillaIni[1]].esVacia()) {
                        if (casillaIni[0] == casillaFin[0] - 1 && casillaIni[1] == casillaFin[1]) {
                            return true;
                        } else if (casillaIni[0] + 2 <= 7) {
                            if (mapa[casillaIni[0] + 2][casillaIni[1]].esVacia()) {
                                return casillaIni[0] == casillaFin[0] - 2 && casillaIni[1] == casillaFin[1] && casillaIni[0] == 1;
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            //Dado que tengo todas las IDS controladas, esto no debería ocurrir
            default -> {
                JOptionPane.showMessageDialog(null, "Esto no deberia ocurrir");
                return false;
            }
        }
    }

    //Funcion que sirve para comprobar si el movimiento es un enroque(en la funcion del movimiento no esta contemplado)
    public boolean comprobarEnroque(int[] casillaIni, int[] casillaFin, Pieza pieza, Jugador jugador, Jugador ausente) {
        //Al ser tan especifico, hay muchas comprobaciones concretas de casillas
        if (pieza.getId().equals(Constantes.ID_REY) && !pieza.esMovida()) {
            if (jugador.isBlanco()) {
                if (casillaFin[0] == casillaIni[0] && casillaFin[1] == 6) {
                    if (mapa[7][5].esVacia() && mapa[7][6].esVacia()
                            && mapa[7][7].getJugador().isBlanco() == jugador.isBlanco() && mapa[7][7].getId().equals(Constantes.ID_TORRE) && !mapa[7][7].esMovida()) {

                        mapa[7][7].setPosicion(new int[]{7, 5});
                        mapa[7][5] = mapa[7][7];
                        colocarCasVacia(new int[]{7, 7});

                        Pieza piezaOcupada = mapa[casillaFin[0]][casillaFin[1]];

                        mapa[casillaFin[0]][casillaFin[1]] = pieza;
                        colocarCasVacia(casillaIni);
                        for (int i = 0; i < ausente.getPiezas().size(); i++) {
                            if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY)) {
                                if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), casillaFin, ausente.getPiezas().get(i).getId(), ausente)) {
                                    mapa[7][5].setPosicion(new int[]{7, 7});
                                    mapa[7][7] = mapa[7][5];
                                    colocarCasVacia(new int[]{7, 5});

                                    mapa[casillaIni[0]][casillaIni[1]] = pieza;
                                    mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                                    return false;
                                }
                            }
                        }

                        mapa[casillaIni[0]][casillaIni[1]] = pieza;
                        mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;

                        mapa[7][5].mover();
                        return true;
                    }
                } else if (casillaFin[0] == 7 && casillaFin[1] == 2) {
                    if (mapa[7][1].esVacia() && mapa[7][2].esVacia() && mapa[7][3].esVacia()
                            && mapa[7][0].getJugador().isBlanco() == jugador.isBlanco() && mapa[7][0].getId().equals(Constantes.ID_TORRE) && !mapa[7][0].esMovida()) {
                        mapa[7][0].setPosicion(new int[]{7, 3});
                        mapa[7][3] = mapa[7][0];
                        colocarCasVacia(new int[]{7, 0});

                        Pieza piezaOcupada = mapa[casillaFin[0]][casillaFin[1]];

                        mapa[casillaFin[0]][casillaFin[1]] = pieza;
                        colocarCasVacia(casillaIni);
                        for (int i = 0; i < ausente.getPiezas().size(); i++) {
                            if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY)) {
                                if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), casillaFin, ausente.getPiezas().get(i).getId(), ausente)) {
                                    mapa[7][3].setPosicion(new int[]{7, 0});
                                    mapa[7][0] = mapa[7][3];
                                    colocarCasVacia(new int[]{7, 3});

                                    mapa[casillaIni[0]][casillaIni[1]] = pieza;
                                    mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                                    return false;
                                }
                            }
                        }

                        mapa[casillaIni[0]][casillaIni[1]] = pieza;
                        mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                        
                        mapa[7][0].mover();
                        return true;
                    }
                }
            } else {
                if (casillaFin[0] == 0 && casillaFin[1] == 6) {
                    if (mapa[0][5].esVacia() && mapa[0][6].esVacia()
                            && mapa[0][7].getJugador().isBlanco() == jugador.isBlanco() && mapa[0][7].getId().equals(Constantes.ID_TORRE) && !mapa[0][7].esMovida()) {
                        mapa[0][7].setPosicion(new int[]{0, 5});
                        mapa[0][5] = mapa[0][7];
                        colocarCasVacia(new int[]{0, 7});

                        Pieza piezaOcupada = mapa[casillaFin[0]][casillaFin[1]];

                        mapa[casillaFin[0]][casillaFin[1]] = pieza;
                        colocarCasVacia(casillaIni);
                        for (int i = 0; i < ausente.getPiezas().size(); i++) {
                            if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY)) {
                                if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), casillaFin, ausente.getPiezas().get(i).getId(), ausente)) {
                                    mapa[0][5].setPosicion(new int[]{0, 7});
                                    mapa[0][7] = mapa[0][5];
                                    colocarCasVacia(new int[]{0, 5});

                                    mapa[casillaIni[0]][casillaIni[1]] = pieza;
                                    mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                                    return false;
                                }
                            }
                        }

                        mapa[casillaIni[0]][casillaIni[1]] = pieza;
                        mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                        
                        mapa[0][7].mover();
                        return true;
                    }
                } else if (casillaFin[0] == 0 && casillaFin[1] == 2) {
                    if (mapa[0][1].esVacia() && mapa[0][2].esVacia() && mapa[0][3].esVacia()
                            && mapa[0][0].getJugador().isBlanco() == jugador.isBlanco() && mapa[0][0].getId().equals(Constantes.ID_TORRE) && !mapa[0][0].esMovida()) {
                        mapa[0][0].setPosicion(new int[]{0, 3});
                        mapa[0][3] = mapa[0][0];
                        colocarCasVacia(new int[]{0, 0});

                        Pieza piezaOcupada = mapa[casillaFin[0]][casillaFin[1]];

                        mapa[casillaFin[0]][casillaFin[1]] = pieza;
                        colocarCasVacia(casillaIni);
                        for (int i = 0; i < ausente.getPiezas().size(); i++) {
                            if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY)) {
                                if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), casillaFin, ausente.getPiezas().get(i).getId(), ausente)) {
                                    mapa[0][3].setPosicion(new int[]{0, 0});
                                    mapa[0][0] = mapa[0][3];
                                    colocarCasVacia(new int[]{0, 3});

                                    mapa[casillaIni[0]][casillaIni[1]] = pieza;
                                    mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                                    return false;
                                }
                            }
                        }

                        mapa[casillaIni[0]][casillaIni[1]] = pieza;
                        mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                        
                        mapa[0][0].mover();
                        return true;
                    }
                }

            }
        }
        return false;
    }

    //Aunque el movimiento sea valido, la pieza puede que no se pueda mover porque sería jaque al rey
    public boolean comprobarClavada(Jugador jugador, Jugador ausente, Pieza pieza, int[] casillaIni, int[] casillaFin) {
        //Para que vaya bien, primero muevo la pieza y después compruebo(revierto los cambios al final)
        Pieza piezaOcupada = mapa[casillaFin[0]][casillaFin[1]];

        mapa[casillaFin[0]][casillaFin[1]] = pieza;
        colocarCasVacia(pieza.getPosicion());

        if (!pieza.getId().equals(Constantes.ID_REY)) {
            for (int i = 0; i < ausente.getPiezas().size(); i++) {
                if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY) && !Arrays.equals(ausente.getPiezas().get(i).getPosicion(), casillaFin)) {
                    if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), jugador.buscarPiezaId(Constantes.ID_REY).getPosicion(), ausente.getPiezas().get(i).getId(), jugador)) {
                        mapa[casillaIni[0]][casillaIni[1]] = pieza;
                        mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
                        return false;
                    }
                }
            }
        }

        mapa[casillaIni[0]][casillaIni[1]] = pieza;
        mapa[casillaFin[0]][casillaFin[1]] = piezaOcupada;
        return true;
    }

    //Si las funciones de arriba han dado el OK, la pieza finalmente se mueve
    public void moverPieza(int[] casillaIni, int[] casillaFin, Jugador ausente) {
        //Si la pieza se come a otra, la borro de la lista del jugador correspondiente
        if (!mapa[casillaFin[0]][casillaFin[1]].esVacia()) {
            ausente.borrarPieza(mapa[casillaFin[0]][casillaFin[1]]);
        }
        //Sentencias que sirven para mover la pieza
        mapa[casillaIni[0]][casillaIni[1]].mover();
        mapa[casillaIni[0]][casillaIni[1]].setPosicion(casillaFin);
        mapa[casillaFin[0]][casillaFin[1]] = mapa[casillaIni[0]][casillaIni[1]];
        colocarCasVacia(casillaIni);
    }

    //Funcion para comprobar si un peon corona o no
    public boolean comprobarCoronar(int[] casillaFin) {
        return mapa[casillaFin[0]][casillaFin[1]].getId().equals(Constantes.ID_PEON) && (casillaFin[0] == 0 || casillaFin[0] == 7);
    }

    //Funcion para cambiar el id y el dibujo del peon
    public void coronar(int respuestaCor, int[] casillaFin) {
        switch (respuestaCor) {
            case 1 -> {
                mapa[casillaFin[0]][casillaFin[1]].setId(Constantes.ID_REINA);
                if (mapa[casillaFin[0]][casillaFin[1]].getJugador().isBlanco()) {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_REINA_B);
                } else {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_REINA_N);
                }
            }
            case 2 -> {
                mapa[casillaFin[0]][casillaFin[1]].setId(Constantes.ID_TORRE);
                if (mapa[casillaFin[0]][casillaFin[1]].getJugador().isBlanco()) {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_TORRE_B);
                } else {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_TORRE_N);
                }
            }
            case 3 -> {
                mapa[casillaFin[0]][casillaFin[1]].setId(Constantes.ID_ALFIL);
                if (mapa[casillaFin[0]][casillaFin[1]].getJugador().isBlanco()) {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_ALFIL_B);
                } else {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_ALFIL_N);
                }
            }
            case 4 -> {
                mapa[casillaFin[0]][casillaFin[1]].setId(Constantes.ID_CABALLO);
                if (mapa[casillaFin[0]][casillaFin[1]].getJugador().isBlanco()) {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_CABALLO_B);
                } else {
                    mapa[casillaFin[0]][casillaFin[1]].setDibujo(Constantes.DIB_CABALLO_N);
                }
            }
        }
    }

    //comparada con las demás, esta es sencilla, sólo veo si las piezas del jugador
    //pueden llegar a la casilla del rey del jugador contrario
    public boolean comprobarJaque(Jugador jugador, Jugador ausente) {
        for (int i = 0; i < jugador.getPiezas().size(); i++) {
            if (!jugador.getPiezas().get(i).getId().equals(Constantes.ID_REY)) {
                if (comprobarMovimiento(jugador.getPiezas().get(i).getPosicion(), ausente.buscarPiezaId(Constantes.ID_REY).getPosicion(), jugador.getPiezas().get(i).getId(), jugador)) {
                    jugador.getPiezas().get(i).haceJaque();
                    return true;
                } else {
                    jugador.getPiezas().get(i).noHaceJaque();
                }
            }
        }
        return false;
    }

    //Funcion que comprueba si es jaque mate
    public boolean comprobarMate(Jugador jugador, Jugador ausente, int[] posFin) {
        //Hay 3 cosas a tener en cuenta del mate:
        //1º, es mate si el rey no puede moverse a ningún lugar y está en jaque
        //2º, si el jugador atacado se come la pieza que le está atacando, deja de ser jaque
        //3º, no tiene ni que comerse la pieza, con que se ponga por delante, ya sirve
        //La 1º compruebo si el rey tiene algun movimiento disponible, para eso compruebo los 8 movimientos que puede hace el rey
        //La 2º compruebo que alguna pieza del jugador contrario puede moverse a la posicion de la pieza que le hace jaque, para comerla
        //La 3º tengo que saber las casillas necesarias para que la pieza haga jaque, y después, compruebo si 
        //alguna pieza del jugador atacado puede moverse a alguna de esas casillas
        int[] posReyContrario = ausente.buscarPiezaId(Constantes.ID_REY).getPosicion();
        //1º paso
        for (int i = posReyContrario[0] - 1; i <= posReyContrario[0] + 1; i++) {
            for (int j = posReyContrario[1] - 1; j <= posReyContrario[1] + 1; j++) {
                //El if es para que no se salga del tablero
                if (!(i < 0 || 7 < i || j < 0 || 7 < j) && !ausente.getPiezas().contains(mapa[i][j])) {
                    //Gracias a como he hecho el comprobarMovimiento, no me tengo que preocupar de quitar la casilla donde ya está el rey
                    if (comprobarMovimiento(posReyContrario, new int[]{i, j}, ausente.buscarPiezaId(Constantes.ID_REY).getId(), jugador)) {
                        return false;
                    }
                }
            }
        }
        //Si el rey no tiene movimientos disponibles, pillo la pieza que está haciendo jaque y las casillas necesarias para que pueda hacer jaque
        Pieza piezaJaque = jugador.buscarPiezaJaque();
        ArrayList<Pieza> bodyBlock
                = (!piezaJaque.getId().equals(Constantes.ID_REY) && !piezaJaque.getId().equals(Constantes.ID_PEON) && !piezaJaque.getId().equals(Constantes.ID_CABALLO))
                ? getCasillasMovimiento(piezaJaque.getPosicion(), posReyContrario, piezaJaque.getId(), ausente) : new ArrayList<>();
        //Compruebo cada pieza del jugador atacado para el 2º y 3º paso
        for (int i = 0; i < ausente.getPiezas().size(); i++) {
            if (!ausente.getPiezas().get(i).getId().equals(Constantes.ID_REY)) {
                //2º paso
                if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), piezaJaque.getPosicion(), jugador.getPiezas().get(i).getId(), jugador)) {
                    return false;
                }
                //3º paso
                for (int j = 0; j < bodyBlock.size(); j++) {
                    if (comprobarMovimiento(ausente.getPiezas().get(i).getPosicion(), bodyBlock.get(j).getPosicion(), ausente.getPiezas().get(i).getId(), jugador)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //Funcion para comprobar las casillas necesarias para el movimiento de la pieza que hace jaque
    //y así ver si es jaque mate
    public ArrayList<Pieza> getCasillasMovimiento(int[] casillaIni, int[] casillaFin, String id, Jugador ausente) {
        ArrayList<Pieza> casillasNecesarias = new ArrayList<>();
        switch (id) {
            case Constantes.ID_TORRE -> {
                if (casillaIni[0] == casillaFin[0]) {
                    if (casillaIni[1] < casillaFin[1]) {
                        //Derecha
                        for (int i = casillaIni[1] + 1; i < casillaFin[1]; i++) {
                            casillasNecesarias.add(mapa[casillaIni[0]][i]);
                        }
                        return casillasNecesarias;
                    } else {
                        //Izquierda
                        for (int i = casillaIni[1] - 1; i > casillaFin[1]; i--) {
                            casillasNecesarias.add(mapa[casillaIni[0]][i]);
                        }
                        return casillasNecesarias;
                    }
                } else if (casillaIni[1] == casillaFin[1]) {
                    if (casillaIni[0] < casillaFin[0]) {
                        //Abajo
                        for (int i = casillaIni[0] + 1; i < casillaFin[0]; i++) {
                            casillasNecesarias.add(mapa[i][casillaIni[1]]);
                        }
                        return casillasNecesarias;
                    } else {
                        //Arriba
                        for (int i = casillaIni[0] - 1; i > casillaFin[0]; i--) {
                            casillasNecesarias.add(mapa[i][casillaIni[1]]);
                        }
                        return casillasNecesarias;
                    }
                } else {
                    return casillasNecesarias;
                }
            }
            case Constantes.ID_ALFIL -> {
                //Por la forma en la que lo he hecho, en la y se resta hacia arriba y en la x se resta hacia la izquierda
                if (casillaIni[0] > casillaFin[0]) {
                    //Arriba
                    if (casillaIni[1] > casillaFin[1]) {
                        //izquierda
                        int j = casillaIni[1] - 1;
                        for (int i = casillaIni[0] - 1; i > casillaFin[0]; i--) {
                            casillasNecesarias.add(mapa[i][j]);
                            j--;
                        }
                        return casillasNecesarias;
                    } else {
                        //derecha
                        int j = casillaIni[1] + 1;
                        for (int i = casillaIni[0] - 1; i > casillaFin[0]; i--) {
                            casillasNecesarias.add(mapa[i][j]);
                            j++;
                        }
                        return casillasNecesarias;
                    }
                } else {
                    //Abajo
                    if (casillaIni[1] > casillaFin[1]) {
                        //izquierda
                        int j = casillaIni[1] - 1;
                        for (int i = casillaIni[0] + 1; i < casillaFin[0]; i++) {
                            casillasNecesarias.add(mapa[i][j]);
                            j--;
                        }
                        return casillasNecesarias;
                    } else {
                        //derecha
                        int j = casillaIni[1] + 1;
                        for (int i = casillaIni[0] + 1; i < casillaFin[0]; i++) {
                            casillasNecesarias.add(mapa[i][j]);
                            j++;
                        }
                        return casillasNecesarias;
                    }
                }
            }
            case Constantes.ID_REINA -> {
                if (comprobarMovimiento(casillaIni, casillaFin, Constantes.ID_TORRE, ausente)) {
                    return getCasillasMovimiento(casillaIni, casillaFin, Constantes.ID_TORRE, ausente);
                } else {
                    return getCasillasMovimiento(casillaIni, casillaFin, Constantes.ID_ALFIL, ausente);
                }
            }
            //Dado que tengo todas las IDS controladas, esto no debería ocurrir
            default -> {
                JOptionPane.showMessageDialog(null, "Esto no deberia ocurrir");
                return casillasNecesarias;
            }
        }
    }
}
