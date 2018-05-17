/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrame;

import Class.Categoria;
import Class.Metodos;
import Class.PreguntaSeleccionMultiple;
import Class.PreguntaSeleccionUnica;
import Class.PreguntaVerdaderoFalso;
import Class.Respuesta;
import Class.Usuario;
import javax.swing.ImageIcon;

/**
 *
 * @author Randald Villegas
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ImageIcon foto =  Metodos.getInstance().getFotografia();

                //Se crean los usuarios
                Usuario u1 = new Usuario("Randald Villegas", "Baxi", "randald1991@gmail.com", "1", "Costa Rica", "Male", foto,10);
                Usuario u2 = new Usuario("Angel Gamboa", "Angel", "angel@gmail.com", "1", "Costa Rica", "Male", foto,10);
                Usuario u3 = new Usuario("Meylin Gomez A", "Mey", "mey@gmail.com", "1", "Costa Rica", "Female", foto,10);
                Usuario u4 = new Usuario("Gabriela Villegas", "Gaby", "gaby@gmail.com", "1", "Costa Rica", "Female", foto,10);
                Usuario u5 = new Usuario("Fabian Zamora", "Fabian", "guillen@gmail.com", "1", "Costa Rica", "Male", foto,10);

                //Los agregamos a la lista
                Metodos.getInstance().listaUsuarios.add(u1);
                Metodos.getInstance().listaUsuarios.add(u2);
                Metodos.getInstance().listaUsuarios.add(u3);
                Metodos.getInstance().listaUsuarios.add(u4);
                Metodos.getInstance().listaUsuarios.add(u5);
                
                //Los administradores los agregamos a la lista
                Metodos.getInstance().listaUsuariosAdmi.add(u1);
                Metodos.getInstance().listaUsuariosAdmi.add(u2);
                Metodos.getInstance().listaUsuariosAdmi.add(u3);
                
                
                //se crean las categorias
                Categoria cat1 = new Categoria("Jugadores", Metodos.getInstance().aumentarCategoria());
                Categoria cat2 = new Categoria("Estadios", Metodos.getInstance().aumentarCategoria());
                Categoria cat3 = new Categoria("Equipos", Metodos.getInstance().aumentarCategoria());
                Categoria cat4 = new Categoria("Fechas", Metodos.getInstance().aumentarCategoria());
                Categoria cat5 = new Categoria("Partidos", Metodos.getInstance().aumentarCategoria());
                
                
                //agregamos las categorias a la lista
                Metodos.getInstance().getListaCategorias().add(cat1);
                Metodos.getInstance().getListaCategorias().add(cat2);
                Metodos.getInstance().getListaCategorias().add(cat3);
                Metodos.getInstance().getListaCategorias().add(cat4);
                Metodos.getInstance().getListaCategorias().add(cat5);

                //se crean las preguntas de verdadero o falso
                Respuesta rp1 = new Respuesta("Si", true);
                Respuesta rp2 = new Respuesta("No", false);
                PreguntaVerdaderoFalso fv1 = new PreguntaVerdaderoFalso(rp1, rp2, "Se enfrentaran los equipos Egipto vrs Uruguay?", "Fechas", 1);

                Respuesta rp3 = new Respuesta("Si", false);
                Respuesta rp4 = new Respuesta("No", true);
                PreguntaVerdaderoFalso fv2 = new PreguntaVerdaderoFalso(rp3, rp4, "El mundial es en Alemania?", "Estadios", 3);

                Respuesta rp5 = new Respuesta("Si", true);
                Respuesta rp6 = new Respuesta("No", false);
                PreguntaVerdaderoFalso fv3 = new PreguntaVerdaderoFalso(rp5, rp6, "Se enfrentaran los equipos Rusia vrs Arabia Saudí?", "Partidos", 5);

                //agregamos las preguntas de verdadero o falso  a la lista
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(fv1);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(fv2);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(fv3);

                //se crean las preguntas de seleccion unica
                Respuesta rp7 = new Respuesta("viernes 15 junio", true);
                Respuesta rp8 = new Respuesta("sábado 16 junio", false);
                Respuesta rp9 = new Respuesta("domingo 17 junio", false);
                Respuesta rp10 = new Respuesta("lunes 18 junio", false);
                PreguntaSeleccionUnica psu1 = new PreguntaSeleccionUnica(rp7, rp8, rp9, rp10, "Que dia se enfrenta Rusia vrs Arabia Saudí?", "Fechas", 1);

                Respuesta rp11 = new Respuesta("viernes 15 junio", false);
                Respuesta rp12 = new Respuesta("sábado 16 junio", false);
                Respuesta rp13 = new Respuesta("domingo 17 junio", true);
                Respuesta rp14 = new Respuesta("lunes 18 junio", false);
                PreguntaSeleccionUnica psu2 = new PreguntaSeleccionUnica(rp11, rp12, rp13, rp14, "Que dia se enfrenta Brasil vrs Suiza?", "Fechas", 3);

                Respuesta rp15 = new Respuesta("viernes 15 junio", false);
                Respuesta rp16 = new Respuesta("sábado 16 junio", true);
                Respuesta rp17 = new Respuesta("domingo 17 junio", false);
                Respuesta rp18 = new Respuesta("lunes 18 junio", false);
                PreguntaSeleccionUnica psu3 = new PreguntaSeleccionUnica(rp15, rp16, rp17, rp18, "Que dia se enfrenta Francia vrs Australia?", "Fechas", 5);

                //agregamos las preguntas de seleccion unica  a la lista
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(psu1);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(psu2);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(psu3);

                //se crean las  preguntas de selecion multiple
                Respuesta rp19 = new Respuesta("España", true);
                Respuesta rp20 = new Respuesta("Portugal", true);
                Respuesta rp21 = new Respuesta("Costa Rica", false);
                Respuesta rp22 = new Respuesta("Honduras", false);
                Respuesta rp23 = new Respuesta("Panama", false);
                Respuesta rp24 = new Respuesta("USA", false);
                Respuesta rp25 = new Respuesta("China", false);
                Respuesta rp26 = new Respuesta("Alemania", false);
                PreguntaSeleccionMultiple psm1 = new PreguntaSeleccionMultiple(rp19, rp20, rp21, rp22, rp23, rp24, rp25, rp26, "Equipos que se enfrentaran el viernes 15 junio ", "Partidos", 1);

                Respuesta rp27 = new Respuesta("Francia", true);
                Respuesta rp28 = new Respuesta("Argentina", true);
                Respuesta rp29 = new Respuesta("Costa Rica", false);
                Respuesta rp30 = new Respuesta("Honduras", false);
                Respuesta rp31 = new Respuesta("Panama", false);
                Respuesta rp32 = new Respuesta("USA", false);
                Respuesta rp33 = new Respuesta("China", false);
                Respuesta rp34 = new Respuesta("Alemania", false);
                PreguntaSeleccionMultiple psm2 = new PreguntaSeleccionMultiple(rp27, rp28, rp29, rp30, rp31, rp32, rp33, rp34, "Equipos que se enfrentaran el sabado 16 junio ", "Partidos", 3);

                Respuesta rp35 = new Respuesta("España", false);
                Respuesta rp36 = new Respuesta("Portugal", false);
                Respuesta rp37 = new Respuesta("Costa Rica", true);
                Respuesta rp38 = new Respuesta("Honduras", false);
                Respuesta rp39 = new Respuesta("Brazil", true);
                Respuesta rp40 = new Respuesta("USA", false);
                Respuesta rp41 = new Respuesta("China", false);
                Respuesta rp42 = new Respuesta("Alemania", false);
                PreguntaSeleccionMultiple psm3 = new PreguntaSeleccionMultiple(rp35, rp36, rp37, rp38, rp39, rp40, rp41, rp42, "Equipos que se enfrentaran el Domingo 17 junio ", "Partidos", 5);

                //agregamos las preguntas de seleccion multiple  a la lista
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(psm1);
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(psm2);
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(psm3);

                new VentanaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
