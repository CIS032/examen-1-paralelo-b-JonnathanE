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
public abstract class Profesor {
    private String cedula;
    private String nombres;
    private String apellido;
    private String carrera;
    private int horasClase;

    public Profesor(String cedula, String nombres, String apellido, String carrera, int horasClase) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellido = apellido;
        this.carrera = carrera;
        this.horasClase = horasClase;
    }
    
    public abstract int horasComplementarias();
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

//    @Override
//    public String toString() {
//        return "Profesor{" + "cedula=" + cedula + ", nombres=" + nombres + ", apellido=" + apellido + ", carrera=" + carrera + ", horasClase=" + horasClase + '}';
//    }
//    
    
}
