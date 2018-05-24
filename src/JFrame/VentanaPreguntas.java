/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;
//Libreria de animaciones

import AppPackage.AnimationClass;
import Class.Metodos;
import Class.Pregunta;
import Class.PreguntaSeleccionMultiple;
import Class.PreguntaSeleccionUnica;
import Class.PreguntaVerdaderoFalso;

import Class.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.Collections;
import java.util.TimerTask;
import javax.swing.DefaultListModel;

/**
 *
 * @author Randald Villegas
 */
public class VentanaPreguntas extends javax.swing.JFrame {
    DefaultListModel<String> listModel = new DefaultListModel<>();
    DefaultListModel<String> listModel2 = new DefaultListModel<>();
    String nombreUsuario;
    int contador = 30;
    boolean juegoIniciado = false;

    /**
     * Creates new form Login
     */
    public VentanaPreguntas(String categoria) {
        initComponents();
        //imprimirCategorias();
        nombreUsuario = categoria;
        Usuario aux = Metodos.getInstance().buscarUsuario(nombreUsuario);
        Metodos.getInstance().getListaJugadoresTorneo().add(aux);
        //hace aparecer en el centro de la pantalla
        this.setLocationRelativeTo(null);
        //Damos el saludo al usuario logueado
        usuarioActual.setText(null);
        usuarioActual.setText("");
        //imprimirCategorias();
        showTimer();
        imprimirPreguntas(categoria);
        
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
        background = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListPreguntas = new javax.swing.JList<>();
        jLabelLevel1 = new javax.swing.JLabel();
        jLabelNivel = new javax.swing.JLabel();
        fechaAdmi = new javax.swing.JLabel();
        horaAdmi = new javax.swing.JLabel();
        usuarioActual = new javax.swing.JLabel();
        jButtonStartTournament = new javax.swing.JButton();
        jLabelStrat = new javax.swing.JLabel();
        jLabelPlayers = new javax.swing.JLabel();
        jButtonOff = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLabelPaloVertical = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        jLabel11.setText("jLabel11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setMaximumSize(new java.awt.Dimension(1000, 500));
        background.setMinimumSize(new java.awt.Dimension(1000, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(111, 174, 2)));
        jScrollPane2.setOpaque(false);

        jListPreguntas.setBackground(new java.awt.Color(0, 0, 0));
        jListPreguntas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jListPreguntas.setForeground(new java.awt.Color(111, 174, 2));
        jListPreguntas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jListPreguntas);

        background.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 680, 130));

        jLabelLevel1.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelLevel1.setForeground(new java.awt.Color(111, 174, 2));
        jLabelLevel1.setText("Time :");
        background.add(jLabelLevel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 110, -1));

        jLabelNivel.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelNivel.setForeground(new java.awt.Color(111, 174, 2));
        jLabelNivel.setText("30");
        background.add(jLabelNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 130, -1));

        fechaAdmi.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        fechaAdmi.setForeground(new java.awt.Color(111, 174, 2));
        fechaAdmi.setToolTipText("");
        background.add(fechaAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 140, 30));

        horaAdmi.setFont(new java.awt.Font("Script MT Bold", 1, 18)); // NOI18N
        horaAdmi.setForeground(new java.awt.Color(111, 174, 2));
        horaAdmi.setToolTipText("");
        background.add(horaAdmi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 140, 30));

        usuarioActual.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        usuarioActual.setForeground(new java.awt.Color(111, 174, 2));
        background.add(usuarioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 240, 30));

        jButtonStartTournament.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar1.png"))); // NOI18N
        jButtonStartTournament.setBorder(null);
        jButtonStartTournament.setBorderPainted(false);
        jButtonStartTournament.setContentAreaFilled(false);
        jButtonStartTournament.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonStartTournament.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar2.png"))); // NOI18N
        jButtonStartTournament.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar2.png"))); // NOI18N
        jButtonStartTournament.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aceptar2.png"))); // NOI18N
        jButtonStartTournament.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonStartTournamentMouseClicked(evt);
            }
        });
        background.add(jButtonStartTournament, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabelStrat.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelStrat.setForeground(new java.awt.Color(111, 174, 2));
        jLabelStrat.setText("Ok");
        background.add(jLabelStrat, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        jLabelPlayers.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabelPlayers.setForeground(new java.awt.Color(111, 174, 2));
        jLabelPlayers.setText("Select a Category");
        background.add(jLabelPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 150, -1));

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

        jLabelPaloVertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/paloPublicVertical.png"))); // NOI18N
        background.add(jLabelPaloVertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 500));

        jLabel5.setFont(new java.awt.Font("Script MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(111, 174, 2));
        jLabel5.setText("Welcome");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 30));

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

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //imprimirCategorias();
        imprimirCategorias();

    }//GEN-LAST:event_formWindowOpened
   
    public void showDate() {
        //metodo que retorna la fecha
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        fechaAdmi.setText(s.format(d));
    }

    public void showTime(){
        //metodo que retorna la hora
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                jLabelNivel.setText(s.format(d));
                
            }
        }).start();
    }
    public void showTimer(){
        
            java.util.Timer timer = new java.util.Timer();
            TimerTask tiempoJuego = new TimerTask() {
                @Override
                public void run() {

                    jLabelNivel.setText(Integer.toString(contador));
                    contador--;
                    if (contador == -1) {
                        JOptionPane.showMessageDialog(rootPane, "Time off");
                        contador = 30;
                        this.cancel();
                        VentanaTorneo vT = new VentanaTorneo("");
                        vT.setVisible(true);
                        cerrar();

                    }

                }
            };
            timer.schedule(tiempoJuego, 0, 1000);
            

    }
    public void cerrar(){
        this.dispose();
    }
    
    public void imprimirPreguntas(String categoria){
        //metodo para imprimir preguuntas 
        listModel2.clear();//limpiamos el listmodel
        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionMultiples.size(); i++) {
            PreguntaSeleccionMultiple aux = Metodos.getInstance().getListaPreguntaSeleccionMultiples().get(i);
            if (aux.getCategoria().equals(categoria)) {
                listModel2.addElement(aux.getPregunta());
                listModel2.addElement(aux.getRespuesta1().toString());
                listModel2.addElement(aux.getRespuesta2().toString());
                listModel2.addElement(aux.getRespuesta3().toString());
                listModel2.addElement(aux.getRespuesta4().toString());
                listModel2.addElement("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntaSeleccionUnicas.size(); i++) {
            PreguntaSeleccionUnica aux2 = Metodos.getInstance().getListaPreguntaSeleccionUnicas().get(i);
            if(aux2.getCategoria().equals(categoria)){
                Pregunta nuevo = Metodos.getInstance().listaPreguntaSeleccionUnicas.get(i);
                listModel2.addElement(aux2.getPregunta());
                listModel2.addElement(aux2.getRespuesta1().toString());
                listModel2.addElement(aux2.getRespuesta2().toString());
                listModel2.addElement(aux2.getRespuesta3().toString());
                listModel2.addElement(aux2.getRespuesta4().toString());
                listModel2.addElement("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
            }
        }
        for (int i = 0; i < Metodos.getInstance().listaPreguntasVerdaderoFalso.size(); i++) {
            PreguntaVerdaderoFalso aux3 = Metodos.getInstance().getListaPreguntasVerdaderoFalso().get(i);
            if(aux3.getCategoria().equals(categoria)){
                Pregunta nuevo = Metodos.getInstance().listaPreguntasVerdaderoFalso.get(i);
                listModel2.addElement(aux3.getPregunta());
                listModel2.addElement(aux3.getRespuestaFalsa().toString());
                listModel2.addElement(aux3.getRespuestaVerdadera().toString());
                listModel2.addElement("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                
            }
        }
        jListPreguntas.setModel(listModel2);
       

    
    }
    public void imprimirCategorias(){
        //metodo para imprimir categorias
        listModel.clear();//limpiamos el listmodel
        for (int i = 0; i < Metodos.getInstance().getListaCategorias().size(); i++) {
            String aux = Metodos.getInstance().getListaCategorias().get(i).getTipo();
            listModel.addElement(aux);
        }
       // jListCategorias.setModel(listModel);     
    
    }
    private void botonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMinimizarMouseClicked
        //Para minimizar la ventana
        this.setState(JFrame.VentanaPreguntas.ICONIFIED);
    }//GEN-LAST:event_botonMinimizarMouseClicked

    private void jButtonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHomeMouseClicked

        VentanaLogin lg = new VentanaLogin();
        lg.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonHomeMouseClicked

    private void jButtonOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOffMouseClicked
        Metodos.getInstance().cerrar();
    }//GEN-LAST:event_jButtonOffMouseClicked

    private void jButtonStartTournamentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonStartTournamentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonStartTournamentMouseClicked
    
    

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
            java.util.logging.Logger.getLogger(VentanaPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new VentanaPreguntas("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel botonMinimizar;
    private javax.swing.JLabel fechaAdmi;
    private javax.swing.JLabel horaAdmi;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonOff;
    private javax.swing.JButton jButtonStartTournament;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLevel1;
    private javax.swing.JLabel jLabelNivel;
    private javax.swing.JLabel jLabelPaloVertical;
    private javax.swing.JLabel jLabelPlayers;
    private javax.swing.JLabel jLabelStrat;
    private javax.swing.JList<String> jListPreguntas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel usuarioActual;
    // End of variables declaration//GEN-END:variables
}
