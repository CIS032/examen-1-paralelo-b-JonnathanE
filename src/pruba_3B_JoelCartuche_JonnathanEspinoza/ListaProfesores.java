/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruba_3B_JoelCartuche_JonnathanEspinoza;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author Procesamiento Señal
 */
public class ListaProfesores {
    ArrayList<Profesor> profesores= new ArrayList<Profesor>();
    
    public void agregar(Profesor profe){
        this.profesores.add(profe);
        
    }
    public void grabar(){
        try{
            FileWriter file= new FileWriter(new File("Docentes.csv"),true);
            PrintWriter pw= new PrintWriter(file,true);
            for (Profesor profesore : profesores) {
                if(profesore instanceof ProfesorTiempoParcial){
                    ProfesorTiempoParcial pp= (ProfesorTiempoParcial)profesore;
                    pw.print(pp+"\n");
                }
                if(profesore instanceof ProfesorMedioTiempo){
                    ProfesorMedioTiempo pm= (ProfesorMedioTiempo)profesore;
                    pw.print(pm+ "\n");
                }
                if(profesore instanceof ProfesorTiempoCompleto){
                    ProfesorTiempoCompleto pc= (ProfesorTiempoCompleto)profesore;
                    pw.print(pc+"\n");
                }
                    
            }
            pw.close();
            file.close();
        }catch(IOException ex){
            
        }
    }
            
    
}
