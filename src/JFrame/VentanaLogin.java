/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
//Libreria de animaciones
import AppPackage.AnimationClass;
import Class.Categoria;

import Class.Metodos;
import Class.PreguntaSeleccionMultiple;
import Class.PreguntaSeleccionUnica;
import Class.PreguntaVerdaderoFalso;
import Class.Respuesta;
import Class.Usuario;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import sun.java2d.pipe.SpanShapeRenderer;
/**
 *
 * @author Randald Villegas
 */
public class VentanaLogin extends javax.swing.JFrame {
    //variable para controlar el tamaño del panel del login
    private boolean navBar;
    private static ImageIcon foto;
    private File auxFile;
    /**
     * Creates new form Login
     */
    public VentanaLogin() {
        initComponents();
        JLabelFecha.setText(fecha());
        //Variable para hacer aparecer un panel para el login
        Boolean navBar = false;
        //se establece la medida inicial del panel del login
        login.setSize(400,0);
        //hace aparecer en el centro de la pantalla
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        jButtonEntrar = new javax.swing.JButton();
        contraseña = new javax.swing.JPasswordField();
        nombreUsuario = new javax.swing.JTextField();
        jLabelUsuario1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jButtonDown = new javax.swing.JButton();
        jButtonUp = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelPublic1 = new javax.swing.JLabel();
        jLabelPublic2 = new javax.swing.JLabel();
        registro = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldConfirmarContraseña = new javax.swing.JTextField();
        jTextFieldNombreUsuario = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jTextFieldNombreCompleto = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jButtonAgregarFoto1 = new javax.swing.JButton();
        jButtonAgregarFoto = new javax.swing.JButton();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        Photo = new javax.swing.JLabel();
        imagenIcono = new javax.swing.JLabel();
        JLabelFecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonOff = new javax.swing.JButton();
        jButtonNext = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setMaximumSize(new java.awt.Dimension(250, 270));
        login.setOpaque(false);
        login.setPreferredSize(new java.awt.Dimension(250, 270));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_OFF.png"))); // NOI18N
        jButtonEntrar.setBorder(null);
        jButtonEntrar.setBorderPainted(false);
        jButtonEntrar.setContentAreaFilled(false);
        jButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButtonEntrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButtonEntrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/GO_LOG_ON.png"))); // NOI18N
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseClicked(evt);
            }
        });
        login.add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 60, 40));

        contraseña.setBackground(new java.awt.Color(33, 33, 33));
        contraseña.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        login.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        nombreUsuario.setBackground(new java.awt.Color(33, 33, 33));
        nombreUsuario.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        login.add(nombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));

        jLabelUsuario1.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelUsuario1.setForeground(new java.awt.Color(111, 174, 2));
        jLabelUsuario1.setText("Password");
        login.add(jLabelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        jLabelUsuario.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(111, 174, 2));
        jLabelUsuario.setText("User");
        login.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 30));

        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LOGIN_INGRESO2.png"))); // NOI18N
        jLabelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLoginMouseClicked(evt);
            }
        });
        login.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 270));

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 250, 0));

        background.setMaximumSize(new java.awt.Dimension(1000, 500));
        background.setMinimumSize(new java.awt.Dimension(1000, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abajo1.png"))); // NOI18N
        jButtonDown.setBorder(null);
        jButtonDown.setBorderPainted(false);
        jButtonDown.setContentAreaFilled(false);
        jButtonDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDown.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abajo2.png"))); // NOI18N
        jButtonDown.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abajo2.png"))); // NOI18N
        jButtonDown.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/abajo2.png"))); // NOI18N
        jButtonDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDownMouseClicked(evt);
            }
        });
        background.add(jButtonDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 50, 40));

        jButtonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arriba1.png"))); // NOI18N
        jButtonUp.setBorder(null);
        jButtonUp.setBorderPainted(false);
        jButtonUp.setContentAreaFilled(false);
        jButtonUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonUp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arriba2.png"))); // NOI18N
        jButtonUp.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arriba2.png"))); // NOI18N
        jButtonUp.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/arriba2.png"))); // NOI18N
        jButtonUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonUpMouseClicked(evt);
            }
        });
        background.add(jButtonUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 50, 40));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 260, 30));

        jLabelPublic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/6.png"))); // NOI18N
        jLabelPublic1.setToolTipText("");
        background.add(jLabelPublic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 320));

        jLabelPublic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/3.png"))); // NOI18N
        jLabelPublic2.setToolTipText("");
        background.add(jLabelPublic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 1000, 320));

        registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setOpaque(false);
        registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(111, 174, 2));
        jLabel5.setText("Finalizar:");
        registro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 70, 40));

        jLabel6.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(111, 174, 2));
        jLabel6.setText("Name");
        registro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        User.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        User.setForeground(new java.awt.Color(111, 174, 2));
        User.setText("User");
        registro.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        jLabel8.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(111, 174, 2));
        jLabel8.setText("Email");
        registro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 30));

        jLabel9.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(111, 174, 2));
        jLabel9.setText("Confirm Password");
        registro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jLabel10.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(111, 174, 2));
        jLabel10.setText("Country");
        registro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 110, 30));

        jLabel11.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(111, 174, 2));
        jLabel11.setText("Gender");
        registro.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 50, 30));

        jLabel12.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(111, 174, 2));
        jLabel12.setText("Password");
        registro.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 80, 30));

        jTextFieldConfirmarContraseña.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldConfirmarContraseña.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jTextFieldConfirmarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        registro.add(jTextFieldConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, 30));

        jTextFieldNombreUsuario.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldNombreUsuario.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jTextFieldNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        registro.add(jTextFieldNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 160, 30));

        jTextFieldContraseña.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldContraseña.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jTextFieldContraseña.setForeground(new java.awt.Color(255, 255, 255));
        registro.add(jTextFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 160, 30));

        jTextFieldNombreCompleto.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldNombreCompleto.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jTextFieldNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        registro.add(jTextFieldNombreCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 160, 30));

        jTextFieldCorreo.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldCorreo.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jTextFieldCorreo.setForeground(new java.awt.Color(255, 255, 255));
        registro.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, 30));

        jTextFieldPais.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldPais.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jTextFieldPais.setForeground(new java.awt.Color(255, 255, 255));
        registro.add(jTextFieldPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 30));

        jButtonAgregarFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar1.png"))); // NOI18N
        jButtonAgregarFoto1.setBorder(null);
        jButtonAgregarFoto1.setBorderPainted(false);
        jButtonAgregarFoto1.setContentAreaFilled(false);
        jButtonAgregarFoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarFoto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar2.png"))); // NOI18N
        jButtonAgregarFoto1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar2.png"))); // NOI18N
        jButtonAgregarFoto1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar2.png"))); // NOI18N
        jButtonAgregarFoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarFoto1MouseClicked(evt);
            }
        });
        jButtonAgregarFoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarFoto1ActionPerformed(evt);
            }
        });
        registro.add(jButtonAgregarFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 50, 40));

        jButtonAgregarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/foto1.png"))); // NOI18N
        jButtonAgregarFoto.setBorder(null);
        jButtonAgregarFoto.setBorderPainted(false);
        jButtonAgregarFoto.setContentAreaFilled(false);
        jButtonAgregarFoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarFoto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/foto2.png"))); // NOI18N
        jButtonAgregarFoto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/foto2.png"))); // NOI18N
        jButtonAgregarFoto.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/foto2.png"))); // NOI18N
        jButtonAgregarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAgregarFotoMouseClicked(evt);
            }
        });
        jButtonAgregarFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarFotoActionPerformed(evt);
            }
        });
        registro.add(jButtonAgregarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 50, 40));

        jComboBoxSexo.setBackground(new java.awt.Color(33, 33, 33));
        jComboBoxSexo.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        jComboBoxSexo.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male\t", "Female" }));
        jComboBoxSexo.setBorder(null);
        jComboBoxSexo.setOpaque(false);
        registro.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 160, 30));

        Photo.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        Photo.setForeground(new java.awt.Color(111, 174, 2));
        Photo.setText("Fotografia:");
        registro.add(Photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, 30));
        registro.add(imagenIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 160, 130));

        background.add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 660, 270));

        JLabelFecha.setFont(new java.awt.Font("Script MT Bold", 0, 24)); // NOI18N
        JLabelFecha.setForeground(new java.awt.Color(111, 174, 2));
        background.add(JLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 310, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paloPublic.png"))); // NOI18N
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 418, 1000, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paloPublic.png"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 94, 1000, 10));

        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        botonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMinimizarMouseClicked(evt);
            }
        });
        background.add(botonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, 50));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras1.png"))); // NOI18N
        jButtonBack.setBorder(null);
        jButtonBack.setBorderPainted(false);
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.setDisabledIcon(null);
        jButtonBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.png"))); // NOI18N
        jButtonBack.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.png"))); // NOI18N
        jButtonBack.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/atras2.png"))); // NOI18N
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });
        background.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 50, 40));

        jButtonOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/off1.png"))); // NOI18N
        jButtonOff.setBorder(null);
        jButtonOff.setBorderPainted(false);
        jButtonOff.setContentAreaFilled(false);
        jButtonOff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOff.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/off2.png"))); // NOI18N
        jButtonOff.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/off2.png"))); // NOI18N
        jButtonOff.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/off2.png"))); // NOI18N
        jButtonOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOffMouseClicked(evt);
            }
        });
        background.add(jButtonOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 50, 40));

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/adelante1.png"))); // NOI18N
        jButtonNext.setBorder(null);
        jButtonNext.setBorderPainted(false);
        jButtonNext.setContentAreaFilled(false);
        jButtonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNext.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/adelante2.png"))); // NOI18N
        jButtonNext.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/adelante2.png"))); // NOI18N
        jButtonNext.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/adelante2.png"))); // NOI18N
        jButtonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNextMouseClicked(evt);
            }
        });
        background.add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 440, 50, 40));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login2.png"))); // NOI18N
        background.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
        moverIzquierda();
    }//GEN-LAST:event_jButtonBackMouseClicked

    private void jButtonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseClicked
        moverDerecha();
    }//GEN-LAST:event_jButtonNextMouseClicked
    public static String fecha(){
        //Retorna la fecha actual
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat();
        return formatoFecha.format(fecha);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Empieza el movimiento apenas el windows inicia
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 5, 8, jLabelPublic1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000,0, 5, 8, jLabelPublic2);
        
    }//GEN-LAST:event_formWindowOpened

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        //Para minimizar la ventana
        this.setState(JFrame.VentanaLogin.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
        //Si el panel del login esta abierto lo cierra
        if (navBar == true){                
            login.setSize(400, 0);   
            navBar = false;                
            
        } 
        
    }//GEN-LAST:event_jLabelLoginMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Si el panel del login esta cerrado lo abre 
        if (navBar == false){
            login.setSize(250,270);
            navBar = true;                 
        }
    }//GEN-LAST:event_jLabel2MouseClicked
    
    private void jButtonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseClicked
        
        if(Metodos.getInstance().verificarAdmi(nombreUsuario.getText(), contraseña.getText())){
            VentanaAdmi va = new VentanaAdmi(nombreUsuario.getText());
            va.setVisible(true);
            this.dispose();
        }
        else if(Metodos.getInstance().verificar(nombreUsuario.getText(), contraseña.getText())){
            VentanaInicio inicio = new VentanaInicio(nombreUsuario.getText());
            inicio.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Error  \n Verifique los datos \n Si no tiene una cuenta puede registrarse");
        }
        
       
    }//GEN-LAST:event_jButtonEntrarMouseClicked

    private void jButtonUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonUpMouseClicked
        mostrarRegistro();      
    }//GEN-LAST:event_jButtonUpMouseClicked

    private void jButtonDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDownMouseClicked
        ocultarRegistro();
    }//GEN-LAST:event_jButtonDownMouseClicked

    private void jButtonAgregarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarFotoMouseClicked
        int resultado ;
        VentanaCargarArchivos ventana = new VentanaCargarArchivos();
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Fotos: JPG y PNG", "jpg","png");
        ventana.jFileCargarFoto.setFileFilter(filtro1);
        resultado = ventana.jFileCargarFoto.showOpenDialog(null);
       
        if(JFileChooser.APPROVE_OPTION == resultado){
            //guardar el archivo selecionado
            auxFile = ventana.jFileCargarFoto.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(auxFile.toString());
                //ajustar el tamaño de la imagen que se ha cargado
                Icon fotoSubida = new ImageIcon(icon.getImage().getScaledInstance(imagenIcono.getWidth(), imagenIcono.getHeight(), Image.SCALE_DEFAULT));
                //borrar TEXTO en label
                imagenIcono.setText(null);
                foto = (ImageIcon) fotoSubida;
                //mostrar imagen en label
                imagenIcono.setIcon(foto);
                JOptionPane.showMessageDialog(this, "Foto agregada correctamente \n"
                        + "Puedes modificar alguno de tus datos \n"
                        + "O presione en el boton para agregar el usuario");
                moverDerecha();
                mostrarRegistro();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Error al abrir la imagen " + ex);
            }
        }
    }//GEN-LAST:event_jButtonAgregarFotoMouseClicked

    private void jButtonAgregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarFotoActionPerformed

    private void jButtonAgregarFoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarFoto1MouseClicked
        if (Metodos.getInstance().buscarNombre(nombreUsuario.getText())) {
            JOptionPane.showMessageDialog(this, "Este nombre de usuario ya existe, prueba con otro para continuar");
        } else {
            if (jTextFieldNombreCompleto.getText().isEmpty() | jTextFieldNombreUsuario.getText().isEmpty() | jTextFieldContraseña.getText().isEmpty() | jTextFieldConfirmarContraseña.getText().isEmpty() | jTextFieldCorreo.getText().isEmpty() | jTextFieldPais.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Campo Vacio");
            } else {
                if (jTextFieldContraseña.getText().equals(jTextFieldConfirmarContraseña.getText())) {
                    Usuario usuario = new Usuario(jTextFieldNombreCompleto.getText(), jTextFieldNombreUsuario.getText(), jTextFieldCorreo.getText(),jTextFieldContraseña.getText(), jTextFieldPais.getText(), jComboBoxSexo.getSelectedItem().toString(), foto,10);
                    Metodos.getInstance().listaUsuarios.add(usuario);
                    JOptionPane.showMessageDialog(rootPane, usuario.getNombreCompleto()+ "  Agregado Exitosamente!");
                    ocultarRegistro();
                    moverIzquierda();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Datos Incorrectos");
                }
            }
        }
    }//GEN-LAST:event_jButtonAgregarFoto1MouseClicked

    private void jButtonAgregarFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarFoto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarFoto1ActionPerformed

    private void jButtonOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOffMouseClicked
        cerrar();
    }//GEN-LAST:event_jButtonOffMouseClicked

    public void moverDerecha() {
        // Establecemos la variable que vamos a presentar a la izquierda en x,y  y su movimiento 25 y 5
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 5, 8, jLabelPublic1);

        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000, 0, 5, 8, jLabelPublic2);
    }

    public void moverIzquierda() {
        // Establecemos la variable que vamos a presentar a la izquierda en x,y  y su movimiento 25 y 5
        AnimationClass ac = new AnimationClass();
        ac.jLabelXRight(-1000, 0, 5, 8, jLabelPublic1);

        AnimationClass acc = new AnimationClass();
        acc.jLabelXRight(0, 1000, 5, 8, jLabelPublic2);
    }

    public void ocultarRegistro() {
        //se encarga de cerrar la segunda imagen para ocultar el registro
        AnimationClass acc = new AnimationClass();
        acc.jLabelYDown(-220, 100, 5, 8, jLabelPublic2);

    }

    public void mostrarRegistro() {
        //se encarga de abrir la segunda imagen para mostrar el registro
        AnimationClass acc = new AnimationClass();
        acc.jLabelYUp(100, -220, 5, 8, jLabelPublic2);
    }
    public void cerrar(){
        //Para salir del sistema
        try {
            int dialoButton = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea Salir del Sistema?", "EXIT", dialoButton);
            if (result == 0) {
                System.exit(0);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFecha;
    private javax.swing.JLabel Photo;
    private javax.swing.JLabel User;
    private javax.swing.JPanel background;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel imagenIcono;
    private javax.swing.JButton jButtonAgregarFoto;
    private javax.swing.JButton jButtonAgregarFoto1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDown;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JButton jButtonOff;
    private javax.swing.JButton jButtonUp;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPublic1;
    private javax.swing.JLabel jLabelPublic2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JTextField jTextFieldConfirmarContraseña;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombreCompleto;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JPanel login;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JPanel registro;
    // End of variables declaration//GEN-END:variables
}
