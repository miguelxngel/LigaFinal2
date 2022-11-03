/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaEquipos {
    //ATRIBUTOS
    private String nombreEquipoSeleccionado;
    private int position;

    //METODOS
    ArrayList<String> equipos = new ArrayList<>();
    public void creacionLista() {//CREACION DE LISTA DE EQUIPOS
        equipos.add("Liverpool");
        equipos.add("Chelsea");
        equipos.add("Manchester United");
        equipos.add("Manchester City");
        equipos.add("Everton");
        equipos.add("Arsenal");
        equipos.add("Tottenham");
        equipos.add("West Ham");
    }

    public void escogerEquipo() {//ESCOGER EQUIPO POR PARTE DEL USUARIO
        do {
            String contenidoImput="";
            
            for (int i = equipos.size()-1; i >=0; i--) {
                contenidoImput = ("\n" + equipos.get(i) + " = " + i + "\n")+contenidoImput;
            }
            JOptionPane.showMessageDialog(null,contenidoImput);
            position = Integer.parseInt(JOptionPane.showInputDialog("Cual es su equipo?:"));
            if(position>=8){
                JOptionPane.showMessageDialog(null, "El equipo no se encuentra en la lista","ERROR",0);
            }
        } while (position>=equipos.size());
        mostrarEquipoSeleccionado();
    }

    public void mostrarEquipoSeleccionado() {//MOSTRAR EQUIPO SELECCIONADO POR EL USUARIO   

        nombreEquipoSeleccionado = equipos.get(position);
        JOptionPane.showMessageDialog(null, "El equipo es:  " + nombreEquipoSeleccionado);
    }

    public String guardarEquipo() {//GUARDAR EQUIPO 
        return nombreEquipoSeleccionado;
    }
    
    
}
