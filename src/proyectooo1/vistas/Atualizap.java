
package proyectooo1.vistas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyectooo1.clases.Admin;
import proyectooo1.clases.Profesor;


public class Atualizap extends javax.swing.JFrame {

     private Profesor profesorAActualizar;
    public Atualizap() {
        initComponents();
    }

    public void setProfesorAActua(Profesor profesor) {
        this.profesorAActualizar = profesor;
        // Configura los campos de texto con los datos del profesor
        Txtcodpro.setText(String.valueOf(profesor.getCodigo()));
        Txtnompro.setText(profesor.getNombre());
        Txtapepro.setText(profesor.getApellido());
        Txtcorreopro.setText(profesor.getCorreo());
        Txtcontrapro.setText(profesor.getPassword());
        genpro.setSelectedItem(profesor.getGenero());
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Txtcontrapro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genpro = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Btnactualizarprof = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txtcodpro = new javax.swing.JTextField();
        Txtnompro = new javax.swing.JTextField();
        Txtapepro = new javax.swing.JTextField();
        Txtcorreopro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ACTUALZIAR DATOS PROFESOR");

        jLabel2.setText("CODIGO");

        genpro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        genpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genproActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRE");

        Btnactualizarprof.setText("ACTUALIZAR");
        Btnactualizarprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnactualizarprofActionPerformed(evt);
            }
        });

        jLabel4.setText("APELLIDO");

        jLabel5.setText("CORREO");

        jLabel6.setText("CONTRASEÑA");

        jLabel7.setText("GENERO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txtcodpro)
                            .addComponent(Txtnompro)
                            .addComponent(Txtapepro)
                            .addComponent(Txtcorreopro)
                            .addComponent(Txtcontrapro)
                            .addComponent(genpro, 0, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Btnactualizarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcodpro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtnompro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Txtapepro, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcorreopro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcontrapro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genpro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(Btnactualizarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genproActionPerformed

    private void BtnactualizarprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnactualizarprofActionPerformed
        try {
            // Obtén los valores editados de los campos de texto
            int codigo = Integer.parseInt(Txtcodpro.getText());
            String nombre = Txtnompro.getText();
            String apellido = Txtapepro.getText();
            String correo = Txtcorreopro.getText();
            String genero = genpro.getSelectedItem().toString();
            String contra = Txtcontrapro.getText();
            // Actualiza los datos del profesor
            profesorAActualizar.setCodigo(codigo);
            profesorAActualizar.setNombre(nombre);
            profesorAActualizar.setApellido(apellido);
            profesorAActualizar.setCorreo(correo);
            profesorAActualizar.setGenero(genero);
            profesorAActualizar.setPassword(contra);

            // Actualiza la lista de profesores en la clase Admin
            ArrayList<Profesor> profesores = Admin.getprofesores();
            // Encuentra y reemplaza el profesor actualizado en la lista
            for (int i = 0; i < profesores.size(); i++) {
                if (profesores.get(i).getCodigo() == profesorAActualizar.getCodigo()) {
                    profesores.set(i, profesorAActualizar);
                    break; // Sal del bucle una vez que se haya encontrado y actualizado el profesor

                }

            }

            // Guarda la lista actualizada en el archivo
            guardarProfesoresEnArchivo(profesores);

            // Cierra esta ventana después de actualizar
            this.dispose();
        } catch (NumberFormatException e) {
            // Maneja una excepción si la conversión del código a entero falla
            // Puedes mostrar un mensaje de error o realizar una acción apropiada aquí
            JOptionPane.showMessageDialog(this, "Error en el formato del código.", "Error", JOptionPane.ERROR_MESSAGE);
        }

     this.dispose();
                        VistaProfesor vistap = new VistaProfesor();
                        vistap.setVisible(true);
       
    }//GEN-LAST:event_BtnactualizarprofActionPerformed

    private void guardarProfesoresEnArchivo(ArrayList<Profesor> profesores) {
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\profesorees.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(profesores);
        fos.close();
        oos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
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
            java.util.logging.Logger.getLogger(Atualizap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Atualizap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Atualizap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Atualizap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Atualizap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnactualizarprof;
    private javax.swing.JTextField Txtapepro;
    private javax.swing.JTextField Txtcodpro;
    private javax.swing.JTextField Txtcontrapro;
    private javax.swing.JTextField Txtcorreopro;
    private javax.swing.JTextField Txtnompro;
    private javax.swing.JComboBox<String> genpro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
