package Vistas.Forms;

import Controlador.PacienteDAO;
import Modelo.Paciente;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Historial2 extends javax.swing.JPanel {

    //Variable para agregar a la DB la seleccion del RadioButton
    private String opcionSeleccionada;
    ButtonGroup buttonGroup = new ButtonGroup();
    //Clasees que contienen los metodos para manejar la DB
    PacienteDAO paciente = new PacienteDAO();
    Paciente p = new Paciente();

    public Historial2() {
        initComponents();
        setOpaque(false);
        setVisible(true);
        
        System.out.println("Hola usuario bienvenido");
        //Agregando imagen para el boton anterior y siguiente y redimensionandola -
        ImageIcon anterior = new javax.swing.ImageIcon(getClass().getResource("/icon/anterior.png"));
        ImageIcon siguiente = new javax.swing.ImageIcon(getClass().getResource("/icon/siguiente.png"));

        // Escalar la imagen al tamaño deseado (ajustar valores segun se necesite)
        Image imagen1 = anterior.getImage();
        Image imagen2 = siguiente.getImage();
        Image nuevaImagen1 = imagen1.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
        Image nuevaImagen2 = imagen2.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);

        btnAnterior.setIcon(new javax.swing.ImageIcon(nuevaImagen1));
        btnSiguiente.setIcon(new javax.swing.ImageIcon(nuevaImagen2));

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener el botón seleccionado
                JRadioButton selectedButton = (JRadioButton) e.getSource();
                opcionSeleccionada = selectedButton.getText();
            }
        };

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        PanelDatosE = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_internado = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        btn_si = new javax.swing.JRadioButton();
        btn_no = new javax.swing.JRadioButton();
        box_tratamiento = new javax.swing.JComboBox<>();
        txt_evolucion = new javax.swing.JTextField();
        PanelTratamiento = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        box_transfusiones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txt_fecha_1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cant_fecha1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_fecha_2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cant_fecha2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_fecha_3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_cant_fecha3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_fecha_4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_cant_fecha4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt_germen = new javax.swing.JTextField();
        txt_localizacion = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();
        txt_i = new javax.swing.JTextField();
        txt_sensibilidad = new javax.swing.JTextField();
        txt_resistencia = new javax.swing.JTextField();
        txt_tratamiento_i = new javax.swing.JTextField();
        btnSiguiente = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        PanelDatosE.setBackground(new java.awt.Color(0, 102, 102));
        PanelDatosE.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATOS EPIDEMIOLOGICOS");

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HUBO HOSPITALIZACION:");

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DONDE ESTUVO INTERNADO/A:");

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TRATAMIENTO MEDICO PREVIO:");

        txt_internado.setColumns(20);
        txt_internado.setRows(5);
        jScrollPane1.setViewportView(txt_internado);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TIEMPO DE EVOLUCIÓN DESDE ACCIDENTE:");

        btn_si.setText("Si");

        btn_no.setText("No");

        box_tratamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curaciones", "Tradicional-No Médico", "Ninguno", "Cirugias", "L&D", "Injertos", "Colgajos" }));

        javax.swing.GroupLayout PanelDatosELayout = new javax.swing.GroupLayout(PanelDatosE);
        PanelDatosE.setLayout(PanelDatosELayout);
        PanelDatosELayout.setHorizontalGroup(
            PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosELayout.createSequentialGroup()
                .addGroup(PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelDatosELayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatosELayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(box_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelDatosELayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_si)
                                .addGap(18, 18, 18)
                                .addComponent(btn_no))
                            .addGroup(PanelDatosELayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelDatosELayout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(jLabel7))
                    .addGroup(PanelDatosELayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_evolucion)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        PanelDatosELayout.setVerticalGroup(
            PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosELayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_si)
                    .addComponent(btn_no))
                .addGroup(PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosELayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(PanelDatosELayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(box_tratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelDatosELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_evolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelTratamiento.setBackground(new java.awt.Color(0, 102, 102));
        PanelTratamiento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TRANSFUSIONES:");

        btnAnterior.setBackground(new java.awt.Color(46, 68, 82));
        btnAnterior.setForeground(new java.awt.Color(255, 255, 255));
        btnAnterior.setText("Anterior");
        btnAnterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnterior.setBorderPainted(false);
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("TRATAMIENTO MEDICO UNIDAD DE QUEMADOS");

        box_transfusiones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plasma", "Albumina", "Célula empacada", "Sangre completa", "Cultivos Positivos" }));

        jLabel2.setText("FECHA 1:");

        jLabel3.setText("CANTIDAD:");

        jLabel5.setText("FECHA 2:");

        jLabel9.setText("CANTIDAD:");

        jLabel10.setText("FECHA 3:");

        jLabel12.setText("CANTIDAD:");

        jLabel14.setText("FECHA 4:");

        jLabel15.setText("CANTIDAD:");

        jLabel16.setText("GÉRMEN:");

        jLabel17.setText("LOCALIZACIÓN:");

        jLabel18.setText("C:");

        jLabel19.setText("I:");

        jLabel20.setText("SENSIBLILIDAD:");

        jLabel21.setText("RESISTENCIA:");

        jLabel22.setText("TRATAMIENTO INDICADO:");

        btnSiguiente.setBackground(new java.awt.Color(46, 68, 82));
        btnSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        btnSiguiente.setText("Siguiente");
        btnSiguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTratamientoLayout = new javax.swing.GroupLayout(PanelTratamiento);
        PanelTratamiento.setLayout(PanelTratamientoLayout);
        PanelTratamientoLayout.setHorizontalGroup(
            PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTratamientoLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel11))
                    .addGroup(PanelTratamientoLayout.createSequentialGroup()
                        .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_fecha_1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3))
                                    .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(box_transfusiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cant_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cant_fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cant_fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fecha_2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cant_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelTratamientoLayout.createSequentialGroup()
                        .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_germen, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_c)))
                            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_sensibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_i))
                                .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_localizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_resistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelTratamientoLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_tratamiento_i, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTratamientoLayout.createSequentialGroup()
                    .addContainerGap(731, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(344, 344, 344)))
        );
        PanelTratamientoLayout.setVerticalGroup(
            PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTratamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(box_transfusiones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_fecha_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cant_fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_fecha_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_cant_fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_fecha_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txt_cant_fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_fecha_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_cant_fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txt_germen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_localizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(txt_sensibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_resistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tratamiento_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(PanelTratamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTratamientoLayout.createSequentialGroup()
                    .addContainerGap(374, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDatosE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelDatosE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelTratamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
       
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       
    }//GEN-LAST:event_btnSiguienteActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDatosE;
    private javax.swing.JPanel PanelTratamiento;
    private javax.swing.JComboBox<String> box_transfusiones;
    private javax.swing.JComboBox<String> box_tratamiento;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JRadioButton btn_no;
    private javax.swing.JRadioButton btn_si;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_c;
    private javax.swing.JTextField txt_cant_fecha1;
    private javax.swing.JTextField txt_cant_fecha2;
    private javax.swing.JTextField txt_cant_fecha3;
    private javax.swing.JTextField txt_cant_fecha4;
    private javax.swing.JTextField txt_evolucion;
    private javax.swing.JTextField txt_fecha_1;
    private javax.swing.JTextField txt_fecha_2;
    private javax.swing.JTextField txt_fecha_3;
    private javax.swing.JTextField txt_fecha_4;
    private javax.swing.JTextField txt_germen;
    private javax.swing.JTextField txt_i;
    private javax.swing.JTextArea txt_internado;
    private javax.swing.JTextField txt_localizacion;
    private javax.swing.JTextField txt_resistencia;
    private javax.swing.JTextField txt_sensibilidad;
    private javax.swing.JTextField txt_tratamiento_i;
    // End of variables declaration//GEN-END:variables
}
