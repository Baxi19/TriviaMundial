/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import Class.Categoria;
import Class.Crea;
import Class.CreaPreguntas;
import Class.Metodos;
import Class.PreguntaSeleccionMultiple;
import Class.PreguntaSeleccionUnica;
import Class.PreguntaVerdaderoFalso;
import Class.Respuesta;

import Class.Usuario;
import JFrame.VentanaLogin;
import javax.swing.ImageIcon;

/**
 *
 * @author toshib
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                //Imagen para los usuarios quemados XD
                ImageIcon foto =  new javax.swing.ImageIcon(getClass().getResource("/Image/Male User_100px.png"));

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
                Metodos.getInstance().setPreguntaVF(fv1);
                Crea crea;
                crea = new CreaPreguntas();
                PreguntaVerdaderoFalso pregunta = crea.creaPreguntaFalsoVerdadero();
                
                
                Respuesta rp3 = new Respuesta("Si", false);
                Respuesta rp4 = new Respuesta("No", true);
                PreguntaVerdaderoFalso fv2 = new PreguntaVerdaderoFalso(rp3, rp4, "El mundial es en Alemania?", "Estadios", 3);
                Metodos.getInstance().setPreguntaVF(fv2);
                crea.update();
                PreguntaVerdaderoFalso pregunta2 = crea.creaPreguntaFalsoVerdadero();
                Metodos.getInstance().listaPreguntasVerdaderoFalso.add(pregunta2);
                
                Respuesta rp5 = new Respuesta("Si", true);
                Respuesta rp6 = new Respuesta("No", false);
                PreguntaVerdaderoFalso fv3 = new PreguntaVerdaderoFalso(rp5, rp6, "Se enfrentaran los equipos Rusia vrs Arabia Saudí?", "Partidos", 5);
                Metodos.getInstance().setPreguntaVF(fv3);
                crea.update();
                PreguntaVerdaderoFalso pregunta3 = crea.creaPreguntaFalsoVerdadero();
                Metodos.getInstance().listaPreguntasVerdaderoFalso.add(pregunta3);
                
                //agregamos las preguntas de verdadero o falso  a la lista
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta2);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta3);

                //se crean las preguntas de seleccion unica
                Respuesta rp7 = new Respuesta("viernes 15 junio", true);
                Respuesta rp8 = new Respuesta("sábado 16 junio", false);
                Respuesta rp9 = new Respuesta("domingo 17 junio", false);
                Respuesta rp10 = new Respuesta("lunes 18 junio", false);
                PreguntaSeleccionUnica psu1 = new PreguntaSeleccionUnica(rp7, rp8, rp9, rp10, "Que dia se enfrenta Rusia vrs Arabia Saudí?", "Fechas", 1);
                Metodos.getInstance().setPreguntaSU(psu1);
                crea.update();
                PreguntaSeleccionUnica pregunta4 = crea.creaPreguntaSeleccionUnica();
                
                
                Respuesta rp11 = new Respuesta("viernes 15 junio", false);
                Respuesta rp12 = new Respuesta("sábado 16 junio", false);
                Respuesta rp13 = new Respuesta("domingo 17 junio", true);
                Respuesta rp14 = new Respuesta("lunes 18 junio", false);
                PreguntaSeleccionUnica psu2 = new PreguntaSeleccionUnica(rp11, rp12, rp13, rp14, "Que dia se enfrenta Brasil vrs Suiza?", "Fechas", 3);
                Metodos.getInstance().setPreguntaSU(psu2);
                crea.update();
                PreguntaSeleccionUnica pregunta5 = crea.creaPreguntaSeleccionUnica();
                
                
                Respuesta rp15 = new Respuesta("viernes 15 junio", false);
                Respuesta rp16 = new Respuesta("sábado 16 junio", true);
                Respuesta rp17 = new Respuesta("domingo 17 junio", false);
                Respuesta rp18 = new Respuesta("lunes 18 junio", false);
                PreguntaSeleccionUnica psu3 = new PreguntaSeleccionUnica(rp15, rp16, rp17, rp18, "Que dia se enfrenta Francia vrs Australia?", "Fechas", 5);
                Metodos.getInstance().setPreguntaSU(psu3);
                crea.update();
                PreguntaSeleccionUnica pregunta6 = crea.creaPreguntaSeleccionUnica();
                
                //agregamos las preguntas de seleccion unica  a la lista
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta4);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta5);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta6);

                //se crean las  preguntas de selecion multiple
                Respuesta rp19 = new Respuesta("España", true);
                Respuesta rp20 = new Respuesta("Portugal", true);
                Respuesta rp21 = new Respuesta("Costa Rica", false);
                Respuesta rp22 = new Respuesta("Honduras", false);
                
                PreguntaSeleccionMultiple psm1 = new PreguntaSeleccionMultiple(rp19, rp20, rp21, rp22,"Equipos que se enfrentaran el viernes 15 junio ", "Partidos", 1);
                Metodos.getInstance().setPreguntaSM(psm1);
                crea.update();
                PreguntaSeleccionMultiple pregunta7 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp27 = new Respuesta("Francia", true);
                Respuesta rp28 = new Respuesta("Argentina", true);
                Respuesta rp29 = new Respuesta("Costa Rica", false);
                Respuesta rp30 = new Respuesta("Honduras", false);
               
                PreguntaSeleccionMultiple psm2 = new PreguntaSeleccionMultiple(rp27, rp28, rp29, rp30, "Equipos que se enfrentaran el sabado 16 junio ", "Partidos", 3);
                Metodos.getInstance().setPreguntaSM(psm2);
                crea.update();
                PreguntaSeleccionMultiple pregunta8 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp35 = new Respuesta("España", false);
                Respuesta rp36 = new Respuesta("Portugal", false);
                Respuesta rp37 = new Respuesta("Costa Rica", true);
                Respuesta rp38 = new Respuesta("Brazil", true);
                
                PreguntaSeleccionMultiple psm3 = new PreguntaSeleccionMultiple(rp35, rp36, rp37,  rp38, "Equipos que se enfrentaran el Domingo 17 junio ", "Partidos", 5);
                Metodos.getInstance().setPreguntaSM(psm3);
                crea.update();
                PreguntaSeleccionMultiple pregunta9 = crea.creaPreguntaSeleccionMultiple();
                
                
            
                
                //agregamos las preguntas de seleccion multiple  a la lista
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta7);
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta8);
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta9);
                
                //asignamos la pregunta
                Respuesta rp39 = new Respuesta("Cristiano Ronaldo", true);
                Respuesta rp40 = new Respuesta("Leonel Messi", false);
                Respuesta rp41 = new Respuesta("Peter La Anguila", false);
                Respuesta rp42 = new Respuesta("Flash Gordon", false);
                
                PreguntaSeleccionUnica psu4 = new PreguntaSeleccionUnica(rp39, rp40, rp41,  rp42, "Jugador profesional portugueno que juega actualmente en el Real madrid y es uno de los mejores del mundo", "Jugadores", 2);
                Metodos.getInstance().setPreguntaSU(psu4);
                crea.update();
                PreguntaSeleccionUnica pregunta10 = crea.creaPreguntaSeleccionUnica();
                
                
                Respuesta rp43 = new Respuesta("Cristiano Ronaldo", false);
                Respuesta rp44 = new Respuesta("Leonel Messi", true);
                Respuesta rp45 = new Respuesta("Bryan Arrieta", false);
                Respuesta rp46 = new Respuesta("Ronaldinho", false);
                
                PreguntaSeleccionUnica psu5 = new PreguntaSeleccionUnica(rp43, rp44, rp45,  rp46, "Primer futbolista que gano 5 veces el balon de oro(1 Balon de Oro y 4 de FIFA Balon de Oro)", "Jugadores", 4);
                Metodos.getInstance().setPreguntaSU(psu5);
                crea.update();
                PreguntaSeleccionUnica pregunta11 = crea.creaPreguntaSeleccionUnica();
                
                
                Respuesta rp47 = new Respuesta("Keylor Navas", false);
                Respuesta rp48 = new Respuesta("Leonel Messi", false);
                Respuesta rp49 = new Respuesta("Sergio Ramos", false);
                Respuesta rp50 = new Respuesta("Pepe Reina", true);
                
                PreguntaSeleccionUnica psu6 = new PreguntaSeleccionUnica(rp47, rp48, rp49,  rp50, "Jugador mas veterano de Espana", "Jugadores", 4);
                Metodos.getInstance().setPreguntaSU(psu6);
                crea.update();
                PreguntaSeleccionUnica pregunta12 = crea.creaPreguntaSeleccionUnica();
                
                //se agrega a la lista
                
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta10);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta11);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta12);
                
                //mas preguntas
                
                Respuesta rp51 = new Respuesta("Keylor Navas", false);
                Respuesta rp52 = new Respuesta("Essam El Hadary", true);
                Respuesta rp53 = new Respuesta("Sergio Ramos", false);
                Respuesta rp54 = new Respuesta("Pepe Reina", false);
                
                PreguntaSeleccionUnica psu7 = new PreguntaSeleccionUnica(rp51, rp52, rp53,  rp54, "Jugador con 44 anos considerado el mas viejo de Rusia 2018", "Jugadores", 4);
                Metodos.getInstance().setPreguntaSU(psu7);
                crea.update();
                PreguntaSeleccionUnica pregunta13 = crea.creaPreguntaSeleccionUnica();
                
                
                
                Respuesta rp55 = new Respuesta("Si", true);
                Respuesta rp56 = new Respuesta("No", false);

                PreguntaVerdaderoFalso fv4 = new PreguntaVerdaderoFalso(rp56, rp55, "Ha ganado Messi 5 veces el balon de oro", "Jugadores", 4);
                Metodos.getInstance().setPreguntaVF(fv4);
                crea.update();
                PreguntaVerdaderoFalso pregunta14 = crea.creaPreguntaFalsoVerdadero();
                
                
                
                Respuesta rp57 = new Respuesta("Arena Volgrogrado", true);
                Respuesta rp58 = new Respuesta("Camp Nou", false);
                Respuesta rp59 = new Respuesta("Red Bull Arena", false);
                Respuesta rp60 = new Respuesta("Estadio Samara", false);
                
                PreguntaSeleccionUnica psu8 = new PreguntaSeleccionUnica(rp57, rp58, rp59,  rp60, "Cual estadio tuvo que lidiar con proectiles sin estallar y cadavers de soldados de la Batalla de Stalingrado de la 2 Guerra mundial?", "Estadios", 5);
                Metodos.getInstance().setPreguntaSU(psu8);
                crea.update();
                PreguntaSeleccionUnica pregunta15 = crea.creaPreguntaSeleccionUnica();
                
                //se agreega a la lista
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta13);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta14);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta15);
                
                
                //mas preguntas 
                
                Respuesta rp61 = new Respuesta("Arena Volgrogrado", false);
                Respuesta rp62 = new Respuesta("Camp Nou", false);
                Respuesta rp63 = new Respuesta("Estadio de San Petersburgo", true);
                Respuesta rp64= new Respuesta("Estadio Samara", false);
                
                PreguntaSeleccionUnica psu9 = new PreguntaSeleccionUnica(rp61, rp62, rp63,  rp64, "Estadio con problemas de filtaciones en el techo y un pobre crecimiento del cesped que ha sido reemplzado multiples veces?", "Estadios", 3);
                Metodos.getInstance().setPreguntaSU(psu9);
                crea.update();
                PreguntaSeleccionUnica pregunta16 = crea.creaPreguntaSeleccionUnica();
                
                Respuesta rp65 = new Respuesta("Arena Volgrogrado", false);
                Respuesta rp66 = new Respuesta("Camp Nou", false);
                Respuesta rp67 = new Respuesta("Arena Rostov", true);
                Respuesta rp68= new Respuesta("Estadio Samara", false);
                
                PreguntaSeleccionUnica psu10 = new PreguntaSeleccionUnica(rp61, rp62, rp63,  rp64, "Estadio ubicado en la ribera del Don y planeado como centro de un vasto complejo residencial y de entretenimiento tras la Copa del Mundo?", "Estadios", 4);
                Metodos.getInstance().setPreguntaSU(psu10);
                crea.update();
                PreguntaSeleccionUnica pregunta17 = crea.creaPreguntaSeleccionUnica();
                
                
                
                Respuesta rp69 = new Respuesta("Estadio Nizhny Novgorod", true);
                Respuesta rp70 = new Respuesta("Camp Nou", false);
                Respuesta rp71 = new Respuesta("Arena Rostov", false);
                Respuesta rp72= new Respuesta("Estadio Samara", false);
                
                PreguntaSeleccionUnica psu11 = new PreguntaSeleccionUnica(rp69, rp70, rp71,  rp72, "Cual estadio ofrece a los hinchas una vista de los rios OKA y VOLGA?", "Estadios", 4);
                Metodos.getInstance().setPreguntaSU(psu11);
                crea.update();
                PreguntaSeleccionUnica pregunta18 = crea.creaPreguntaSeleccionUnica();
                
                //agrega a la lista
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta16);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta17);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta18);
                
                //mas preguntas
                
                Respuesta rp73 = new Respuesta("Estadio Nizhny Novgorod", true);
                Respuesta rp74 = new Respuesta("Camp Nou", false);
                Respuesta rp75 = new Respuesta("Arena Rostov", true);
                Respuesta rp76= new Respuesta("Estadio Samara", true);
                
                PreguntaSeleccionMultiple psm4 = new PreguntaSeleccionMultiple(rp73, rp74, rp75,  rp76, "Estadios de Rusia", "Estadios", 2);
                Metodos.getInstance().setPreguntaSM(psm4);
                crea.update();
                PreguntaSeleccionMultiple pregunta19 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp77 = new Respuesta("Si", true);
                Respuesta rp78 = new Respuesta("No", false);

                PreguntaVerdaderoFalso fv5 = new PreguntaVerdaderoFalso(rp77,rp78, "Se encuentra el estadio Luzhniki en la ciudad de Moscu en Rusia", "Estadios", 3);
                Metodos.getInstance().setPreguntaVF(fv5);
                crea.update();
                PreguntaVerdaderoFalso pregunta20 = crea.creaPreguntaFalsoVerdadero();
                
                
                Respuesta rp79 = new Respuesta("Si", false);
                Respuesta rp80 = new Respuesta("No", true);

                PreguntaVerdaderoFalso fv6 = new PreguntaVerdaderoFalso(rp77,rp78, "Se encuentra el estadio Samara en la ciudad de Moscu en Rusia", "Estadios", 1);
                Metodos.getInstance().setPreguntaVF(fv5);
                crea.update();
                PreguntaVerdaderoFalso pregunta21 = crea.creaPreguntaFalsoVerdadero();
                
                // agrega la lista
                
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta19);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta20);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta21);
                
                // mas preguntas 
                
                Respuesta rp81 = new Respuesta("Keylor Navas", true);
                Respuesta rp82 = new Respuesta("Andres Iniesta", false);
                Respuesta rp83 = new Respuesta("Bryan Ruiz", true);
                Respuesta rp84= new Respuesta("Pepe Gonzales", false);
                
                PreguntaSeleccionMultiple psm5 = new PreguntaSeleccionMultiple(rp81, rp82, rp83,  rp84, "Cuales jugadorees son de Costa Rica", "Equipos", 3);
                Metodos.getInstance().setPreguntaSM(psm5);
                crea.update();
                PreguntaSeleccionMultiple pregunta22 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp85 = new Respuesta("Costa Rica", true);
                Respuesta rp86 = new Respuesta("Barcelona", false);
                Respuesta rp87 = new Respuesta("Panama", false);
                Respuesta rp88= new Respuesta("Real Madrid", true);
                
                PreguntaSeleccionMultiple psm6 = new PreguntaSeleccionMultiple(rp85, rp86, rp87,  rp88, "Equipos en el que juega Keylor Navas", "Equipos", 1);
                Metodos.getInstance().setPreguntaSM(psm6);
                crea.update();
                PreguntaSeleccionMultiple pregunta23 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp89 = new Respuesta("Brasil", false);
                Respuesta rp90 = new Respuesta("Costa Rica", false);
                Respuesta rp91 = new Respuesta("Nicaragua", false);
                Respuesta rp92= new Respuesta("Alemani", true);
                
                PreguntaSeleccionUnica psu12 = new PreguntaSeleccionUnica(rp89, rp90, rp91,  rp92, "Equipo Ganador del mundial de Brasil 2014", "Equipos", 3);
                Metodos.getInstance().setPreguntaSU(psu12);
                crea.update();
                PreguntaSeleccionUnica pregunta24 = crea.creaPreguntaSeleccionUnica();
                
                //agrega la lista
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta22);
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta23);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta24);
                
                // mas preguntas
                
                Respuesta rp93 = new Respuesta("Costa Rica", true);
                Respuesta rp94 = new Respuesta("Holanda", false);
                Respuesta rp95 = new Respuesta("Peru", true);
                Respuesta rp96= new Respuesta("Brasil", true);
                
                PreguntaSeleccionMultiple psm7 = new PreguntaSeleccionMultiple(rp93, rp94, rp95,  rp96, "Cuales Equipos estan en el mundial de Rusia 2018", "Equipos", 4);
                Metodos.getInstance().setPreguntaSM(psm7);
                crea.update();
                PreguntaSeleccionMultiple pregunta25 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp97 = new Respuesta("A", false);
                Respuesta rp98 = new Respuesta("Z", false);
                Respuesta rp99 = new Respuesta("C", false);
                Respuesta rp100= new Respuesta("E", true);
                
                PreguntaSeleccionUnica psu13 = new PreguntaSeleccionUnica(rp97, rp98, rp99,  rp100, "Grupo en el que se encuentra Costa Rica", "Equipos", 3);
                Metodos.getInstance().setPreguntaSU(psu13);
                crea.update();
                PreguntaSeleccionUnica pregunta26 = crea.creaPreguntaSeleccionUnica();
                
                
                Respuesta rp101 = new Respuesta("28 de Junio", true);
                Respuesta rp102 = new Respuesta("30 de mayo", false);
                Respuesta rp103 = new Respuesta("18 de Enero", false);
                Respuesta rp104 = new Respuesta("20 de Julio", false);
                
                PreguntaSeleccionUnica psu14 = new PreguntaSeleccionUnica(rp101, rp102, rp103,  rp104, "Fecha en que se realiza el priemr partido en el estadio de Samara", "Fechas", 5);
                Metodos.getInstance().setPreguntaSU(psu14);
                crea.update();
                PreguntaSeleccionUnica pregunta27 = crea.creaPreguntaSeleccionUnica();
                
                // agrega a la lista
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta25);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta26);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta27);
                
                // mas preguntas
                Respuesta rp105 = new Respuesta("Si", true);
                Respuesta rp106 = new Respuesta("No", false);

                
                PreguntaVerdaderoFalso fv7 = new PreguntaVerdaderoFalso(rp105, rp106, "El mundial de Rusia es en el 2018", "Fechas", 1);
                Metodos.getInstance().setPreguntaVF(fv7);
                crea.update();
                PreguntaVerdaderoFalso pregunta28 = crea.creaPreguntaFalsoVerdadero();
                
                Respuesta rp107 = new Respuesta("Si", false);
                Respuesta rp108 = new Respuesta("No", true);
                
                PreguntaVerdaderoFalso fv8 = new PreguntaVerdaderoFalso(rp107,rp108, "El mundial de Rusia es en el 2020", "Fechas", 1);
                Metodos.getInstance().setPreguntaVF(fv8);
                crea.update();
                PreguntaVerdaderoFalso pregunta29 = crea.creaPreguntaFalsoVerdadero();
                
                Respuesta rp109 = new Respuesta("2015", false);
                Respuesta rp110 = new Respuesta("2020", false);
                Respuesta rp111 = new Respuesta("2018", true);
                Respuesta rp112 = new Respuesta("2019", false);
                
                PreguntaSeleccionUnica psu15 = new PreguntaSeleccionUnica(rp109, rp110, rp111,  rp112, "Ano en que se realiza el mundial de Rusia", "Fechas", 2);
                Metodos.getInstance().setPreguntaSU(psu15);
                crea.update();
                PreguntaSeleccionUnica pregunta30 = crea.creaPreguntaSeleccionUnica();
                
                //agrega a la lista
                
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta28);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta29);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta30);
                
                //mas preguntas
                
                Respuesta rp113 = new Respuesta("2014", true);
                Respuesta rp114 = new Respuesta("2015", false);
                Respuesta rp115 = new Respuesta("2018", true);
                Respuesta rp116= new Respuesta("2020", false);
                
                PreguntaSeleccionMultiple psm8 = new PreguntaSeleccionMultiple(rp113, rp114, rp115,  rp116, "Anos en que se realizaron mundiales", "Fechas", 1);
                Metodos.getInstance().setPreguntaSM(psm8);
                crea.update();
                PreguntaSeleccionMultiple pregunta31 = crea.creaPreguntaSeleccionMultiple();
                
                
                Respuesta rp117 = new Respuesta("Si", true);
                Respuesta rp118 = new Respuesta("No", false);
                PreguntaVerdaderoFalso fv9 = new PreguntaVerdaderoFalso(rp117, rp118, "La final de Rusia es el 15 de Julio", "Fechas", 5);
                Metodos.getInstance().setPreguntaVF(fv9);
                crea.update();
                PreguntaVerdaderoFalso pregunta32 = crea.creaPreguntaFalsoVerdadero();
                
                Respuesta rp119 = new Respuesta("Si", false);
                Respuesta rp120 = new Respuesta("No", true);
                PreguntaVerdaderoFalso fv10 = new PreguntaVerdaderoFalso(rp119, rp120, "El primer partido de Rusia es el 16 de Junio", "Fechas", 4);
                Metodos.getInstance().setPreguntaVF(fv10);
                crea.update();
                PreguntaVerdaderoFalso pregunta33 = crea.creaPreguntaFalsoVerdadero();
                //agrega a la lista
                
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta31);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta32);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta33);
                
                // mas preguntas
                
                Respuesta rp121 = new Respuesta("Si", true);
                Respuesta rp122 = new Respuesta("No", false);
                PreguntaVerdaderoFalso fv11 = new PreguntaVerdaderoFalso(rp121, rp122, "Se juega la semifinal de Rusia el 10 y 11 de Julio", "Fechas", 4);
                Metodos.getInstance().setPreguntaVF(fv11);
                crea.update();
                PreguntaVerdaderoFalso pregunta34 = crea.creaPreguntaFalsoVerdadero();
                
                
                Respuesta rp123 = new Respuesta("No", true);
                Respuesta rp124 = new Respuesta("Si", false);
                PreguntaVerdaderoFalso fv12 = new PreguntaVerdaderoFalso(rp123, rp124, "El 28 de abril se juega el primer partido en el estadio Samara?", "Fechas", 5);
                Metodos.getInstance().setPreguntaVF(fv12);
                crea.update();
                PreguntaVerdaderoFalso pregunta35 = crea.creaPreguntaFalsoVerdadero();
                
                
                Respuesta rp125 = new Respuesta("4", true);
                Respuesta rp126 = new Respuesta("5", false);
                Respuesta rp127 = new Respuesta("3", true);
                Respuesta rp128= new Respuesta("1", false);
                
                PreguntaSeleccionMultiple psm9 = new PreguntaSeleccionMultiple(rp125, rp126, rp127,  rp128, "Cuantos arbitros hay en un partido Oficial", "Fechas", 3);
                Metodos.getInstance().setPreguntaSM(psm9);
                crea.update();
                PreguntaSeleccionMultiple pregunta36 = crea.creaPreguntaSeleccionMultiple();
                
                //agrega a la lista
                Metodos.getInstance().getListaPreguntaSeleccionMultiples().add(pregunta36);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta34);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta35);
                
                //mas preguntas
                
                Respuesta rp129 = new Respuesta("Serbia", true);
                Respuesta rp130 = new Respuesta("Brasil", false);
                Respuesta rp131 = new Respuesta("Alemania", false);
                Respuesta rp132= new Respuesta("Peru", false);
                
                PreguntaSeleccionUnica psu16 = new PreguntaSeleccionUnica(rp132, rp129, rp130,  rp131, "Contra quien es el primer partido contra Costa Rica", "Fechas", 3);
                Metodos.getInstance().setPreguntaSU(psu16);
                crea.update();
                PreguntaSeleccionUnica pregunta37 = crea.creaPreguntaSeleccionUnica();
                
                
                Respuesta rp133 = new Respuesta("No", true);
                Respuesta rp134 = new Respuesta("Si", false);
                PreguntaVerdaderoFalso fv13 = new PreguntaVerdaderoFalso(rp133, rp134, "En un partido se cuenta con 26 jugadores en la cancha de los 2 equipos?", "Fechas", 2);
                Metodos.getInstance().setPreguntaVF(fv13);
                crea.update();
                PreguntaVerdaderoFalso pregunta38 = crea.creaPreguntaFalsoVerdadero();
                
                
                Respuesta rp135 = new Respuesta("Serbia VS Alemania", false);
                Respuesta rp136 = new Respuesta("Costa Rica vs Serbia", false);
                Respuesta rp137 = new Respuesta("Rusia vs Arabia Saudita", true);
                Respuesta rp138= new Respuesta("Peru vs Portugal", false);
                
                PreguntaSeleccionUnica psu17 = new PreguntaSeleccionUnica(rp135, rp136, rp137,  rp138, "Quienes juega en el primer partido de Mundial de Rusia 2018", "Fechas", 4);
                Metodos.getInstance().setPreguntaSU(psu17);
                crea.update();
                PreguntaSeleccionUnica pregunta39 = crea.creaPreguntaSeleccionUnica();
                
                
                //agrega a la lista
                
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta37);
                Metodos.getInstance().getListaPreguntasVerdaderoFalso().add(pregunta38);
                Metodos.getInstance().getListaPreguntaSeleccionUnicas().add(pregunta39);
                
                new VentanaLogin().setVisible(true);
           }
        });
    }
}


