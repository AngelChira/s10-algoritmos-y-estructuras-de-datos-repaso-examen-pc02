package semana07LinkedListForm;

import java.util.Comparator;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class FrmCancion extends javax.swing.JFrame {

    LinkedList<Song> canciones = new LinkedList<>();

    public FrmCancion() {
        initComponents();
    }

    // Esta función verifica si la Song que se ingresa es igual a otro ya ingresada
    private boolean agregarCancion(Song n) {
        // Esta condicional verifica si no hay peliculas en el LinkedList
        // isEmpty -> Devuelve un boolean true en caso este vacia y false en caso este llena
        if (canciones.isEmpty()) {
            return true;
        }

        // Recorre con un forEach el linkedlist de canciones
        for (Song can : canciones) {
            // Verificar si cada atributo de Song es igual al que se va ingresar en caso
            // sea verdadero devuelve true
            if (can.getTitulo().equalsIgnoreCase(n.getTitulo()) && can.getArtista().equalsIgnoreCase(n.getArtista())) {
                return false;
            }
        }
        // En caso ninguna condicional no se cumpla devuelve false
        return true;
    }

    private boolean eliminar(int n) {
        if (n >= 0 && n < canciones.size()) {
            canciones.remove(n);
            return true;
        }
        return false;
    }

    private boolean actualizar(Song son, int n) {
        if (n >= 0 && n < canciones.size()) {
            canciones.set(n, son);
            return true;
        }
        return false;
    }

    private void listarCanciones() {
        if (canciones.size() > 0) {
            taResultado.setText("");
            taResultado.append("Titulo \t Artista\n");
            for (Song can : canciones) {
                taResultado.append(can.getTitulo() + " \t " + can.getArtista() + "\n");
            }
            return;
        }
        taResultado.setText("No hay canciones");
    }

    private void ordenarCanciones() {
        if (canciones.size() > 0) {
            taResultado.setText("");
            LinkedList<Song> ordenadas = new LinkedList<>();
            ordenadas.addAll(canciones);
            ordenadas.sort(Comparator.naturalOrder());
            taResultado.append("Titulo \t Artista\n");
            for (Song can : ordenadas) {
                taResultado.append(can.getTitulo() + " \t " + can.getArtista() + "\n");
            }
            return;
        }
        taResultado.setText("No hay canciones");
    }

    private void buscarCanciones(String valor, boolean f) {
        if (canciones.size() > 0) {
            taResultado.setText("");
            taResultado.append("Titulo \t Artista\n");
            if (f) {
                // Titulo
                for (Song can : canciones) {
                    if (can.getTitulo().equalsIgnoreCase(valor)) {
                        taResultado.append(can.getTitulo() + " \t " + can.getArtista() + "\n");
                    }
                }
            } else {
                // Artista
                for (Song can : canciones) {
                    if (can.getArtista().equalsIgnoreCase(valor)) {
                        taResultado.append(can.getTitulo() + " \t " + can.getArtista() + "\n");
                    }
                }
            }
            return;
        }
        taResultado.setText("No hay canciones");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtArtista = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultado = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();
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

        taResultado.setColumns(20);
        taResultado.setRows(5);
        jScrollPane1.setViewportView(taResultado);

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarA)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo)
                            .addComponent(txtArtista, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(btnOrdenar)
                            .addComponent(btnEliminar)
                            .addComponent(btnBuscarT))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnActualizar)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Song n = new Song(txtTitulo.getText().strip(), txtArtista.getText().strip());
        if (agregarCancion(n)) {
            if (canciones.add(n)) {
                JOptionPane.showMessageDialog(null, "Se agrego la canción.");
                txtArtista.setText("");
                txtTitulo.setText("");
                listarCanciones();
            } else {
                JOptionPane.showMessageDialog(null, "No se agrego la canción.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La canción ya existe.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        listarCanciones();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        ordenarCanciones();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a eliminar"));
        if (eliminar(po - 1)) {
            JOptionPane.showMessageDialog(null, "Se elimino.");
            listarCanciones();
        } else {
            JOptionPane.showMessageDialog(null, "No se elimino.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTActionPerformed
        String valor = JOptionPane.showInputDialog("Agrege el titulo a buscar: ");
        buscarCanciones(valor, true);
    }//GEN-LAST:event_btnBuscarTActionPerformed

    private void btnBuscarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAActionPerformed
        String valor = JOptionPane.showInputDialog("Agrege el artista a buscar: ");
        buscarCanciones(valor, false);
    }//GEN-LAST:event_btnBuscarAActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición a actualizar"));
        if (actualizar(new Song(txtTitulo.getText().strip(), txtArtista.getText().strip()),po-1)) {
            JOptionPane.showMessageDialog(null,"Se Actualizo la pelicula con posición "+po);
            listarCanciones();
        } else {
            JOptionPane.showMessageDialog(null, "No se actualizo.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
