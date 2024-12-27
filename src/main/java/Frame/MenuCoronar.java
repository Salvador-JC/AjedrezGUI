package Frame;

import cons.Constantes;
import java.awt.Color;
import juego.Ajedrez;

/**
 *
 * @author salvador
 */
public class MenuCoronar extends javax.swing.JFrame {

    private final Ajedrez ajedrez;
    private final int[] posFin;

    public MenuCoronar(Ajedrez ajedrez, int[] posFin) {
        this.ajedrez = ajedrez;
        this.posFin = posFin;
        initComponents();
        
        //Inicia todos los componentes con sus respectivas casillas
        this.iniciarJFrame();
    }

    private void iniciarJFrame() {
        c00.setBackground(Color.WHITE);
        c01.setBackground(Color.WHITE);
        c02.setBackground(Color.WHITE);
        c03.setBackground(Color.WHITE);
        if (ajedrez.getJugadorAct().isBlanco()) {
            c00.setText(Constantes.DIB_REINA_B);
            c01.setText(Constantes.DIB_TORRE_B);
            c02.setText(Constantes.DIB_ALFIL_B);
            c03.setText(Constantes.DIB_CABALLO_B);
        } else {
            c00.setText(Constantes.DIB_REINA_N);
            c01.setText(Constantes.DIB_TORRE_N);
            c02.setText(Constantes.DIB_ALFIL_N);
            c03.setText(Constantes.DIB_CABALLO_N);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        c00 = new javax.swing.JButton();
        c01 = new javax.swing.JButton();
        c03 = new javax.swing.JButton();
        c02 = new javax.swing.JButton();
        txtTurno = new javax.swing.JLabel();

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

        txtTurno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtTurno.setText("¿A qué pieza quieres que el peón corone?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTurno)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(c00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(c03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtTurno)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void c00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c00ActionPerformed
        ajedrez.getJuego().coronar(1, posFin);
        new MenuTableroMov(ajedrez, posFin, true).setVisible(false);
        this.dispose();
    }//GEN-LAST:event_c00ActionPerformed

    private void c01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c01ActionPerformed
        ajedrez.getJuego().coronar(2, posFin);
        new MenuTableroMov(ajedrez, posFin, true).setVisible(false);
        this.dispose();
    }//GEN-LAST:event_c01ActionPerformed

    private void c02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c02ActionPerformed
        ajedrez.getJuego().coronar(3, posFin);
        new MenuTableroMov(ajedrez, posFin, true).setVisible(false);
        this.dispose();
    }//GEN-LAST:event_c02ActionPerformed

    private void c03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c03ActionPerformed
        ajedrez.getJuego().coronar(4, posFin);
        new MenuTableroMov(ajedrez, posFin, true).setVisible(false);
        this.dispose();
    }//GEN-LAST:event_c03ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCoronar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCoronar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCoronar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCoronar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton c00;
    private javax.swing.JButton c01;
    private javax.swing.JButton c02;
    private javax.swing.JButton c03;
    private javax.swing.JLabel txtTurno;
    // End of variables declaration//GEN-END:variables
}
