/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
//Libreria de animaciones 
import AppPackage.AnimationClass;
import Class.Metodos;
import Class.Usuario;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Randald Villegas
 */
public class VentanaEditarPerfil extends javax.swing.JFrame {
    String usuarioLogueado;
    private static ImageIcon foto;
    private File auxFile;
    /**
     * Creates new form Login
     */
    public VentanaEditarPerfil(Usuario nombreUsuarioLogueado) {
        initComponents();
        usuarioLogueado = nombreUsuarioLogueado.getNombreUsuario();
        //hace aparecer en el centro de la pantalla
        this.setLocationRelativeTo(null);
        //Damos el saludo al usuario logueado
        usuarioActual.setText(null);
        usuarioActual.setText(nombreUsuarioLogueado.getNombreUsuario());
        ImageIcon foto = Metodos.getInstance().BuscarFotoUsuario(usuarioLogueado);
        imagenIcono.setIcon(foto);
        Usuario u = Metodos.getInstance().buscarUsuario(usuarioLogueado);
        jTextFieldNombreCompleto.setText(u.getNombreCompleto());
        jTextFieldNombreUsuario.setText(u.getNombreUsuario());
        jTextFieldCorreo.setText(u.getCorreo());
        jTextFieldPais.setText(u.getPais());
        jTextFieldContraseña.setText(u.getContraseña());
        jTextFieldConfirmarContraseña.setText(u.getContraseña());
        if (u.getSexo().equals("Female")) {
            jComboBoxSexo.setSelectedIndex(1);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        registro = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jLabel16 = new javax.swing.JLabel();
        imagenIcono = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        usuarioActual = new javax.swing.JLabel();
        jButtonOff = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();
        jButtonHome2 = new javax.swing.JButton();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        registro.setForeground(new java.awt.Color(255, 255, 255));
        registro.setOpaque(false);
        registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Name");
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        registro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        User.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setText("User");
        registro.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        Email.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Emal");
        registro.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, 30));

