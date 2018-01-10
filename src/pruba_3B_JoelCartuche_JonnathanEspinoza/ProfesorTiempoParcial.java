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
public class ProfesorTiempoParcial extends Profesor {
    private int horasSemanales;

    public ProfesorTiempoParcial(int horasSemanales, String cedula, String nombres, String apellido, String carrera, int horasClase) {
        super(cedula, nombres, apellido, carrera, horasClase);
        this.horasSemanales = horasSemanales;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
    
    public int horasComplementarias() {
        return this.horasSemanales - this.getHorasClase();
    }

    @Override
    public String toString() {
        int t = horasComplementarias();
        if(t < 0){
            t = 0;
        }
        return this.getCedula()+";"+this.getNombres()+";"+this.getApellido()+"; ProfesorTiempoParcial; "+this.getHorasClase()+";"+t;
    }
    
    
}
