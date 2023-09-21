
package proyectooo1.vistas;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyectooo1.clases.Admin;
import proyectooo1.clases.Alumno;



public class Actualizara extends javax.swing.JFrame {

  private Alumno alumnoAActualizar;
    public Actualizara() {
        initComponents();
    }

   public void setAlumnoAActua(Alumno alumno) {
        this.alumnoAActualizar = alumno;
        // Configura los campos de texto con los datos del profesor
        Txtcoda.setText(String.valueOf(alumno.getCodigo()));
        Txtnoma.setText(alumno.getNombre());
        Txtapea.setText(alumno.getApellido());
        Txtcorreoa.setText(alumno.getCorreo());
        Txtcontraa.setText(alumno.getPassword());
        gena.setSelectedItem(alumno.getGenero());
        
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Txtnoma = new javax.swing.JTextField();
        Txtcontraa = new javax.swing.JTextField();
        Txtapea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txtcorreoa = new javax.swing.JTextField();
        gena = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Btnactualizaralum = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Txtcoda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jlabelimagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("CODIGO");

        gena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        gena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genaActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRE");

        Btnactualizaralum.setText("ACTUALIZAR");
        Btnactualizaralum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnactualizaralumActionPerformed(evt);
            }
        });

        jLabel4.setText("APELLIDO");

        jLabel5.setText("CORREO");

        jLabel6.setText("CONTRASEÑA");

        jLabel7.setText("GENERO");

        Txtcoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcodaActionPerformed(evt);
            }
        });

        jLabel1.setText("ACTUALZIAR DATOS ALUMNO");

        jButton1.setText("CAMBIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(Btnactualizaralum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gena, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txtcontraa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txtcorreoa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txtapea, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Txtnoma, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jlabelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Txtcoda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(88, 88, 88)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jlabelimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcoda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtnoma, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtapea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Txtcorreoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcontraa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Btnactualizaralum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genaActionPerformed

    private void BtnactualizaralumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnactualizaralumActionPerformed
        try {
            // Obtén los valores editados de los campos de texto
            int codigo = Integer.parseInt(Txtcoda.getText());
            String nombre = Txtnoma.getText();
            String apellido = Txtapea.getText();
            String correo = Txtcorreoa.getText();
            String genero = gena.getSelectedItem().toString();
            String contra = Txtcontraa.getText();
            // Actualiza los datos del profesor
            alumnoAActualizar.setCodigo(codigo);
            alumnoAActualizar.setNombre(nombre);
            alumnoAActualizar.setApellido(apellido);
            alumnoAActualizar.setCorreo(correo);
            alumnoAActualizar.setGenero(genero);
            alumnoAActualizar.setPassword(contra);

            // Actualiza la lista de profesores en la clase Admin
            ArrayList<Alumno> alumnos = Admin.getAlumnos();
            // Encuentra y reemplaza el profesor actualizado en la lista
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getCodigo() == alumnoAActualizar.getCodigo()) {
                    alumnos.set(i, alumnoAActualizar);
                    break; // Sal del bucle una vez que se haya encontrado y actualizado el profesor

                }

            }

            // Guarda la lista actualizada en el archivo
            guardarAlumnosEnArchivo(alumnos);

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
    
    }//GEN-LAST:event_BtnactualizaralumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Mostrar el cuadro de diálogo de selección de archivo
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("./imagenes")); // Establecer la carpeta de inicio
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                // Leer la imagen seleccionada y ajustarla
                BufferedImage originalImage = ImageIO.read(selectedFile);
                int labelWidth = jlabelimagen.getWidth();
                int labelHeight = jlabelimagen.getHeight();
                Image scaledImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);

                // Actualizar el contenido del JLabel con la imagen
                jlabelimagen.setIcon(new ImageIcon(scaledImage));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al seleccionar el archivo: " + ex.getMessage());
            }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void TxtcodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcodaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcodaActionPerformed
        
    private void guardarAlumnosEnArchivo(ArrayList<Alumno> alumnos) {
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\alumnoos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(alumnos);
        fos.close();
        oos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
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
            java.util.logging.Logger.getLogger(Actualizara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnactualizaralum;
    private javax.swing.JTextField Txtapea;
    private javax.swing.JTextField Txtcoda;
    private javax.swing.JTextField Txtcontraa;
    private javax.swing.JTextField Txtcorreoa;
    private javax.swing.JTextField Txtnoma;
    private javax.swing.JComboBox<String> gena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlabelimagen;
    // End of variables declaration//GEN-END:variables
}
