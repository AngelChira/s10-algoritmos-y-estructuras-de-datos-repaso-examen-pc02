package semana08ListaEnlazadaSimple;

import javax.swing.JOptionPane;

public class FrmNodo extends javax.swing.JFrame {
    Lista l = new Lista();
    public FrmNodo() {
        initComponents();
    }
    
    private void listarNumeros(){
        Nodo aux = l.inicio;
        taResultado.setText("");
        while (aux != null) {            
            taResultado.append(aux.getNumero()+"\n");
            aux = aux.getSiguiente();
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnAgregarInicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        btnAgregarFinal = new javax.swing.JButton();
        btnAgregarPosicion = new javax.swing.JButton();
        btnEliminarInicio = new javax.swing.JButton();
        btnEliminarFinal = new javax.swing.JButton();
        btnEliminarPosicion = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número:");

        btnAgregarInicio.setText("Agregar Inicio");
        btnAgregarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInicioActionPerformed(evt);
            }
        });

        taResultado.setColumns(20);
        taResultado.setRows(5);
        jScrollPane1.setViewportView(taResultado);

        btnAgregarFinal.setText("Agregar Final");
        btnAgregarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFinalActionPerformed(evt);
            }
        });

        btnAgregarPosicion.setText("Agregar Posicion");
        btnAgregarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPosicionActionPerformed(evt);
            }
        });

        btnEliminarInicio.setText("Eliminar Incio");
        btnEliminarInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInicioActionPerformed(evt);
            }
        });

        btnEliminarFinal.setText("Eliminar Final");
        btnEliminarFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFinalActionPerformed(evt);
            }
        });

        btnEliminarPosicion.setText("Eliminar Posicion");
        btnEliminarPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPosicionActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnAgregarInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarFinal)
                            .addComponent(btnAgregarPosicion)
                            .addComponent(btnEliminarInicio)
                            .addComponent(btnEliminarFinal)
                            .addComponent(btnEliminarPosicion)
                            .addComponent(btnMostrar)
                            .addComponent(btnBuscar)
                            .addComponent(btnActualizar))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarInicio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregarFinal)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarPosicion)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarInicio)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarFinal)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPosicion)
                        .addGap(18, 18, 18)
                        .addComponent(btnMostrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInicioActionPerformed
        l.insertarInicio(Integer.parseInt(txtNumero.getText().strip()));
        listarNumeros();
        txtNumero.setText("");
    }//GEN-LAST:event_btnAgregarInicioActionPerformed

    private void btnAgregarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFinalActionPerformed
        l.insertarFinal(Integer.parseInt(txtNumero.getText().strip()));
        listarNumeros();
        txtNumero.setText("");
    }//GEN-LAST:event_btnAgregarFinalActionPerformed

    private void btnAgregarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPosicionActionPerformed
        int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a agregar: "));
        l.insertarPosicion(Integer.parseInt(txtNumero.getText().strip()), po-1);
        listarNumeros();
        txtNumero.setText("");
    }//GEN-LAST:event_btnAgregarPosicionActionPerformed

    private void btnEliminarInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInicioActionPerformed
        l.eliminarIncio();
        listarNumeros();
    }//GEN-LAST:event_btnEliminarInicioActionPerformed

    private void btnEliminarFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFinalActionPerformed
        l.eliminarFinal();
        listarNumeros();
    }//GEN-LAST:event_btnEliminarFinalActionPerformed

    private void btnEliminarPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPosicionActionPerformed
        int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar: "));
        l.eliminarPosicion(po-1);
        listarNumeros();
    }//GEN-LAST:event_btnEliminarPosicionActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        listarNumeros();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a buscar: "));
        if (po-1 >= 0) {
            taResultado.setText("");
            taResultado.append(l.BuscarNumeroPosicion(po-1));
        } else {
            JOptionPane.showMessageDialog(null, "Error, la posición es menor a 0.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a actualizar: "));
        l.actualizarNumeroPosicion(Integer.parseInt(txtNumero.getText().strip()),po-1);
        listarNumeros();
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmNodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmNodo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregarFinal;
    private javax.swing.JButton btnAgregarInicio;
    private javax.swing.JButton btnAgregarPosicion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarFinal;
    private javax.swing.JButton btnEliminarInicio;
    private javax.swing.JButton btnEliminarPosicion;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taResultado;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

}
