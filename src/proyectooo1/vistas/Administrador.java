
package proyectooo1.vistas;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Container;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import proyectooo1.clases.Profesor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import proyectooo1.clases.Admin;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import proyectooo1.clases.Alumno;
import proyectooo1.clases.Curso;





public class Administrador extends javax.swing.JFrame {


    public  Administrador() {
        initComponents();   
        this.recuperarProfesores();
          this.mostrarProfesores(); 
          
          this.recuperarCursos();
          this.mostrarCursos();
          
          this.recuperarAlumnos();
          this.mostrarAlumnos();
       
          this.mostrarGrafica();
       this.mostrarGraficaalumno();
          
          
          


    }
    
    
    
   public void recuperarProfesores() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\profesorees.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Profesor> profesores = (ArrayList<Profesor>) ois.readObject();
            Admin.setprofesor(profesores);
            fis.close();
            ois.close();
            System.out.println("Profesores recuperados: " + profesores.size());
        } catch (Exception e) {
            System.out.println("Error al recuperar profesores: " + e.getMessage());
        }
    }
    
    private void mostrarProfesores(){
       String[] columnNames = {"CODIGO","NOMBRE", "APELLIDO","CORREO","genero"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
     for (Profesor profesor : Admin.getprofesores()) {
            Object[] rowData = {profesor.getCodigo(),profesor.getNombre(),profesor.getApellido(),
            profesor.getCorreo(),profesor.getGenero()};
            model.addRow(rowData);
        }
        tablaprofesores.setModel(model);
        }
       
    
    public void recuperarCursos() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\cursos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Curso> cursos = (ArrayList<Curso>) ois.readObject();
            Admin.setCursos(cursos);
            fis.close();
            ois.close();
            System.out.println("cursos recuperados: " + cursos.size());
        } catch (Exception e) {
            
            System.out.println("Error al recuperar cursos: " + e.getMessage());
        }
    }
    
    private void mostrarCursos(){
       String[] columnNames = {"CODIGO","NOMBRE", "CREDITOS","ALUMNOS","PROFESOR"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
     for (Curso curso : Admin.getCursos()) {
            Object[] rowData = {curso.getCodigoCurso(),curso.getNombreCurso(),curso.getCreditosCurso(),"asii",curso.getProfesorCurso()};
            model.addRow(rowData);
        }
        Tblcursos.setModel(model);
        }
    
    
     public void recuperarAlumnos() {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\alumnoos.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Alumno> alumnos = (ArrayList<Alumno>) ois.readObject();
            Admin.setAlumnos(alumnos);
            fis.close();
            ois.close();
            System.out.println("alumnos recuperados: " + alumnos.size());
        } catch (Exception e) {
            System.out.println("Error al recuperar alumnos: " + e.getMessage());
        }
    }
   
    private void mostrarAlumnos() {
    String[] columnNames = {"CODIGO", "NOMBRE", "APELLIDO", "CORREO", "GENERO"};

    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    // Carga los datos de la serialización
    try (FileInputStream fis = new FileInputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\alumnoos.dat");
        ObjectInputStream ois = new ObjectInputStream(fis)) {
        ArrayList<Alumno> alumnos = (ArrayList<Alumno>) ois.readObject();

        for (Alumno alumno : alumnos) {
            Object[] rowData = {alumno.getCodigo(), alumno.getNombre(), alumno.getApellido(),
                alumno.getCorreo(), alumno.getGenero()};
            model.addRow(rowData);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    Jtalumnos.setModel(model);
}
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Btncrearprof = new javax.swing.JButton();
        Btncargarprof = new javax.swing.JButton();
        Btbactualizarprof = new javax.swing.JButton();
        Btneliminarprof = new javax.swing.JButton();
        btnexportarprofpdf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaprofesores = new javax.swing.JTable();
        Btncreargraficaprof = new javax.swing.JButton();
        jPanelp = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        Tblcursos = new javax.swing.JTable();
        Btncrearalumno = new javax.swing.JButton();
        BtnCargarCursos = new javax.swing.JButton();
        Btneliminarc = new javax.swing.JButton();
        Btnexportarpdfcursos = new javax.swing.JButton();
        Btnaztualizarc = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Jtalumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtncargaAlumnos = new javax.swing.JButton();
        Btnexportarpdfalumnos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("LISTADO OFICIAL");

        Btncrearprof.setText("CREAR");
        Btncrearprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncrearprofActionPerformed(evt);
            }
        });

        Btncargarprof.setText("CARGA MASIVA");
        Btncargarprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncargarprofActionPerformed(evt);
            }
        });

        Btbactualizarprof.setText("ACTUALIZAR");
        Btbactualizarprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtbactualizarprofActionPerformed(evt);
            }
        });

        Btneliminarprof.setText("ELIMINAR");
        Btneliminarprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneliminarprofActionPerformed(evt);
            }
        });

        btnexportarprofpdf.setText("EXPORTAR LISTADO PDF");
        btnexportarprofpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarprofpdfActionPerformed(evt);
            }
        });

        tablaprofesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaprofesores);

        Btncreargraficaprof.setText("CREAR GRAFICA");
        Btncreargraficaprof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncreargraficaprofActionPerformed(evt);
            }
        });

        jPanelp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelpLayout = new javax.swing.GroupLayout(jPanelp);
        jPanelp.setLayout(jPanelpLayout);
        jPanelpLayout.setHorizontalGroup(
            jPanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        jPanelpLayout.setVerticalGroup(
            jPanelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );

        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(Btncrearprof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Btbactualizarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btncargarprof)
                                .addGap(37, 37, 37)
                                .addComponent(Btneliminarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnexportarprofpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Btncreargraficaprof)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton2)))))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btncrearprof, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btbactualizarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btncargarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btneliminarprof, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnexportarprofpdf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btncreargraficaprof, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PROFESORES", jPanel2);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("LISTADO OFICIAL");

        Tblcursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(Tblcursos);

        Btncrearalumno.setText("CREAR");
        Btncrearalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncrearalumnoActionPerformed(evt);
            }
        });

        BtnCargarCursos.setText("CARGA MASIVA");
        BtnCargarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarCursosActionPerformed(evt);
            }
        });

        Btneliminarc.setText("ELIMIINAR");
        Btneliminarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtneliminarcActionPerformed(evt);
            }
        });

        Btnexportarpdfcursos.setText("EXPORTAR LISTADO PDF");
        Btnexportarpdfcursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnexportarpdfcursosActionPerformed(evt);
            }
        });

        Btnaztualizarc.setText("ACTUALIZAR");
        Btnaztualizarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnaztualizarcActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(Btncrearalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(BtnCargarCursos)
                                .addGap(27, 27, 27)
                                .addComponent(Btnaztualizarc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btnexportarpdfcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btneliminarc, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65))))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btncrearalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnCargarCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Btnaztualizarc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btneliminarc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnexportarpdfcursos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CURSOS", jPanel3);

        Jtalumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(Jtalumnos);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("LISTADO OFICIAL");

        BtncargaAlumnos.setText("CARGA MASIVA");
        BtncargaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncargaAlumnosActionPerformed(evt);
            }
        });

        Btnexportarpdfalumnos.setText("EXPORTAR LISTADO PDF");
        Btnexportarpdfalumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnexportarpdfalumnosActionPerformed(evt);
            }
        });

        jButton1.setText("Crear Grafica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 485, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(BtncargaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Btnexportarpdfalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtncargaAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btnexportarpdfalumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("ALUMNOS", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCargarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarCursosActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV (.csv)", "csv");
    fileChooser.setFileFilter(filter);

    int respuesta = fileChooser.showOpenDialog(null);

    if (respuesta == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
            String linea;
            boolean primeraLinea = true; // Bandera para identificar la primera línea

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // Saltar la primera línea (encabezados)
                    continue;
                }

                String[] fields = linea.split(",");

                if (fields.length > 1) {
                    int codigoCurso = Integer.parseInt(fields[0]);
                    String nombreCurso = fields[1];
                    int creditosCurso = Integer.parseInt(fields[2]);
                    String profesorCurso = fields[3];
                    

                    Curso nuevoCurso = new Curso(codigoCurso, nombreCurso, creditosCurso, profesorCurso);
                    Admin.getCursos().add(nuevoCurso);

                    FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\cursos.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(Admin.getCursos());
                    fos.close();
                    oos.close();

                    for (String field : fields) {
                        System.out.print(field + "\t");
                    }
                    System.out.println();
                }
            }
            
            // Después de cargar los nuevos datos, actualiza la tabla
            mostrarCursos();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error de formato en los datos del archivo CSV: " + e.getMessage());
        }
    }    
        
        
    }//GEN-LAST:event_BtnCargarCursosActionPerformed
    
    private void BtncrearprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncrearprofActionPerformed
                   
        Crearprofesor crearp = new Crearprofesor();
        crearp.setResizable(false);
        crearp.setVisible(true);
        crearp.pack();;
        crearp.setLocationRelativeTo(null);
        crearp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.dispose();
    }//GEN-LAST:event_BtncrearprofActionPerformed
 
    private void BtbactualizarprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtbactualizarprofActionPerformed
    
        int filaSeleccionada = tablaprofesores.getSelectedRow();

    if (filaSeleccionada >= 0) {
        
        // Obtén el profesor seleccionado en la fila
        Profesor profesorAActualizar = Admin.getprofesores().get(filaSeleccionada);

        // Abre una nueva ventana de actualización de datos y pásale el profesor
        Actualizarprofesor actualizarVentana = new Actualizarprofesor();
        actualizarVentana.setProfesorAActualizar(profesorAActualizar); // Pasa el profesor seleccionado
        actualizarVentana.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para actualizar.");
    }
    }//GEN-LAST:event_BtbactualizarprofActionPerformed

    private void BtncrearalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncrearalumnoActionPerformed
      
        Crearcurso crearc = new Crearcurso();
        crearc.setResizable(false);
        crearc.setVisible(true);
        crearc.pack();;
        crearc.setLocationRelativeTo(null);
        crearc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        this.dispose();
        
        
        
    }//GEN-LAST:event_BtncrearalumnoActionPerformed

    private void BtncargarprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncargarprofActionPerformed
    
         JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV (.csv)", "csv");
    fileChooser.setFileFilter(filter);

    int respuesta = fileChooser.showOpenDialog(null);

    if (respuesta == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
            String linea;
            boolean primeraLinea = true; // Bandera para identificar la primera línea

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // Saltar la primera línea (encabezados)
                    continue;
                }

                String[] fields = linea.split(",");

                if (fields.length > 1) {
                    int codigo = Integer.parseInt(fields[0]);
                    String nombre = fields[1];
                    String apellido = fields[2];
                    String correo = fields[3];
                    String genero = fields[4];

                    Profesor nuevoProfesor = new Profesor(codigo, nombre, apellido, correo, genero,"1234");
                    Admin.getprofesores().add(nuevoProfesor);

                    FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\profesorees.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(Admin.getprofesores());
                    fos.close();
                    oos.close();

                    for (String field : fields) {
                        System.out.print(field + "\t");
                    }
                    System.out.println();
                }
            }
            
            // Después de cargar los nuevos datos, actualiza la tabla
            mostrarProfesores();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error de formato en los datos del archivo CSV: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_BtncargarprofActionPerformed

    private void btnexportarprofpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarprofpdfActionPerformed
          // Crear un documento PDF
    Document documento = new Document();

    try {
        // Especificar la ubicación y el nombre del archivo PDF de salida
        PdfWriter.getInstance(documento, new FileOutputStream("profesores.pdf"));
        documento.open();

        // Crear una tabla para mostrar los datos de los profesores
        PdfPTable table = new PdfPTable(5); // 5 columnas

        // Agregar encabezados de columna
        table.addCell("CODIGO");
        table.addCell("NOMBRE");
        table.addCell("APELLIDO");
        table.addCell("CORREO");
        table.addCell("GÉNERO");

        // Agregar datos de profesores desde la tabla a la tabla PDF
        for (Profesor profesor : Admin.getprofesores()) {
            table.addCell(String.valueOf(profesor.getCodigo()));
            table.addCell(profesor.getNombre());
            table.addCell(profesor.getApellido());
            table.addCell(profesor.getCorreo());
            table.addCell(profesor.getGenero());
        }

        // Agregar la tabla al documento PDF
        documento.add(table);

        // Cerrar el documento
        documento.close();

        JOptionPane.showMessageDialog(null, "PDF exportado correctamente como profesores.pdf");
        
    } catch (DocumentException | FileNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al exportar el PDF: " + e.getMessage());
    }
        
    }//GEN-LAST:event_btnexportarprofpdfActionPerformed

    private void BtneliminarprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneliminarprofActionPerformed
       int filaSeleccionada = tablaprofesores.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este profesor?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Obtiene el profesor seleccionado en la fila y elimínalo de la lista.
            Profesor profesorAEliminar = Admin.getprofesores().get(filaSeleccionada);
            Admin.getprofesores().remove(profesorAEliminar);
            
            // Actualiza la tabla después de eliminar el profesor.
            mostrarProfesores();
            
            guardarProfesoresEnArchivo();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para eliminar.");
    }
    }//GEN-LAST:event_BtneliminarprofActionPerformed

    private void BtncargaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncargaAlumnosActionPerformed
   
          JFileChooser fileChooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos CSV (.csv)", "csv");
    fileChooser.setFileFilter(filter);

    int respuesta = fileChooser.showOpenDialog(null);

    if (respuesta == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(selectedFile))) {
            String linea;
            boolean primeraLinea = true; // Bandera para identificar la primera línea

            while ((linea = br.readLine()) != null) {
                if (primeraLinea) {
                    primeraLinea = false; // Saltar la primera línea (encabezados)
                    continue;
                }

                String[] fields = linea.split(",");

                if (fields.length > 1) {
                    int codigo = Integer.parseInt(fields[0]);
                    String nombre = fields[1];
                    String apellido = fields[2];
                    String correo = fields[3];
                    String genero = fields[4];

                    Alumno nuevoAlumno = new Alumno(codigo, nombre, apellido, correo, genero,"1234");
                    Admin.getAlumnos().add(nuevoAlumno);

                    FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\alumnoos.dat");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(Admin.getAlumnos());
                    fos.close();
                    oos.close();

                    for (String field : fields) {
                        System.out.print(field + "\t");
                    }
                    System.out.println();
                }
            }
            
            // Después de cargar los nuevos datos, actualiza la tabla
            mostrarAlumnos();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.err.println("Error de formato en los datos del archivo CSV: " + e.getMessage());
        }
    }   
   
    
    }//GEN-LAST:event_BtncargaAlumnosActionPerformed

    private void BtncreargraficaprofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncreargraficaprofActionPerformed

        }

        // Crear el conjunto de datos para la gráfica de pie
        private PieDataset createDatasetFromProfessors() {
            DefaultPieDataset dataset = new DefaultPieDataset();

            for (Profesor profesor : Admin.getprofesores()) {
                String genero = profesor.getGenero();
                if (dataset.getKeys().contains(genero)) {
                    int valorExistente = dataset.getValue(genero).intValue();
                    dataset.setValue(genero, valorExistente + 1);
                } else {
                    dataset.setValue(genero, 1);
                }
            }

            return dataset;
        }
        // Crear la gráfica de pie
        private JFreeChart createPieChart(PieDataset dataset) {
            JFreeChart chart = ChartFactory.createPieChart(
                "Distribución de Género de Profesores",
                dataset,
                true,
                true,
                false);

            PiePlot plot = (PiePlot) chart.getPlot();

            return chart;    
    }//GEN-LAST:event_BtncreargraficaprofActionPerformed

      private void mostrarGrafica() {
   PieDataset dataset = createDatasetFromProfessors();
JFreeChart chart = createPieChart(dataset);
ChartPanel chartPanel = new ChartPanel(chart);
JPanel panelGrafica = new JPanel();
panelGrafica.add(chartPanel);
panelGrafica.setPreferredSize(jPanelp.getSize());
panelGrafica.setBounds(0, 0, jPanelp.getSize().width, jPanelp.getSize().height);
Container panelProfesores = getContentPane();
panelProfesores.add(panelGrafica, BorderLayout.CENTER);
jPanelp.add(panelGrafica);
}  
        
        
        
    private void BtnaztualizarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnaztualizarcActionPerformed
        
       int filaSeleccionada2 = Tblcursos.getSelectedRow();

    if (filaSeleccionada2 >= 0) {
       
       Curso cursoActualizar = Admin.getCursos().get(filaSeleccionada2);

       
        Actualizarcurso actualizarc = new Actualizarcurso();
        actualizarc.setCursoActualizar(cursoActualizar);
        actualizarc.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un profesor para actualizar.");
    }
                                                
    }//GEN-LAST:event_BtnaztualizarcActionPerformed

    private void BtneliminarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtneliminarcActionPerformed
      
        int filaSeleccionada2 = Tblcursos.getSelectedRow();

    if (filaSeleccionada2 >= 0) {
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este curso?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            // Obtiene el profesor seleccionado en la fila y elimínalo de la lista.
            Curso cursoAEliminar = Admin.getCursos().get(filaSeleccionada2);
            Admin.getCursos().remove(cursoAEliminar);
            
            // Actualiza la tabla después de eliminar el profesor.
            mostrarCursos();
            
            guardarCursosEnArchivo();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un curso para eliminar.");
    }
        
    }//GEN-LAST:event_BtneliminarcActionPerformed

    private void BtnexportarpdfcursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnexportarpdfcursosActionPerformed
        
       // Crear un documento PDF
    Document documento = new Document();

    try {
        // Especificar la ubicación y el nombre del archivo PDF de salida
        PdfWriter.getInstance(documento, new FileOutputStream("cursos.pdf"));
        documento.open();

        // Crear una tabla para mostrar los datos de los profesores
        PdfPTable table = new PdfPTable(5); // 5 columnas

        // Agregar encabezados de columna
        table.addCell("CODIGO");
        table.addCell("NOMBRE");    
        table.addCell("CREDITOS");
        table.addCell("ALUMNOS");
        table.addCell("PROFESOR");
        

        // Agregar datos de profesores desde la tabla a la tabla PDF
        for (Curso curso : Admin.getCursos()) {
            table.addCell(String.valueOf(curso.getCodigoCurso()));
            table.addCell(curso.getNombreCurso());
            table.addCell(String.valueOf(curso.getCreditosCurso()));
            table.addCell("alumnos");
            table.addCell(curso.getProfesorCurso());
           
        }

        // Agregar la tabla al documento PDF
        documento.add(table);

        // Cerrar el documento
        documento.close();

        JOptionPane.showMessageDialog(null, "PDF exportado correctamente como profesores.pdf");
        
    } catch (DocumentException | FileNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al exportar el PDF: " + e.getMessage());
    }
            
        
        
        
    }//GEN-LAST:event_BtnexportarpdfcursosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed
