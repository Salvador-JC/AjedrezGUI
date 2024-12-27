package Frame;

import java.awt.Color;
import juego.Ajedrez;

/**
 *
 * @author salvador
 */
public class MenuJaqueMate extends javax.swing.JFrame {

    private final Ajedrez ajedrez;

    public MenuJaqueMate(Ajedrez ajedrez) {
        this.ajedrez = ajedrez;
        initComponents();
        
        //Inicia todos los componentes con sus respectivas casillas
        this.iniciarJFrame();
    }

    private void iniciarJFrame() {
        numTurno.setText(Integer.toString(ajedrez.getTurno()));
        txtJugadorAct.setText(ajedrez.getJugadorAct().toString());
        Color cobalto = new Color(69, 141, 195);
        c00.setText(ajedrez.getJuego().getPieza(new int[]{0, 0}).toString());
        c00.setBackground(Color.WHITE);
        c01.setText(ajedrez.getJuego().getPieza(new int[]{0, 1}).toString());
        c01.setBackground(cobalto);
        c02.setText(ajedrez.getJuego().getPieza(new int[]{0, 2}).toString());
        c02.setBackground(Color.WHITE);
        c03.setText(ajedrez.getJuego().getPieza(new int[]{0, 3}).toString());
        c03.setBackground(cobalto);
        c04.setText(ajedrez.getJuego().getPieza(new int[]{0, 4}).toString());
        c04.setBackground(Color.WHITE);
        c05.setText(ajedrez.getJuego().getPieza(new int[]{0, 5}).toString());
        c05.setBackground(cobalto);
        c06.setText(ajedrez.getJuego().getPieza(new int[]{0, 6}).toString());
        c06.setBackground(Color.WHITE);
        c07.setText(ajedrez.getJuego().getPieza(new int[]{0, 7}).toString());
        c07.setBackground(cobalto);
        c10.setText(ajedrez.getJuego().getPieza(new int[]{1, 0}).toString());
        c10.setBackground(cobalto);
        c11.setText(ajedrez.getJuego().getPieza(new int[]{1, 1}).toString());
        c11.setBackground(Color.WHITE);
        c12.setText(ajedrez.getJuego().getPieza(new int[]{1, 2}).toString());
        c12.setBackground(cobalto);
        c13.setText(ajedrez.getJuego().getPieza(new int[]{1, 3}).toString());
        c13.setBackground(Color.WHITE);
        c14.setText(ajedrez.getJuego().getPieza(new int[]{1, 4}).toString());
        c14.setBackground(cobalto);
        c15.setText(ajedrez.getJuego().getPieza(new int[]{1, 5}).toString());
        c15.setBackground(Color.WHITE);
        c16.setText(ajedrez.getJuego().getPieza(new int[]{1, 6}).toString());
        c16.setBackground(cobalto);
        c17.setText(ajedrez.getJuego().getPieza(new int[]{1, 7}).toString());
        c17.setBackground(Color.WHITE);
        c20.setText(ajedrez.getJuego().getPieza(new int[]{2, 0}).toString());
        c20.setBackground(Color.WHITE);
        c21.setText(ajedrez.getJuego().getPieza(new int[]{2, 1}).toString());
        c21.setBackground(cobalto);
        c22.setText(ajedrez.getJuego().getPieza(new int[]{2, 2}).toString());
        c22.setBackground(Color.WHITE);
        c23.setText(ajedrez.getJuego().getPieza(new int[]{2, 3}).toString());
        c23.setBackground(cobalto);
        c24.setText(ajedrez.getJuego().getPieza(new int[]{2, 4}).toString());
        c24.setBackground(Color.WHITE);
        c25.setText(ajedrez.getJuego().getPieza(new int[]{2, 5}).toString());
        c25.setBackground(cobalto);
        c26.setText(ajedrez.getJuego().getPieza(new int[]{2, 6}).toString());
        c26.setBackground(Color.WHITE);
        c27.setText(ajedrez.getJuego().getPieza(new int[]{2, 7}).toString());
        c27.setBackground(cobalto);
        c30.setText(ajedrez.getJuego().getPieza(new int[]{3, 0}).toString());
        c30.setBackground(cobalto);
        c31.setText(ajedrez.getJuego().getPieza(new int[]{3, 1}).toString());
        c31.setBackground(Color.WHITE);
        c32.setText(ajedrez.getJuego().getPieza(new int[]{3, 2}).toString());
        c32.setBackground(cobalto);
        c33.setText(ajedrez.getJuego().getPieza(new int[]{3, 3}).toString());
        c33.setBackground(Color.WHITE);
        c34.setText(ajedrez.getJuego().getPieza(new int[]{3, 4}).toString());
        c34.setBackground(cobalto);
        c35.setText(ajedrez.getJuego().getPieza(new int[]{3, 5}).toString());
        c35.setBackground(Color.WHITE);
        c36.setText(ajedrez.getJuego().getPieza(new int[]{3, 6}).toString());
        c36.setBackground(cobalto);
        c37.setText(ajedrez.getJuego().getPieza(new int[]{3, 7}).toString());
        c37.setBackground(Color.WHITE);
        c40.setText(ajedrez.getJuego().getPieza(new int[]{4, 0}).toString());
        c40.setBackground(Color.WHITE);
        c41.setText(ajedrez.getJuego().getPieza(new int[]{4, 1}).toString());
        c41.setBackground(cobalto);
        c42.setText(ajedrez.getJuego().getPieza(new int[]{4, 2}).toString());
        c42.setBackground(Color.WHITE);
        c43.setText(ajedrez.getJuego().getPieza(new int[]{4, 3}).toString());
        c43.setBackground(cobalto);
        c44.setText(ajedrez.getJuego().getPieza(new int[]{4, 4}).toString());
        c44.setBackground(Color.WHITE);
        c45.setText(ajedrez.getJuego().getPieza(new int[]{4, 5}).toString());
        c45.setBackground(cobalto);
        c46.setText(ajedrez.getJuego().getPieza(new int[]{4, 6}).toString());
        c46.setBackground(Color.WHITE);
        c47.setText(ajedrez.getJuego().getPieza(new int[]{4, 7}).toString());
        c47.setBackground(cobalto);
        c50.setText(ajedrez.getJuego().getPieza(new int[]{5, 0}).toString());
        c50.setBackground(cobalto);
        c51.setText(ajedrez.getJuego().getPieza(new int[]{5, 1}).toString());
        c51.setBackground(Color.WHITE);
        c52.setText(ajedrez.getJuego().getPieza(new int[]{5, 2}).toString());
        c52.setBackground(cobalto);
        c53.setText(ajedrez.getJuego().getPieza(new int[]{5, 3}).toString());
        c53.setBackground(Color.WHITE);
        c54.setText(ajedrez.getJuego().getPieza(new int[]{5, 4}).toString());
        c54.setBackground(cobalto);
        c55.setText(ajedrez.getJuego().getPieza(new int[]{5, 5}).toString());
        c55.setBackground(Color.WHITE);
        c56.setText(ajedrez.getJuego().getPieza(new int[]{5, 6}).toString());
        c56.setBackground(cobalto);
        c57.setText(ajedrez.getJuego().getPieza(new int[]{5, 7}).toString());
        c57.setBackground(Color.WHITE);
        c60.setText(ajedrez.getJuego().getPieza(new int[]{6, 0}).toString());
        c60.setBackground(Color.WHITE);
        c61.setText(ajedrez.getJuego().getPieza(new int[]{6, 1}).toString());
        c61.setBackground(cobalto);
        c62.setText(ajedrez.getJuego().getPieza(new int[]{6, 2}).toString());
        c62.setBackground(Color.WHITE);
        c63.setText(ajedrez.getJuego().getPieza(new int[]{6, 3}).toString());
        c63.setBackground(cobalto);
        c64.setText(ajedrez.getJuego().getPieza(new int[]{6, 4}).toString());
        c64.setBackground(Color.WHITE);
        c65.setText(ajedrez.getJuego().getPieza(new int[]{6, 5}).toString());
        c65.setBackground(cobalto);
        c66.setText(ajedrez.getJuego().getPieza(new int[]{6, 6}).toString());
        c66.setBackground(Color.WHITE);
        c67.setText(ajedrez.getJuego().getPieza(new int[]{6, 7}).toString());
        c67.setBackground(cobalto);
        c70.setText(ajedrez.getJuego().getPieza(new int[]{7, 0}).toString());
        c70.setBackground(cobalto);
        c71.setText(ajedrez.getJuego().getPieza(new int[]{7, 1}).toString());
        c71.setBackground(Color.WHITE);
        c72.setText(ajedrez.getJuego().getPieza(new int[]{7, 2}).toString());
        c72.setBackground(cobalto);
        c73.setText(ajedrez.getJuego().getPieza(new int[]{7, 3}).toString());
        c73.setBackground(Color.WHITE);
        c74.setText(ajedrez.getJuego().getPieza(new int[]{7, 4}).toString());
        c74.setBackground(cobalto);
        c75.setText(ajedrez.getJuego().getPieza(new int[]{7, 5}).toString());
        c75.setBackground(Color.WHITE);
        c76.setText(ajedrez.getJuego().getPieza(new int[]{7, 6}).toString());
        c76.setBackground(cobalto);
        c77.setText(ajedrez.getJuego().getPieza(new int[]{7, 7}).toString());
        c77.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c00 = new javax.swing.JButton();
        c01 = new javax.swing.JButton();
        c03 = new javax.swing.JButton();
        c02 = new javax.swing.JButton();
        c04 = new javax.swing.JButton();
        c05 = new javax.swing.JButton();
        c06 = new javax.swing.JButton();
        c07 = new javax.swing.JButton();
        c10 = new javax.swing.JButton();
        c11 = new javax.swing.JButton();
        c12 = new javax.swing.JButton();
        c13 = new javax.swing.JButton();
        c14 = new javax.swing.JButton();
        c15 = new javax.swing.JButton();
        c16 = new javax.swing.JButton();
        c17 = new javax.swing.JButton();
        c20 = new javax.swing.JButton();
        c21 = new javax.swing.JButton();
        c23 = new javax.swing.JButton();
        c22 = new javax.swing.JButton();
        c24 = new javax.swing.JButton();
        c25 = new javax.swing.JButton();
        c26 = new javax.swing.JButton();
        c27 = new javax.swing.JButton();
        c30 = new javax.swing.JButton();
        c31 = new javax.swing.JButton();
        c32 = new javax.swing.JButton();
        c33 = new javax.swing.JButton();
        c34 = new javax.swing.JButton();
        c35 = new javax.swing.JButton();
        c36 = new javax.swing.JButton();
        c37 = new javax.swing.JButton();
        c40 = new javax.swing.JButton();
        c41 = new javax.swing.JButton();
        c42 = new javax.swing.JButton();
        c43 = new javax.swing.JButton();
        c44 = new javax.swing.JButton();
        c45 = new javax.swing.JButton();
        c46 = new javax.swing.JButton();
        c47 = new javax.swing.JButton();
        c50 = new javax.swing.JButton();
        c51 = new javax.swing.JButton();
        c52 = new javax.swing.JButton();
        c53 = new javax.swing.JButton();
        c54 = new javax.swing.JButton();
        c55 = new javax.swing.JButton();
        c56 = new javax.swing.JButton();
        c57 = new javax.swing.JButton();
        c60 = new javax.swing.JButton();
        c61 = new javax.swing.JButton();
        c62 = new javax.swing.JButton();
        c63 = new javax.swing.JButton();
        c64 = new javax.swing.JButton();
        c65 = new javax.swing.JButton();
        c66 = new javax.swing.JButton();
        c67 = new javax.swing.JButton();
        c70 = new javax.swing.JButton();
        c71 = new javax.swing.JButton();
        c72 = new javax.swing.JButton();
        c73 = new javax.swing.JButton();
        c74 = new javax.swing.JButton();
        c75 = new javax.swing.JButton();
        c76 = new javax.swing.JButton();
        c77 = new javax.swing.JButton();
        txtTurno = new javax.swing.JLabel();
        numTurno = new javax.swing.JLabel();
        txtJugadorAct = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        c00.setText("jButton1");
        c00.setMaximumSize(new java.awt.Dimension(50, 50));
        c00.setMinimumSize(new java.awt.Dimension(50, 50));
        c00.setPreferredSize(new java.awt.Dimension(50, 50));
        c00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c00ActionPerformed(evt);
            }
        });

        c01.setText("jButton1");
        c01.setMaximumSize(new java.awt.Dimension(50, 50));
        c01.setMinimumSize(new java.awt.Dimension(50, 50));
        c01.setPreferredSize(new java.awt.Dimension(50, 50));
        c01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c01ActionPerformed(evt);
            }
        });

        c03.setText("jButton1");
        c03.setMaximumSize(new java.awt.Dimension(50, 50));
        c03.setMinimumSize(new java.awt.Dimension(50, 50));
        c03.setPreferredSize(new java.awt.Dimension(50, 50));
        c03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c03ActionPerformed(evt);
            }
        });

        c02.setText("jButton1");
        c02.setMaximumSize(new java.awt.Dimension(50, 50));
        c02.setMinimumSize(new java.awt.Dimension(50, 50));
        c02.setPreferredSize(new java.awt.Dimension(50, 50));
        c02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c02ActionPerformed(evt);
            }
        });

        c04.setText("jButton1");
        c04.setMaximumSize(new java.awt.Dimension(50, 50));
        c04.setMinimumSize(new java.awt.Dimension(50, 50));
        c04.setPreferredSize(new java.awt.Dimension(50, 50));
        c04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c04ActionPerformed(evt);
            }
        });

        c05.setText("jButton1");
        c05.setMaximumSize(new java.awt.Dimension(50, 50));
        c05.setMinimumSize(new java.awt.Dimension(50, 50));
        c05.setPreferredSize(new java.awt.Dimension(50, 50));
        c05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c05ActionPerformed(evt);
            }
        });

        c06.setText("jButton1");
        c06.setMaximumSize(new java.awt.Dimension(50, 50));
        c06.setMinimumSize(new java.awt.Dimension(50, 50));
        c06.setPreferredSize(new java.awt.Dimension(50, 50));
        c06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c06ActionPerformed(evt);
            }
        });

        c07.setText("jButton1");
        c07.setMaximumSize(new java.awt.Dimension(50, 50));
        c07.setMinimumSize(new java.awt.Dimension(50, 50));
        c07.setPreferredSize(new java.awt.Dimension(50, 50));
        c07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c07ActionPerformed(evt);
            }
        });

        c10.setText("jButton1");
        c10.setMaximumSize(new java.awt.Dimension(50, 50));
        c10.setMinimumSize(new java.awt.Dimension(50, 50));
        c10.setPreferredSize(new java.awt.Dimension(50, 50));
        c10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c10ActionPerformed(evt);
            }
        });

        c11.setText("jButton1");
        c11.setMaximumSize(new java.awt.Dimension(50, 50));
        c11.setMinimumSize(new java.awt.Dimension(50, 50));
        c11.setPreferredSize(new java.awt.Dimension(50, 50));
        c11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c11ActionPerformed(evt);
            }
        });

        c12.setText("jButton1");
        c12.setMaximumSize(new java.awt.Dimension(50, 50));
        c12.setMinimumSize(new java.awt.Dimension(50, 50));
        c12.setPreferredSize(new java.awt.Dimension(50, 50));
        c12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c12ActionPerformed(evt);
            }
        });

        c13.setText("jButton1");
        c13.setMaximumSize(new java.awt.Dimension(50, 50));
        c13.setMinimumSize(new java.awt.Dimension(50, 50));
        c13.setPreferredSize(new java.awt.Dimension(50, 50));
        c13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c13ActionPerformed(evt);
            }
        });

        c14.setText("jButton1");
        c14.setMaximumSize(new java.awt.Dimension(50, 50));
        c14.setMinimumSize(new java.awt.Dimension(50, 50));
        c14.setPreferredSize(new java.awt.Dimension(50, 50));
        c14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c14ActionPerformed(evt);
            }
        });

        c15.setText("jButton1");
        c15.setMaximumSize(new java.awt.Dimension(50, 50));
        c15.setMinimumSize(new java.awt.Dimension(50, 50));
        c15.setPreferredSize(new java.awt.Dimension(50, 50));
        c15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c15ActionPerformed(evt);
            }
        });

        c16.setText("jButton1");
        c16.setMaximumSize(new java.awt.Dimension(50, 50));
        c16.setMinimumSize(new java.awt.Dimension(50, 50));
        c16.setPreferredSize(new java.awt.Dimension(50, 50));
        c16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c16ActionPerformed(evt);
            }
        });

        c17.setText("jButton1");
        c17.setMaximumSize(new java.awt.Dimension(50, 50));
        c17.setMinimumSize(new java.awt.Dimension(50, 50));
        c17.setPreferredSize(new java.awt.Dimension(50, 50));
        c17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c17ActionPerformed(evt);
            }
        });

        c20.setText("jButton1");
        c20.setMaximumSize(new java.awt.Dimension(50, 50));
        c20.setMinimumSize(new java.awt.Dimension(50, 50));
        c20.setPreferredSize(new java.awt.Dimension(50, 50));
        c20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c20ActionPerformed(evt);
            }
        });

        c21.setText("jButton1");
        c21.setMaximumSize(new java.awt.Dimension(50, 50));
        c21.setMinimumSize(new java.awt.Dimension(50, 50));
        c21.setPreferredSize(new java.awt.Dimension(50, 50));
        c21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c21ActionPerformed(evt);
            }
        });

        c23.setText("jButton1");
        c23.setMaximumSize(new java.awt.Dimension(50, 50));
        c23.setMinimumSize(new java.awt.Dimension(50, 50));
        c23.setPreferredSize(new java.awt.Dimension(50, 50));
        c23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c23ActionPerformed(evt);
            }
        });

        c22.setText("jButton1");
        c22.setMaximumSize(new java.awt.Dimension(50, 50));
        c22.setMinimumSize(new java.awt.Dimension(50, 50));
        c22.setPreferredSize(new java.awt.Dimension(50, 50));
        c22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c22ActionPerformed(evt);
            }
        });

        c24.setText("jButton1");
        c24.setMaximumSize(new java.awt.Dimension(50, 50));
        c24.setMinimumSize(new java.awt.Dimension(50, 50));
        c24.setPreferredSize(new java.awt.Dimension(50, 50));
        c24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c24ActionPerformed(evt);
            }
        });

        c25.setText("jButton1");
        c25.setMaximumSize(new java.awt.Dimension(50, 50));
        c25.setMinimumSize(new java.awt.Dimension(50, 50));
        c25.setPreferredSize(new java.awt.Dimension(50, 50));
        c25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c25ActionPerformed(evt);
            }
        });

        c26.setText("jButton1");
        c26.setMaximumSize(new java.awt.Dimension(50, 50));
        c26.setMinimumSize(new java.awt.Dimension(50, 50));
        c26.setPreferredSize(new java.awt.Dimension(50, 50));
        c26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c26ActionPerformed(evt);
            }
        });

        c27.setText("jButton1");
        c27.setMaximumSize(new java.awt.Dimension(50, 50));
        c27.setMinimumSize(new java.awt.Dimension(50, 50));
        c27.setPreferredSize(new java.awt.Dimension(50, 50));
        c27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c27ActionPerformed(evt);
            }
        });

        c30.setText("jButton1");
        c30.setMaximumSize(new java.awt.Dimension(50, 50));
        c30.setMinimumSize(new java.awt.Dimension(50, 50));
        c30.setPreferredSize(new java.awt.Dimension(50, 50));
        c30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c30ActionPerformed(evt);
            }
        });

        c31.setText("jButton1");
        c31.setMaximumSize(new java.awt.Dimension(50, 50));
        c31.setMinimumSize(new java.awt.Dimension(50, 50));
        c31.setPreferredSize(new java.awt.Dimension(50, 50));
        c31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c31ActionPerformed(evt);
            }
        });

        c32.setText("jButton1");
        c32.setMaximumSize(new java.awt.Dimension(50, 50));
        c32.setMinimumSize(new java.awt.Dimension(50, 50));
        c32.setPreferredSize(new java.awt.Dimension(50, 50));
        c32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c32ActionPerformed(evt);
            }
        });

        c33.setText("jButton1");
        c33.setMaximumSize(new java.awt.Dimension(50, 50));
        c33.setMinimumSize(new java.awt.Dimension(50, 50));
        c33.setPreferredSize(new java.awt.Dimension(50, 50));
        c33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c33ActionPerformed(evt);
            }
        });

        c34.setText("jButton1");
        c34.setMaximumSize(new java.awt.Dimension(50, 50));
        c34.setMinimumSize(new java.awt.Dimension(50, 50));
        c34.setPreferredSize(new java.awt.Dimension(50, 50));
        c34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c34ActionPerformed(evt);
            }
        });

        c35.setText("jButton1");
        c35.setMaximumSize(new java.awt.Dimension(50, 50));
        c35.setMinimumSize(new java.awt.Dimension(50, 50));
        c35.setPreferredSize(new java.awt.Dimension(50, 50));
        c35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c35ActionPerformed(evt);
            }
        });

        c36.setText("jButton1");
        c36.setMaximumSize(new java.awt.Dimension(50, 50));
        c36.setMinimumSize(new java.awt.Dimension(50, 50));
        c36.setPreferredSize(new java.awt.Dimension(50, 50));
        c36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c36ActionPerformed(evt);
            }
        });

        c37.setText("jButton1");
        c37.setMaximumSize(new java.awt.Dimension(50, 50));
        c37.setMinimumSize(new java.awt.Dimension(50, 50));
        c37.setPreferredSize(new java.awt.Dimension(50, 50));
        c37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c37ActionPerformed(evt);
            }
        });

        c40.setText("jButton1");
        c40.setMaximumSize(new java.awt.Dimension(50, 50));
        c40.setMinimumSize(new java.awt.Dimension(50, 50));
        c40.setPreferredSize(new java.awt.Dimension(50, 50));
        c40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c40ActionPerformed(evt);
            }
        });

        c41.setText("jButton1");
        c41.setMaximumSize(new java.awt.Dimension(50, 50));
        c41.setMinimumSize(new java.awt.Dimension(50, 50));
        c41.setPreferredSize(new java.awt.Dimension(50, 50));
        c41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c41ActionPerformed(evt);
            }
        });

        c42.setText("jButton1");
        c42.setMaximumSize(new java.awt.Dimension(50, 50));
        c42.setMinimumSize(new java.awt.Dimension(50, 50));
        c42.setPreferredSize(new java.awt.Dimension(50, 50));
        c42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c42ActionPerformed(evt);
            }
        });

        c43.setText("jButton1");
        c43.setMaximumSize(new java.awt.Dimension(50, 50));
        c43.setMinimumSize(new java.awt.Dimension(50, 50));
        c43.setPreferredSize(new java.awt.Dimension(50, 50));
        c43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c43ActionPerformed(evt);
            }
        });

        c44.setText("jButton1");
        c44.setMaximumSize(new java.awt.Dimension(50, 50));
        c44.setMinimumSize(new java.awt.Dimension(50, 50));
        c44.setPreferredSize(new java.awt.Dimension(50, 50));
        c44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c44ActionPerformed(evt);
            }
        });

        c45.setText("jButton1");
        c45.setMaximumSize(new java.awt.Dimension(50, 50));
        c45.setMinimumSize(new java.awt.Dimension(50, 50));
        c45.setPreferredSize(new java.awt.Dimension(50, 50));
        c45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c45ActionPerformed(evt);
            }
        });

        c46.setText("jButton1");
        c46.setMaximumSize(new java.awt.Dimension(50, 50));
        c46.setMinimumSize(new java.awt.Dimension(50, 50));
        c46.setPreferredSize(new java.awt.Dimension(50, 50));
        c46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c46ActionPerformed(evt);
            }
        });

        c47.setText("jButton1");
        c47.setMaximumSize(new java.awt.Dimension(50, 50));
        c47.setMinimumSize(new java.awt.Dimension(50, 50));
        c47.setPreferredSize(new java.awt.Dimension(50, 50));
        c47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c47ActionPerformed(evt);
            }
        });

        c50.setText("jButton1");
        c50.setMaximumSize(new java.awt.Dimension(50, 50));
        c50.setMinimumSize(new java.awt.Dimension(50, 50));
        c50.setPreferredSize(new java.awt.Dimension(50, 50));
        c50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c50ActionPerformed(evt);
            }
        });

        c51.setText("jButton1");
        c51.setMaximumSize(new java.awt.Dimension(50, 50));
        c51.setMinimumSize(new java.awt.Dimension(50, 50));
        c51.setPreferredSize(new java.awt.Dimension(50, 50));
        c51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c51ActionPerformed(evt);
            }
        });

        c52.setText("jButton1");
        c52.setMaximumSize(new java.awt.Dimension(50, 50));
        c52.setMinimumSize(new java.awt.Dimension(50, 50));
        c52.setPreferredSize(new java.awt.Dimension(50, 50));
        c52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c52ActionPerformed(evt);
            }
        });

        c53.setText("jButton1");
        c53.setMaximumSize(new java.awt.Dimension(50, 50));
        c53.setMinimumSize(new java.awt.Dimension(50, 50));
        c53.setPreferredSize(new java.awt.Dimension(50, 50));
        c53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c53ActionPerformed(evt);
            }
        });

        c54.setText("jButton1");
        c54.setMaximumSize(new java.awt.Dimension(50, 50));
        c54.setMinimumSize(new java.awt.Dimension(50, 50));
        c54.setPreferredSize(new java.awt.Dimension(50, 50));
        c54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c54ActionPerformed(evt);
            }
        });

        c55.setText("jButton1");
        c55.setMaximumSize(new java.awt.Dimension(50, 50));
        c55.setMinimumSize(new java.awt.Dimension(50, 50));
        c55.setPreferredSize(new java.awt.Dimension(50, 50));
        c55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c55ActionPerformed(evt);
            }
        });

        c56.setText("jButton1");
        c56.setMaximumSize(new java.awt.Dimension(50, 50));
        c56.setMinimumSize(new java.awt.Dimension(50, 50));
        c56.setPreferredSize(new java.awt.Dimension(50, 50));
        c56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c56ActionPerformed(evt);
            }
        });

        c57.setText("jButton1");
        c57.setMaximumSize(new java.awt.Dimension(50, 50));
        c57.setMinimumSize(new java.awt.Dimension(50, 50));
        c57.setPreferredSize(new java.awt.Dimension(50, 50));
        c57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c57ActionPerformed(evt);
            }
        });

        c60.setText("jButton1");
        c60.setMaximumSize(new java.awt.Dimension(50, 50));
        c60.setMinimumSize(new java.awt.Dimension(50, 50));
        c60.setPreferredSize(new java.awt.Dimension(50, 50));
        c60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c60ActionPerformed(evt);
            }
        });

        c61.setText("jButton1");
        c61.setMaximumSize(new java.awt.Dimension(50, 50));
        c61.setMinimumSize(new java.awt.Dimension(50, 50));
        c61.setPreferredSize(new java.awt.Dimension(50, 50));
        c61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c61ActionPerformed(evt);
            }
        });

        c62.setText("jButton1");
        c62.setMaximumSize(new java.awt.Dimension(50, 50));
        c62.setMinimumSize(new java.awt.Dimension(50, 50));
        c62.setPreferredSize(new java.awt.Dimension(50, 50));
        c62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c62ActionPerformed(evt);
            }
        });

        c63.setText("jButton1");
        c63.setMaximumSize(new java.awt.Dimension(50, 50));
        c63.setMinimumSize(new java.awt.Dimension(50, 50));
        c63.setPreferredSize(new java.awt.Dimension(50, 50));
        c63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c63ActionPerformed(evt);
            }
        });

        c64.setText("jButton1");
        c64.setMaximumSize(new java.awt.Dimension(50, 50));
        c64.setMinimumSize(new java.awt.Dimension(50, 50));
        c64.setPreferredSize(new java.awt.Dimension(50, 50));
        c64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c64ActionPerformed(evt);
            }
        });

        c65.setText("jButton1");
        c65.setMaximumSize(new java.awt.Dimension(50, 50));
        c65.setMinimumSize(new java.awt.Dimension(50, 50));
        c65.setPreferredSize(new java.awt.Dimension(50, 50));
        c65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c65ActionPerformed(evt);
            }
        });

        c66.setText("jButton1");
        c66.setMaximumSize(new java.awt.Dimension(50, 50));
        c66.setMinimumSize(new java.awt.Dimension(50, 50));
        c66.setPreferredSize(new java.awt.Dimension(50, 50));
        c66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c66ActionPerformed(evt);
            }
        });

        c67.setText("jButton1");
        c67.setMaximumSize(new java.awt.Dimension(50, 50));
        c67.setMinimumSize(new java.awt.Dimension(50, 50));
        c67.setPreferredSize(new java.awt.Dimension(50, 50));
        c67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c67ActionPerformed(evt);
            }
        });

        c70.setText("jButton1");
        c70.setMaximumSize(new java.awt.Dimension(50, 50));
        c70.setMinimumSize(new java.awt.Dimension(50, 50));
        c70.setPreferredSize(new java.awt.Dimension(50, 50));
        c70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c70ActionPerformed(evt);
            }
        });

        c71.setText("jButton1");
        c71.setMaximumSize(new java.awt.Dimension(50, 50));
        c71.setMinimumSize(new java.awt.Dimension(50, 50));
        c71.setPreferredSize(new java.awt.Dimension(50, 50));
        c71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c71ActionPerformed(evt);
            }
        });

        c72.setText("jButton1");
        c72.setMaximumSize(new java.awt.Dimension(50, 50));
        c72.setMinimumSize(new java.awt.Dimension(50, 50));
        c72.setPreferredSize(new java.awt.Dimension(50, 50));
        c72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c72ActionPerformed(evt);
            }
        });

        c73.setText("jButton1");
        c73.setMaximumSize(new java.awt.Dimension(50, 50));
        c73.setMinimumSize(new java.awt.Dimension(50, 50));
        c73.setPreferredSize(new java.awt.Dimension(50, 50));
        c73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c73ActionPerformed(evt);
            }
        });

        c74.setText("jButton1");
        c74.setMaximumSize(new java.awt.Dimension(50, 50));
        c74.setMinimumSize(new java.awt.Dimension(50, 50));
        c74.setPreferredSize(new java.awt.Dimension(50, 50));
        c74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c74ActionPerformed(evt);
            }
        });

        c75.setText("jButton1");
        c75.setMaximumSize(new java.awt.Dimension(50, 50));
        c75.setMinimumSize(new java.awt.Dimension(50, 50));
        c75.setPreferredSize(new java.awt.Dimension(50, 50));
        c75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c75ActionPerformed(evt);
            }
        });

        c76.setText("jButton1");
        c76.setMaximumSize(new java.awt.Dimension(50, 50));
        c76.setMinimumSize(new java.awt.Dimension(50, 50));
        c76.setPreferredSize(new java.awt.Dimension(50, 50));
        c76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c76ActionPerformed(evt);
            }
        });

        c77.setText("jButton1");
        c77.setMaximumSize(new java.awt.Dimension(50, 50));
        c77.setMinimumSize(new java.awt.Dimension(50, 50));
        c77.setPreferredSize(new java.awt.Dimension(50, 50));
        c77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c77ActionPerformed(evt);
            }
        });

        txtTurno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTurno.setText("Turno");

        numTurno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        numTurno.setText("0");

        txtJugadorAct.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtJugadorAct.setText("a");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Jaque mate de las ");

        Cerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(c77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jLabel6)
                                .addGap(1, 1, 1)
                                .addComponent(txtJugadorAct))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(txtTurno)
                        .addGap(6, 6, 6)
                        .addComponent(numTurno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(Cerrar)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTurno)
                    .addComponent(numTurno))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c06, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c07, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtJugadorAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void c00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c00ActionPerformed

    }//GEN-LAST:event_c00ActionPerformed

    private void c20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c20ActionPerformed

    private void c40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c40ActionPerformed

    private void c60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c60ActionPerformed

    }//GEN-LAST:event_c60ActionPerformed

    private void c01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c01ActionPerformed

    private void c02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c02ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c02ActionPerformed

    private void c03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c03ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c03ActionPerformed

    private void c04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c04ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c04ActionPerformed

    private void c05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c05ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c05ActionPerformed

    private void c06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c06ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c06ActionPerformed

    private void c07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c07ActionPerformed

    private void c10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c10ActionPerformed

    private void c11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c11ActionPerformed

    private void c12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c12ActionPerformed

    private void c13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c13ActionPerformed

    private void c14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c14ActionPerformed

    private void c15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c15ActionPerformed

    private void c16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c16ActionPerformed

    private void c17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c17ActionPerformed

    private void c21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c21ActionPerformed

    private void c22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c22ActionPerformed

    private void c23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c23ActionPerformed

    private void c24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c24ActionPerformed

    private void c25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c25ActionPerformed

    private void c26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c26ActionPerformed

    private void c27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c27ActionPerformed

    private void c30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c30ActionPerformed

    private void c31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c31ActionPerformed

    private void c32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c32ActionPerformed

    private void c33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c33ActionPerformed

    private void c34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c34ActionPerformed

    private void c35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c35ActionPerformed

    private void c36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c36ActionPerformed

    private void c37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c37ActionPerformed

    private void c41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c41ActionPerformed

    private void c42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c42ActionPerformed

    private void c43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c43ActionPerformed

    private void c44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c44ActionPerformed

    private void c45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c45ActionPerformed

    private void c46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c46ActionPerformed

    private void c47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c47ActionPerformed

    private void c50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c50ActionPerformed

    }//GEN-LAST:event_c50ActionPerformed

    private void c51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c51ActionPerformed

    }//GEN-LAST:event_c51ActionPerformed

    private void c52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c52ActionPerformed

    private void c53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c53ActionPerformed

    private void c54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c54ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c54ActionPerformed

    private void c55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c55ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c55ActionPerformed

    private void c56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c56ActionPerformed

    private void c57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c57ActionPerformed

    private void c61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c61ActionPerformed

    }//GEN-LAST:event_c61ActionPerformed

    private void c62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c62ActionPerformed

    private void c63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c63ActionPerformed

    private void c64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c64ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c64ActionPerformed

    private void c65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c65ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c65ActionPerformed

    private void c66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c66ActionPerformed

    private void c67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c67ActionPerformed

    private void c70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c70ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c70ActionPerformed

    private void c71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c71ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c71ActionPerformed

    private void c72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c72ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c72ActionPerformed

    private void c73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c73ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c73ActionPerformed

    private void c74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c74ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c74ActionPerformed

    private void c75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c75ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c75ActionPerformed

    private void c76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c76ActionPerformed

    private void c77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c77ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c77ActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        // TODO add your handling code here:
        new Saliendo().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJaqueMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJaqueMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJaqueMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJaqueMate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton c00;
    private javax.swing.JButton c01;
    private javax.swing.JButton c02;
    private javax.swing.JButton c03;
    private javax.swing.JButton c04;
    private javax.swing.JButton c05;
    private javax.swing.JButton c06;
    private javax.swing.JButton c07;
    private javax.swing.JButton c10;
    private javax.swing.JButton c11;
    private javax.swing.JButton c12;
    private javax.swing.JButton c13;
    private javax.swing.JButton c14;
    private javax.swing.JButton c15;
    private javax.swing.JButton c16;
    private javax.swing.JButton c17;
    private javax.swing.JButton c20;
    private javax.swing.JButton c21;
    private javax.swing.JButton c22;
    private javax.swing.JButton c23;
    private javax.swing.JButton c24;
    private javax.swing.JButton c25;
    private javax.swing.JButton c26;
    private javax.swing.JButton c27;
    private javax.swing.JButton c30;
    private javax.swing.JButton c31;
    private javax.swing.JButton c32;
    private javax.swing.JButton c33;
    private javax.swing.JButton c34;
    private javax.swing.JButton c35;
    private javax.swing.JButton c36;
    private javax.swing.JButton c37;
    private javax.swing.JButton c40;
    private javax.swing.JButton c41;
    private javax.swing.JButton c42;
    private javax.swing.JButton c43;
    private javax.swing.JButton c44;
    private javax.swing.JButton c45;
    private javax.swing.JButton c46;
    private javax.swing.JButton c47;
    private javax.swing.JButton c50;
    private javax.swing.JButton c51;
    private javax.swing.JButton c52;
    private javax.swing.JButton c53;
    private javax.swing.JButton c54;
    private javax.swing.JButton c55;
    private javax.swing.JButton c56;
    private javax.swing.JButton c57;
    private javax.swing.JButton c60;
    private javax.swing.JButton c61;
    private javax.swing.JButton c62;
    private javax.swing.JButton c63;
    private javax.swing.JButton c64;
    private javax.swing.JButton c65;
    private javax.swing.JButton c66;
    private javax.swing.JButton c67;
    private javax.swing.JButton c70;
    private javax.swing.JButton c71;
    private javax.swing.JButton c72;
    private javax.swing.JButton c73;
    private javax.swing.JButton c74;
    private javax.swing.JButton c75;
    private javax.swing.JButton c76;
    private javax.swing.JButton c77;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel numTurno;
    private javax.swing.JLabel txtJugadorAct;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
