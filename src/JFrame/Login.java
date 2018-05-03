/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
//Libreria de animaciones
import AppPackage.AnimationClass;
import javax.swing.JOptionPane;
/**
 *
 * @author toshib
 */
public class Login extends javax.swing.JFrame {
    private boolean navBar;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Boolean navBar = false;
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
        jPasswordContraseña = new javax.swing.JPasswordField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelUsuario1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelPublic1 = new javax.swing.JLabel();
        jLabelPublic2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
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

        jPasswordContraseña.setBackground(new java.awt.Color(33, 33, 33));
        jPasswordContraseña.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jPasswordContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        login.add(jPasswordContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(33, 33, 33));
        jTextFieldUsuario.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        login.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 210, -1));

        jLabelUsuario1.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelUsuario1.setForeground(new java.awt.Color(111, 174, 2));
        jLabelUsuario1.setText("Contraseña");
        login.add(jLabelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 30));

        jLabelUsuario.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(111, 174, 2));
        jLabelUsuario.setText("Usuario");
        login.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 70, 30));

        jLabelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/LOGIN_INGRESO.png"))); // NOI18N
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

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 260, 30));

        jLabelPublic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/publi1.png"))); // NOI18N
        jLabelPublic1.setToolTipText("");
        background.add(jLabelPublic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 320));

        jLabelPublic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/publi2.png"))); // NOI18N
        jLabelPublic2.setToolTipText("");
        background.add(jLabelPublic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 100, 1000, 320));

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

        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Delete_32px.png"))); // NOI18N
        botonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCerrarMouseClicked(evt);
            }
        });
        background.add(botonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 10, 40, 50));

        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/NEXT.png"))); // NOI18N
        jButtonBack.setBorder(null);
        jButtonBack.setBorderPainted(false);
        jButtonBack.setContentAreaFilled(false);
        jButtonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });
        background.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 40, 30));

        jButtonNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/BACK.png"))); // NOI18N
        jButtonNext.setBorder(null);
        jButtonNext.setBorderPainted(false);
        jButtonNext.setContentAreaFilled(false);
        jButtonNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNextMouseClicked(evt);
            }
        });
        background.add(jButtonNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 40, 30));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login.png"))); // NOI18N
        background.add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
        // Establecemos la variable que vamos a presentar a la izquierda en x,y  y su movimiento 25 y 5
        AnimationClass ac = new AnimationClass();
        ac.jLabelXRight(-1000, 0, 25, 5, jLabelPublic1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXRight(0, 1000, 25, 5, jLabelPublic2);
    }//GEN-LAST:event_jButtonBackMouseClicked

    private void jButtonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNextMouseClicked
        // Establecemos la variable que vamos a presentar a la izquierda en x,y  y su movimiento 25 y 5
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, jLabelPublic1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000,0, 25, 5, jLabelPublic2);
    }//GEN-LAST:event_jButtonNextMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Establecemos la variable que vamos a presentar a la izquierda en x,y  y su movimiento 25 y 5
        AnimationClass ac = new AnimationClass();
        ac.jLabelXLeft(0, -1000, 25, 5, jLabelPublic1);
        
        AnimationClass acc = new AnimationClass();
        acc.jLabelXLeft(1000,0, 25, 5, jLabelPublic2);
    }//GEN-LAST:event_formWindowOpened

    private void botonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCerrarMouseClicked
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
        
        
    }//GEN-LAST:event_botonCerrarMouseClicked

    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        //Para minimizar la ventana
        this.setState(JFrame.Login.ICONIFIED);
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
        if(jTextFieldUsuario.getText().isEmpty() & jPasswordContraseña.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "Uusuario Invalido");
        }else{
            Inicio inicio = new Inicio();
            inicio.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonEntrarMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel botonCerrar;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonNext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPublic1;
    private javax.swing.JLabel jLabelPublic2;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPasswordField jPasswordContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
