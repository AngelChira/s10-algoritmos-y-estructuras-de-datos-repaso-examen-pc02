package semana06ArrayListForm;

import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class FrmCancion extends javax.swing.JFrame {
    ArrayList<Cancion> canciones = new ArrayList<>();
    boolean bus = false;

    public FrmCancion() {
        initComponents();
    }

    private void listarCanciones() {
        taResultado.setText("");
        if (canciones.size() > 0) {
            taResultado.append("Titulo \t Artista\n");
            for (Cancion cancion : canciones) {
                taResultado.append(cancion.getTitulo() + "\t" + cancion.getArtista() + "\n");
            }
            return;
        }
        taResultado.setText("No hay canciones.");
    }

    private boolean agregarCancion(Cancion n) {
        for (Cancion c : canciones) {
            if (c.getTitulo().equalsIgnoreCase(n.getTitulo()) && c.getArtista().equalsIgnoreCase(n.getArtista())) {
                return true;
            }
        }
        return false;
    }

    private void ordenarCanciones() {
        ArrayList<Cancion> ordenar = new ArrayList<>();
        ordenar.clear();
        ordenar.addAll(canciones);
        ordenar.sort(Comparator.naturalOrder());
        taResultado.setText("");
        if (ordenar.size() > 0) {
            taResultado.append("Titulo \t Artista\n");
            for (Cancion cancion : ordenar) {
                taResultado.append(cancion.getTitulo() + "\t" + cancion.getArtista() + "\n");
            }
            return;
        }
        taResultado.setText("No hay canciones.");
    }

    private boolean eliminarCancion(int index) {
        if (index >= 0 && index < canciones.size()) {
            canciones.remove(index);
            return true;
        }
        return false;
    }
    
    private boolean actualizarCancion(Cancion objetoDeCancion, int index) {
        if (index >= 0 && index < canciones.size()) {
            canciones.set(index, objetoDeCancion);
            return true;
        }
        return false;
    }

    private void buscarCancionListar(String valor, boolean f) {
        taResultado.setText("");
        if (canciones.size() > 0) {
            taResultado.append("Titulo \t Artista\n");
            if (f) {
                for (Cancion cancion : canciones) {
                    if (cancion.getTitulo().equalsIgnoreCase(valor)) {
                        taResultado.append(cancion.getTitulo() + "\t" + cancion.getArtista() + "\n");
                    }
                }
            } else {
                for (Cancion cancion : canciones) {
                    if (cancion.getArtista().equalsIgnoreCase(valor)) {
                        taResultado.append(cancion.getTitulo() + "\t" + cancion.getArtista() + "\n");
                    }
                }
            }
            return;
        }
        taResultado.setText("No hay canciones.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        btnOrdenar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscarT = new javax.swing.JButton();
        btnBuscarA = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo:");

        jLabel2.setText("Artista:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        taResultado.setColumns(20);
        taResultado.setRows(5);
        jScrollPane1.setViewportView(taResultado);

        btnOrdenar.setText("Ordenar");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscarT.setText("Buscar T");
        btnBuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTActionPerformed(evt);
            }
        });

        btnBuscarA.setText("Buscar A");
        btnBuscarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAActionPerformed(evt);
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
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txtArtista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrdenar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscarT)
                    .addComponent(btnBuscarA)
                    .addComponent(btnActualizar))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnOrdenar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarT)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarA)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cancion can = new Cancion(txtTitulo.getText().strip(), txtArtista.getText().strip());
        if (!agregarCancion(can)) {
            if (canciones.add(can)) {
                JOptionPane.showMessageDialog(null, "Se agrego correctamente la canción.");
                txtArtista.setText("");
                txtTitulo.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "No se agrego la canción.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La canción ya existe");
            txtTitulo.requestFocus();
        }
        listarCanciones();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        listarCanciones();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        ordenarCanciones();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición de la canción a eliminar:"));
        if (eliminarCancion(index - 1)) {
            JOptionPane.showMessageDialog(null, "Se elimino la canción.");
            listarCanciones();
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino la canción.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTActionPerformed
        bus = true;
        String valor = (JOptionPane.showInputDialog("Ingrese el titulo de la canción a buscar:"));
        buscarCancionListar(valor, bus);
    }//GEN-LAST:event_btnBuscarTActionPerformed

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAActionPerformed
        bus = false;
        String valor = (JOptionPane.showInputDialog("Ingrese el titulo de la canción a buscar:"));
        buscarCancionListar(valor, bus);
    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int index = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición de la canción a actualizar:"));
        if (actualizarCancion(new Cancion(txtTitulo.getText().strip(), txtArtista.getText().strip()),index-1)) {
            JOptionPane.showMessageDialog(null, "Se actualizo la canción con posición "+index);
            listarCanciones();
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo la canción.");
        }
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
            java.util.logging.Logger.getLogger(FrmCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCancion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCancion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarA;
    private javax.swing.JButton btnBuscarT;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea taResultado;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