        jLabel9.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Confirm Password");
        registro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, 30));

        jLabel10.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country");
        registro.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 30));

        jLabel15.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gender ");
        registro.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 50, 30));

        jLabel12.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
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

        jButtonAgregarFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-perf_on.png"))); // NOI18N
        jButtonAgregarFoto1.setBorder(null);
        jButtonAgregarFoto1.setBorderPainted(false);
        jButtonAgregarFoto1.setContentAreaFilled(false);
        jButtonAgregarFoto1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAgregarFoto1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-perf.png"))); // NOI18N
        jButtonAgregarFoto1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-perf.png"))); // NOI18N
        jButtonAgregarFoto1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-perf.png"))); // NOI18N
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
        registro.add(jButtonAgregarFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 110, 30));

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
        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBoxSexo.setBorder(null);
        jComboBoxSexo.setOpaque(false);
        registro.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 160, 30));

        jLabel16.setFont(new java.awt.Font("Script MT Bold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Photo");
        registro.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 80, 30));
        registro.add(imagenIcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 160, 130));

        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 660, 270));

        background.setMaximumSize(new java.awt.Dimension(1000, 500));
        background.setMinimumSize(new java.awt.Dimension(1000, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioActual.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        usuarioActual.setForeground(new java.awt.Color(111, 174, 2));
        background.add(usuarioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 170, 30));

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
        background.add(jButtonOff, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, -1, -1));

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log1.png"))); // NOI18N
        jButtonHome.setBorder(null);
        jButtonHome.setBorderPainted(false);
        jButtonHome.setContentAreaFilled(false);
        jButtonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHome.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log2.png"))); // NOI18N
        jButtonHome.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log2.png"))); // NOI18N
        jButtonHome.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/log2.png"))); // NOI18N
        jButtonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHomeMouseClicked(evt);
            }
        });
        background.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(111, 174, 2));
        jLabel5.setText("Welcome");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 80, 30));

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

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login3.png"))); // NOI18N
        background.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        jButtonHome2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hom.png"))); // NOI18N
        jButtonHome2.setBorder(null);
        jButtonHome2.setBorderPainted(false);
        jButtonHome2.setContentAreaFilled(false);
        jButtonHome2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonHome2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hom2.png"))); // NOI18N
        jButtonHome2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hom2.png"))); // NOI18N
        jButtonHome2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hom2.png"))); // NOI18N
        jButtonHome2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHome2MouseClicked(evt);
            }
        });
        background.add(jButtonHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
    }//GEN-LAST:event_formWindowOpened

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        //Para minimizar la ventana
        this.setState(JFrame.VentanaEditarPerfil.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarMouseClicked
    
    private void jButtonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHomeMouseClicked
        Metodos.getInstance().getListaJugadoresTorneo().clear();
        VentanaInicio lg=new VentanaInicio(usuarioLogueado);
        lg.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonHomeMouseClicked

    private void jButtonOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOffMouseClicked
        Metodos.getInstance().cerrar();
    }//GEN-LAST:event_jButtonOffMouseClicked

    private void jButtonHome2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHome2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHome2MouseClicked

    private void jButtonAgregarFoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarFoto1MouseClicked
        if (jTextFieldNombreUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Your username is Empty");
        } else {
            if (jTextFieldNombreCompleto.getText().isEmpty() | jTextFieldNombreUsuario.getText().isEmpty() | jTextFieldContraseña.getText().isEmpty() | jTextFieldConfirmarContraseña.getText().isEmpty() | jTextFieldCorreo.getText().isEmpty() | jTextFieldPais.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Empty field");
            } else {
                if (jTextFieldContraseña.getText().equals(jTextFieldConfirmarContraseña.getText())) {
                    Usuario usuario = new Usuario(jTextFieldNombreCompleto.getText(), jTextFieldNombreUsuario.getText(), jTextFieldCorreo.getText(),jTextFieldContraseña.getText(), jTextFieldPais.getText(), jComboBoxSexo.getSelectedItem().toString(), Metodos.getInstance().BuscarFotoUsuario(usuarioLogueado));
                    Metodos.getInstance().ModificarUsuario(usuario, usuarioLogueado);
                    usuarioLogueado=usuario.getNombreUsuario();
                    JOptionPane.showMessageDialog(rootPane, usuario.getNombreCompleto()+ "Successfully Modified!");
                    
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Incorrect data");
                }
            }
        } 
    }//GEN-LAST:event_jButtonAgregarFoto1MouseClicked

    private void jButtonAgregarFoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarFoto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarFoto1ActionPerformed

    private void jButtonAgregarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAgregarFotoMouseClicked
      int resultado ;
        VentanaCargarArchivos ventana = new VentanaCargarArchivos();
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Photos: JPG y PNG", "jpg","png");
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
                JOptionPane.showMessageDialog(this, "Photo added correctly \n" + 
                        "You can modify some of your data \n" + 
                        "Or click on the button to add the user");
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Error opening the image " + ex);
            }
        }
    }//GEN-LAST:event_jButtonAgregarFotoMouseClicked

    private void jButtonAgregarFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAgregarFotoActionPerformed

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseDragged
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Windows (introduced in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(VentanaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new VentanaEditarPerfil(new Usuario()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel User;
    private javax.swing.JPanel background;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JLabel imagenIcono;
    private javax.swing.JButton jButtonAgregarFoto;
    private javax.swing.JButton jButtonAgregarFoto1;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonHome2;
    private javax.swing.JButton jButtonOff;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JTextField jTextFieldConfirmarContraseña;
    private javax.swing.JTextField jTextFieldContraseña;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombreCompleto;
    private javax.swing.JTextField jTextFieldNombreUsuario;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JPanel registro;
    private javax.swing.JLabel usuarioActual;
    // End of variables declaration//GEN-END:variables
}
