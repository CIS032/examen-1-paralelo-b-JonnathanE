/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruba_3B_JoelCartuche_JonnathanEspinoza;

import javax.swing.JOptionPane;

/**
 *
 * @author Procesamiento Señal
 */
public class PrubaProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cad = "Seleccione una opción:\n"
                + "1. Ingresar Docente\n"
                + "2. SALIR y GRABAR";
        String cad1 = "Seleccione tipo de profesor:\n"
                + "1. Ingresar Profesor tiempo parcial\n"
                + "2. Ingresar Profesor medio tiempo\n"
                + "3. Ingrsear Profesor tiempo completo\n";

        int opcion = 0;
        int opcion2 = 0;
        ListaProfesores lista = new ListaProfesores();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, cad, "opciónes"));
            switch (opcion) {
                case 1:
                    String cedula = JOptionPane.showInputDialog(null, "Ingrese el número de cédula", "Cédula");
                    String nombres = JOptionPane.showInputDialog(null, "Ingrese nombres", "Nombres");
                    String apellido = JOptionPane.showInputDialog(null, "Ingrese apellidos", "Apellidos");
                    String carrera = JOptionPane.showInputDialog(null, "Ingrese la carrera", "Carrera");
                    do {

                        opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, cad1, "opciónes"));
                        switch (opcion2) {
                            case 1:
                                int horasClase = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el número de horas clase (entre 2 y 9 horas)", "Horas clase"));
                                while (!(horasClase >= 2 && horasClase <= 9)) {
                                    JOptionPane.showMessageDialog(null, "Las horas clases tinen que estar entre el intervalo entre 2 y 9 horas", "", JOptionPane.ERROR_MESSAGE);
                                    horasClase = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de horas clase", "Horas clase"));
                                }
                                int horasSemanales = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el número de horas semanales (menor a 20)", "Horas Semanales"));
                                while (!(horasSemanales  < 20)) {
                                    JOptionPane.showMessageDialog(null, "Las horas semanales tines que ser menor o igual a 20 horas", "Horas semanales", JOptionPane.ERROR_MESSAGE);
                                    horasSemanales  = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de horas clase", "Horas clase"));
                                }
                                ProfesorTiempoParcial ptp = new ProfesorTiempoParcial(horasSemanales, cedula, nombres, apellido, carrera, horasClase);
                                lista.agregar(ptp);
                                opcion2 = 4;
                                break;
                            case 2:
                                int horasClase1 =10; //Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el número de horas clase", "Horas clase"));
//                                while (!(horasClase1 >= 10)) {
//                                    JOptionPane.showMessageDialog(null, "Las horas clases tinen que ser mayores a 9 horas", "", JOptionPane.ERROR_MESSAGE);
//                                    horasClase1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de horas clase", "Horas clase"));
//                                }
                                ProfesorMedioTiempo pmt = new ProfesorMedioTiempo(cedula, nombres, apellido, carrera, horasClase1);
                                lista.agregar(pmt);
                                opcion2 = 4;
                                break;
                            case 3:
                                int horasClase2 = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el número de horas clase (entre 3 a 6 horas)", "Horas clase"));
                                while (!(horasClase2 >= 3 && horasClase2 <= 16)) {
                                    JOptionPane.showMessageDialog(null, "Las horas clases tinen que estar entre el intervalo de 3 y 6 horas", "", JOptionPane.ERROR_MESSAGE);
                                    horasClase2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de horas clase", "Horas clase"));
                                }
                                ProfesorTiempoCompleto ptc = new ProfesorTiempoCompleto(cedula, nombres, apellido, carrera, horasClase2);
                                lista.agregar(ptc);
                                opcion2 = 4;
                                break;
                            default:JOptionPane.showMessageDialog(null, "Ingrese una opción correcta","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                   
                    } while (opcion2 != 4);

                    break;
                    
                case 2:
                    lista.grabar();
                    opcion = 2;
                    break;
                    default: JOptionPane.showMessageDialog(null, "Ingrese una opción correcta","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 2);
    }

}
