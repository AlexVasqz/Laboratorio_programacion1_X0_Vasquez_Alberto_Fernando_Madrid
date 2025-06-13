package juegoxo.ventanas;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import juegoxo.eventos.Posiciones;

public class Tablero extends javax.swing.JFrame {

    private Posiciones juego = new Posiciones();
    private boolean turnoX = true; // true = X, false = O

    public Tablero() {
        initComponents();

        boton1.addActionListener(e -> manejarMovimiento(boton1, 0));
        boton2.addActionListener(e -> manejarMovimiento(boton2, 1));
        boton3.addActionListener(e -> manejarMovimiento(boton3, 2));
        boton4.addActionListener(e -> manejarMovimiento(boton4, 3));
        boton5.addActionListener(e -> manejarMovimiento(boton5, 4));
        boton6.addActionListener(e -> manejarMovimiento(boton6, 5));
        boton7.addActionListener(e -> manejarMovimiento(boton7, 6));
        boton8.addActionListener(e -> manejarMovimiento(boton8, 7));
        boton9.addActionListener(e -> manejarMovimiento(boton9, 8));
    }

    private void manejarMovimiento(JButton boton, int posicion) {
        if (!juego.esValida(posicion)) {
            JOptionPane.showMessageDialog(this, "Movimiento Incorrecto! Intentelo de nuevo.");
            return;
        }

        boton.setText(turnoX ? "X" : "O");
        juego.registrarMovimiento(posicion, turnoX ? 1 : 2);

        int ganador = juego.getGanador();
        if (ganador != 0) {
            JOptionPane.showMessageDialog(this, "Ganó el jugador " + (ganador == 1 ? "X" : "O"));
        }

        turnoX = !turnoX;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boton1.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton2.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton3.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton4.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton5.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton6.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton7.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton8.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        boton9.setFont(new java.awt.Font("Kefa", 1, 48)); // NOI18N
        boton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        titulo.setFont(new java.awt.Font("Kefa", 1, 36)); // NOI18N
        titulo.setText("Tic Tac Toe");

        turno.setFont(new java.awt.Font("Kefa", 1, 24)); // NOI18N
        turno.setText("Turno de:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(turno, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(titulo)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(turno))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables
}
