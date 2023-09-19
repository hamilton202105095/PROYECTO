
package proyectooo1.vistas;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import proyectooo1.clases.Admin;
import proyectooo1.clases.Curso;
import proyectooo1.clases.Profesor;



public class Actualizarcurso extends javax.swing.JFrame {

    private Curso cursoActualizar;
    
    public Actualizarcurso() {
        initComponents();
        ArrayList<Profesor> profesores = Admin.getprofesores();

// Crear un nuevo arraylist con los nombres y apellidos de los profesores
ArrayList<String> nombresApellidos = new ArrayList<>();
for (Profesor profesor : profesores) {
    nombresApellidos.add(profesor.getNombre() + " " + profesor.getApellido());
}
    }
    
 public void setCursoActualizar(Curso curso) {
       this.cursoActualizar = curso;
        // Configura los campos de texto con los datos del curso
        Txtcodigocurso.setText(String.valueOf(curso.getCodigoCurso()));
        Txtnombrecurso.setText(curso.getNombreCurso());
         Txtcreditoscurso.setText(String.valueOf(curso.getCreditosCurso()));       
        // Carga los datos del profesor en el combobox
        ArrayList<Profesor> profesores = Admin.getprofesores();
        ArrayList<String> nombresApellidos = new ArrayList<>();
        for (Profesor profesor : profesores) {
            nombresApellidos.add(profesor.getNombre() + " " + profesor.getApellido());
        }
        jComboBox2.setModel(new DefaultComboBoxModel(nombresApellidos.toArray()));
        jComboBox2.setSelectedItem(curso.getProfesorCurso());
        
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Txtcodigocurso = new javax.swing.JTextField();
        Txtnombrecurso = new javax.swing.JTextField();
        Txtcreditoscurso = new javax.swing.JTextField();
        Btnactualizarc = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ACTUALIZAR DATOS DEL CURSO");

        jLabel2.setText("CODIGO");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("CREDITOS");

        jLabel5.setText("PROFESOR");

        Btnactualizarc.setText("AGREGAR");
        Btnactualizarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnactualizarcActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Txtcodigocurso, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(Txtnombrecurso)
                                    .addComponent(Txtcreditoscurso)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(Btnactualizarc, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcodigocurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtnombrecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txtcreditoscurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(Btnactualizarc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnactualizarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnactualizarcActionPerformed

       try {
            // Obtén los valores editados de los campos de texto
             int Codigoc = (Integer.parseInt(Txtcodigocurso.getText()));
       String Nombrec = Txtnombrecurso.getText();
           int Creditosc = (Integer.parseInt(Txtcreditoscurso.getText()));
       String profesoresc = jComboBox2.getSelectedItem().toString();

            // Actualiza los datos del profesor
            cursoActualizar.setCodigoCurso(Codigoc);
            cursoActualizar.setNombreCurso(Nombrec);
            cursoActualizar.setCreditosCurso(Creditosc);   
            cursoActualizar.setProfesorCurso(profesoresc);

             // Actualiza la lista de profesores en la clase Admin
        ArrayList<Curso> cursos = Admin.getCursos();
        // Encuentra y reemplaza el profesor actualizado en la lista
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigoCurso()== cursoActualizar.getCodigoCurso()) {
                cursos.set(i, cursoActualizar);
                break; // Sal del bucle una vez que se haya encontrado y actualizado el profesor
                
            }

        }

        // Guarda la lista actualizada en el archivo
        guardarCursosEnArchivo(cursos);

        // Cierra esta ventana después de actualizar
        this.dispose();
        } catch (NumberFormatException e) {
            // Maneja una excepción si la conversión del código a entero falla
            // Puedes mostrar un mensaje de error o realizar una acción apropiada aquí
            JOptionPane.showMessageDialog(this, "Error en el formato del código.", "Error", JOptionPane.ERROR_MESSAGE);
        }
      
      Administrador admin = new Administrador();
        admin.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_BtnactualizarcActionPerformed

    private void guardarCursosEnArchivo(ArrayList<Curso> cursos) {
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\cursos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(cursos);
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
            java.util.logging.Logger.getLogger(Actualizarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizarcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizarcurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnactualizarc;
    private javax.swing.JTextField Txtcodigocurso;
    private javax.swing.JTextField Txtcreditoscurso;
    private javax.swing.JTextField Txtnombrecurso;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
