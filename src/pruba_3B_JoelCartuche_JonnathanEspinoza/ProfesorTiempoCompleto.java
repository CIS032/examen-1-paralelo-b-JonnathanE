/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruba_3B_JoelCartuche_JonnathanEspinoza;

/**
 *
 * @author Procesamiento Señal
 */
public class ProfesorTiempoCompleto extends Profesor{
    private final int HORAS_SEMANALES=40;

    public ProfesorTiempoCompleto(String cedula, String nombres, String apellido, String carrera, int horasClase) {
        super(cedula, nombres, apellido, carrera, horasClase);
    }

    public int getHORAS_SEMANALES() {
        return HORAS_SEMANALES;
    }

    
    public int horasComplementarias() {
        return this.HORAS_SEMANALES - this.getHorasClase();
    }
    @Override
    public String toString() {
        int t = horasComplementarias();
        if(t < 0){
            t = 0;
        }
        return this.getCedula()+";"+this.getNombres()+";"+this.getApellido()+"; ProfesorTiempoCompleto; "+this.getHorasClase()+";"+t;
    }
    
}