// Crear el conjunto de datos para la gráfica de pie
        private PieDataset createDatasetFromAlumnos() {
            DefaultPieDataset dataset = new DefaultPieDataset();

            for (Alumno alumno : Admin.getAlumnos()) {
                String genero = alumno.getGenero();
                if (dataset.getKeys().contains(genero)) {
                    int valorExistente = dataset.getValue(genero).intValue();
                    dataset.setValue(genero, valorExistente + 1);
                } else {
                    dataset.setValue(genero, 1);
                }
            }

            return dataset;
        }
        // Crear la gráfica de pie
        private JFreeChart createPieChartalumno(PieDataset dataset) {
            JFreeChart chart = ChartFactory.createPieChart(
                "Distribución de Género de alumnos",
                dataset,
                true,
                true,
                false);

            PiePlot plot = (PiePlot) chart.getPlot();

            return chart;    
    }                                                   

      private void mostrarGraficaalumno() {
   PieDataset dataset2 = createDatasetFromAlumnos();
JFreeChart chart = createPieChartalumno(dataset2);
ChartPanel chartPanel2 = new ChartPanel(chart);
JPanel panelGrafica2 = new JPanel();
panelGrafica2.add(chartPanel2);
panelGrafica2.setPreferredSize(jPanel5.getSize());
panelGrafica2.setBounds(0, 0, jPanel5.getSize().width, jPanel5.getSize().height);
Container panelAlumnos = getContentPane();
panelAlumnos.add(panelGrafica2, BorderLayout.CENTER);
jPanel5.add(panelGrafica2);
}  
    
    
    
    private void BtnexportarpdfalumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnexportarpdfalumnosActionPerformed
     
        
        
        
        
    }//GEN-LAST:event_BtnexportarpdfalumnosActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
       Iniciosesion inicios = new Iniciosesion();
        inicios.setVisible(true);
        this.dispose(); 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

     

    
    
    private void guardarProfesoresEnArchivo() {
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\profesorees.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Admin.getprofesores());
        fos.close();
        oos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
      private void guardarCursosEnArchivo() {
    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\herme\\OneDrive\\Documentos\\NetBeansProjects\\proyectooo1\\cursos.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Admin.getCursos());
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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btbactualizarprof;
    private javax.swing.JButton BtnCargarCursos;
    private javax.swing.JButton Btnaztualizarc;
    private javax.swing.JButton BtncargaAlumnos;
    private javax.swing.JButton Btncargarprof;
    private javax.swing.JButton Btncrearalumno;
    private javax.swing.JButton Btncreargraficaprof;
    private javax.swing.JButton Btncrearprof;
    private javax.swing.JButton Btneliminarc;
    private javax.swing.JButton Btneliminarprof;
    private javax.swing.JButton Btnexportarpdfalumnos;
    private javax.swing.JButton Btnexportarpdfcursos;
    private javax.swing.JTable Jtalumnos;
    private javax.swing.JTable Tblcursos;
    private javax.swing.JButton btnexportarprofpdf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelp;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaprofesores;
    // End of variables declaration//GEN-END:variables
}
